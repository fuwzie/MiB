/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gustav, Neryse, Oskar
 */
public class AgentFonster extends javax.swing.JFrame {
     //Deklarerar databasuppkoppling
     private InfDB idb;
     //Sträng som används för att visa vem som är inloggad.
     private String id;
         
    /**
     * Creates new form AgentFonster
     */
    public AgentFonster(InfDB idb, String id) {
        this.idb = idb;
        this.id = id;
        initComponents();
        
        //Använder id:t som skapas under inloggningsprocessen för att hålla koll på vem som är inloggad
        try {
            //Med hjälp av föregående ID så hämtar den ut agentens namn och printar ut det i välkomstmeddelandet
        String agentNamn = "SELECT namn FROM mibdb.agent WHERE agent_id =" + id;
        String agentNamnSvar = idb.fetchSingle(agentNamn);
        lblValkommenAgent.setText("Välkommen  "+agentNamnSvar);
        } 
        catch (InfException ex) {
            //Om agenten inte returnerar ett namn korrekt så sätts labeln till ett felmeddelande + ett popupfönster som ber användare att kontakta admin
            //Ska endast vara nödvändigt i fall då man kan lägga till en agent utan att sätta ett namn
            JOptionPane.showMessageDialog(null, "Kunde ej hitta ditt namn i systemet, kontakta administratör");
            lblValkommenAgent.setText("Välkommen, ditt namn kunde ej hittas");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnLogOut = new javax.swing.JButton();
        lblValkommenAgent = new javax.swing.JLabel();
        btnRegistreraAlien = new javax.swing.JButton();
        btnRegistreraUtrustning = new javax.swing.JButton();
        btnSokAlien = new javax.swing.JButton();
        cbSokOmradesAnsvarig = new javax.swing.JComboBox<>();
        btnLosenordsAndring = new javax.swing.JButton();
        txtSokOmradesAnsvarig = new javax.swing.JTextField();
        lblSokOmradesAnsvarig = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnVisaUtrustning = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtVisaUtrustning = new javax.swing.JTextArea();
        btnRedigeraAlien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAgentRanking = new javax.swing.JTextArea();
        cbAgentRanking = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogOut.setText("Logga ut");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblValkommenAgent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValkommenAgent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValkommenAgent.setText("Välkommen Agent!");

        btnRegistreraAlien.setText("Registrera alien");
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

        btnRegistreraUtrustning.setText("Registrera utrustning");
        btnRegistreraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraUtrustningActionPerformed(evt);
            }
        });

        btnSokAlien.setText("Sök alien");
        btnSokAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAlienActionPerformed(evt);
            }
        });

        cbSokOmradesAnsvarig.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));
        cbSokOmradesAnsvarig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSokOmradesAnsvarigActionPerformed(evt);
            }
        });

        btnLosenordsAndring.setText("Ändra lösenord");
        btnLosenordsAndring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLosenordsAndringActionPerformed(evt);
            }
        });

        lblSokOmradesAnsvarig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSokOmradesAnsvarig.setText("Sök områdesansvarig");

        btnVisaUtrustning.setText("Visa min utrustning");
        btnVisaUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaUtrustningActionPerformed(evt);
            }
        });

        txtVisaUtrustning.setColumns(20);
        txtVisaUtrustning.setRows(5);
        jScrollPane3.setViewportView(txtVisaUtrustning);

        btnRedigeraAlien.setText("Redigera alien");
        btnRedigeraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraAlienActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Visa  agenter med flest aliens");

        txtAgentRanking.setColumns(20);
        txtAgentRanking.setRows(5);
        jScrollPane4.setViewportView(txtAgentRanking);

        cbAgentRanking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Götaland", "Norrland", "Svealand" }));
        cbAgentRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgentRankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogOut))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValkommenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistreraAlien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRedigeraAlien, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbSokOmradesAnsvarig, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSokOmradesAnsvarig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistreraUtrustning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSokOmradesAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSokAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLosenordsAndring, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVisaUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAgentRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValkommenAgent)
                    .addComponent(lblSokOmradesAnsvarig))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistreraAlien)
                    .addComponent(btnRedigeraAlien)
                    .addComponent(cbSokOmradesAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistreraUtrustning)
                    .addComponent(txtSokOmradesAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSokAlien)
                    .addComponent(btnLosenordsAndring))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisaUtrustning)
                    .addComponent(cbAgentRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(8, 8, 8)
                .addComponent(btnLogOut))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        //loggar ut och återvänder användaren till inloggningsmenyn 
        new Inloggning(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void cbSokOmradesAnsvarigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSokOmradesAnsvarigActionPerformed
        String valtOmrade = (String) cbSokOmradesAnsvarig.getSelectedItem(); //deklarerar combobox-val
        String sqlFraga = "SELECT namn FROM agent\n" +
                          "JOIN omradeschef ON agent.agent_id = omradeschef.agent_id\n" +
                          "JOIN omrade on omradeschef.omrade = omrade.Omrades_ID WHERE benamning = '" + valtOmrade + "'"; //deklarerar SQL-fråga
        try {
            String svar = idb.fetchSingle(sqlFraga);
            idb.fetchRows(sqlFraga);
            txtSokOmradesAnsvarig.setText(svar);
        } catch (InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
    }//GEN-LAST:event_cbSokOmradesAnsvarigActionPerformed

    private void btnSokAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAlienActionPerformed
        //Öppnat nytt fönster för aliensökning
        new AlienRegister(idb).setVisible(true);
    }//GEN-LAST:event_btnSokAlienActionPerformed

    private void btnLosenordsAndringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLosenordsAndringActionPerformed
        //Öppnat nytt fönster för lösenordsändring
        new LosenordsandringAgent(idb, id).setVisible(true);
    }//GEN-LAST:event_btnLosenordsAndringActionPerformed

    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        //Öppnat nytt fönster för alienregistrering
        new RegistreraAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    private void btnRegistreraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraUtrustningActionPerformed
        //Öppnat nytt fönster för utrustningsregistrering
        new RegistreraUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_btnRegistreraUtrustningActionPerformed

    private void btnVisaUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaUtrustningActionPerformed
       String sqlFraga = "SELECT u.Benamning, t.Kraftkalla, v.Kaliber "
                    + "FROM innehar_utrustning iu "
                    + "JOIN utrustning u ON iu.Utrustnings_ID = u.Utrustnings_ID "
                    + "LEFT JOIN teknik t ON u.Utrustnings_ID = t.Utrustnings_ID "
                    + "LEFT JOIN vapen v ON u.Utrustnings_ID = v.Utrustnings_ID "
                    + "WHERE iu.Agent_ID = " + id;

    try {
        // idb.fetchRows(sqlFraga) returnerar en ArrayList med HashMap
        ArrayList<HashMap<String, String>> utrustningsLista = idb.fetchRows(sqlFraga);
        
        // SÄtter textruta till tom
        txtVisaUtrustning.setText("");
        
        //  Iterera genom arraylistan och skriver ut info
        for (HashMap<String, String> utrustning : utrustningsLista) {
        // Hämta data från HashMap
        String benamning = utrustning.get("Benamning");
        String kraftkalla = utrustning.get("Kraftkalla");
        String kaliber = utrustning.get("Kaliber");
        
        // Skapar en stringbuilder 
        StringBuilder output = new StringBuilder("Benämning: " + benamning);
        
        // Lägg endast till kraftkälla och kaliber i strängen i de fall dessa inte är null
        if (kraftkalla != null && !kraftkalla.isEmpty()) {
            output.append(", Kraftkälla: ").append(kraftkalla);
        }
        if (kaliber != null && !kaliber.isEmpty()) {
            output.append(", Kaliber: ").append(kaliber);
        }
        
        // Radbrytning
        output.append("\n");
        
        // Resultat printas i textruta
        txtVisaUtrustning.append(output.toString());
    }
} catch (InfException ex){
    //Vid oväntat fel, visa felmeddelande
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnVisaUtrustningActionPerformed

    private void btnRedigeraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraAlienActionPerformed
        //Öppnat nytt fönster för alienredigering
        new RedigeraAlien(idb).setVisible(true);

    }//GEN-LAST:event_btnRedigeraAlienActionPerformed

    private void cbAgentRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgentRankingActionPerformed
        //Deklarera valt område beroende på vilket område som väljs i combobox
        String valtOmrade = (String) cbAgentRanking.getSelectedItem();
        //Deklarera sql-fråga
        String sqlFraga = "SELECT a.Namn, a.Agent_ID, COUNT(al.Alien_ID) AS Antal_Aliens, o.Benamning "
                + "FROM agent a "
                + "JOIN alien al ON a.Agent_ID = al.Ansvarig_Agent "
                + "JOIN omrade o ON a.Omrade = o.Omrades_ID "
                + "WHERE o.Benamning = '" + valtOmrade + "' "
                + "GROUP BY a.Agent_ID "
                + "ORDER BY Antal_Aliens DESC "
                + "LIMIT 3";

