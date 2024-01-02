/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gustav
 */
public class RegistreraAgent extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form RegistreraAgent
     */
    public RegistreraAgent(InfDB idb) {
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

        txtAgentId = new javax.swing.JTextField();
        lblRegistreraAgent = new javax.swing.JLabel();
        txtAgentNamn = new javax.swing.JTextField();
        txtAgentTelefon = new javax.swing.JTextField();
        txtAgentAnstallningsDatum = new javax.swing.JTextField();
        txtAgentEpost = new javax.swing.JTextField();
        txtAgentLosenord = new javax.swing.JTextField();
        btnRegistreraAgent = new javax.swing.JButton();
        lblAgentID = new javax.swing.JLabel();
        lblAgentNamn = new javax.swing.JLabel();
        lblAgentTelefon = new javax.swing.JLabel();
        lblAgentAnstallningsDatum = new javax.swing.JLabel();
        lblAgentAdministrator = new javax.swing.JLabel();
        lblAgentEpost = new javax.swing.JLabel();
        lblAgentLosenord = new javax.swing.JLabel();
        lblAgentOmrade = new javax.swing.JLabel();
        cbAgentOmrade = new javax.swing.JComboBox<>();
        cbAgentAdministrator = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtAgentId.setText("100");

        lblRegistreraAgent.setText("Registrera agent");

        txtAgentNamn.setText("Johan");

        txtAgentTelefon.setText("555-555");

        txtAgentAnstallningsDatum.setText("2023-12-25");

        txtAgentEpost.setText("mail@mib.net");

        txtAgentLosenord.setText("lösen");
        txtAgentLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgentLosenordActionPerformed(evt);
            }
        });

        btnRegistreraAgent.setText("Registrera");
        btnRegistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAgentActionPerformed(evt);
            }
        });

        lblAgentID.setText("Agentens ID:");

        lblAgentNamn.setText("Namn:");

        lblAgentTelefon.setText("Telefonnummer:");

        lblAgentAnstallningsDatum.setText("Anställningsdatum:");

        lblAgentAdministrator.setText("Administratör?");

        lblAgentEpost.setText("E-postadress:");

        lblAgentLosenord.setText("Lösenord:");

        lblAgentOmrade.setText("Område:");

        cbAgentOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "4" }));

        cbAgentAdministrator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "J", "N" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgentID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(txtAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAgentAnstallningsDatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgentAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAgentNamn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAgentTelefon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAgentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAgentAdministrator)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbAgentAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAgentOmrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAgentOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblRegistreraAgent))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAgentEpost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgentEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAgentLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistreraAgent)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAgentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblRegistreraAgent)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentID)
                    .addComponent(txtAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentNamn)
                    .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentTelefon)
                    .addComponent(txtAgentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgentAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgentAnstallningsDatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentAdministrator)
                    .addComponent(cbAgentAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgentEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgentEpost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentLosenord)
                    .addComponent(txtAgentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentOmrade)
                    .addComponent(cbAgentOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnRegistreraAgent)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    
    private void btnRegistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAgentActionPerformed
    //Massiv validering som kollar så alla textfält har värden, de som är int (id och område) valideras så att de är heltal, epost och id jämförs även i databasen för att se om de är unika.
        if (Validering.kollaUniktIDAgent(txtAgentId) 
    && Validering.kollaNamnFormat(txtAgentNamn) 
    && Validering.kollaTelefonFormat(txtAgentTelefon) 
    && Validering.kollaDatumFormat(txtAgentAnstallningsDatum) 
    && Validering.kollaUnikEpostForAgent(txtAgentEpost) 
    && Validering.kollaLosenordLangd(txtAgentLosenord)) {
            String nyttAgent_id = txtAgentId.getText();
            String nyttNamn = txtAgentNamn.getText();
            String nyTelefon = txtAgentTelefon.getText();
            String nyttAnstallningsdatum = txtAgentAnstallningsDatum.getText();
            String nyEpost = txtAgentEpost.getText();
            String nyttLosenord = txtAgentLosenord.getText();
            //Behöver använda (String) för att konvertera combobox-värdet till en sträng.
            String nyAdministrator = (String) cbAgentAdministrator.getSelectedItem();
            String nyttOmrade = (String) cbAgentOmrade.getSelectedItem();
            //Insertar alla strängar ovan in i agenttabellen.
            String sqlFraga = "INSERT INTO agent (agent_id, namn, telefon, anstallningsdatum, administrator, epost, losenord, omrade) VALUES (" 
            + nyttAgent_id + ", '" + nyttNamn + "', '" + nyTelefon + "', '" + nyttAnstallningsdatum + "', '" 
            + nyAdministrator + "', '" + nyEpost + "', '" + nyttLosenord + "', " + nyttOmrade + ")";

        try {
            //Om alla värden stämmer.
            idb.insert(sqlFraga);
            JOptionPane.showMessageDialog(null, "Ny agent har registrerats.");
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_btnRegistreraAgentActionPerformed

    private void txtAgentLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgentLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgentLosenordActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraAgent;
    private javax.swing.JComboBox<String> cbAgentAdministrator;
    private javax.swing.JComboBox<String> cbAgentOmrade;
    private javax.swing.JLabel lblAgentAdministrator;
    private javax.swing.JLabel lblAgentAnstallningsDatum;
    private javax.swing.JLabel lblAgentEpost;
    private javax.swing.JLabel lblAgentID;
    private javax.swing.JLabel lblAgentLosenord;
    private javax.swing.JLabel lblAgentNamn;
    private javax.swing.JLabel lblAgentOmrade;
    private javax.swing.JLabel lblAgentTelefon;
    private javax.swing.JLabel lblRegistreraAgent;
    private javax.swing.JTextField txtAgentAnstallningsDatum;
    private javax.swing.JTextField txtAgentEpost;
    private javax.swing.JTextField txtAgentId;
    private javax.swing.JTextField txtAgentLosenord;
    private javax.swing.JTextField txtAgentNamn;
    private javax.swing.JTextField txtAgentTelefon;
    // End of variables declaration//GEN-END:variables
}
