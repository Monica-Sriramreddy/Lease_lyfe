/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BikeRental;


import HomeLanding.HomeLanding;
import HomeLanding.VehicleAdminLandingPage;
import Rental.Notification.Email;
import MySQLConnection.MySQLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class RentBikeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageBikeJFrame
     */
    MySQLConnection c = new MySQLConnection();
    Email e = new Email();
    public RentBikeJFrame() {
        initComponents();
        DisplayCarOnRent();
        DisplayCarRentalRequest();
        TxtRegNo.setEditable(false);
        TxtCustomerID.setEditable(false);
        TxtRentDate.setEditable(false);
        TxtReturnDate.setEditable(false);
        TxtPrice.setEditable(false);
//     ss   TxtProductId.setEditable(false);
        TxtEmail.setEditable(false);
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

        RentBikePanel = new javax.swing.JPanel();
        ButtonsPanel = new javax.swing.JPanel();
        BtnReturnBike = new javax.swing.JButton();
        BtnManageBike = new javax.swing.JButton();
        BtnReturnCar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblBikeOnRent = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblBikeRentalRequest = new javax.swing.JTable();
        BtnApprove = new javax.swing.JButton();
        BtnDeny = new javax.swing.JButton();
        LblCarsOnRent1 = new javax.swing.JLabel();
        LblCarsOnRent = new javax.swing.JLabel();
        LblRentCarHeading = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCustomerId = new javax.swing.JLabel();
        TxtCustomerID = new javax.swing.JTextField();
        TxtRegNo = new javax.swing.JTextField();
        lblCustomerId1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtRentDate = new javax.swing.JTextField();
        TxtReturnDate = new javax.swing.JTextField();
        TxtRentID = new javax.swing.JTextField();
        TxtPrice = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RentBikePanel.setBackground(new java.awt.Color(51, 51, 51));
        RentBikePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonsPanel.setBackground(new java.awt.Color(153, 153, 153));
        ButtonsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReturnBike.setBackground(new java.awt.Color(51, 51, 51));
        BtnReturnBike.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnReturnBike.setForeground(new java.awt.Color(255, 255, 255));
        BtnReturnBike.setText("Return Bike");
        BtnReturnBike.setBorder(null);
        BtnReturnBike.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReturnBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnBikeActionPerformed(evt);
            }
        });
        ButtonsPanel.add(BtnReturnBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, 29));

        BtnManageBike.setBackground(new java.awt.Color(51, 51, 51));
        BtnManageBike.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnManageBike.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageBike.setText("Manage Bike");
        BtnManageBike.setBorder(null);
        BtnManageBike.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnManageBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageBikeActionPerformed(evt);
            }
        });
        ButtonsPanel.add(BtnManageBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 29));

        BtnReturnCar1.setBackground(new java.awt.Color(51, 51, 51));
        BtnReturnCar1.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnReturnCar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnReturnCar1.setText("Back");
        BtnReturnCar1.setBorder(null);
        BtnReturnCar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReturnCar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnCar1ActionPerformed(evt);
            }
        });
        ButtonsPanel.add(BtnReturnCar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 150, 29));

        RentBikePanel.add(ButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 1040));

        TblBikeOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rent ID", "Customer ID", "Rent Fee"
            }
        ));
        TblBikeOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblBikeOnRentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblBikeOnRent);

        RentBikePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 430, 129));

        TblBikeRentalRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Reg No", "Rent Date", "Return Date", "Fee"
            }
        ));
        TblBikeRentalRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblBikeRentalRequestMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TblBikeRentalRequest);

        RentBikePanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 430, 139));

        BtnApprove.setBackground(new java.awt.Color(153, 153, 153));
        BtnApprove.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnApprove.setText("Approve");
        BtnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApproveActionPerformed(evt);
            }
        });
        RentBikePanel.add(BtnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 605, 94, -1));

        BtnDeny.setBackground(new java.awt.Color(153, 153, 153));
        BtnDeny.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnDeny.setText("Deny");
        BtnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDenyActionPerformed(evt);
            }
        });
        RentBikePanel.add(BtnDeny, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 647, 94, -1));

        LblCarsOnRent1.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        LblCarsOnRent1.setForeground(new java.awt.Color(255, 255, 255));
        LblCarsOnRent1.setText("Bikes On Rent");
        RentBikePanel.add(LblCarsOnRent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 189, 125, -1));

        LblCarsOnRent.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        LblCarsOnRent.setForeground(new java.awt.Color(255, 255, 255));
        LblCarsOnRent.setText("Rental Request");
        RentBikePanel.add(LblCarsOnRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 125, -1));

        LblRentCarHeading.setBackground(new java.awt.Color(255, 185, 12));
        LblRentCarHeading.setFont(new java.awt.Font("Oriya MN", 3, 18)); // NOI18N
        LblRentCarHeading.setForeground(new java.awt.Color(255, 255, 255));
        LblRentCarHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblRentCarHeading.setText("Rent Bikes");
        LblRentCarHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RentBikePanel.add(LblRentCarHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 130, -1, 53));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Oriya MN", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LeaseLyfe");
        RentBikePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblCustomerId.setBackground(new java.awt.Color(51, 51, 51));
        lblCustomerId.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        lblCustomerId.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerId.setText("Customer ID :");

        TxtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerIDActionPerformed(evt);
            }
        });

        TxtRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRegNoActionPerformed(evt);
            }
        });

        lblCustomerId1.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        lblCustomerId1.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerId1.setText("Reg No :");

        jLabel5.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Rent ID :");

        jLabel6.setBackground(new java.awt.Color(255, 185, 12));
        jLabel6.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Rent Date :");

        jLabel7.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Return Date :");

        jLabel8.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Fee :");

        jLabel9.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Email :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCustomerId1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtRentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TxtCustomerID, TxtEmail, TxtPrice, TxtRegNo, TxtRentDate, TxtRentID, TxtReturnDate});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerId1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRentID, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TxtCustomerID, TxtEmail, TxtPrice, TxtRegNo, TxtRentDate, TxtRentID, TxtReturnDate});

        RentBikePanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 200, 340, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rentbike.png"))); // NOI18N
        RentBikePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 300, 190, 160));

        getContentPane().add(RentBikePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 1870, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReturnBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnBikeActionPerformed
        // TODO add your handling code here:
        ReturnBikeJFrame rc = new ReturnBikeJFrame();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnReturnBikeActionPerformed

    private void BtnManageBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageBikeActionPerformed
        // TODO add your handling code here:
        ManageBikeJFrame mc = new ManageBikeJFrame();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnManageBikeActionPerformed

    private void TxtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustomerIDActionPerformed

    private void BtnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApproveActionPerformed
        // TODO add your handling code here:
        
        
        try{
            int flag = 0;
                
                //*************************************** Validation of Empty Name Field ***************************************//
                 if(TxtRentID.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Rent ID cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                String cellPhoneNumber3 = TxtRentID.getText();
                Pattern pattern3 = Pattern.compile("^[0-9]{3}$");
                Matcher matcher3 = pattern3.matcher(cellPhoneNumber3);
                if(!matcher3.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a Valid Rent ID!");
                    flag = 1;
                    TxtRentID.setText("");
                    
                    
                }
                if(flag == 0){
            String sql="UPDATE Bike SET CustomerID = '"+TxtCustomerID.getText()+"', rentid = '"+TxtRentID.getText()+"',Status = 'Booked',rentDate = '"+TxtRentDate.getText()+"' ,returnDate = '"+TxtReturnDate.getText()+"',Price = '"+TxtPrice.getText()+"' WHERE Productid = '"+TxtRegNo.getText()+"' ";
            c.updateDatabase(sql);
            JOptionPane.showMessageDialog(this,"Request Aprooved");  
            String sql1 ="UPDATE Customer SET BikeApprove = 'Booked', bikeRentID  = '"+TxtRentID.getText()+"'  WHERE CustomerID = '"+TxtCustomerID.getText()+"' ";
            c.updateDatabase(sql1);          

            String sql2 = "SELECT email From Customer WHERE CustomerID = '"+TxtCustomerID.getText()+"'";
            
            ResultSet rs = c.selectDatabase(sql2);
            if(rs.next()){
            String email;
            
            email = rs.getString(1);
//            System.out.println(rs.getString(email));
            TxtEmail.setText(email);
            }
//                       String s =c.selectDatabase(sql2).getString(1);
                       
            String msg = "Your Rental Request has been Aprroved";
            e.sendMail(msg,"Car" ,TxtCustomerID.getText(), TxtRegNo.getText(), TxtRentID.getText(), TxtPrice.getText(),TxtRentDate.getText(), TxtReturnDate.getText(), TxtEmail.getText());
            DisplayCarOnRent();
            DisplayCarRentalRequest();
            Reset();
                }
        }
        catch(Exception e)
        {
        e.printStackTrace();
    }
    }//GEN-LAST:event_BtnApproveActionPerformed

    private void TblBikeOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblBikeOnRentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TblBikeOnRentMouseClicked

    private void TblBikeRentalRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblBikeRentalRequestMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TblBikeRentalRequest.getModel();
        int MyIndex = TblBikeRentalRequest.getSelectedRow();
        TxtCustomerID.setText(model.getValueAt(MyIndex,0).toString());
        TxtRentDate.setText(model.getValueAt(MyIndex,2).toString());
        TxtReturnDate.setText(model.getValueAt(MyIndex,3).toString());
        TxtRegNo.setText((model.getValueAt(MyIndex, 1).toString()));
        TxtPrice.setText((model.getValueAt(MyIndex, 4).toString()));
    }//GEN-LAST:event_TblBikeRentalRequestMouseClicked

    private void BtnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDenyActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String sql1 ="UPDATE Customer SET BikeApprove = NULL  WHERE CustomerID = '"+TxtCustomerID.getText()+"' ";
            c.updateDatabase(sql1);
            JOptionPane.showMessageDialog(this,"Request Denied");
            String msg = "Your Rental request has been Denied";
