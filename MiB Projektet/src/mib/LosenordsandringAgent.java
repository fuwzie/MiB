/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import javax.swing.JOptionPane;
import mib.Validering;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author Otte
 */
public class LosenordsandringAgent extends javax.swing.JFrame {
     private InfDB idb;
     private String id;
    /**
     * Creates new form LosenordsandringAgent
     */
    public LosenordsandringAgent(InfDB idb, String id) {
        this.idb = idb;
        this.id = id;
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

        lblRubrik = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBytLosenord = new javax.swing.JButton();
        pwGammaltLosenord = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        pwNyttLosenord = new javax.swing.JPasswordField();
        pwNyttLosenordUpprepa = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setText("Ändra ditt lösenord här");

        jLabel1.setText("Ditt nya lösenord:");

        jLabel2.setText("Upprepa lösenordet:");

        btnBytLosenord.setText("Ändra lösenord");
        btnBytLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLosenordActionPerformed(evt);
            }
        });

        pwGammaltLosenord.setText("jPasswordField3");
        pwGammaltLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwGammaltLosenordActionPerformed(evt);
            }
        });

        jLabel3.setText("Skriv in ditt gamla lösenord:");

        pwNyttLosenord.setText("jPasswordField1");
        pwNyttLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwNyttLosenordActionPerformed(evt);
            }
        });

        pwNyttLosenordUpprepa.setText("jPasswordField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblRubrik)
                                .addGap(136, 136, 136))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBytLosenord)
                                .addGap(314, 314, 314))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pwNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwGammaltLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwNyttLosenordUpprepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pwGammaltLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pwNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwNyttLosenordUpprepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnBytLosenord)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBytLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytLosenordActionPerformed
       //Kollar så alla textrutor har ett värde.
        if (Validering.kollaLosenordLangd(pwGammaltLosenord) && Validering.kollaLosenordLangd(pwNyttLosenord) && Validering.kollaLosenordLangd(pwNyttLosenordUpprepa))
        { try {
            
            String kollaLosenord = new String(pwGammaltLosenord.getPassword());
           
            //Hämtar ut användarens nuvarande lösenord
            String sqlFraga = "SELECT losenord FROM agent where agent_id = " + id;
            String sqlSvar = idb.fetchSingle(sqlFraga);
            
            if (sqlSvar.equals(kollaLosenord)) {
                //Metoden jämför inmatade gamla lösenordet med svaret från databasen
                
                //Hämtar ut värden på de nya lösenorden som matats in
                String nyttLosenord = new String(pwNyttLosenord.getPassword());
                String nyttLosenordUpprepa = new String (pwNyttLosenordUpprepa.getPassword());
                
                if (!nyttLosenord.equals(kollaLosenord))
                {
                    //Kollar så nytt lösenord ej är samma som tidigare.
                
                if (nyttLosenord.equals(nyttLosenordUpprepa)){
                    //Om lösenordet upprepats korrekt och inget annat fel uppstått tidigare så uppdaterar den lösenordet.
                    String bytLosenord = "UPDATE agent SET losenord = '" + nyttLosenord + "' WHERE agent_id = " + id;
                    idb.update(bytLosenord);
                    JOptionPane.showMessageDialog(null, "Ditt lösenord har ändrats.");
                }
                else {
                    //Om nyttLosenord != nyttLosenordUpprepa
                    JOptionPane.showMessageDialog(null, "Nytt lösenord matchar inte upprepning!");
                }
                } else {
                    //Om nyttLosenord = kollaLosenord
                    JOptionPane.showMessageDialog(null, "Nytt lösenord kan inte vara samma som tidigare.");
                } 
            } else {
                JOptionPane.showMessageDialog(null, "Nuvarande lösenord stämmer inte.");
            } 
        }
        
        catch (InfException ex){
            JOptionPane.showMessageDialog(null, "!");
        }
        }                
    }//GEN-LAST:event_btnBytLosenordActionPerformed

    private void pwGammaltLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwGammaltLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwGammaltLosenordActionPerformed

    private void pwNyttLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwNyttLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwNyttLosenordActionPerformed

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
            java.util.logging.Logger.getLogger(LosenordsandringAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LosenordsandringAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LosenordsandringAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LosenordsandringAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBytLosenord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JPasswordField pwGammaltLosenord;
    private javax.swing.JPasswordField pwNyttLosenord;
    private javax.swing.JPasswordField pwNyttLosenordUpprepa;
    // End of variables declaration//GEN-END:variables
}
