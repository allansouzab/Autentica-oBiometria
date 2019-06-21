/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.com.biometria;
import java.io.IOException;
import org.frontendtest.components.ImageComparison;
import net.coobird.thumbnailator.*;
import form.Login;

/**
 *
 * @author allan
 */
public class AutComBiometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Login login = new Login();
        login.setResizable(false);
        login.setVisible(true);
        
    }
}
