/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author naveenb2004
 */
public class details {

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

    public static String telegramAPI() {
        return "";
    }

    public static String telegramUsername() {
        return "";
    }

}
