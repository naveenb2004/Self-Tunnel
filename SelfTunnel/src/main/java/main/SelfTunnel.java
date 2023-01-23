/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import com.formdev.flatlaf.FlatDarkLaf;
import java.io.File;

/**
 *
 * @author naveenb2004
 */
public class SelfTunnel {

    public static void main(String[] args) {
        File directory = new File(helper.settings.workPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        FlatDarkLaf.setup();
        new front.main().setVisible(true);
    }
}
