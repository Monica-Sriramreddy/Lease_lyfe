/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CarRental;

import HomeLanding.HomeLanding;
import HomeLanding.VehicleAdminLandingPage;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author monicasriramreddy
 */
public class ReturnCarJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReturnCarJFrame
     */
    MySQLConnection c = new MySQLConnection();
    public ReturnCarJFrame() {
        initComponents();
        DisplayCarOnRent();
//        TxtRegNo.setVisible(false);
        TxtRentID.setEditable(false);
        TxtCustomerID.setEditable(false);
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

        ReturnCarPanel = new javax.swing.JPanel();
        LblReturnCarHeading = new javax.swing.JLabel();
        ButtonsPanel = new javax.swing.JPanel();
        BtnRentCar = new javax.swing.JButton();
        BtnManageCar = new javax.swing.JButton();
        BtnReturnCar2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblCarOnRent = new javax.swing.JTable();
        TxtCustomerID = new javax.swing.JTextField();
        TxtRentID = new javax.swing.JTextField();
        BtnConfirm = new javax.swing.JButton();
        TxtRegNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReturnCarPanel.setBackground(new java.awt.Color(51, 51, 51));
        ReturnCarPanel.setForeground(new java.awt.Color(255, 255, 255));

        LblReturnCarHeading.setBackground(new java.awt.Color(161, 215, 215));
        LblReturnCarHeading.setFont(new java.awt.Font("Oriya MN", 3, 18)); // NOI18N
        LblReturnCarHeading.setForeground(new java.awt.Color(255, 255, 255));
        LblReturnCarHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblReturnCarHeading.setText("Return Cars");
        LblReturnCarHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ButtonsPanel.setBackground(new java.awt.Color(153, 153, 153));

        BtnRentCar.setBackground(new java.awt.Color(51, 51, 51));
        BtnRentCar.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnRentCar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRentCar.setText("Manage Rents");
        BtnRentCar.setBorder(null);
        BtnRentCar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRentCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRentCarActionPerformed(evt);
            }
        });

        BtnManageCar.setBackground(new java.awt.Color(51, 51, 51));
        BtnManageCar.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnManageCar.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageCar.setText("Manage Cars");
        BtnManageCar.setBorder(null);
        BtnManageCar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnManageCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageCarActionPerformed(evt);
            }
        });

        BtnReturnCar2.setBackground(new java.awt.Color(51, 51, 51));
        BtnReturnCar2.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnReturnCar2.setForeground(new java.awt.Color(255, 255, 255));
        BtnReturnCar2.setText("Back");
        BtnReturnCar2.setBorder(null);
        BtnReturnCar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReturnCar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnCar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnReturnCar2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnManageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        ButtonsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnManageCar, BtnRentCar, BtnReturnCar2});

        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(BtnManageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BtnRentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BtnReturnCar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(864, Short.MAX_VALUE))
        );

        ButtonsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnManageCar, BtnRentCar, BtnReturnCar2});

        TblCarOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Reg No", "Rent ID", "Rent Fee"
            }
        ));
        TblCarOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblCarOnRentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TblCarOnRent);

        TxtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerIDActionPerformed(evt);
            }
        });

        TxtRentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRentIDActionPerformed(evt);
            }
        });

        BtnConfirm.setBackground(new java.awt.Color(153, 153, 153));
        BtnConfirm.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnConfirm.setText("Confirm");
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Customer ID :");

        jLabel8.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Rent ID :");

        jLabel10.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Reg No :");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Oriya MN", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("LeaseLyfe");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Carret.png"))); // NOI18N

        javax.swing.GroupLayout ReturnCarPanelLayout = new javax.swing.GroupLayout(ReturnCarPanel);
        ReturnCarPanel.setLayout(ReturnCarPanelLayout);
        ReturnCarPanelLayout.setHorizontalGroup(
            ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10))
                                    .addComponent(LblReturnCarHeading))
                                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                                        .addGap(306, 306, 306)
                                        .addComponent(jLabel1))))))
                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnConfirm)
                            .addComponent(TxtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(782, Short.MAX_VALUE))
        );
        ReturnCarPanelLayout.setVerticalGroup(
            ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel11)
                .addGap(46, 46, 46)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblReturnCarHeading)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(BtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(ReturnCarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 1260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRentCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRentCarActionPerformed
        // TODO add your handling code here:
        RentCarJFrame rc = new RentCarJFrame();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRentCarActionPerformed

    private void BtnManageCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageCarActionPerformed
        // TODO add your handling code here:
        ManageCarJFrame mc = new ManageCarJFrame();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnManageCarActionPerformed

    private void TxtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustomerIDActionPerformed

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        // TODO add your handling code here:
        try{
            int flag = 0;
            int flag2 = 0;
              
                if(flag == 0){
                    String sql = "Select car_payment_status from Customer where CustomerID = '"+TxtCustomerID.getText()+"'";
            ResultSet rs = c.selectDatabase(sql);
            while(rs.next()){
                if(rs.getString("car_payment_status").equalsIgnoreCase("Done")){
                    flag2 = 1;
                }
            }
            if(flag2==1){
            JOptionPane.showMessageDialog(this,"Return Confirmed");
            String sql1 ="UPDATE Car SET Status = 'Available', rentid = NULL  WHERE Productid = '"+TxtRegNo.getText()+"'";
            c.updateDatabase(sql1);
 
            DisplayCarOnRent();
            TxtCustomerID.setText("");
            TxtRentID.setText("");
            TxtRegNo.setText("");
            }else{
                JOptionPane.showMessageDialog(this,"Payment status is still pending");
            }
           
            
                }
        }
        catch(Exception e)
        {
        e.printStackTrace();
    }
    }//GEN-LAST:event_BtnConfirmActionPerformed

    private void TblCarOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblCarOnRentMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TblCarOnRent.getModel();
        int MyIndex = TblCarOnRent.getSelectedRow();
        TxtCustomerID.setText(model.getValueAt(MyIndex,0).toString());
        TxtRentID.setText(model.getValueAt(MyIndex,2).toString());
        TxtRegNo.setText(model.getValueAt(MyIndex,1).toString());
    }//GEN-LAST:event_TblCarOnRentMouseClicked

    private void TxtRentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRentIDActionPerformed

    private void BtnReturnCar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnCar2ActionPerformed
        // TODO add your handling code here:
        VehicleAdminLandingPage hl = new VehicleAdminLandingPage();
        hl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnReturnCar2ActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnCarJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JButton BtnManageCar;
    private javax.swing.JButton BtnRentCar;
    private javax.swing.JButton BtnReturnCar2;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel LblReturnCarHeading;
    private javax.swing.JPanel ReturnCarPanel;
    private javax.swing.JTable TblCarOnRent;
    private javax.swing.JTextField TxtCustomerID;
    private javax.swing.JTextField TxtRegNo;
    private javax.swing.JTextField TxtRentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void DisplayCarOnRent() {
        String reg,brand,carmodel,status,price;
        try{
            String sql = "select * from Car where Status = 'Booked' and rentid IS NOT NULL";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) TblCarOnRent.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
            }
            while (rs.next()) {
                reg = rs.getString(8);
                brand = rs.getString(1);
                carmodel = rs.getString(11);
                status = rs.getString(5);
                String[] row = {reg,brand,carmodel,status};
                model.addRow(row);                  
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();    
        }
    
    }
}