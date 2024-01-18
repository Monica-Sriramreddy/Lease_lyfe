/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PhoneRental;

import HomeLanding.GadgetAdminLandingPage;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import HomeLanding.HomeLanding;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author rahulb
 */ 
public class PhoneReturnJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReturnJFrame
     */
    MySQLConnection c = new MySQLConnection();
    public PhoneReturnJFrame() {
        initComponents();
        DisplayLaptopOnRent();
        txtProductId.setVisible(false);
        txtRentId.setEditable(false);
        txtCustomerId.setEditable(false);
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLaptopOnRent = new javax.swing.JTable();
        txtProductId = new javax.swing.JTextField();
        txtRentId = new javax.swing.JTextField();
        txtCustomerId = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnManageLaptop = new javax.swing.JButton();
        btnRentLaptop = new javax.swing.JButton();
        btnLogout1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Customer ID :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, 32));

        jLabel8.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Rent ID :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, 32));

        jLabel9.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Product ID :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, 32));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 185, 12));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhoneRental/PhoneRental/return-calls.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 370, 320));

        jLabel1.setFont(new java.awt.Font("Oriya MN", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Return Phones");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 190, 22));

        tblLaptopOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Rent ID", "Customer ID", "Rent Fee"
            }
        ));
        tblLaptopOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaptopOnRentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLaptopOnRent);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, 123));
        jPanel2.add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 138, 32));
        jPanel2.add(txtRentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 138, 31));
        jPanel2.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 138, 32));

        btnConfirm.setBackground(new java.awt.Color(51, 51, 51));
        btnConfirm.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, -1, -1));

        btnManageLaptop.setBackground(new java.awt.Color(51, 51, 51));
        btnManageLaptop.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnManageLaptop.setForeground(new java.awt.Color(255, 255, 255));
        btnManageLaptop.setText("Manage Phone");
        btnManageLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLaptopActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        btnRentLaptop.setBackground(new java.awt.Color(51, 51, 51));
        btnRentLaptop.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnRentLaptop.setForeground(new java.awt.Color(255, 255, 255));
        btnRentLaptop.setText("Rent Phone");
        btnRentLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentLaptopActionPerformed(evt);
            }
        });
        jPanel2.add(btnRentLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 144, -1));

        btnLogout1.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout1.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout1.setText("Back");
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 2020, 1300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLaptopOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaptopOnRentMouseClicked
                // TODO add your handling code here:
                DefaultTableModel model = (DefaultTableModel) tblLaptopOnRent.getModel();
                int MyIndex = tblLaptopOnRent.getSelectedRow();
                txtCustomerId.setText(model.getValueAt(MyIndex,2).toString());
                txtRentId.setText(model.getValueAt(MyIndex,1).toString());
                txtProductId.setText(model.getValueAt(MyIndex,0).toString());

    }//GEN-LAST:event_tblLaptopOnRentMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        try{
int flag = 0;
int flag2 =0;
                
                
                 if(flag == 0){
            String sql = "Select phone_payment_status from Customer where CustomerID = '"+txtCustomerId.getText()+"'";
            ResultSet rs = c.selectDatabase(sql);
            while(rs.next()){
                if(rs.getString(1).equalsIgnoreCase("Done")){
                    flag2 = 1;
                }
            }
            if(flag2==1){
            JOptionPane.showMessageDialog(this,"Return Confirmed");
            String sql1 ="UPDATE Phone SET Status = 'Available', rentid = NULL  WHERE Productid = '"+txtProductId.getText()+"'";
            c.updateDatabase(sql1);
            
//************************************************************** *********************************************   

            DisplayLaptopOnRent();
            txtCustomerId.setText("");
            txtProductId.setText("");
            txtRentId.setText("");
            }else{
                JOptionPane.showMessageDialog(this,"Payment status is still pending");
            }
//***********************************************************************************************************
            
            

                 }
        }
        catch(Exception e)
        {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnManageLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLaptopActionPerformed
        // TODO add your handling code here:
        PhoneManageJFrame lr = new PhoneManageJFrame();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageLaptopActionPerformed

    private void btnRentLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentLaptopActionPerformed
        // TODO add your handling code here:
        
        PhoneRentJFrame lr = new PhoneRentJFrame();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRentLaptopActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        // TODO add your handling code here:
        GadgetAdminLandingPage hl = new GadgetAdminLandingPage();
        hl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogout1ActionPerformed

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
            java.util.logging.Logger.getLogger(PhoneReturnJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneReturnJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneReturnJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneReturnJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhoneReturnJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnManageLaptop;
    private javax.swing.JButton btnRentLaptop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblLaptopOnRent;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtRentId;
    // End of variables declaration//GEN-END:variables

    private void DisplayLaptopOnRent() {
           String reg,brand,carmodel,status,price;
        try{


            String sql = "select * from Phone where Status = 'Booked' and rentid IS NOT NULL";
            ResultSet rs = c.selectDatabase(sql);
            
            DefaultTableModel model =(DefaultTableModel) tblLaptopOnRent.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                 reg = rs.getString(1);
                 brand = rs.getString(11);
                 carmodel = rs.getString(8);
                 status = rs.getString(5);
//               
                  String[] row = {reg,brand,carmodel,status};
                  model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();
            
            
        }
        
    }
}
