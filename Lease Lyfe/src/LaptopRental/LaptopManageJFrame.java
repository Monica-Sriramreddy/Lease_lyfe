/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LaptopRental;


import HomeLanding.GadgetAdminLandingPage;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import HomeLanding.HomeLanding;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author rahulb
 */
public class LaptopManageJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PhoneManageJFrame
     */
    MySQLConnection c = new MySQLConnection();
    public LaptopManageJFrame() {
        initComponents();
          Display();
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
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtProductId = new javax.swing.JTextField();
        lblRentId = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        lblBrand = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaptopList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnReturnLaptop = new javax.swing.JButton();
        btnRentLaptop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setBackground(new java.awt.Color(51, 51, 51));
        btnSave.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 92, 33));

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 92, 29));

        btnReset.setBackground(new java.awt.Color(51, 51, 51));
        btnReset.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 92, 29));

        btnDelete.setBackground(new java.awt.Color(51, 51, 51));
        btnDelete.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 92, 31));
        jPanel2.add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 134, 33));

        lblRentId.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        lblRentId.setForeground(new java.awt.Color(255, 255, 255));
        lblRentId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRentId.setText("Product Id :");
        jPanel2.add(lblRentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 112, -1));
        jPanel2.add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 134, 30));

        lblBrand.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(255, 255, 255));
        lblBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBrand.setText("Brand :");
        jPanel2.add(lblBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 112, 30));
        jPanel2.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 134, 30));

        lblModel.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        lblModel.setForeground(new java.awt.Color(255, 255, 255));
        lblModel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModel.setText("Model :");
        jPanel2.add(lblModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 112, 30));

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Available", "Booked", "In Service" }));
        jPanel2.add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 134, 30));

        lblStatus.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Status :");
        jPanel2.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 112, 30));
        jPanel2.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 134, 30));

        lblPrice.setBackground(new java.awt.Color(255, 185, 12));
        lblPrice.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrice.setText("Price :");
        jPanel2.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 112, 30));

        tblLaptopList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Brand", "Model", "Status", "Price"
            }
        ));
        tblLaptopList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaptopListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLaptopList);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 460, 180));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Laptops");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 253, 52));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LaptopRental/LaptopRental/online-sale.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 380, 280));

        btnLogout.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Back");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, -1, -1));

        btnReturnLaptop.setBackground(new java.awt.Color(51, 51, 51));
        btnReturnLaptop.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnReturnLaptop.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnLaptop.setText("Manage Return");
        btnReturnLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnLaptopActionPerformed(evt);
            }
        });
        jPanel2.add(btnReturnLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

        btnRentLaptop.setBackground(new java.awt.Color(51, 51, 51));
        btnRentLaptop.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnRentLaptop.setForeground(new java.awt.Color(255, 255, 255));
        btnRentLaptop.setText("Manage Rents");
        btnRentLaptop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRentLaptopMouseClicked(evt);
            }
        });
        btnRentLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentLaptopActionPerformed(evt);
            }
        });
        jPanel2.add(btnRentLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 400, 148, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2990, 1580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int flag = 0;
                
                //*************************************** Validation of Empty Name Field ***************************************//
                 if(txtProductId.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Product ID cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                 if(txtModel.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Model cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                  if(txtBrand.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Brand cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                   if(txtPrice.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Price cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                     
                   if(cbStatus.getSelectedItem().toString().isEmpty() || cbStatus.getSelectedItem().toString() == "Select" ){
                    JOptionPane optionPane = new JOptionPane("Please choose the Status", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                 String name7 = txtProductId.getText();
                Pattern pattern7 = Pattern.compile("^[a-zA-Z0-9- ]{1,50}$");
                Matcher matcher7 = pattern7.matcher(name7);
                if(!matcher7.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Product ID!");
                    flag = 1;
                    txtProductId.setText("");
                    
                }
                
                 String employeeId2 = txtBrand.getText();
                Pattern pattern2 = Pattern.compile("^[a-zA-Z0-9- ]{1,50}$");
                Matcher matcher2 =pattern2.matcher(employeeId2);
                if(!matcher2.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a Valid Brand!");
                    flag = 1;
                    txtBrand.setText("");   
                }
                String level4 = txtModel.getText();
                Pattern pattern4 = Pattern.compile("^[a-zA-Z0-9- ]{1,50}$");
                Matcher matcher4 = pattern4.matcher(level4);
                if(!matcher4.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Model!");
                    flag = 1;
                    txtModel.setText("");
                    
                }
                
                 String cellPhoneNumber3 = txtPrice.getText();
                Pattern pattern3 = Pattern.compile("^[0-9]{3}$");
                Matcher matcher3 = pattern3.matcher(cellPhoneNumber3);
                if(!matcher3.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Price!");
                    flag = 1;
                    txtPrice.setText("");
                    
                    
                }
                
                if(flag == 0)
        {
                String sql = "INSERT INTO Laptop (Productid,Brand,Model,Status,Price) "
                + " VALUES ('"+txtProductId.getText()+"','"+txtBrand.getText()+"','"+txtModel.getText()+"',"
                + "'"+cbStatus.getSelectedItem().toString()+"','"+txtPrice.getText()+"')";     
                c.insertDatabase(sql);
                JOptionPane.showMessageDialog(null,"Record Added Successfully!");
                Display();
                Reset();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        if(txtProductId.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to be deleted");
            
        }
        else {
        try {
          
            String Req = txtProductId.getText();
            String Query = "Delete from laptop where productid ='"+Req+"'";
            c.updateDatabase(Query);
//            Statement Add = con.createStatement();
//            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Record Deleted Successfully");
            Display();
            Reset();
        } catch (Exception e){
            
            e.printStackTrace();
        }
        
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblLaptopListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaptopListMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblLaptopList.getModel();
        int MyIndex = tblLaptopList.getSelectedRow();
        txtProductId.setText(model.getValueAt(MyIndex,0).toString());
        txtBrand.setText(model.getValueAt(MyIndex,1).toString());
        txtModel.setText(model.getValueAt(MyIndex,2).toString());
        cbStatus.setSelectedItem(model.getValueAt(MyIndex,3).toString());
        txtPrice.setText(model.getValueAt(MyIndex,4).toString());
                
    }//GEN-LAST:event_tblLaptopListMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
          if(txtProductId.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record");
            
        }else{
        Reset();
    }//GEN-LAST:event_btnResetActionPerformed
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         if(txtProductId.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to be Updated");
            
        }else {
        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
            String Req = txtProductId.getText();
            String Query = "Update laptop set brand = '" +txtBrand.getText()+"', model = '"+txtModel.getText()+"', "
                    + "status = '"+cbStatus.getSelectedItem()+"', price = "+txtPrice.getText()+" where productid = '"+Req+"'" ;
            c.updateDatabase(Query);
//            Statement Add = con.createStatement();
//            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Record Updated Successfully");
            Display();
            Reset();
        } catch (Exception e){
            
            e.printStackTrace();
        }
        
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRentLaptopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRentLaptopMouseClicked
        // TODO add your handling code here:
        LaptopRentJFrame  lr = new LaptopRentJFrame();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRentLaptopMouseClicked

    private void btnRentLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentLaptopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRentLaptopActionPerformed

    private void btnReturnLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnLaptopActionPerformed
        // TODO add your handling code here:
        LaptopReturnJFrame  lr = new LaptopReturnJFrame();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnLaptopActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        GadgetAdminLandingPage hl = new GadgetAdminLandingPage();
        hl.setVisible(true);
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
            java.util.logging.Logger.getLogger(LaptopManageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaptopManageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaptopManageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaptopManageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaptopManageJFrame().setVisible(true);
            }
        });
    }

    
        private void Display(){
        String reg,brand,carmodel,status,price;
        try{
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
//            st = con.createStatement();
            String sql = "select * from Laptop";
          ResultSet  rs = c.selectDatabase(sql);
            
            DefaultTableModel model =(DefaultTableModel) tblLaptopList.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                reg = rs.getString(1);
                brand = rs.getString(2);
                carmodel = rs.getString(3);
                status = rs.getString(4);
                price = rs.getString(5);
                String[] row = {reg,brand,carmodel,status,price};
                  model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();
            
            
        }
        
        
        
    }
        private void Reset(){
        txtProductId.setText("");
        txtModel.setText("");
        cbStatus.setSelectedIndex(0);
        txtPrice.setText("");
        txtBrand.setText("");
    }
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRentLaptop;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReturnLaptop;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblRentId;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblLaptopList;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductId;
    // End of variables declaration//GEN-END:variables
}
