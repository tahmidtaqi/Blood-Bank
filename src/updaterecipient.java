
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class updaterecipient extends javax.swing.JFrame {

    /**
     * Creates new form updatedonor
     */
    public updaterecipient() {
        initComponents();
        // jLabel2.setBackground(new Color(0,0,0,0));
        rid.setBackground(new Color(0,0,0,0));
        raddress.setBackground(new Color(0,0,0,0));
        rphone.setBackground(new Color(0,0,0,0));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        raddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rphone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        updateraddress = new javax.swing.JButton();
        updaterphone = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("ADDRESS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, 30));

        raddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        raddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(raddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("PHONE NO.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, 30));

        rphone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(rphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 140, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("RECIPIENT ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 40));

        rid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(rid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 130, 30));

        updateraddress.setBackground(new java.awt.Color(153, 153, 153));
        updateraddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateraddress.setLabel("Update Address");
        updateraddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateraddressActionPerformed(evt);
            }
        });
        getContentPane().add(updateraddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, 30));

        updaterphone.setBackground(new java.awt.Color(153, 153, 153));
        updaterphone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updaterphone.setText("Update Phone");
        updaterphone.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updaterphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updaterphoneActionPerformed(evt);
            }
        });
        getContentPane().add(updaterphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 190, 140, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Homepage");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 363, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\3-1\\LAB\\Database Lab\\bgbloodbank2.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 440));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateraddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateraddressActionPerformed
        // TODO add your handling code here:
         try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url="jdbc:sqlserver://localhost:1433;databaseName=Bloodbank;user=sa;password=123456";
           Connection con = DriverManager.getConnection(url);
            String sql = "Update RECIPIENT set  R_ADDRESS=? where R_ID=?";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,raddress.getText());
            pst.setString(2,rid.getText());
        
            pst.executeUpdate();
        
               JOptionPane.showMessageDialog(null, "Successfully Updated");
               //InsertFrame.Succes field= new  InsertFrame.Succes();
               //field.setVisible(true);
             
                raddress.setText("");
                rid.setText("");
               
       
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
    }//GEN-LAST:event_updateraddressActionPerformed

    private void updaterphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaterphoneActionPerformed
        // TODO add your handling code here:
          try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url="jdbc:sqlserver://localhost:1433;databaseName=Bloodbank;user=sa;password=123456";
           Connection con = DriverManager.getConnection(url);
            String sql = "Update RECIPIENT set  R_PHONE=? where R_ID=?";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,rphone.getText());
            pst.setString(2,rid.getText());
        
            pst.executeUpdate();
        
               JOptionPane.showMessageDialog(null, "Successfully Updated");
               //InsertFrame.Succes field= new  InsertFrame.Succes();
               //field.setVisible(true);
             
                raddress.setText("");
                rid.setText("");
               
       
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
        
    }//GEN-LAST:event_updaterphoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Homepage gohome =new Homepage();
        gohome.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        recipienthome rhome=new   recipienthome ();
        rhome.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(updaterecipient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updaterecipient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updaterecipient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updaterecipient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updaterecipient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField raddress;
    private javax.swing.JTextField rid;
    private javax.swing.JTextField rphone;
    private javax.swing.JButton updateraddress;
    private javax.swing.JButton updaterphone;
    // End of variables declaration//GEN-END:variables
}
