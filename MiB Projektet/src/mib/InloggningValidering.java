/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Otte
 */
public class InloggningValidering {
    
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }
        
        return resultat;
    }
        
    public static boolean kollaAdminStatus(String nyString) {
        boolean admin = true;
        if(nyString.equals("J")) {
            admin = true;
            
        }
        if(nyString.equals("N")) {
            admin = false;
        }
        if(nyString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Användaren fanns ej i registret.");
        }
        return admin;
    }
}