//            e.sendMail(msg,"Car" ,TxtCustomerID.getText(), TxtRegNo.getText(), TxtRentID.getText(), TxtPrice.getText(),TxtRentDate.getText(), TxtReturnDate.getText(), TxtEmail.getText());
            
        } catch (Exception ex) {
            Logger.getLogger(RentBikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            DisplayCarOnRent();
            DisplayCarRentalRequest();
            Reset();
    }//GEN-LAST:event_BtnDenyActionPerformed

    private void TxtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRegNoActionPerformed

    private void BtnReturnCar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnCar1ActionPerformed
        // TODO add your handling code here:
        VehicleAdminLandingPage hl = new VehicleAdminLandingPage();
        hl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnReturnCar1ActionPerformed

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
            java.util.logging.Logger.getLogger(RentBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentBikeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApprove;
    private javax.swing.JButton BtnDeny;
    private javax.swing.JButton BtnManageBike;
    private javax.swing.JButton BtnReturnBike;
    private javax.swing.JButton BtnReturnCar1;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel LblCarsOnRent;
    private javax.swing.JLabel LblCarsOnRent1;
    private javax.swing.JLabel LblRentCarHeading;
    private javax.swing.JPanel RentBikePanel;
    private javax.swing.JTable TblBikeOnRent;
    private javax.swing.JTable TblBikeRentalRequest;
    private javax.swing.JTextField TxtCustomerID;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtRegNo;
    private javax.swing.JTextField TxtRentDate;
    private javax.swing.JTextField TxtRentID;
    private javax.swing.JTextField TxtReturnDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblCustomerId1;
    // End of variables declaration//GEN-END:variables



    private void DisplayCarOnRent() {
        String reg,brand,carmodel,status,price;
        try{
            
            String sql = "select * from Bike where (Status = 'Booked' and rentid IS NOT NULL )";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) TblBikeOnRent.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) 
            {
                reg = rs.getString(11);
                brand = rs.getString(8);
                carmodel = rs.getString(5);
                String[] row = {reg,brand,carmodel};
                model.addRow(row);
                               
             }
        
        } catch (SQLException e)
        {
            e.printStackTrace();
            
            
        }
        
    }

    private void DisplayCarRentalRequest() {
        String reg,brand,status,price,carmodel;
        try{
            String sql = "SELECT * FROM Customer where BikeApprove = 'Requested' ";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel)TblBikeRentalRequest.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                reg = rs.getString(1);
                brand = rs.getString(11);
                
                status = rs.getString(12);
                price = rs.getString(13);
                carmodel = rs.getString(10);
                String[] row = {reg,brand,status,price,carmodel};
                model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();
            
            
        }
    }

    private void Reset() {
        TxtCustomerID.setText("");
        TxtEmail.setText("");
        TxtPrice.setText("");
        TxtRegNo.setText("");
        TxtRentDate.setText("");
        TxtRentID.setText("");
        TxtReturnDate.setText("");
    }
}