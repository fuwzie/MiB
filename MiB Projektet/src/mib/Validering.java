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
import oru.inf.InfDB;



/**
 *
 * @author Otte
 */
public class Validering {
    private static InfDB idb;
    public Validering() {
    }
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
    
    //Används för att logga in i korrekt ruta om man är agent
    //Denna metod jämför den inmatade strängen för att se om värdet "J" eller "N" returneras och sätter därefter en adminstatus som true eller false
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
    
    public static boolean kollaUniktIDAlien (JTextField idRuta) {
        //Sätter värdet på unikt ID till true som default;
        boolean uniktId = true;
        if(textFaltHarVarde(idRuta) && isHelTal(idRuta)) {
        
        //Hämtar ut värdet på ID för att sedan kunna användas i sql-frågor
        String idKoll = idRuta.getText();
        
        try {
            
            //Kollar om inmatade ID finns i registret
            String idFraga = "SELECT alien_id FROM alien WHERE alien_id = " + idKoll;
            String idSvar = idb.fetchSingle(idFraga);
            
            if(idSvar != null) {
                //Om ID returnerar värde, tala om för användare att ID inte är unikt.
                uniktId = false;
                JOptionPane.showMessageDialog(null, "ID på Alien måste vara unikt.");
            }
            
        } catch(InfException ex) {
           JOptionPane.showMessageDialog(null, "Något gick fel");
        } }
        return uniktId; 
    }
    
     public static boolean kollaUnikEpostForAlien(JTextField nyEpost) {
        //Sätter värdet på unik epost till sant som default
         boolean epost = true;
        if(textFaltHarVarde(nyEpost)) {
        String alienText = nyEpost.getText();
        //Om strängen inte slutar med @mib.net (agenteposten), fortsätt med metod
        if(!alienText.endsWith("@mib.net")) {
        
            try {
                //Kolla om eposten finns i registret redan.
                String alienFraga = "SELECT epost FROM alien WHERE epost = '" + alienText +"'";
                String alienSvar = idb.fetchSingle(alienFraga);
                
                if(alienSvar != null) {
                    //Om eposten fanns, sätt värde till false (inte unikt) och ge felmeddelande
                    epost = false;
                    JOptionPane.showMessageDialog(null, "Eposten var inte unik"); }
        }   catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel.");
        }} 
        else {
            //Om epostadressen slutar med "@mib.net"
            JOptionPane.showMessageDialog(null, "Epost får ej sluta med @mib.net, endast reserverat för agenter.");
        }}
        return epost;
    }
     
    public static boolean kollaLosenordLangd(JTextField losenAttKolla) {
        boolean godkantLosenord = true;
        if(textFaltHarVarde(losenAttKolla)) {
        //Sätter maxlängden på lösenordet till 6 vilket är databasens gräns
        int maxLangd = 6;
        String losenord = losenAttKolla.getText();
        //Jämför lösenordets längd med specifierade maxlängden.
        if(losenord.length() > maxLangd) {
           //Om lösenordet är för långt (enligt databasen)
           godkantLosenord = false;
           JOptionPane.showMessageDialog(null, "Lösenordet får vara max 6 tecken");
        }}
        
        return godkantLosenord;
    }
}