try {
    // idb.fetchRows(sqlFraga) returnerar en ArrayList med HashMap
    ArrayList<HashMap<String, String>> agentLista = idb.fetchRows(sqlFraga);
    
    // Sätter text i textrutan till tom
    txtAgentRanking.setText("");
    
    // Iterera genom arraylistan och skriver ut info
    for (HashMap<String, String> agent : agentLista) {
        // Hämta data från HashMap
        String namn = agent.get("Namn");
        String agentId = agent.get("Agent_ID");
        String antalAliens = agent.get("Antal_Aliens");
        
        // Skapar en stringbuilder 
        StringBuilder output = new StringBuilder("Agent Namn: " + namn);
        output.append(", Agent-ID: ").append(agentId);
        output.append(", Antal Aliens: ").append(antalAliens);
        
        // Ny rad i output
        output.append("\n");
        
        // Resultat skrivs ut i textruta
        txtAgentRanking.append(output.toString());
    }
} catch (InfException ex) {
    // Vid oväntat fel, visa felmeddelande
    JOptionPane.showMessageDialog(null, "Något gick fel vid hämtning av agentinformation.");
    System.out.println("Internt felmeddelande: " + ex.getMessage());
}
        
    }//GEN-LAST:event_cbAgentRankingActionPerformed

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
            java.util.logging.Logger.getLogger(AgentFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLosenordsAndring;
    private javax.swing.JButton btnRedigeraAlien;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JButton btnRegistreraUtrustning;
    private javax.swing.JButton btnSokAlien;
    private javax.swing.JButton btnVisaUtrustning;
    private javax.swing.JComboBox<String> cbAgentRanking;
    private javax.swing.JComboBox<String> cbSokOmradesAnsvarig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblSokOmradesAnsvarig;
    private javax.swing.JLabel lblValkommenAgent;
    private javax.swing.JTextArea txtAgentRanking;
    private javax.swing.JTextField txtSokOmradesAnsvarig;
    private javax.swing.JTextArea txtVisaUtrustning;
    // End of variables declaration//GEN-END:variables
}
