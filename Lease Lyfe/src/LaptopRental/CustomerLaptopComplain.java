/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LaptopRental;

import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Customers.CustomerLanding;
import HomeLanding.HomeLanding;
import static java.awt.GridBagConstraints.BOTH;
import javax.swing.JFrame;

/**
 *
 * @author rahulb
 */
public class CustomerLaptopComplain extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLaptopReturn
     */
     MySQLConnection c = new MySQLConnection();
    public CustomerLaptopComplain() {
        initComponents();
        DisplayLatopOnRent();
             
//txtProductID.setEditable(false);
//        txtCustomerId.setEditable(false);
//        txtRentId.setEditable(false);
//        txtDelay.setEditable(false);
//        txtFine.setEditable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
public CustomerLaptopComplain(String s) {
        initComponents();
        showData(s);
        DisplayLatopOnRent();
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

        jPanel1 = new javax.swing.JPanel();
        txtCustomerId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRentId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLaptopOnRent = new javax.swing.JTable();
        btnRaiseComplaint2 = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 355, 30));

        jLabel1.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Customer ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 119, 30));

        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 355, 32));

        jLabel7.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Product ID :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 119, 30));
        jPanel1.add(txtRentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 355, 29));

        jLabel2.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Rent ID :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 88, 29));

        tblLaptopOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Rent ID"
            }
        ));
        tblLaptopOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaptopOnRentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLaptopOnRent);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 500, 180));

        btnRaiseComplaint2.setBackground(new java.awt.Color(51, 51, 51));
        btnRaiseComplaint2.setFont(new java.awt.Font("Oriya MN", 3, 18)); // NOI18N
        btnRaiseComplaint2.setForeground(new java.awt.Color(255, 255, 255));
        btnRaiseComplaint2.setText("Raise a Complain");
        btnRaiseComplaint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseComplaintActionPerformed(evt);
            }
        });
        jPanel1.add(btnRaiseComplaint2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, -1, 40));

        btnPayment.setBackground(new java.awt.Color(51, 51, 51));
        btnPayment.setFont(new java.awt.Font("Oriya MN", 3, 18)); // NOI18N
        btnPayment.setForeground(new java.awt.Color(255, 255, 255));
        btnPayment.setText("Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        jPanel1.add(btnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 135, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LaptopRental/LaptopRental/laptop.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 300, 270));

        jLabel10.setFont(new java.awt.Font("Oriya MN", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Manage Laptop Rent");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 288, 67));

        btnLogout.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, -1, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1090));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLaptopOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaptopOnRentMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblLaptopOnRent.getModel();
        int MyIndex = tblLaptopOnRent.getSelectedRow();
        txtRentId.setText(model.getValueAt(MyIndex,1).toString());
        txtProductID.setText(model.getValueAt(MyIndex,0).toString());
    }//GEN-LAST:event_tblLaptopOnRentMouseClicked

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
        String sql1 ="UPDATE Customer SET laptop_payment_status = 'Done', LaptopApprove = NULL ,LaptopDelay = NULL,LaptopFine = NULL,LaptopPrice = NULL,"
        + "LaptopComplain = NULL,LaptopRentID = NULL,LaptopRentDate = NULL,LaptopReturnDate = NULL, LaptopID = NULL WHERE CustomerID = '"+txtCustomerId.getText()+"' ";
        c.updateDatabase(sql1);
        JOptionPane.showMessageDialog(this,"Payment Done");
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnRaiseComplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseComplaintActionPerformed
        // TODO add your handling code here:
        try {
            String sql="UPDATE Customer SET LaptopComplain = 'Requested'  WHERE CustomerID = '"+txtCustomerId.getText()+"' ";
            c.updateDatabase(sql);

            String sql1 = "UPDATE Laptop SET Service = 'Requested'  WHERE Productid = '"+txtProductID.getText()+"' ";
            c.updateDatabase(sql1);
            JOptionPane.showMessageDialog(this," Successfully Raised Request");

        }
        catch (Exception ex) {
            System.out.println(ex);}

    }//GEN-LAST:event_btnRaiseComplaintActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        HomeLanding lr = new HomeLanding();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerLaptopComplain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLaptopComplain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLaptopComplain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLaptopComplain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLaptopComplain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnRaiseComplaint2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblLaptopOnRent;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtRentId;
    // End of variables declaration//GEN-END:variables

            
    private void DisplayLatopOnRent() {
        
         String reg,brand,carmodel,status,price;
        try{


            String sql = "select * from Customer where CustomerID = '"+txtCustomerId.getText()+"' and LaptopApprove = 'Booked' ";
            ResultSet rs = c.selectDatabase(sql);
            
            
            DefaultTableModel model =(DefaultTableModel) tblLaptopOnRent.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                 reg = rs.getString(29);
                 brand = rs.getString(32);
//               
                  String[] row = {reg,brand};
                  model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();
            
            
        }
    }

    private void showData(String s) {
         txtCustomerId.setText(s);
    }

}
