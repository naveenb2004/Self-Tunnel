/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author naveenb2004
 */
public class settings {

    public static String workPath = "C:\\ProgramData\\naveenb2004\\self-tunnel\\";

    public static String status() {
        String status = "0";
        File f1 = new File(workPath + "status.nb");
        if (f1.exists()) {
            try (Stream<String> lines = Files.lines(Paths.get(
                    workPath + "status.nb"))) {
                status = lines.skip(0).findFirst().get();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        return status;
    }

    public static String version() {
        return "0.1";
    }

    public static String restartAfterFallback() {
        String status = "0";
        File f1 = new File(workPath + "settingsBasic.nb");
        if (f1.exists()) {
            try (Stream<String> lines = Files.lines(Paths.get(
                    workPath + "settingsBasic.nb"))) {
                status = lines.skip(0).findFirst().get();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        return status;
    }

    public static String stayAliveAfterClose() {
        String status = "0";
        File f1 = new File(workPath + "settingsBasic.nb");
        if (f1.exists()) {
            try (Stream<String> lines = Files.lines(Paths.get(
                    workPath + "settingsBasic.nb"))) {
                status = lines.skip(1).findFirst().get();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        return status;
    }

    public static ArrayList<String> sshStatus() {
        ArrayList<String> status = null;
        try {
            ProcessBuilder processBuilder
                    = new ProcessBuilder("cmd.exe", "/c",
                            "pwsh -Command \"Get-WindowsCapability -Online | Where-Object Name -like 'OpenSSH*'\"");
            processBuilder.redirectErrorStream(true);
            Process p = processBuilder.start();
            String line = null;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] x = line.split("State : ");
                if (x[0].equals("←[32;1mState")) {
                    System.out.println(x[1]);
                    status.add(x[1]);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return status;
    }

    public static String telegramUpdate() {
        String status = "0";
        File f1 = new File(workPath + "settingsTelegram.nb");
        if (f1.exists()) {
            try (Stream<String> lines = Files.lines(Paths.get(
                    workPath + "settingsTelegram.nb"))) {
                status = lines.skip(0).findFirst().get();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        return status;
    }

    public static String telegramAPI() {
        String status = "0";
        File f1 = new File(workPath + "settingsTelegram.nb");
        if (f1.exists()) {
            try (Stream<String> lines = Files.lines(Paths.get(
                    workPath + "settingsTelegram.nb"))) {
                status = lines.skip(1).findFirst().get();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        return status;
    }

    public static String telegramUsername() {
        String status = "0";
        File f1 = new File(workPath + "settingsTelegram.nb");
        if (f1.exists()) {
            try (Stream<String> lines = Files.lines(Paths.get(
                    workPath + "settingsTelegram.nb"))) {
                status = lines.skip(2).findFirst().get();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        return status;
    }

    public static String telegramSendAs() {
        String status = "0";
        File f1 = new File(workPath + "settingsTelegram.nb");
        if (f1.exists()) {
            try (Stream<String> lines = Files.lines(Paths.get(
                    workPath + "settingsTelegram.nb"))) {
                status = lines.skip(3).findFirst().get();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        return status;
    }

}
