/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Otte
 */
public class Inloggning extends javax.swing.JFrame {
     private InfDB idb;

    /**
     * Creates new form Inloggning
     */
    public Inloggning(InfDB idb) {
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

        lblHeader = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        pwLosenord = new javax.swing.JPasswordField();
        txtEpost = new javax.swing.JTextField();
        btnLoggaIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeader.setText("Välkommen!");

        lblEpost.setText("Ange e-postadress:");

        lblLosenord.setText("Ange lösenord:");

        pwLosenord.setText("jPasswordField1");

        txtEpost.setText("exempel@exempel.se");

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoggaIn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLosenord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pwLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEpost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpost)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenord)
                    .addComponent(pwLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnLoggaIn)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //en kontroll för lyckat inlogg nedan
    private boolean lyckadInloggning = false;
    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        
        //Valideringen ser till att textfälten epost och lösenord inte är tomma
        if (InloggningValidering.textFaltHarVarde(txtEpost) && InloggningValidering.textFaltHarVarde(pwLosenord)) {
            try {
                //Programmet tar emot två strängar, en som epost och en som password.
                String epost = txtEpost.getText();
                String losenord = new String(pwLosenord.getPassword());
                //programmet kollar om epostadressen är en "mibadress", om det är det så kollar den efter adminstatus
                if(epost.endsWith("@mib.net")) {
                    kollaAgentInloggning(epost, losenord);
                    }
                //Annars kollar den efter alla epostadresser som inte slutar med mib.net
                else {
                    kollaAlienInloggning(epost, losenord);
                    }
                if(lyckadInloggning) {
                    //vid lyckad inloggning, stäng nuvarande ruta (och öppna relevant ruta)
                    this.setVisible(false);
        }
            } catch (InfException ex) {
                //Allmänt felmeddelande ifall alla andra kontroller "missar" felet, endast för att hålla programmet från att krascha.
                    JOptionPane.showMessageDialog(null, "Något gick fel");
                    System.out.println("Internt felmeddelande: " + ex.getMessage());
                } 
            } 
    }//GEN-LAST:event_btnLoggaInActionPerformed
        private void kollaAgentInloggning(String epost, String losenord) throws InfException {
                    //Skapar en sql "mall" för alienfrågor, sedan kör den för både epost och lösenord.
                    String agent = "SELECT AGENT_ID FROM mibdb.agent WHERE";
                    String epostFraga = agent + " EPOST='" + epost + "'";
                    String pwFraga = agent + " LOSENORD ='" + losenord + "'";
                    
                    //Hämtar ut svaren för de två sql-frågorna
                    String svar = idb.fetchSingle(epostFraga);
                    String losenSvar = idb.fetchSingle(pwFraga);
                    
                    //Gör en kontroll för att se om något av fälten returnerades tomma, sen jämför om deras slutvärde är densamma (vilket endast sker om epost och lösenord matchar samma användare)
                    if (svar != null && losenSvar != null && svar.equals(losenSvar)) {
                            //Skapar en fråga för att se om vår agent är en administrator
                            String adminFraga = "SELECT ADMINISTRATOR FROM mibdb.agent where AGENT_ID=" + svar;
                            String adminSvar = idb.fetchSingle(adminFraga);
                            //Använder valideringsklassen för att kolla om strängen som returneras är "J" för Ja eller "N" för nej
                            boolean adminStatus = InloggningValidering.kollaAdminStatus(adminSvar);
                            //Ifall true ("J"), kör adminfönstret, annars vanliga agentfönstret
                            if (adminStatus) {
                                new AdminFonster(idb).setVisible(true);
                            } else {
                                new AgentFonster(idb).setVisible(true);
                            }
                            //Om inloggningen lyckades
                            lyckadInloggning = true;
                } else {
                // Felaktiga inloggningsuppgifter för agent/administratör
                    JOptionPane.showMessageDialog(null, "Antingen har du matat in fel uppgifter eller så finns användaren inte.");}
                    }
            
        private void kollaAlienInloggning(String epost, String losenord) throws InfException {
                    //Skapar en sql "mall" för alienfrågor, sedan kör den för både epost och lösenord.
                    String alien = "SELECT ALIEN_ID FROM mibdb.alien WHERE ";
                    String epostFraga = alien + "EPOST='" + epost + "'";
                    String pwFraga = alien + "LOSENORD='" + losenord + "'";
                    //Hämtar ut svaren för de två sql-frågorna
                    String svar = idb.fetchSingle(epostFraga);
                    String losenSvar = idb.fetchSingle(pwFraga);
                    //Gör en kontroll för att se om något av fälten returnerades tomma, sen jämför om deras slutvärde är densamma (vilket endast sker om epost och lösenord matchar samma användare)
                    if(svar != null && losenSvar != null && svar.equals(losenSvar)) {
                       //Öppnar upp relevanta inloggningsrutan och ändrar lyckad inloggning till värdet true för att ha ökad validering
                        new AlienFonster(idb).setVisible(true);
                        lyckadInloggning = true;
                    }   else {
                // Felaktiga inloggningsuppgifter för agent/administratör
                    JOptionPane.showMessageDialog(null, "Antingen har du matat in fel uppgifter eller så finns användaren inte.");
                        }
        }
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
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JPasswordField pwLosenord;
    private javax.swing.JTextField txtEpost;
    // End of variables declaration//GEN-END:variables
}
