/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gustav
 */
public class AlienRegister extends javax.swing.JFrame {
    
    private InfDB idb;

    /**
     * Creates new form AlienRegister
     */
    public AlienRegister(InfDB idb) {
        this.idb = idb;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblAlienRegister = new javax.swing.JLabel();
        btnOmradeRasSok = new javax.swing.JButton();
        txtDatum1 = new javax.swing.JTextField();
        txtEnskildAlienSok = new javax.swing.JTextField();
        btnDatumSok = new javax.swing.JButton();
        btnEnskildAlienSok = new javax.swing.JButton();
        lblDatumSok = new javax.swing.JLabel();
        txtDatum2 = new javax.swing.JTextField();
        lblEnskildAlienSok = new javax.swing.JLabel();
        txtViktigtStreck = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaDatumSok = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaEnskildAlienSok = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAlienRegister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAlienRegister.setText("Alienregister");

        btnOmradeRasSok.setText("Sök efter område eller ras");
        btnOmradeRasSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmradeRasSokActionPerformed(evt);
            }
        });

        txtDatum1.setText("2020-01-09");

        txtEnskildAlienSok.setText("Ange alien-ID");
        txtEnskildAlienSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnskildAlienSokActionPerformed(evt);
            }
        });

        btnDatumSok.setText("Sök");
        btnDatumSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatumSokActionPerformed(evt);
            }
        });

        btnEnskildAlienSok.setText("Sök");
        btnEnskildAlienSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnskildAlienSokActionPerformed(evt);
            }
        });

        lblDatumSok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDatumSok.setText("Sök aliens registrerade mellan specifika datum");

        txtDatum2.setText("2023-11-12");

        lblEnskildAlienSok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEnskildAlienSok.setText("Sök information om enskild alien");

        txtViktigtStreck.setText("-");

        txtareaDatumSok.setColumns(20);
        txtareaDatumSok.setRows(5);
        jScrollPane1.setViewportView(txtareaDatumSok);

        txtareaEnskildAlienSok.setColumns(20);
        txtareaEnskildAlienSok.setRows(5);
        jScrollPane2.setViewportView(txtareaEnskildAlienSok);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblAlienRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDatumSok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                .addComponent(lblEnskildAlienSok))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtViktigtStreck)
                .addGap(7, 7, 7)
                .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDatumSok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEnskildAlienSok, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnskildAlienSok, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnOmradeRasSok, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblAlienRegister)
                .addGap(18, 18, 18)
                .addComponent(btnOmradeRasSok)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatumSok)
                    .addComponent(lblEnskildAlienSok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViktigtStreck)
                    .addComponent(btnDatumSok)
                    .addComponent(btnEnskildAlienSok)
                    .addComponent(txtEnskildAlienSok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnskildAlienSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnskildAlienSokActionPerformed
        // TODO  add your handling code here:
    }//GEN-LAST:event_txtEnskildAlienSokActionPerformed

    private void btnOmradeRasSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmradeRasSokActionPerformed
        new OmradeRasSok(idb).setVisible(true);
    }//GEN-LAST:event_btnOmradeRasSokActionPerformed

    private void btnDatumSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatumSokActionPerformed
    String startDatum = txtDatum1.getText();
    String slutDatum = txtDatum2.getText();
    String sqlFraga = "SELECT * FROM alien WHERE registreringsdatum BETWEEN '" + startDatum + "' AND '" + slutDatum + "';";
    
    try {
        ArrayList<HashMap<String, String>> alienDatumLista = idb.fetchRows(sqlFraga);
        txtareaDatumSok.setText("");
        
        // Iterera genom HashMap/ArrayList
        for (HashMap<String, String> alien : alienDatumLista) {
            // Hämta data från HashMap
            String alienID = alien.get("Alien_ID");
            String registreringsdatum = alien.get("Registreringsdatum");
            String epost = alien.get("Epost");
            String namn = alien.get("Namn");
            String telefon = alien.get("Telefon");
            String plats = alien.get("Plats");
            String ansvarigAgent = alien.get("Ansvarig_Agent");
            
            //Formatering av output
            String output = String.format("ID: %s, Datum: %s, Epost: %s, Namn: %s, Telefon: %s, Plats: %s, Agent: %s%n", 
                    alienID, registreringsdatum, epost, namn, telefon, plats, ansvarigAgent);
            
            // Output skickas ut i textruta
            txtareaDatumSok.append(output);
        }
    } catch (InfException ex) {
        JOptionPane.showMessageDialog(null, "Något gick fel: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnDatumSokActionPerformed

    private void btnEnskildAlienSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnskildAlienSokActionPerformed
        String id = txtEnskildAlienSok.getText();
        String sqlFraga = "SELECT * FROM alien WHERE alien_id = '" + id + "'";
    
    try {
        ArrayList<HashMap<String, String>> alienEnskildLista = idb.fetchRows(sqlFraga);
        txtareaEnskildAlienSok.setText("");
        
        //Iterera genom HashMap/ArrayList
        for (HashMap<String, String> alien : alienEnskildLista) {
            // Hämta data från HashMap
            String alienID = alien.get("Alien_ID");
            String registreringsdatum = alien.get("Registreringsdatum");
            String epost = alien.get("Epost");
            String namn = alien.get("Namn");
            String telefon = alien.get("Telefon");
            String plats = alien.get("Plats");
            String ansvarigAgent = alien.get("Ansvarig_Agent");
            
            //Formatering av output
            String output = String.format("ID: %s, Datum: %s, Epost: %s, Namn: %s, Telefon: %s, Plats: %s, Agent: %s%n", 
                    alienID, registreringsdatum, epost, namn, telefon, plats, ansvarigAgent);
            
            // Formaterad output printas i textruta
            txtareaEnskildAlienSok.append(output);
        }
    } catch (InfException ex) {
        JOptionPane.showMessageDialog(null, "Något gick fel: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnEnskildAlienSokActionPerformed

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
            java.util.logging.Logger.getLogger(AlienRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatumSok;
    private javax.swing.JButton btnEnskildAlienSok;
    private javax.swing.JButton btnOmradeRasSok;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlienRegister;
    private javax.swing.JLabel lblDatumSok;
    private javax.swing.JLabel lblEnskildAlienSok;
    private javax.swing.JTextField txtDatum1;
    private javax.swing.JTextField txtDatum2;
    private javax.swing.JTextField txtEnskildAlienSok;
    private javax.swing.JLabel txtViktigtStreck;
    private javax.swing.JTextArea txtareaDatumSok;
    private javax.swing.JTextArea txtareaEnskildAlienSok;
    // End of variables declaration//GEN-END:variables
}
