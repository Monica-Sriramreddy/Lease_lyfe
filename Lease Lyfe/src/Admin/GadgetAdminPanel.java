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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monicasriramreddy
 */
public class GadgetAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form GadgetAdminPanel
     */
        MySQLConnection c = new MySQLConnection();
    public GadgetAdminPanel() {
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
        tblGadgetAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtGadgetAdminID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGadgetAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gadget Admin ID", "Username"
            }
        ));
        tblGadgetAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGadgetAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGadgetAdmin);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 96, 500, 174));

        jLabel1.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gadget Admin ID ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 370, -1, -1));
        jPanel2.add(txtGadgetAdminID, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 367, 120, -1));

        jLabel2.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 421, -1, -1));
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 418, 120, -1));

        jLabel3.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 469, -1, -1));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 466, 120, -1));

        btnSave.setBackground(new java.awt.Color(153, 153, 153));
        btnSave.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 541, -1, -1));

        btnEdit.setBackground(new java.awt.Color(153, 153, 153));
        btnEdit.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 541, -1, -1));

        btnDelete.setBackground(new java.awt.Color(153, 153, 153));
        btnDelete.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 541, -1, -1));

        jLabel4.setFont(new java.awt.Font("Oriya MN", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create Gadget Admin");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 39, 398, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GA.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 190, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(txtGadgetAdminID.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to be deleted");

        }
        else {
            try {

                String Req = txtGadgetAdminID.getText();
                String Query = "Delete from GadgetAdmin where ID ='"+Req+"'";
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

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(txtGadgetAdminID.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to be Updated");

        }else {
            try {
                //            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
                String Req = txtGadgetAdminID.getText();
                String Query = "Update GadgetAdmin set Username = '"+txtUserName.getText()+"', Password = '"+txtPassword.getText()+"' where ID = '"+Req+"'" ;
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
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
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
            String sql = "Insert into GadgetAdmin (ID,Username,Password)"
            + " values ('"+txtGadgetAdminID.getText()+"','"+txtUserName.getText()+"','"+txtPassword.getText()+"')";
            c.insertDatabase(sql);
            JOptionPane.showMessageDialog(this,"Account has been Created");
            Reset();
            Display();
                }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblGadgetAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGadgetAdminMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblGadgetAdmin.getModel();
        int MyIndex = tblGadgetAdmin.getSelectedRow();
        txtGadgetAdminID.setText(model.getValueAt(MyIndex,0).toString());
        txtUserName.setText(model.getValueAt(MyIndex,1).toString());
        txtPassword.setText(model.getValueAt(MyIndex,2).toString());
        //        txtProductId.setText((model.getValueAt(MyIndex, 1).toString()));
        //        txtPrice.setText((model.getValueAt(MyIndex, 4).toString()));
    }//GEN-LAST:event_tblGadgetAdminMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGadgetAdmin;
    private javax.swing.JTextField txtGadgetAdminID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void Reset() {
        txtGadgetAdminID.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        
        
        
    }

    private void Display() {
        String reg,brand,carmodel,status,price;
        try{
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
//            st = con.createStatement();
            String sql = "select * from GadgetAdmin";
          ResultSet  rs = c.selectDatabase(sql);
            
            DefaultTableModel model =(DefaultTableModel) tblGadgetAdmin.getModel();
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
}
