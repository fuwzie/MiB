package mib;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */




import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Gustav
 */
public class OmradeRasSok extends javax.swing.JFrame {
    private InfDB idb;

    public OmradeRasSok(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVisaAliensEfterOmrade = new javax.swing.JLabel();
        lblVisaAliensEfterRas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaRasSok = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaPlatsSok = new javax.swing.JTextArea();
        cbAlienPlats = new javax.swing.JComboBox<>();
        cbAlienRas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblVisaAliensEfterOmrade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVisaAliensEfterOmrade.setText("Visa alla aliens platser efter område");

        lblVisaAliensEfterRas.setText("Visa aliens efter ras");

        txtareaRasSok.setColumns(20);
        txtareaRasSok.setRows(5);
        jScrollPane1.setViewportView(txtareaRasSok);

        txtareaPlatsSok.setColumns(20);
        txtareaPlatsSok.setRows(5);
        jScrollPane2.setViewportView(txtareaPlatsSok);

        cbAlienPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Götaland", "Norrland", "Svealand" }));
        cbAlienPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlienPlatsActionPerformed(evt);
            }
        });

        cbAlienRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));
        cbAlienRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlienRasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(cbAlienPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblVisaAliensEfterOmrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVisaAliensEfterRas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAlienRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVisaAliensEfterRas)
                    .addComponent(lblVisaAliensEfterOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlienPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAlienRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    private void cbAlienPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienPlatsActionPerformed
    String valtPlats = (String) cbAlienPlats.getSelectedItem();
    String sqlFraga = "SELECT alien.Alien_ID, alien.Namn, plats.benamning AS Plats " +
                      "FROM alien " +
                      "JOIN plats ON alien.Plats = plats.plats_id " +
                      "WHERE plats.finns_i IN (SELECT omrades_id FROM omrade WHERE benamning = '" + valtPlats + "')";
    
    try {
        ArrayList<HashMap<String, String>> alienPlatsLista = idb.fetchRows(sqlFraga);
        
        // Iterera genom HashMap/ArrayList
        for (HashMap<String, String> alien : alienPlatsLista) {
            // Hämta data från HashMap
            String alienID = alien.get("Alien_ID");
            String namn = alien.get("Namn");
            String plats = alien.get("Benamning");
            
            // Formatering av output
            String output = String.format("ID: %s, Namn: %s, Plats: %s%n", alienID, namn, plats);
            
            // Output skickas ut i textruta
            txtareaPlatsSok.append(output);
        }
    } catch (InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
   
    }//GEN-LAST:event_cbAlienPlatsActionPerformed

    private void cbAlienRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienRasActionPerformed
        txtareaRasSok.setText("");
        String valdRas= (String) cbAlienRas.getSelectedItem();
        String sqlFraga = "";
        
        if ("Worm".equals(valdRas)) {
        
        sqlFraga = "SELECT alien.alien_id, registreringsdatum, epost, losenord, namn, telefon, plats, ansvarig_agent, langd FROM alien\n" +
                   "JOIN worm ON alien.alien_id = worm.Alien_ID;";
      
    try {
        ArrayList<HashMap<String, String>> alienWormLista = idb.fetchRows(sqlFraga);
        
        // Iterera genom HashMap/ArrayList
        for (HashMap<String, String> alien : alienWormLista) {
            // Hämta data från HashMap
            String alienID = alien.get("Alien_ID");
            String registreringsdatum = alien.get("Registreringsdatum");
            String epost = alien.get("Epost");
            String namn = alien.get("Namn");
            String telefon = alien.get("Telefon");
            String plats = alien.get("Plats");
            String ansvarigAgent = alien.get("Ansvarig_Agent");
            String langd = alien.get("Langd");
            
            //Formatering av output
            String output = String.format("ID: %s, Datum: %s, Epost: %s, Namn: %s, Telefon: %s, Plats: %s, Agent: %s, Längd: %s%n", 
                    alienID, registreringsdatum, epost, namn, telefon, plats, ansvarigAgent, langd);
            
            // Output skickas ut i textruta
            txtareaRasSok.append(output);
        }
    } catch (InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
        }
        
    else if ("Boglodite".equals(valdRas)) {
        
        sqlFraga = "SELECT alien.alien_id, registreringsdatum, epost, losenord, namn, telefon, plats, ansvarig_agent, antal_boogies FROM alien\n" +
                   "JOIN boglodite ON alien.alien_id = boglodite.Alien_ID;";
      
    try {
        ArrayList<HashMap<String, String>> alienBogloditeLista = idb.fetchRows(sqlFraga);
        
        // Iterera genom HashMap/ArrayList
        for (HashMap<String, String> alien : alienBogloditeLista) {
            // Hämta data från HashMap
            String alienID = alien.get("Alien_ID");
            String registreringsdatum = alien.get("Registreringsdatum");
            String epost = alien.get("Epost");
            String namn = alien.get("Namn");
            String telefon = alien.get("Telefon");
            String plats = alien.get("Plats");
            String ansvarigAgent = alien.get("Ansvarig_Agent");
            String antalBoogies = alien.get("Antal_Boogies");
            
            //Formatering av output
            String output = String.format("ID: %s, Datum: %s, Epost: %s, Namn: %s, Telefon: %s, Plats: %s, Agent: %s, Boogies: %s%n", 
                    alienID, registreringsdatum, epost, namn, telefon, plats, ansvarigAgent, antalBoogies);
            
            // Output skickas ut i textruta
            txtareaRasSok.append(output);
        }
    } catch (InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
        
    } else if ("Squid".equals(valdRas)) {
        
        sqlFraga = "SELECT alien.alien_id, registreringsdatum, epost, losenord, namn, telefon, plats, ansvarig_agent, antal_armar FROM alien\n" +
                   "JOIN squid ON alien.alien_id = squid.Alien_ID;";
    
    
    try {
        ArrayList<HashMap<String, String>> alienSquidLista = idb.fetchRows(sqlFraga);
        
        // Iterera genom HashMap/ArrayList
        for (HashMap<String, String> alien : alienSquidLista) {
            // Hämta data från HashMap
            String alienID = alien.get("Alien_ID");
            String registreringsdatum = alien.get("Registreringsdatum");
            String epost = alien.get("Epost");
            String namn = alien.get("Namn");
            String telefon = alien.get("Telefon");
            String plats = alien.get("Plats");
            String ansvarigAgent = alien.get("Ansvarig_Agent");
            String antalArmar = alien.get("Antal_Armar");
            
            //Formatering av output
            String output = String.format("ID: %s, Datum: %s, Epost: %s, Namn: %s, Telefon: %s, Plats: %s, Agent: %s, Armar: %s%n", 
                    alienID, registreringsdatum, epost, namn, telefon, plats, ansvarigAgent, antalArmar);
            
            // Output skickas ut i textruta
            txtareaRasSok.append(output);
        }
    } catch (InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }}
    }//GEN-LAST:event_cbAlienRasActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OmradeRasSok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OmradeRasSok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OmradeRasSok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OmradeRasSok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAlienPlats;
    private javax.swing.JComboBox<String> cbAlienRas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblVisaAliensEfterOmrade;
    private javax.swing.JLabel lblVisaAliensEfterRas;
    private javax.swing.JTextArea txtareaPlatsSok;
    private javax.swing.JTextArea txtareaRasSok;
    // End of variables declaration//GEN-END:variables

    private static class infException {

        public infException() {
        }
    }}

