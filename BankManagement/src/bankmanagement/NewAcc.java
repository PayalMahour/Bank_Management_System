/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewAcc.java
 *
 * Created on 15 Jul, 2014, 9:12:52 AM
 */
package bankmanagement;

import javax.swing.JOptionPane;
import connection.Connect;
import java.sql.*;


/**
 *
 * @author Kashmir Singh
 */
public class NewAcc extends javax.swing.JInternalFrame {

    /** Creates new form NewAcc */
    public NewAcc() {
        initComponents();
    }

    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    String date1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        acc_id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        c_num = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        dateField = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setResizable(true);
        setTitle("NEW ACCOUNT");
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

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel5.setForeground(new java.awt.Color(-1,true));
        jLabel5.setText("Account ID");

        acc_id.setEditable(false);
        acc_id.setFont(new java.awt.Font("Dialog", 0, 14));
        acc_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_idActionPerformed(evt);
            }
        });
        acc_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                acc_idKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(65, 65, 65)
                .addComponent(acc_id, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(205, 205, 205))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(acc_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(-1,true));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true), 3));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel9.setForeground(new java.awt.Color(-10197846,true));
        jLabel9.setText("Enter Customer Details :");

        c_name.setFont(new java.awt.Font("Dialog", 0, 14));
        c_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nameActionPerformed(evt);
            }
        });
        c_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_nameKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel1.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel3.setText("Sex");

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel8.setText("Age");

        age.setFont(new java.awt.Font("Dialog", 0, 14));
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel6.setText("Date");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel2.setText("Address");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel4.setText("Contact Number");

        c_num.setFont(new java.awt.Font("Dialog", 0, 14));
        c_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_numActionPerformed(evt);
            }
        });
        c_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_numKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel7.setText("Deposit Money");

        balance.setFont(new java.awt.Font("Dialog", 0, 14));
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        balance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                balanceKeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(-10197846,true));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton2.setForeground(new java.awt.Color(-1,true));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(-10197846,true));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton1.setForeground(new java.awt.Color(-1,true));
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dateField.setEditable(false);
        dateField.setFont(new java.awt.Font("Dialog", 0, 14));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(c_name, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                .addGap(152, 152, 152))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(male)
                        .addGap(42, 42, 42)
                        .addComponent(female)))
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                .addGap(152, 152, 152))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(420, 420, 420))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                .addGap(152, 152, 152))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(107, 107, 107)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(152, 152, 152))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(c_num, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                .addGap(152, 152, 152))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                .addGap(152, 152, 152))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(male)
                        .addComponent(female)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

private void c_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nameActionPerformed
// TODO add your handling code here:
    
    
}//GEN-LAST:event_c_nameActionPerformed

private void c_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_numActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_c_numActionPerformed

