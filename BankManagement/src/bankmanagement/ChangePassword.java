/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChangePassword.java
 *
 * Created on 28 Jul, 2014, 1:08:06 AM
 */
package bankmanagement;

import connection.Connect;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Kashmir Singh
 */
public class ChangePassword extends javax.swing.JInternalFrame {

    /** Creates new form ChangePassword */
    public ChangePassword() {
        initComponents();
    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    static int attempt=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        u_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        old_pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        new_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(-1,true));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true), 3));
        setClosable(true);
        setTitle("CHANGE PASSWORD");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel2.setText("Username");

        u_name.setEditable(false);
        u_name.setFont(new java.awt.Font("Dialog", 0, 14));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel3.setText("Current Password");

        old_pass.setFont(new java.awt.Font("Dialog", 0, 14));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel4.setText("New Password");

        new_pass.setFont(new java.awt.Font("Dialog", 0, 14));

        jButton1.setBackground(new java.awt.Color(-10197846,true));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(-1,true));
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(-10197846,true));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(-1,true));
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(-10197846,true));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel1.setForeground(new java.awt.Color(-1,true));
        jLabel1.setText("Change Your Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(new_pass)
                            .addComponent(old_pass)
                            .addComponent(u_name, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(u_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(old_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
// TODO add your handling code here:
    u_name.setText(Login.username);
    u_name.setEditable(false);
    
}//GEN-LAST:event_formInternalFrameOpened

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    if(old_pass.getText().equals(""))
    {
        JOptionPane.showMessageDialog(rootPane,"Enter your Password");
        return;
    }
    else if(new_pass.getText().equals(""))
    {
        JOptionPane.showMessageDialog(rootPane,"Enter new Password");
        return;
    }   
    try
    {
        attempt=attempt+1;
        String query = "select password from login where user='"+u_name.getText()+"'";
        ResultSet rs = Connect.st.executeQuery(query);
        if(rs.next())
        {
            if(old_pass.getText().equals(rs.getString("password")))
            {
                String query1 = "update login set password='"+new_pass.getText()+"' where user='"+u_name.getText()+"'";
                int row = Connect.st.executeUpdate(query1);
                if(row>0)
                {
                    JOptionPane.showMessageDialog(rootPane,"Password Changed");
                    dispose();
                }
            }
            else
            {
             
             JOptionPane.showMessageDialog(rootPane,"Wrong Password \n ATTEMPT : "+attempt+"/3");
             if(attempt==3)
             {
                 JOptionPane.showMessageDialog(rootPane,"Closing Application \n LOGIN AGAIN");
                 System.exit(1);
             }
             else
             {
                 old_pass.setText("");
                 new_pass.setText("");
                
             } 
             return;
             }  
        }     
 
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JPasswordField old_pass;
    private javax.swing.JTextField u_name;
    // End of variables declaration//GEN-END:variables
}