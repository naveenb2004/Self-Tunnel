/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import com.formdev.flatlaf.FlatDarkLaf;

/**
 *
 * @author naveenb2004
 */
public class SelfTunnel {

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        new front.main().setVisible(true);
    }
}
