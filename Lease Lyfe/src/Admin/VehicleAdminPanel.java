/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Admin;

import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author monicasriramreddy
 */
public class VehicleAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form VehicleAdminPanel
     */
    MySQLConnection c = new MySQLConnection();
    public VehicleAdminPanel() {
        initComponents();
        Display();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehicleAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtVehicleAdminID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtSave = new javax.swing.JButton();
        txtEdit = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(561, 619));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVehicleAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Admin ID", "Username"
            }
        ));
        tblVehicleAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehicleAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVehicleAdmin);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 91, 512, 174));

        jLabel1.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vechicle Admin ID ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 285, -1, 20));
        jPanel2.add(txtVehicleAdminID, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 283, 120, -1));

        jLabel2.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 336, -1, -1));
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 333, 120, -1));

        jLabel3.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 386, -1, -1));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 383, 120, -1));

        txtSave.setBackground(new java.awt.Color(153, 153, 153));
        txtSave.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        txtSave.setText("Save");
        txtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveActionPerformed(evt);
            }
        });
        jPanel2.add(txtSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 463, -1, -1));

        txtEdit.setBackground(new java.awt.Color(153, 153, 153));
        txtEdit.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        txtEdit.setText("Edit");
        txtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditActionPerformed(evt);
            }
        });
        jPanel2.add(txtEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 463, -1, -1));

        txtDelete.setBackground(new java.awt.Color(153, 153, 153));
        txtDelete.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        txtDelete.setText("Delete");
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(txtDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 463, -1, -1));

        jLabel4.setFont(new java.awt.Font("Oriya MN", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create Vehicle Admin");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 35, 398, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VA.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 190, 180));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1889, Short.MAX_VALUE)
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveActionPerformed
        try{
            int flag =0;
             String password = txtPassword.getText();
                Pattern pattern3 = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
                Matcher matcher3 = pattern3.matcher(password);
                if(!matcher3.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Password!");
                    flag = 1;
                    txtPassword.setText("");
                    
                }
            if(flag == 0){
            String sql = "Insert into VehicleAdmin (ID,Username,Password)"
                    + " values ('"+txtVehicleAdminID.getText()+"','"+txtUsername.getText()+"','"+txtPassword.getText()+"')";
            c.insertDatabase(sql);
            JOptionPane.showMessageDialog(this,"Account has been Created");
            Reset();
            Display();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaveActionPerformed

    private void txtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditActionPerformed
         if(txtVehicleAdminID.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to be Updated");
            
        }else {
        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
            String Req = txtVehicleAdminID.getText();
            String Query = "Update Vehicleadmin set Username = '"+txtUsername.getText()+"', Password = '"+txtPassword.getText()+"' where ID = '"+Req+"'" ;
            c.updateDatabase(Query);
//            Statement Add = con.createStatement();
//            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Record Updated Successfully");
            Display();
            Reset();
        } catch (Exception e){
            
            e.printStackTrace();
        }
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditActionPerformed

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
        if(txtVehicleAdminID.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to be deleted");
            
        }
        else {
        try {
          
            String Req = txtVehicleAdminID.getText();
            String Query = "Delete from Vehicleadmin where ID ='"+Req+"'";
            c.updateDatabase(Query);
//            Statement Add = con.createStatement();
//            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Record Deleted Successfully");
            Display();
            Reset();
        } catch (Exception e){
            
            e.printStackTrace();
        }
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteActionPerformed

    private void tblVehicleAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehicleAdminMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblVehicleAdmin.getModel();
        int MyIndex = tblVehicleAdmin.getSelectedRow();
        txtVehicleAdminID.setText(model.getValueAt(MyIndex,0).toString());
        txtUsername.setText(model.getValueAt(MyIndex,1).toString());
        txtPassword.setText(model.getValueAt(MyIndex,2).toString());
//        txtProductId.setText((model.getValueAt(MyIndex, 1).toString()));
//        txtPrice.setText((model.getValueAt(MyIndex, 4).toString()));        // TODO add your handling code here:
    }//GEN-LAST:event_tblVehicleAdminMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVehicleAdmin;
    private javax.swing.JButton txtDelete;
    private javax.swing.JButton txtEdit;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JButton txtSave;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtVehicleAdminID;
    // End of variables declaration//GEN-END:variables

    private void Display() {
String reg,brand,carmodel,status,price;
        try{
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
//            st = con.createStatement();
            String sql = "select * from VehicleAdmin";
          ResultSet  rs = c.selectDatabase(sql);
            
            DefaultTableModel model =(DefaultTableModel) tblVehicleAdmin.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                reg = rs.getString(1);
                brand = rs.getString(2);
                carmodel = rs.getString(3);
//                status = rs.getString(5);
//                price = rs.getString(6);
                String[] row = {reg,brand};
                  model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();
            
            
        }
    }

    private void Reset() {
 txtVehicleAdminID.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        
            }
}