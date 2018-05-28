package admin;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DateFormat;
import javax.swing.*;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AMEER SHAHIB
 */
public class transactions extends javax.swing.JFrame {

    Date d = new Date();
    String s = d.toString();
    DateFormat df = DateFormat.getDateInstance();
//String rendate =df.format(s);

    public transactions() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(null);
        rent_date.setDate(d);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        mid = new javax.swing.JTextField();
        ifee = new javax.swing.JTextField();
        add_fee = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        state = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        rent_date = new com.toedter.calendar.JDateChooser();
        due_date = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Transation ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Customer ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Movie ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 90, 14));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Rented date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 100, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("Due Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 80, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Initial Fee");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 260, 100, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("Additional Fee");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 298, 120, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setText("Status");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 336, 70, -1));

        tid.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });
        tid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tidKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tidKeyTyped(evt);
            }
        });
        getContentPane().add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 165, 30));

        cid.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        cid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cidKeyTyped(evt);
            }
        });
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 165, 30));

        mid.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                midKeyTyped(evt);
            }
        });
        getContentPane().add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 165, 30));

        ifee.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        ifee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ifeeKeyTyped(evt);
            }
        });
        getContentPane().add(ifee, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 257, 165, 30));

        add_fee.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        add_fee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                add_feeKeyTyped(evt);
            }
        });
        getContentPane().add(add_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 295, 165, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel9.setText("TRANSACTIONS DETAILS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 370, 22));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 80, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 80, -1));

        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Assigned", "Rented", "Setteld" }));
        getContentPane().add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("View Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        rent_date.setDateFormatString("yyyy,MMM d, ");
        getContentPane().add(rent_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 165, 30));

        due_date.setDateFormatString("yyyy,MMM d ");
        due_date.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(due_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 165, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Divvya\\Desktop\\images\\grunge-movie-background-17100508.jpg")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String trid = tid.getText();
            String cuid = cid.getText();
            String moid = mid.getText();
            String rendate = df.format(rent_date.getDate());
            //   df.setDate();
            String dd = df.format(due_date.getDate());
            String ini_fee = ifee.getText();
            String addi_fee = add_fee.getText();
            Object sta = state.getSelectedItem();

            Connection c = DB.getConnect();
            String query;
            query = "insert into VIDEO_LENDING.TRANSACTIONS(TRANSACTION_ID,CUSTOMER_ID,MOVIE_ID,RENTED,DUE_DATE,FEE,ADDITIONAL_FEE,STATUS) values (?,?,?,?,?,?,?,?)";

            if (tid.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "You Can't Leave Transaction ID Empty !!");

            } else if (cid.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "You Can't Leave customer ID Empty !!");

            } else if (mid.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "You Can't Leave Movie ID Empty !!");

            } else if (df.format(due_date.getDate()).equals("")) {
                JOptionPane.showMessageDialog(null, "You Can't Leave Rented date Empty !!");

            } else if (df.format(rent_date.getDate()).equals("")) {
                JOptionPane.showMessageDialog(null, "You Can't Leave Due date Empty !!");

            } else if (ifee.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "You Can't Leave Initial fee Empty !!");

            } else if (add_fee.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "You Can't Leave Additional fee Empty !!");

            } else if (state.getSelectedItem().equals("Not Assigned")) {
                JOptionPane.showMessageDialog(null, "Please set a status !!");

            } else {
                PreparedStatement statement = c.prepareStatement(query);
                statement.setString(1, trid);
                statement.setString(2, cuid);
                statement.setString(3, moid);
                statement.setString(4, rendate);
                statement.setString(5, dd);
                statement.setString(6, ini_fee);
                statement.setString(7, addi_fee);
                statement.setString(8, (String) sta);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Transaction details have been added to the system.....");
                }
                {
                    transactions lin = new transactions();
                    lin.setVisible(true);
                    this.dispose();
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        {
            link lin = new link();
            lin.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        {
            TRANS_detils lin = new TRANS_detils();
            lin.setVisible(true);
            this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tidKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidKeyPressed

    private void tidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tidKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tidKeyTyped

    private void cidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cidKeyTyped

    private void midKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_midKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_midKeyTyped

    private void ifeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ifeeKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ifeeKeyTyped

    private void add_feeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add_feeKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_add_feeKeyTyped

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
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transactions().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_fee;
    private javax.swing.JTextField cid;
    private com.toedter.calendar.JDateChooser due_date;
    private javax.swing.JTextField ifee;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mid;
    private com.toedter.calendar.JDateChooser rent_date;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JTextField tid;
    // End of variables declaration//GEN-END:variables
}
