
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class updatedonorinfo extends javax.swing.JFrame {

    /**
     * Creates new form updatedonorinfo
     */
    public updatedonorinfo() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        donorid = new javax.swing.JTextField();
        dphone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        updatedaddress = new javax.swing.JButton();
        daddress = new javax.swing.JTextField();
        updatedphone = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ddategiven = new com.toedter.calendar.JDateChooser();
        updatedategiven = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Date Given");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));
        getContentPane().add(donorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 80, -1));
        getContentPane().add(dphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Donor ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        updatedaddress.setText("Update");
        updatedaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedaddressActionPerformed(evt);
            }
        });
        getContentPane().add(updatedaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));
        getContentPane().add(daddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 80, -1));

        updatedphone.setText("Update");
        updatedphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedphoneActionPerformed(evt);
            }
        });
        getContentPane().add(updatedphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 50, -1));
        getContentPane().add(ddategiven, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        updatedategiven.setText("Update");
        updatedategiven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedategivenActionPerformed(evt);
            }
        });
        getContentPane().add(updatedategiven, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jButton1.setText("Homepage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jButton2.setText("Back");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\3-1\\LAB\\Database Lab\\bloodbank.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 4, 580, 420));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatedategivenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedategivenActionPerformed
        // TODO add your handling code here:
          try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url="jdbc:sqlserver://localhost:1433;databaseName=Bloodbank;user=sa;password=123456";
           Connection con = DriverManager.getConnection(url);
            String sql = "Update DONOR set  DATE_GIVEN=? where DONOR_ID=?";
            
            PreparedStatement pst = con.prepareStatement(sql);
             pst.setString(1,((JTextField)ddategiven.getDateEditor().getUiComponent()).getText());
            pst.setString(2,donorid.getText());
        
            pst.executeUpdate();
        
               JOptionPane.showMessageDialog(null, "Successfully Updated");
               //InsertFrame.Succes field= new  InsertFrame.Succes();
               //field.setVisible(true);
             
                //raddress.setText("");
                //rid.setText("");
               
       
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
    }//GEN-LAST:event_updatedategivenActionPerformed

    private void updatedaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedaddressActionPerformed
        // TODO add your handling code here:
         try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url="jdbc:sqlserver://localhost:1433;databaseName=Bloodbank;user=sa;password=123456";
           Connection con = DriverManager.getConnection(url);
            String sql = "Update DONOR set  DONOR_ADDRESS=? where DONOR_ID=?";
            
            PreparedStatement pst = con.prepareStatement(sql);
             pst.setString(1,daddress.getText());
            pst.setString(2,donorid.getText());
        
            pst.executeUpdate();
        
               JOptionPane.showMessageDialog(null, "Successfully Updated");
               //InsertFrame.Succes field= new  InsertFrame.Succes();
               //field.setVisible(true);
             
                //raddress.setText("");
                //rid.setText("");
               
       
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
    }//GEN-LAST:event_updatedaddressActionPerformed

    private void updatedphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedphoneActionPerformed
        // TODO add your handling code here
         try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url="jdbc:sqlserver://localhost:1433;databaseName=Bloodbank;user=sa;password=123456";
           Connection con = DriverManager.getConnection(url);
            String sql = "Update DONOR set  DONOR_PHONE=? where DONOR_ID=?";
            
            PreparedStatement pst = con.prepareStatement(sql);
             pst.setString(1,dphone.getText());
            pst.setString(2,donorid.getText());
        
            pst.executeUpdate();
        
               JOptionPane.showMessageDialog(null, "Successfully Updated");
               //InsertFrame.Succes field= new  InsertFrame.Succes();
               //field.setVisible(true);
             
                //raddress.setText("");
                //rid.setText("");
               
       
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
    }//GEN-LAST:event_updatedphoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Homepage gohome=new Homepage();
        gohome.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        donorhome dhome=new donorhome();
        dhome.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(updatedonorinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatedonorinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatedonorinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatedonorinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatedonorinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField daddress;
    private com.toedter.calendar.JDateChooser ddategiven;
    private javax.swing.JTextField donorid;
    private javax.swing.JTextField dphone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton updatedaddress;
    private javax.swing.JButton updatedategiven;
    private javax.swing.JButton updatedphone;
    // End of variables declaration//GEN-END:variables
}