private void acc_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_idActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_acc_idActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    
    if(c_name.getText().trim().length()==0)
    {
        JOptionPane.showMessageDialog(rootPane,"Enter Customer Name");
        return;
    } 
    
    if(!male.isSelected() && !female.isSelected())
    {    
        JOptionPane.showMessageDialog(rootPane,"Select sex");
        return;
    }
  
    if(age.getText().trim().length()==0||age.getText().trim().length()>3)
    {
       JOptionPane.showMessageDialog(rootPane,"Enter correct age");
       return;
    }
    
    if(address.getText().trim().length()==0)
    {
        JOptionPane.showMessageDialog(rootPane,"enter customer's address");
        return;
    } 
    if(c_num.getText().trim().length()>11||c_num.getText().trim().length()==0)
    {
        JOptionPane.showMessageDialog(rootPane,"enter customer's correct number ( max.11 digit)");
        return; 
    }    
    
    if(balance.getText().trim().length()<4)
    {
        JOptionPane.showMessageDialog(rootPane,"deposit money (minimum Rs. 1000)");
        return;
    } 
   String sex="";
    if(male.isSelected())
    {
        sex="male";
    }
    else 
    {
        sex= "female";
    }
    
    try
    {        
       
         String query1 = "select count(*) from transaction1";
        ResultSet rs = Connect.st.executeQuery(query1);
        rs.first();
        int count = rs.getInt(1);
        rs.close();
        String c;
        if(count==0)
        {
           c = String.valueOf(count);
        }
        else
        {
            String query2 = "select transid from transaction1";
            rs = Connect.st.executeQuery(query2);
            rs.last();
            int i = Integer.parseInt(rs.getString("transid"));
            i=i+1;
            c=String.valueOf(i);
         }
       String query3 = "insert into transaction1 (transid,account,action,date,amount) values ('"+c+"','"+acc_id.getText()+"','deposit','"+date1+"','"+balance.getText()+"')";
        int row3 = Connect.st.executeUpdate(query3);
        if(row3>0)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Error Occured");
        }
      
         String query = "insert into new_account(account,name,sex,age,mobile,address,open_date,deposit_date,last_deposit,balance) values ('"+acc_id.getText()+"','"+c_name.getText()+"','"+sex+"','"+age.getText()+"'"
        + ",'"+c_num.getText()+"','"+address.getText()+"','"+date1+"','"+date1+"','"+balance.getText()+"','"+balance.getText()+"')";
                
        int row = Connect.st.executeUpdate(query);
        if(row>0)
        {
            JOptionPane.showMessageDialog(rootPane,"new Customer registered");
            dispose();
        }
        
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
   
    
}//GEN-LAST:event_jButton1ActionPerformed

private void c_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_nameKeyTyped
// TODO add your handling code here:
    char ch = evt.getKeyChar();
  /*  if(Character.isDigit(ch))
    {
        evt.consume();
    }  */
    if(!Character.isAlphabetic(evt.getKeyChar()))
    {
        evt.consume();
    }
}//GEN-LAST:event_c_nameKeyTyped

private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_femaleActionPerformed

private void c_numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_numKeyTyped
// TODO add your handling code here:
    if(!Character.isDigit(evt.getKeyChar()))
    {
        evt.consume();
    }
    if(c_num.getText().trim().length()>9)
    {
        evt.consume();
    }
}//GEN-LAST:event_c_numKeyTyped

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
   dispose();
}//GEN-LAST:event_jButton2ActionPerformed

private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_balanceActionPerformed

private void acc_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_idKeyTyped
// TODO add your handling code here:
    
}//GEN-LAST:event_acc_idKeyTyped

private void balanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_balanceKeyTyped
// TODO add your handling code here:
   if(!Character.isDigit(evt.getKeyChar()))
    {
        evt.consume();
    } 
}//GEN-LAST:event_balanceKeyTyped

private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped
// TODO add your handling code here:
    if(!Character.isDigit(evt.getKeyChar()))
    {
        evt.consume();
    }
    if(age.getText().trim().length()>2)
    {
        evt.consume();
    }
}//GEN-LAST:event_ageKeyTyped

private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
// TODO add your handling code here:
    try
    {
        Connect.getConnection();
        String query = "select count(*) from new_account";
        ResultSet rs = Connect.st.executeQuery(query);
        rs.first();
        int count = rs.getInt(1);
        rs.close();
        if(count==0)
        {
            acc_id.setText(String.valueOf(count+1000));
        }
        else
        {
            String query4 = "select account from new_account";
            rs = Connect.st.executeQuery(query4);
            rs.last();
            acc_id.setText(String.valueOf((Integer.parseInt(rs.getString("account")))+1));
            
        }
        date1=DateToday.getDate();
        dateField.setText(DateToday.day+"-"+DateToday.monthName+"-"+DateToday.year);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acc_id;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField balance;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JTextField c_name;
    private javax.swing.JTextField c_num;
    private javax.swing.JTextField dateField;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton male;
    // End of variables declaration//GEN-END:variables
}
