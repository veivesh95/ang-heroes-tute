/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.*;
import java.util.Arrays;
import javax.swing.*;

public class register extends javax.swing.JFrame {

    private Object l;

    public register() {
        setTitle("Register");
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pw = new javax.swing.JPasswordField();
        conpw = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Name :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 60, 30));

        name.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 230, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Desired Username :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 230, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Enter Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Confirm Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("E-Mail :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 80, -1));
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 230, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setText("Contact :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 100, -1));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 230, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 81, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 100, 30));
        getContentPane().add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 230, 30));

        conpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpwActionPerformed(evt);
            }
        });
        getContentPane().add(conpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Divvya\\Desktop\\images\\neww.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String getName = name.getText();
            String getUN = username.getText();
            String getPW = pw.getText();
            String confirmPW = conpw.getText();
            String email = mail.getText();
            String number = contact.getText();

            if (validate.isEmpty(getName, getUN, getPW, confirmPW, email, number)) {
               if (validate.ischar(getName)) {
                    if (validate.isNumber(number)) {
                        if (getPW.equals(confirmPW)) {
                            if(validate.isEmail(email)){
                            System.out.println("correct");

                            Connection c = DB.getConnect();
                            String query;
                            query = "insert into video_lending.admin (username, password, name, email, contact)  values (?,?,?,?,?)";
                            PreparedStatement statement = c.prepareStatement(query);
                            statement.setString(1, getName);
                            statement.setString(2, getUN);
                            statement.setString(3, getPW);
                            statement.setString(4, email);
                            statement.setString(5, number);

                            int rowsInserted = statement.executeUpdate();

                            if (rowsInserted > 0) {
                                JOptionPane.showMessageDialog(null, "New administrator has been added to the system");
                                System.out.println("A new user was inserted successfully!");
                            }

                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Your password doesn't match");
                        }
                    }
                }
            }
          }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int answer = JOptionPane.showConfirmDialog(this, "Do you want to cancel?");
        if (answer == 0) {
            Login log = new Login();
            log.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void conpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpwActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField conpw;
    private javax.swing.JTextField contact;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
