/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author naveenb2004
 */
public class main {

    public void startTunnel() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ProcessBuilder processBuilder
                            = new ProcessBuilder("cmd.exe", "/c", "ssh -R 80:localhost:80 nokey@localhost.run");
                    processBuilder.redirectErrorStream(true);
                    Process p = processBuilder.start();
                    String line = null;
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    while ((line = bufferedReader.readLine()) != null) {
                        front.main.jTextArea1.append(line + "\n");
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }).start();
    }

}
