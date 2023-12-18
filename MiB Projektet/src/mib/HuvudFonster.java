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
public class HuvudFonster extends javax.swing.JFrame {

     private InfDB idb;
    /**
     * Creates new form HuvudFonster
     */
    public HuvudFonster(InfDB idb) {
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
        txtID = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnVisaNamn = new javax.swing.JButton();
        lblNamn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeader.setText("VISA FÖRNAMN");

        txtID.setText("skit");

        lblId.setText("Ange id:");

        btnVisaNamn.setText("Visa namn:");
        btnVisaNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaNamnActionPerformed(evt);
            }
        });

        lblNamn.setText("Namnet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVisaNamn)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamn))
                        .addGap(143, 143, 143))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisaNamn)
                    .addComponent(lblNamn))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaNamnActionPerformed
        if(Validering.textFaltHarVarde(txtID) && Validering.isHelTal(txtID)) {
          
        try {
            String id = txtID.getText();
            String fraga = "SELECT Namn FROM mibdb.agent where AGENT_ID=" + id;
            String svar = idb.fetchSingle(fraga);
            String resultat = svar;
            lblNamn.setText(resultat);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande: " + e.getMessage());
        }    
        
        }
    }//GEN-LAST:event_btnVisaNamnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisaNamn;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
