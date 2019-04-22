/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ModifyAcc.java
 *
 * Created on 24 Jul, 2014, 8:42:00 PM
 */
package bankmanagement;

import connection.Connect;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Kashmir Singh
 */
public class ModifyAcc extends javax.swing.JInternalFrame {

    /** Creates new form ModifyAcc */
    public ModifyAcc() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        acc_id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_num = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setTitle("MODIFY ACCOUNT DETAILS");
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

        jPanel1.setBackground(new java.awt.Color(-10197846,true));

        label.setFont(new java.awt.Font("Dialog", 2, 14));
        label.setForeground(new java.awt.Color(-65536,true));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel1.setForeground(new java.awt.Color(-1,true));
        jLabel1.setText("Account ID");

        acc_id.setFont(new java.awt.Font("Dialog", 0, 18));
        acc_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                acc_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                acc_idKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acc_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addGap(121, 121, 121))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(acc_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(-1,true));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true), 3));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel6.setForeground(new java.awt.Color(-10197846,true));
        jLabel6.setText("Modify Details:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel2.setText("Customer Name");

        c_name.setEditable(false);
        c_name.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        c_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                c_nameFocusGained(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel3.setText("Mobile");

        c_num.setEditable(false);
        c_num.setFont(new java.awt.Font("Dialog", 0, 14));
        c_num.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                c_numFocusGained(evt);
            }
        });

        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(address);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel5.setText("Balance");

        balance.setEditable(false);
        balance.setFont(new java.awt.Font("Dialog", 0, 14));

        jButton5.setBackground(new java.awt.Color(-10197846,true));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton5.setForeground(new java.awt.Color(-1,true));
        jButton5.setText("CANCEL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(-10197846,true));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton4.setForeground(new java.awt.Color(-1,true));
        jButton4.setText("SAVE CHANGES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(396, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(c_num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(c_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addGap(123, 123, 123))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(78, 78, 78)
                        .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jButton5)
                .addGap(87, 87, 87)
                .addComponent(jButton4)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void acc_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_idKeyReleased
// TODO add your handling code here:
    try
    {
        if(!acc_id.getText().equals(""))
    {
        Connect.getConnection();
        String query ="select name,mobile,address,balance from new_account where account='"+acc_id.getText()+"'";
        ResultSet rs = Connect.st.executeQuery(query);
        if(rs.next())
        {
            label.setText("valid Account ID");
               c_name.setText(rs.getString("name"));
            c_num.setText(rs.getString("mobile"));
            address.setText(rs.getString("address"));
            balance.setText(rs.getString("balance"));
        } 
        else
        {
        label.setText("invalid account ID");    
        c_name.setText("");
        address.setText("");
        c_num.setText("");
        balance.setText("");
        }
    }
        else
            label.setText("Enter account Id");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }    
}//GEN-LAST:event_acc_idKeyReleased

private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
// TODO add your handling code here:
      c_name.setEditable(true);
    c_num.setEditable(true);
    address.setEditable(true);
    balance.setEditable(false);
}//GEN-LAST:event_formInternalFrameOpened

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_jButton5ActionPerformed

private void acc_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_idKeyTyped
// TODO add your handling code here:
    
    if(!Character.isDigit(evt.getKeyChar()))
    {
        evt.consume();   
    }
}//GEN-LAST:event_acc_idKeyTyped

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
    try
    {
        if(!acc_id.getText().trim().equals(""))
    {
          Connect.getConnection();
        String query ="select name,mobile,address,balance from new_account where account='"+acc_id.getText().trim()+"'";
        ResultSet rs = Connect.st.executeQuery(query);
        if(rs.next())
        {
            String query1 ="update new_account set name='"+c_name.getText().trim()+"',mobile='"+c_num.getText().trim()+"'"
                    + ",address='"+address.getText().trim()+"' where account='"+acc_id.getText().trim()+"'";
         int row = Connect.st.executeUpdate(query1);
         if(row>0)
         {
             JOptionPane.showMessageDialog(rootPane,"Modification Successful");
             dispose();
         }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Invalid Account ID");
            return; 
        }
    }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Enter Account ID");
            return;
        }
    }   
    catch(Exception e)
    {
        System.out.println(e);
    }
}//GEN-LAST:event_jButton4ActionPerformed

private void c_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_nameFocusGained
// TODO add your handling code here:
    c_name.setText("");
}//GEN-LAST:event_c_nameFocusGained

private void c_numFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_numFocusGained
// TODO add your handling code here:
    c_num.setText("");
}//GEN-LAST:event_c_numFocusGained

private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
// TODO add your handling code here:
    address.setText("");
}//GEN-LAST:event_addressFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acc_id;
    private javax.swing.JTextPane address;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField c_name;
    private javax.swing.JTextField c_num;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
