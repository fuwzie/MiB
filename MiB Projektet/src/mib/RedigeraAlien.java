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
public class RedigeraAlien extends javax.swing.JFrame {
    
    private InfDB idb;
    /**
     * Creates new form RedigeraAlien
     */
    public RedigeraAlien(InfDB idb) {
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

        jLabel1 = new javax.swing.JLabel();
        btnVerkstallAlien = new javax.swing.JButton();
        cbAndraAlien = new javax.swing.JComboBox<>();
        txtAngeAlienID = new javax.swing.JTextField();
        txtNyttVardeAlien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtAngeAlienIDRas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnVerkstallRas = new javax.swing.JButton();
        cbTidigareRas = new javax.swing.JComboBox<>();
        cbNyRas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Redigera alien");

        btnVerkstallAlien.setText("Verkställ");
        btnVerkstallAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerkstallAlienActionPerformed(evt);
            }
        });

        cbAndraAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registreringsdatum", "Lösenord", "Namn", "Telefonnummer", "Plats", "Ansvarig agent" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ange alien-ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Välj vad du vill ändra");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ange nytt värde");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Ange alien-ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Välj tidigare ras");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Välj ny ras");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Korrigera rastillhörighet");

        btnVerkstallRas.setText("Verkställ");
        btnVerkstallRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerkstallRasActionPerformed(evt);
            }
        });

        cbTidigareRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));
        cbTidigareRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTidigareRasActionPerformed(evt);
            }
        });

        cbNyRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAngeAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(cbAndraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtNyttVardeAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnVerkstallAlien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerkstallRas)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTidigareRas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbNyRas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAngeAlienIDRas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAngeAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbAndraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNyttVardeAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerkstallAlien))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAngeAlienIDRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTidigareRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNyRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerkstallRas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerkstallAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerkstallAlienActionPerformed
        if(Validering.kollaOmAlienFinns(txtAngeAlienID)){
        String sqlFraga = "";
    String id = txtAngeAlienID.getText();
    String valdAndring = (String) cbAndraAlien.getSelectedItem();
    String nyttVarde = txtNyttVardeAlien.getText();
    boolean lyckadValidering = false;
 
    if (nyttVarde != null && !nyttVarde.trim().isEmpty()) {
        if (null != valdAndring) switch (valdAndring) {
                case "Lösenord":
                    // Kontrollerar att lösenordet är max 6 tecken
                    if (Validering.kollaLosenordLangd(txtNyttVardeAlien)) {
                        sqlFraga = "UPDATE alien SET losenord = '" + nyttVarde + "' WHERE alien_id = '" + id + "';";
                        lyckadValidering = true;
                    }       break;
                case "Registreringsdatum":
                    // Kontrollerar att datumet är i formatet ÅÅÅÅ-MM-DD
                    if (Validering.kollaDatumFormat(txtNyttVardeAlien)) {
                        sqlFraga = "UPDATE alien SET registreringsdatum = '" + nyttVarde + "' WHERE alien_id = '" + id + "';";
                        lyckadValidering = true;
                    }       break;
                case "Telefonnummer":
                    // Kontrollerar att telefonnumret endast innehåller siffror
                    if (Validering.kollaTelefonFormat(txtNyttVardeAlien)) {
                        sqlFraga = "UPDATE alien SET telefon = '" + nyttVarde + "' WHERE alien_id = '" + id + "';";
                        lyckadValidering = true;
                    }       break;
                case "Ansvarig agent":
                    // Kontrollerar att ansvarig agent finns i databasen
                    if (Validering.kollaOmAgentFinns(txtNyttVardeAlien)) {
                        sqlFraga = "UPDATE alien SET ansvarig_agent = '" + nyttVarde + "' WHERE alien_id = '" + id + "';";
                        lyckadValidering = true;
                    }       break;
                case "Plats":
                    //  Kontrollerar att platsen finns i databasen
                    if(Validering.kollaOmPlatsFinns(txtNyttVardeAlien))
                        sqlFraga = "UPDATE alien SET plats = '" + nyttVarde + "' WHERE alien_id = '" + id + "';";
                    lyckadValidering = true;
                    break;
                case "Namn":
                    //  Kontrollerar att namnet inte är för långt
                    if(Validering.kollaNamnFormat(txtNyttVardeAlien))
                        sqlFraga = "UPDATE alien SET namn = '" + nyttVarde + "' WHERE alien_id = '" + id + "';";
                    lyckadValidering = true;
                    break;
                default:
                    break;
            }
        if(lyckadValidering = true) {
        try {
            idb.update(sqlFraga);
            JOptionPane.showMessageDialog(null, "Uppdatering av uppgifter lyckades.");
        } catch (InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
    }}}
     
    
    }//GEN-LAST:event_btnVerkstallAlienActionPerformed

    private void btnVerkstallRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerkstallRasActionPerformed
       if(Validering.kollaOmAlienFinns(txtAngeAlienIDRas)) {
           
           String id = txtAngeAlienIDRas.getText().trim();
           String nyRas = (String) cbNyRas.getSelectedItem();
           String tidigareRas = (String) cbTidigareRas.getSelectedItem();
           

           String input = null;
           String sqlDelete = "";
           String sqlInsert = "";
        
         switch (tidigareRas) {
             case "Boglodite":
               sqlDelete = "DELETE FROM boglodite WHERE alien_id = '" + id + "'";
               break;
             case "Worm":
               sqlDelete = "DELETE FROM worm WHERE alien_id = '" + id + "'";
               break;
             case "Squid":
               sqlDelete = "DELETE FROM squid WHERE alien_id = '" + id + "'";
               break;
          }

      try {
       idb.delete(sqlDelete);
      }
      
      catch (InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }

      switch (nyRas) {
       case "Boglodite":
         input = JOptionPane.showInputDialog(null, "Ange antal boogies:");
         sqlInsert = "INSERT INTO boglodite (alien_id, antal_boogies) VALUES ('" + id + "','" + input + "')";
         break;
       case "Worm":
         input = JOptionPane.showInputDialog(null, "Ange längd:");
         sqlInsert = "INSERT INTO worm (alien_id, langd) VALUES ('" + id + "','" + input + "')";
         break;
      case "Squid":
         input = JOptionPane.showInputDialog(null, "Ange antal armar:");
         sqlInsert = "INSERT INTO squid (alien_id, antal_armar) VALUES ('" + id + "','" + input + "')";
         break;
}

if (input != null && !input.isEmpty()) {
    try {
        idb.insert(sqlInsert);
        JOptionPane.showMessageDialog(null, "Ras uppdaterad och tidigare ras borttagen!");
    } catch (InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
} else {
    JOptionPane.showMessageDialog(null, "Attributet kan inte vara tomt!");
}}
    }//GEN-LAST:event_btnVerkstallRasActionPerformed

    private void cbTidigareRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTidigareRasActionPerformed
        
    }//GEN-LAST:event_cbTidigareRasActionPerformed

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
            java.util.logging.Logger.getLogger(RedigeraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RedigeraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RedigeraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RedigeraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerkstallAlien;
    private javax.swing.JButton btnVerkstallRas;
    private javax.swing.JComboBox<String> cbAndraAlien;
    private javax.swing.JComboBox<String> cbNyRas;
    private javax.swing.JComboBox<String> cbTidigareRas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAngeAlienID;
    private javax.swing.JTextField txtAngeAlienIDRas;
    private javax.swing.JTextField txtNyttVardeAlien;
    // End of variables declaration//GEN-END:variables
}
