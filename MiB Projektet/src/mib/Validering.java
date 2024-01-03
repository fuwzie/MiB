/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfException;
import oru.inf.InfDB;

/**
 *
 * @author Gustav, Neryse, Oskar
 */

public class Validering {
    // Deklarerar och instansierar databasuppkoppling
    private static InfDB idb;

    public Validering(InfDB idb) {
        this.idb = idb;
    }
    
    
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        // En metod för att se om en JTextField inte är tom
        // Börjar med att sätta resultat till true
        boolean resultat = true;

        if (rutaAttKolla.getText().isEmpty()) {
            // Om vår textfield är tom, ge felmeddelande och sätt resultat till false
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }

        return resultat;
    }
    
    public static boolean textFaltHarVardeComboBox(JComboBox rutaAttKolla) {
        // Metoden fungerar på samma sätt som ovan men gjordes om för att stödja combobox options istället.
        boolean resultat = true;

        // Om rutans valda "item" är null, eller om den konverterade rutans sträng är tom.
        if (rutaAttKolla.getSelectedItem() == null || rutaAttKolla.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }

        return resultat;
    }
    
    
    public static boolean isHelTal(JTextField rutaAttKolla){
        // Metod som kollar om värdet på vår TextField är ett heltal (en integer)
        boolean resultat = true;

        try {
            // Använder parseInt för att kolla om vår string inkluderar en int
            String inStrang = rutaAttKolla.getText();
            Integer.parseInt(inStrang);
            rutaAttKolla.requestFocus();
        } catch (NumberFormatException e) {
            // Om den inte gör det, ge felmeddelande till användaren
            JOptionPane.showMessageDialog(null, "Var god mata in ett heltal");
            resultat = false;
            rutaAttKolla.requestFocus();
        }

        return resultat;
    }
    
    public static boolean isDoubleInputDialog(String input) {
        // Metoden fungerar på samma sätt som den ovan, fast tar in String som parameter och kollar istället efter doublevärden.
        // Användningsområdet är när man har en Input Dialog
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
        // Metoden fungerar på samma sätt som den ovan, fast tar in String som parameter och kollar efter integers.
        // Användningsområdet är när man har en Input Dialog
        boolean resultat = true;

        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god mata in ett heltal");
            resultat = false;
        }

        return resultat;
    }   
    
    
    public static boolean kollaAdminStatus(String nyString) {
        // Används för att logga in i korrekt ruta om man är agent
        // Denna metod jämför den inmatade strängen för att se om värdet "J" eller "N" returneras och sätter därefter en adminstatus som true eller false    
        boolean admin = true;

        if (nyString.equals("J")) {
            admin = true;
        }

        if (nyString.equals("N")) {
            admin = false;
        }

        if (nyString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Användaren fanns ej i registret.");
        }

        return admin;

    }
    
    public static boolean kollaUniktIDAlien (JTextField idRuta) {
        // Metod som kollar om en aliens id är unikt (används vid registrering av alien)
        // Sätter värdet på unikt ID till true som default;
        boolean uniktId = true;

        if (textFaltHarVarde(idRuta) && isHelTal(idRuta)) {
            // Hämtar ut värdet på ID för att sedan kunna användas i SQL-frågor
            String idKoll = idRuta.getText();

            try {
                // Kollar om inmatade ID finns i registret
                String idFraga = "SELECT alien_id FROM alien WHERE alien_id = " + idKoll;
                String idSvar = idb.fetchSingle(idFraga);

                if (idSvar != null) {
                    // Om ID returnerar värde, tala om för användaren att ID inte är unikt.
                    uniktId = false;
                    JOptionPane.showMessageDialog(null, "ID på Alien måste vara unikt.");
                }

            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
            }
        }

        return uniktId;
    }
    public static boolean kollaUniktIDAgent (JTextField idRuta) {
        // Kollar om en agents ID är unikt (används vid registrering av agenter)
        // Sätter värdet på unikt ID till true som default;
        boolean uniktId = false;

        if (textFaltHarVarde(idRuta) && isHelTal(idRuta)) {
            // Hämtar ut värdet på ID för att sedan kunna användas i SQL-frågor
            String idKoll = idRuta.getText();

            try {
                // Kollar om inmatade ID finns i registret
                String idFraga = "SELECT agent_id FROM agent WHERE agent_id = " + idKoll;
                String idSvar = idb.fetchSingle(idFraga);

                if (idSvar != null) {
                    // Om ID returnerar värde, tala om för användaren att ID inte är unikt.
                    uniktId = false;
                    JOptionPane.showMessageDialog(null, "ID på Agent måste vara unikt.");
                } else {
                    // Om ID inte hittas i databasen
                    uniktId = true;
                }

            } catch(InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
            }
        }

        return uniktId;
    }
    public static boolean kollaUniktIDUtrustning (JTextField idRuta) {
        // Kollar om en utrustnings ID är unikt (används vid registrering av utrustning)
        // Sätter värdet på unikt ID till true som default;
        boolean uniktId = false;

        if (textFaltHarVarde(idRuta) && isHelTal(idRuta)) {
            // Hämtar ut värdet på ID för att sedan kunna användas i SQL-frågor
            String idKoll = idRuta.getText();

            try {
                // Kollar om inmatade ID finns i registret
                String idFraga = "SELECT utrustnings_id FROM utrustning WHERE utrustnings_id = " + idKoll;
                String idSvar = idb.fetchSingle(idFraga);

                if (idSvar != null) {
                    // Om ID returnerar värde, tala om för användaren att ID inte är unikt.
                    uniktId = false;
                    JOptionPane.showMessageDialog(null, "ID på utrustning måste vara unikt.");
                } else {
                    // Om ID inte hittas i databasen
                    uniktId = true;
                }

            } catch(InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
            }
        }

        return uniktId; 
    }
    
     public static boolean kollaUnikEpostForAlien(JTextField nyEpost) {
        // En metod för att kolla om en aliens epost är unik, används vid nyregistrering av alien
        // Sätter värdet på unik epost till false som default
        boolean epost = false;

        if (textFaltHarVarde(nyEpost)) {
            String alienText = nyEpost.getText();

            // Kollar så textfältet matchar vår formattering av epostadresser
            // Formatet är: tecken (De flesta typer av tecken och siffror) följt av @ och sedan fler tecken.
            if (alienText.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                // Om strängen inte slutar med @mib.net (agenteposten), fortsätt med metoden
                if (!alienText.endsWith("@mib.net")) {

                    try {
                        // Kolla om eposten finns i registret redan.
                        String alienFraga = "SELECT epost FROM alien WHERE epost = '" + alienText + "'";
                        String alienSvar = idb.fetchSingle(alienFraga);

                        if (alienSvar != null) {
                            // Om eposten fanns, sätt värde till false (inte unikt) och ge felmeddelande
                            JOptionPane.showMessageDialog(null, "Eposten var inte unik");
                        } else {
                            epost = true;
                        }
                    } catch (InfException ex) {
                        JOptionPane.showMessageDialog(null, "Något gick fel");
                        System.out.println("Internt felmeddelande: " + ex.getMessage());
                    }
                } else {
                    // Om epostadressen slutar med "@mib.net"
                    JOptionPane.showMessageDialog(null, "Epost får ej sluta med @mib.net, endast reserverat för agenter.");
                }
            } else {
                // Om epostadressen är i felaktigt format
                JOptionPane.showMessageDialog(null, "Eposten var skriven i felaktigt format.");
            }
        }

        return epost;
    }
     public static boolean kollaUnikEpostForAgent(JTextField nyEpost) {
        // En metod för att kolla om en agents epost är unik, används vid nyregistrering av agent
        // Sätter värdet på unik epost till false som default
        boolean epost = false;

        if (textFaltHarVarde(nyEpost)) {
            String agentText = nyEpost.getText();

            // Kollar så textfältet matchar vår formattering av epostadresser
            // Formatet är: tecken (De flesta typer av tecken och siffror) följt av @ och sedan fler tecken.
            if (agentText.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                // Om strängen inte slutar med @mib.net (agenteposten), fortsätt med metoden
                if (agentText.endsWith("@mib.net")) {

                    try {
                        // Kolla om eposten finns i registret redan.
                        String agentFraga = "SELECT epost FROM agent WHERE epost = '" + agentText + "'";
                        String agentSvar = idb.fetchSingle(agentFraga);

                        if (agentSvar != null) {
                            // Om eposten fanns, ge felmeddelande
                            JOptionPane.showMessageDialog(null, "Eposten var inte unik");
                        } else {
                            epost = true;
                        }
                    } catch (InfException ex) {
                        JOptionPane.showMessageDialog(null, "Något gick fel");
                        System.out.println("Internt felmeddelande: " + ex.getMessage());
                    }
                } else {
                    // Om epostadressen inte slutar med "@mib.net"
                    JOptionPane.showMessageDialog(null, "Epost måste sluta med @mib.net på grund av sekretesskäl.");
                }
            } else {
                // Om epostadressen är i felaktigt format
                JOptionPane.showMessageDialog(null, "Eposten var skriven i felaktigt format.");
            }
        }

        return epost;
    }
     
    public static boolean kollaLosenordLangd(JTextField losenAttKolla) {
        // Enkel metod för att se till så lösenord inte överskrider 6 tecken (databasgräns)
        // Sätter först godkänt till true, men hade kunnat vara tvärtom.
        boolean godkantLosenord = true;

        if (textFaltHarVarde(losenAttKolla)) {
            // Sätter maxlängden på lösenordet till 6 vilket är databasens gräns
            int maxLangd = 6;
            String losenord = losenAttKolla.getText();

            // Jämför lösenordets längd med specifierade maxlängden.
            if (losenord.length() > maxLangd) {
                // Om lösenordet är för långt (enligt databasen)
                godkantLosenord = false;
                JOptionPane.showMessageDialog(null, "Lösenordet får vara max 6 tecken");
            }
        }

        return godkantLosenord;
    }
    public static boolean kollaTelefonFormat(JTextField telefonAttKolla) {
        // Metod för att kolla om telefonformatet stämmer överens, "0000-0000"
        // Sätter först att formatet inte stämmer (före koller)
        boolean formatStammer = false;

        // Hämtar ut värdet för att kunna kolla om det är tomt
        String telefonenAttKolla = telefonAttKolla.getText();

        // Om värdet är lika med eller under 30 samt inte är tomt
        if (telefonenAttKolla.length() <= 30) {
            if (telefonenAttKolla != null && !telefonenAttKolla.isEmpty()) {
                // Detta format betyder att den tittar efter endast siffror, följt av ett -, följt av siffror i obestämd längd på vardera sida (max 30)
                if (telefonenAttKolla.matches("\\d+-\\d+")) {
                    // Om formatet är giltigt, returnera true
                    formatStammer = true;
                } else {
                    // Om användaren inte använder siffror-siffror som format.
                    JOptionPane.showMessageDialog(null, "Ogiltigt telefonnummerformat. Använd formatet: siffror-siffror");
                }
            } else {
                // Om telefonnumret är tomt
                JOptionPane.showMessageDialog(null, "Telefonnumret får inte vara tomt");
            }
        } else {
            // Om telefonnumret är för långt
            JOptionPane.showMessageDialog(null, "Angivet telefonnummer är för långt.");
        }

    return formatStammer;
}
    public static boolean kollaNamnFormat(JTextField namnAttKolla) {
        // Enkel metod som kollar så namn inte överskrider 20 tecken.
        boolean namnLangd = false;

        if (textFaltHarVarde(namnAttKolla)) {
            String namnet = namnAttKolla.getText();

            if (namnet.length() <= 20) {
                namnLangd = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ditt namn är för långt. Ange annat namn eller förkortad version.");
            }
        }

        return namnLangd;
    }
    public static boolean kollaDatumFormat(JTextField datumAttKolla) {
        // Metod som kollar så vårat datumformat stämmer öevrens med ÅÅÅÅ-MM-DD
        boolean formatStammer = false;

        if (textFaltHarVarde(datumAttKolla)) {
            String nyttVarde = datumAttKolla.getText();

            // Formatet under tittar så det först finns exakt 4 siffror, ett bindestreck, 2 siffror, bindestreck och sedan 2 siffror igen. 
            if (nyttVarde.matches("\\d{4}-\\d{2}-\\d{2}")) {
                formatStammer = true;
            } else {
                JOptionPane.showMessageDialog(null, "Datumet måste vara i formatet ÅÅÅÅ-MM-DD!");
            }
        }

        return formatStammer; 
    }
    
    public static boolean kollaOmAgentFinns(JTextField agentAttKolla) {
        // Metod som kollar om en agent finns i databasen, används för att få fram statistik eller för att redigera data
        boolean agentFanns = false;

        // Om fältet är ett heltal
        if (textFaltHarVarde(agentAttKolla) && isHelTal(agentAttKolla)) {
            try {
                // Hämta ner värdet på textrutan till en sträng
                String valdAgentID = agentAttKolla.getText();

                // Kolla i databasen om vi får en matchning (om agenten finns)
                String kollaOmAgentFinns = "SELECT agent_id FROM agent WHERE agent_id = " + valdAgentID;
                String svarOmAgentFinns = idb.fetchSingle(kollaOmAgentFinns);

                // Om svaret inte returnerar null så finns agenten.
                if (svarOmAgentFinns != null) {
                    agentFanns = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Agenten fanns ej i databasen.");
                }
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande: " + ex);
            }
        }

        return agentFanns;
    }
    
    public static boolean kollaOmAlienFinns(JTextField alienAttKolla) {
        // Metod som kollar om en alien finns i databasen, används för att få fram statistik eller för att redigera data
        boolean alienFanns = false;

        // Om fältet är ett heltal
        if (textFaltHarVarde(alienAttKolla) && isHelTal(alienAttKolla)) {
            try {
                // Hämta ner värdet på textrutan till en sträng
                String valdAlienID = alienAttKolla.getText();

                // Kolla i databasen om vi får en matchning (om alien finns)    
                String kollaOmAlienFinns = "SELECT alien_id FROM alien WHERE alien_id = " + valdAlienID;
                String svarOmAlienFinns = idb.fetchSingle(kollaOmAlienFinns);

                // Om svaret inte returnerar null så finns vår alien.
                if (svarOmAlienFinns != null) {
                    alienFanns = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Vald alien fanns ej i databasen.");
                }
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande: " + ex);
            }
        }

        return alienFanns;
    }
    public static boolean kollaOmUtrustningFinns(JTextField utrustningAttKolla) {
        // Metod som kollar om utrustning finns i databasen, används för att få fram statistik eller för att redigera data
        boolean utrustningFanns = false;

        // Om fältet är ett heltal
        if (textFaltHarVarde(utrustningAttKolla) && isHelTal(utrustningAttKolla)) {
            try {
                // Hämta ner värdet på textrutan till en sträng
                String valdUtrustningID = utrustningAttKolla.getText();

                // Kolla i databasen om vi får en matchning (om utrustning finns) 
                String kollaOmUtrustningFinns = "SELECT utrustnings_id FROM utrustning WHERE utrustnings_id = " + valdUtrustningID;
                String svarOmUtrustningFinns = idb.fetchSingle(kollaOmUtrustningFinns);

                // Om svaret inte returnerar null så finns vår utrustning.
                if (svarOmUtrustningFinns != null) {
                    utrustningFanns = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Vald utrustning fanns ej i databasen.");
                }
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande: " + ex);
            }
        }

        return utrustningFanns;
    }
    public static boolean kollaOmPlatsFinns(JTextField platsAttKolla) {
        // Metod som kollar om en plats finns i databasen, används för att få fram statistik eller för att redigera data
        boolean platsFanns = false;

        // Hämta ner värdet på textrutan till en sträng
        String platsKoll = platsAttKolla.getText();

        // Om fältet är ett heltal
        if (textFaltHarVarde(platsAttKolla) && isHelTal(platsAttKolla)) {
            try {
                // Kolla i databasen om vi får en matchning (om plats finns) 
                String kollaOmplatsFinns = "SELECT plats_id FROM plats WHERE plats_id = " + platsKoll;
                String fannsplats = idb.fetchSingle(kollaOmplatsFinns);

                // Om svaret inte returnerar null så finns platsen.
                if (fannsplats != null) {
                    platsFanns = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Vald plats fanns inte i databasen.");
                }
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Vald plats fanns inte i databasen.");
                System.out.println("Internt felmeddelande: " + ex);
            }
        }

        return platsFanns;
    } 
    public static boolean kollaOmOmradeFinns(JTextField OmradeAttKolla) {
        // Metod som kollar om ett område finns i databasen, används för att få fram statistik eller för att redigera data
        boolean OmradeFanns = false;

        // Hämta ner värdet på textrutan till en sträng
        String OmradeKoll = OmradeAttKolla.getText();

        // Om fältet är ett heltal
        if (textFaltHarVarde(OmradeAttKolla) && isHelTal(OmradeAttKolla)) {
            try {
                // Kolla i databasen om vi får en matchning (om område finns) 
                String kollaOmOmradeFinns = "SELECT Omrades_id FROM Omrade WHERE Omrades_id = " + OmradeKoll;
                String fannsOmrade = idb.fetchSingle(kollaOmOmradeFinns);

                // Om svaret inte returnerar null så finns området.
                if (fannsOmrade != null) {
                    OmradeFanns = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Valt område fanns inte i databasen.");
                }
            } catch(InfException ex) {
                JOptionPane.showMessageDialog(null, "Valt område fanns inte i databasen.");
                System.out.println("Internt felmeddelande: " + ex);
            }
        }

        return OmradeFanns;
    }
}


