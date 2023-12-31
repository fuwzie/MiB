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
 * @author Gustav, Neryse, Oskar
 */
public class AlienFonster extends javax.swing.JFrame {
    //Deklarerar databasuppkoppling
     private InfDB idb;
     //Sträng som används för att visa vem som är inloggad.
     private String id;
     
    /**
     * Creates new form AlienFonster
     */
    public AlienFonster(InfDB idb, String id) {
        // Deklarerar instans av databasuppkoppling
        this.idb = idb;
        //Deklarerar id-variabel
        this.id = id;
        initComponents();
         
        //Använder id:t som skapas under inloggningsprocessen för att hålla koll på vem som är inloggad
        try {
            //Med hjälp av föregående id, ta reda på vilken plats som denna alien tillhör
             String kollaPlatsFraga = "SELECT plats FROM alien WHERE alien_id = " + id;
             String kollaPlatsSvar = idb.fetchSingle(kollaPlatsFraga);
             // Tom sträng för att sedan mata in ansvarig områdeschef
             String aliensOmradesChef = "";
             
             if(kollaPlatsSvar != null) {
                 // Hämtar ut området från platstabellen
             String kollaOmradeForPlats = "SELECT Finns_I FROM plats WHERE plats_id = " + kollaPlatsSvar;
             String svarOmradeForPlats = idb.fetchSingle(kollaOmradeForPlats);
             
                if(svarOmradeForPlats != null) {
                    // Hämtar ut id på agent som är ansvarig för ett område
                String kollaOmradesChef = "SELECT agent_id FROM omradeschef WHERE omrade = " + svarOmradeForPlats;
                String svarOmradesChef = idb.fetchSingle(kollaOmradesChef);
                
                    if(svarOmradesChef != null) {
                        // Hämtar ut namnet på ansvarig agent
                        String aliensOmradesChefFraga = "SELECT namn FROM agent WHERE agent_id = " + svarOmradesChef;
                        aliensOmradesChef = idb.fetchSingle(aliensOmradesChefFraga);
                    }
                }
             
             }
             // Om sista SQL frågan inte är tom
             if(!aliensOmradesChef.isEmpty()) {
                lblAnsvarig.setText("Din områdesansvariga är: "+aliensOmradesChef);
             }
             // Annars säg att ansvarig ej finns
             else {
                 lblAnsvarig.setText("Det finns ingen områdesansvarig just nu.");
             }
        } catch (InfException ex) {
            //Om någon av frågorna resulterar i fel så säger programmet att den områdesansvarige inte kunde hittas och att man ska kontakta admin.
            JOptionPane.showMessageDialog(null, "Områdesansvarige fanns ej");
            lblAnsvarig.setText("Kunde ej hitta din områdesansvariga, kontakta en administratör.");
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

        jButton2 = new javax.swing.JButton();
        lblValkommenAlien = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btnLosenordsAndring = new javax.swing.JButton();
        lblAnsvarig = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkommenAlien.setText("Välkommen!");

        btnLogOut.setText("Logga ut");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnLosenordsAndring.setText("Ändra lösenord");
        btnLosenordsAndring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLosenordsAndringActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLosenordsAndring, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(lblValkommenAlien))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAnsvarig)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblValkommenAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(lblAnsvarig)
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLosenordsAndring)
                    .addComponent(btnLogOut))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
          //Loggar ut användare genom att öppna nytt inloggningsfönster och stänger det tidigare fönstret
          new Inloggning(idb).setVisible(true);
          dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnLosenordsAndringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLosenordsAndringActionPerformed
        //Öppnat nytt fönster för lösenordsändring
        new LosenordsandringAlien(idb, id).setVisible(true);
    }//GEN-LAST:event_btnLosenordsAndringActionPerformed

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
            java.util.logging.Logger.getLogger(AlienFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLosenordsAndring;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblAnsvarig;
    private javax.swing.JLabel lblValkommenAlien;
    // End of variables declaration//GEN-END:variables
}
