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
        jLabel1 = new javax.swing.JLabel();
        txtAgentNamn = new javax.swing.JTextField();
        txtAgentTelefon = new javax.swing.JTextField();
        txtAgentAnstallningsDatum = new javax.swing.JTextField();
        txtAgentEpost = new javax.swing.JTextField();
        txtAgentLosenord = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbAgentOmrade = new javax.swing.JComboBox<>();
        cbAgentAdministrator = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAgentId.setText("100");

        jLabel1.setText("Registrera agent");

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

        jButton1.setText("Registrera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Agentens ID:");

        jLabel3.setText("Namn:");

        jLabel4.setText("Telefonnummer:");

        jLabel5.setText("Anställningsdatum:");

        jLabel6.setText("Administratör?");

        jLabel7.setText("E-postadress:");

        jLabel8.setText("Lösenord:");

        jLabel9.setText("Område:");

        cbAgentOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "4" }));

        cbAgentAdministrator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "J", "N" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(txtAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgentAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAgentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbAgentAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAgentOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgentEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAgentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAgentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgentAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbAgentAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgentEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAgentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbAgentOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public  boolean kollaUniktIDAgent (JTextField idRuta) {
       //Sätter värdet på unikt ID till true som default;
        boolean uniktId = true;
        if(Validering.textFaltHarVarde(idRuta) && Validering.isHelTal(idRuta)) {
            
        //Hämtar ut värdet på ID för att sedan kunna användas i sql-frågor
        String idKoll = idRuta.getText();
        
        try {
            
             //Kollar om inmatade ID finns i registret
            String idFraga = "SELECT agent_id FROM agent WHERE agent_id = " + idKoll;
            String idSvar = idb.fetchSingle(idFraga);
            
            if(idSvar != null) {
                //Om ID returnerar värde, tala om för användare att ID inte är unikt.
                uniktId = false;
                JOptionPane.showMessageDialog(null, "Agentens ID måste vara unikt.");
            }
        } catch(InfException ex) {
           JOptionPane.showMessageDialog(null, "Något gick fel");
           System.out.println("Internt felmeddelande: " + ex);
        }
       }
       return uniktId;
    }
        
        public boolean kollaUnikEpostForAgent(JTextField txtAgentEpost) {
        //Sätter värdet på unik epost till sant som default
        boolean epost = true;
        if(Validering.textFaltHarVarde(txtAgentEpost)) {
        String agentText = txtAgentEpost.getText();
        
        //Om strängen slutar med @mib.net (agenteposten), fortsätt med metod
        if(agentText.endsWith("@mib.net")) {
       
            try{
                
                //Kolla om eposten finns i registret redan.
                String agentFraga = "SELECT epost from agent WHERE epost = '" + agentText +"'";
                String agentSvar = idb.fetchSingle(agentFraga);
        
                if(agentSvar != null) {
                    //Om matchande epost hittades, sätt värdet till false (inte unikt) och ge felmeddelande.
                    epost = false;
                    JOptionPane.showMessageDialog(null, "Agentens epost måste vara unik.");
        }
       } catch (InfException ex) {
           JOptionPane.showMessageDialog(null, "Något gick fel.");
           System.out.println("Internt felmeddelande: " + ex);
       } }
        else { 
            //Om eposten inte är en "agentepost" dvs slutar med "@mib.net"
            epost = false;
            JOptionPane.showMessageDialog(null, "Eposten är inte giltig för en agent, måste sluta med @mib.net");
        } }
        return epost;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //Massiv validering som kollar så alla textfält har värden, de som är int (id och område) valideras så att de är heltal, epost och id jämförs även i databasen för att se om de är unika.
        if(kollaUniktIDAgent(txtAgentId) && Validering.textFaltHarVarde(txtAgentNamn) && Validering.textFaltHarVarde(txtAgentTelefon) && Validering.textFaltHarVarde(txtAgentAnstallningsDatum) && kollaUnikEpostForAgent(txtAgentEpost) && Validering.kollaLosenordLangd(txtAgentLosenord)) {
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
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JComboBox<String> cbAgentAdministrator;
    private javax.swing.JComboBox<String> cbAgentOmrade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAgentAnstallningsDatum;
    private javax.swing.JTextField txtAgentEpost;
    private javax.swing.JTextField txtAgentId;
    private javax.swing.JTextField txtAgentLosenord;
    private javax.swing.JTextField txtAgentNamn;
    private javax.swing.JTextField txtAgentTelefon;
    // End of variables declaration//GEN-END:variables
}
