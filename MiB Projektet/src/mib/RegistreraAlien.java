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
 * @author Gustav
 */
public class RegistreraAlien extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form RegistreraAgent
     */
    public RegistreraAlien(InfDB idb) {
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

        lblRegistreraAlien = new javax.swing.JLabel();
        btnRegistreraAlien = new javax.swing.JButton();
        txtAlienID = new javax.swing.JTextField();
        txtAlienRegistreringsDatum = new javax.swing.JTextField();
        txtAlienEpost = new javax.swing.JTextField();
        txtAlienLosenord = new javax.swing.JTextField();
        txtAlienNamn = new javax.swing.JTextField();
        txtAlienTelefon = new javax.swing.JTextField();
        txtAlienPlats = new javax.swing.JTextField();
        txtAlienAnsvarigAgent = new javax.swing.JTextField();
        cbAlienRas = new javax.swing.JComboBox<>();
        lblAlienID = new javax.swing.JLabel();
        lblAlienRegistreringsDatum = new javax.swing.JLabel();
        lblAlienEpost = new javax.swing.JLabel();
        lblAlienLosenord = new javax.swing.JLabel();
        lblAliennamn = new javax.swing.JLabel();
        lblAlienTelefon = new javax.swing.JLabel();
        lblAlienPlats = new javax.swing.JLabel();
        lblAlienAnsvarigAgent = new javax.swing.JLabel();
        lblValjRas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegistreraAlien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegistreraAlien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistreraAlien.setText("Registrera alien");

        btnRegistreraAlien.setText("Registrera");
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

        cbAlienRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Worm", "Squid" }));
        cbAlienRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlienRasActionPerformed(evt);
            }
        });

        lblAlienID.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAlienID.setText("Alien-ID");

        lblAlienRegistreringsDatum.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAlienRegistreringsDatum.setText("Registreringsdatum");

        lblAlienEpost.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAlienEpost.setText("E-post");

        lblAlienLosenord.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAlienLosenord.setText("Lösenord");

        lblAliennamn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAliennamn.setText("Namn");

        lblAlienTelefon.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAlienTelefon.setText("Telefon");

        lblAlienPlats.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAlienPlats.setText("Plats");

        lblAlienAnsvarigAgent.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAlienAnsvarigAgent.setText("Ansvarig agent");

        lblValjRas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblValjRas.setText("Välj ras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlienLosenord)
                    .addComponent(lblAlienEpost)
                    .addComponent(txtAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlienRegistreringsDatum)
                    .addComponent(txtAlienRegistreringsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlienEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlienLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValjRas)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlienPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlienTelefon)
                            .addComponent(txtAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlienPlats)
                            .addComponent(lblAlienAnsvarigAgent)
                            .addComponent(txtAlienAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAlienRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistreraAlien))
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblRegistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAlienID)
                        .addGap(118, 118, 118)
                        .addComponent(lblAliennamn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblRegistreraAlien)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienID)
                    .addComponent(lblAliennamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienRegistreringsDatum)
                    .addComponent(lblAlienTelefon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlienRegistreringsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienEpost)
                    .addComponent(lblAlienPlats)
                    .addComponent(lblValjRas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlienEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlienPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAlienRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienLosenord)
                    .addComponent(lblAlienAnsvarigAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlienLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlienAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistreraAlien))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
    String nyttAlien_id = (String) txtAlienID.getText();
    String nyttRegistreringsdatum = txtAlienRegistreringsDatum.getText();
    String nyEpost = txtAlienEpost.getText();
    String nyttLosenord = txtAlienLosenord.getText();
    String nyttNamn = txtAlienNamn.getText();
    String nyTelefon = txtAlienTelefon.getText();
    String nyPlats = (String) txtAlienPlats.getText();
    String nyAnsvarigAgent = (String) txtAlienAnsvarigAgent.getText();
    
        // Kolla så lösenord är max 6 tecken
        if (nyttLosenord.length() > 6) {
            JOptionPane.showMessageDialog(null, "Lösenordet får max vara 6 tecken!");
            return;
        }

        // Kolla så alien/agent-id är integer med hjälp av metodanrop från isInteger
        if (!isInteger(nyttAlien_id) || !isInteger(nyAnsvarigAgent)) {
            JOptionPane.showMessageDialog(null, "Alien-ID och Ansvarig Agent måste vara heltal!");
            return;
        }

        // Kolla så telefonnummer är siffror
        if (!nyTelefon.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Telefonnummer måste vara siffror!");
            return;
        }

        // Kolla emailformat
        if (!nyEpost.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            JOptionPane.showMessageDialog(null, "Epostadressen är inte i rätt format!");
            return;
        }

        // När alla villkor validerats, kör kod
        String sqlFraga = "INSERT INTO alien (alien_id, registreringsdatum, epost, losenord, namn, telefon, plats, ansvarig_agent) VALUES ('" 
                + nyttAlien_id + "', '" + nyttRegistreringsdatum + "', '" + nyEpost + "', '" + nyttLosenord + "', '" 
                + nyttNamn + "', '" + nyTelefon + "', '" + nyPlats + "', '" + nyAnsvarigAgent + "')";

        try {
            idb.insert(sqlFraga);
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!" + ex.getMessage());
        }
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed
    private boolean isInteger(String s) {
        try {
            Integer.valueOf(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void cbAlienRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienRasActionPerformed
    
    String nyttAlien_id = txtAlienID.getText();
    String valdRas = (String) cbAlienRas.getSelectedItem();

    String sqlFraga = "";
    String input = "";

    if ("Boglodite".equals(valdRas)) {
        input = JOptionPane.showInputDialog(this, "Ange antal boogies:");
        
        sqlFraga = "INSERT INTO boglodite (alien_id, antal_boogies) VALUES ('" + nyttAlien_id + "', '" + input + "');";
    } else if ("Worm".equals(valdRas)) {
        input = JOptionPane.showInputDialog(this, "Ange längd:");
        
        sqlFraga = "INSERT INTO worm (alien_id, langd) VALUES ('" + nyttAlien_id + "', '" + input + "');";
    } else if ("Squid".equals(valdRas)) {
        input = JOptionPane.showInputDialog(this, "Ange antal armar:");
        
        sqlFraga = "INSERT INTO squid (alien_id, antal_armar) VALUES ('" + nyttAlien_id + "', '" + input + "');";
    } if (input != null && !input.trim().isEmpty()) {
        try {
            idb.insert(sqlFraga);
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Textfältet kan inte vara tomt!");
    }
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
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    } 



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JComboBox<String> cbAlienRas;
    private javax.swing.JLabel lblAlienAnsvarigAgent;
    private javax.swing.JLabel lblAlienEpost;
    private javax.swing.JLabel lblAlienID;
    private javax.swing.JLabel lblAlienLosenord;
    private javax.swing.JLabel lblAlienPlats;
    private javax.swing.JLabel lblAlienRegistreringsDatum;
    private javax.swing.JLabel lblAlienTelefon;
    private javax.swing.JLabel lblAliennamn;
    private javax.swing.JLabel lblRegistreraAlien;
    private javax.swing.JLabel lblValjRas;
    private javax.swing.JTextField txtAlienAnsvarigAgent;
    private javax.swing.JTextField txtAlienEpost;
    private javax.swing.JTextField txtAlienID;
    private javax.swing.JTextField txtAlienLosenord;
    private javax.swing.JTextField txtAlienNamn;
    private javax.swing.JTextField txtAlienPlats;
    private javax.swing.JTextField txtAlienRegistreringsDatum;
    private javax.swing.JTextField txtAlienTelefon;
    // End of variables declaration//GEN-END:variables
}
