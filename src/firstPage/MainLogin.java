/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstPage;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class MainLogin {
     public static void main(String[] args) {

        JFrame splash = new FirstPage();
        splash.setVisible(true);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(FirstPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        splash.setVisible(false);
        splash.dispose();

        JFrame spla = new Locker();
        spla.setVisible(true);
    }
}


