/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

/**
 *
 * @author Otte
 */
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfException;


/**
 *
 * @author Otte
 */
public class Validering {
    
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }
        
        return resultat;
    }
    
    public static boolean isHelTal(JTextField rutaAttKolla){
        boolean resultat = true;
       
        try {
            String inStrang = rutaAttKolla.getText();
            Integer.parseInt(inStrang);
            rutaAttKolla.requestFocus();
        } 
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god mata in ett heltal");
            resultat = false;
            rutaAttKolla.requestFocus();
        }
        
        return resultat;
    }
}

