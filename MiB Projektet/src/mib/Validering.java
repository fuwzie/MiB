/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

/**
 *
 * @author Otte
 */
import javax.swing.JComboBox;
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
    public Validering(InfDB idb) {
        this.idb = idb;
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
    public static boolean textFaltHarVardeComboBox(JComboBox rutaAttKolla) {
        boolean resultat = true;
        
        if(rutaAttKolla.getSelectedItem() == null || rutaAttKolla.getSelectedItem().toString().isEmpty()) {
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
    
    public static boolean isDoubleInputDialog(String input) {
        boolean resultat = true;

        try {
            Double.parseDouble(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god mata in ett tal.");
            resultat = false;
        }

        return resultat;
    }   
    public static boolean isHelTalInputDialog(String input) {
        boolean resultat = true;

        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god mata in ett heltal");
            resultat = false;
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
    public static boolean kollaUniktIDAgent (JTextField idRuta) {
        //Sätter värdet på unikt ID till true som default;
        boolean uniktId = false;
        if(textFaltHarVarde(idRuta) && isHelTal(idRuta)) {
        
        //Hämtar ut värdet på ID för att sedan kunna användas i sql-frågor
        String idKoll = idRuta.getText();
        
        try {
            
            //Kollar om inmatade ID finns i registret
            String idFraga = "SELECT agent_id FROM agent WHERE agent_id = " + idKoll;
            String idSvar = idb.fetchSingle(idFraga);
            
            if(idSvar != null) {
                //Om ID returnerar värde, tala om för användare att ID inte är unikt.
                uniktId = false;
                JOptionPane.showMessageDialog(null, "ID på Agent måste vara unikt.");
            }
            else {
                //Om ID inte hittas i databasen
                uniktId = true;
            }
            
        } catch(InfException ex) {
           JOptionPane.showMessageDialog(null, "Något gick fel");
        } }
        return uniktId; 
    }
    public static boolean kollaUniktIDUtrustning (JTextField idRuta) {
        //Sätter värdet på unikt ID till true som default;
        boolean uniktId = false;
        if(textFaltHarVarde(idRuta) && isHelTal(idRuta)) {
        
        //Hämtar ut värdet på ID för att sedan kunna användas i sql-frågor
        String idKoll = idRuta.getText();
        
        try {
            
            //Kollar om inmatade ID finns i registret
            String idFraga = "SELECT utrustnings_id FROM utrustning WHERE utrustnings_id = " + idKoll;
            String idSvar = idb.fetchSingle(idFraga);
            
            if(idSvar != null) {
                //Om ID returnerar värde, tala om för användare att ID inte är unikt.
                uniktId = false;
                JOptionPane.showMessageDialog(null, "ID på utrustning måste vara unikt.");
            }
            else {
                //Om ID inte hittas i databasen
                uniktId = true;
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
        if(alienText.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
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
        } } else {
            //Om epostadressen är i felaktigt format
            JOptionPane.showMessageDialog(null, "Eposten var skriven i felaktigt format.");
        }}
        return epost;
    }
     public static boolean kollaUnikEpostForAgent(JTextField nyEpost) {
        //Sätter värdet på unik epost till sant som default
         boolean epost = true;
        if(textFaltHarVarde(nyEpost)) {
        String agentText = nyEpost.getText();
        if(!agentText.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
        //Om strängen inte slutar med @mib.net (agenteposten), fortsätt med metod
        if(agentText.endsWith("@mib.net")) {
        
            try {
                //Kolla om eposten finns i registret redan.
                String agentFraga = "SELECT epost FROM agent WHERE epost = '" + agentText +"'";
                String agentSvar = idb.fetchSingle(agentFraga);
                
                if(agentSvar != null) {
                    //Om eposten fanns, sätt värde till false (inte unikt) och ge felmeddelande
                    epost = false;
                    JOptionPane.showMessageDialog(null, "Eposten var inte unik"); }
        }   catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel.");
        }} 
        else {
            //Om epostadressen inte slutar med "@mib.net"
            JOptionPane.showMessageDialog(null, "Epost måste sluta med @mib.net på grund av sekretesskäl.");
        } } else {
            //Om epostadressen är i felaktigt format
            JOptionPane.showMessageDialog(null, "Eposten var skriven i felaktigt format.");
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
    public static boolean kollaTelefonFormat(JTextField telefonAttKolla) {
        boolean formatStammer = true;

    // Hämtar ut värdet för att kunna kolla om det är tomt
    String telefonenAttKolla = telefonAttKolla.getText();

    if (telefonenAttKolla != null && !telefonenAttKolla.isEmpty()) {
        if (telefonenAttKolla.matches("\\d+-\\d+")) {
            // Om formatet är giltigt, returnera true
            formatStammer = true;
        } else {
            // Om användaren inte använder siffror-siffror som format.
            JOptionPane.showMessageDialog(null, "Ogiltigt telefonnummerformat. Använd formatet: siffror-siffror");
            formatStammer = false;
        }
    } else {
        // Om telefonnumret är tomt
        JOptionPane.showMessageDialog(null, "Telefonnumret får inte vara tomt");
        formatStammer = false;
    }

    return formatStammer;
}
    public static boolean kollaNamn(JTextField namnAttKolla) {
        boolean namnLangd = false;
        if(textFaltHarVarde(namnAttKolla)) {
            String namnet = namnAttKolla.getText();
            if(namnet.length() <= 20) {
                namnLangd = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ditt namn är för långt. Ange annat namn eller förkortad version.");
            }
        }
        return namnLangd;
    }
    public static boolean kollaDatumFormat(JTextField datumAttKolla) {
        boolean formatStammer = false;
        if(textFaltHarVarde(datumAttKolla)) {
        String nyttVarde = datumAttKolla.getText();
        if (nyttVarde.matches("\\d{4}-\\d{2}-\\d{2}")) {
            formatStammer = true;
    }
        else {
            JOptionPane.showMessageDialog(null, "Datumet måste vara i formatet ÅÅÅÅ-MM-DD!");
        }
}return formatStammer; }
    
    public static boolean kollaOmAgentFinns(JTextField agentAttKolla) {
        boolean agentFanns = false;
        if(textFaltHarVarde(agentAttKolla) && isHelTal(agentAttKolla)) {
            try{
            String valdAgentID = agentAttKolla.getText();
                String kollaOmAgentFinns = "SELECT agent_id FROM agent WHERE agent_id = " + valdAgentID;
                String svarOmAgentFinns = idb.fetchSingle(kollaOmAgentFinns);
                if(svarOmAgentFinns != null) {
                    agentFanns = true;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Agenten fanns ej i databasen.");
                }
            } catch(InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande: " +ex);
            }
            }
        return agentFanns;
    }
    
    public static boolean kollaOmAlienFinns(JTextField alienAttKolla) {
        boolean alienFanns = false;
        if(textFaltHarVarde(alienAttKolla) && isHelTal(alienAttKolla)) {
            try{
            String valdAlienID = alienAttKolla.getText();
                String kollaOmAlienFinns = "SELECT alien_id FROM alien WHERE alien_id = " + valdAlienID;
                String svarOmAlienFinns = idb.fetchSingle(kollaOmAlienFinns);
                if(svarOmAlienFinns != null) {
                    alienFanns = true;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Vald alien fanns ej i databasen.");
                }
            } catch(InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande: " +ex);
            }
            }
        return alienFanns;
    }
    public static boolean kollaOmUtrustningFinns(JTextField utrustningAttKolla) {
        boolean utrustningFanns = false;
        if(textFaltHarVarde(utrustningAttKolla) && isHelTal(utrustningAttKolla)) {
            try{
            String valdUtrustningID = utrustningAttKolla.getText();
                String kollaOmUtrustningFinns = "SELECT utrustnings_id FROM utrustning WHERE utrustnings_id = " + valdUtrustningID;
                String svarOmUtrustningFinns = idb.fetchSingle(kollaOmUtrustningFinns);
                if(svarOmUtrustningFinns != null) {
                    utrustningFanns = true;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Vald utrustning fanns ej i databasen.");
                }
            } catch(InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande: " +ex);
            }
            }
        return utrustningFanns;
    }
}


