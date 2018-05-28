package admin;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import net.proteanit.sql.DbUtils;

public class update extends javax.swing.JFrame {
        Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    

    public update() {
        initComponents();
        conn = DB.getConnect();
       updatetable ();
       this.setLocationRelativeTo(null);
    }
    public void updatetable (){
    try{
    String sql = "select * from video_lending.TRANSACTIONS";
    pst = conn.prepareStatement(sql);
    rs = pst.executeQuery();
    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        z = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        f = new javax.swing.JTextField();
        g = new javax.swing.JTextField();
        TRANSACTION_ID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        h = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 112, -1));

        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bKeyTyped(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 98, 112, -1));

        z.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zKeyTyped(evt);
            }
        });
        getContentPane().add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 136, 112, -1));

        d.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dKeyTyped(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 112, -1));
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 223, 112, -1));

        f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fKeyTyped(evt);
            }
        });
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 261, 112, -1));

        g.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gKeyTyped(evt);
            }
        });
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 299, 112, -1));

        TRANSACTION_ID.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        TRANSACTION_ID.setText("TRANSACTION_ID");
        getContentPane().add(TRANSACTION_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 180, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("CUSTOMER_ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 150, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("MOVIE_ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 139, 120, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("RENTED DATE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 140, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("DUE DATE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 100, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("INITIAL FEE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 120, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("ADDITIONAL FEE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 170, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setText("STATUS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 90, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 120, 30));

        h.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rented", "Settled" }));
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 110, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 371, 120, 30));

        jList1.setModel(new DefaultListModel ());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 75, 136, 282));

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("Get Transactions");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 160, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 407, 810, 145));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("UPDATE DATA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 17, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Divvya\\Desktop\\images\\neww.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
  
    }//GEN-LAST:event_aActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection)  DriverManager.getConnection("jdbc:mysql://localhost:3306/video_lending","root","1234");
Statement stmt=con.createStatement();
        String abc1  = (String) jList1.getSelectedValue();
        String transacid=a.getText();
        String cusid=b.getText();
        String mov_id=z.getText();
        String rented_t=d.getText();
        String due_da=e.getText();
        String fee1=f.getText();
        String addi_fee=g.getText(); 
        String status_1  = (String) h.getSelectedItem();
String sql10 = "Update transactions set TRANSACTION_ID='" + (transacid)+ "', CUSTOMER_ID='" + (cusid)+ "', MOVIE_ID='" + (mov_id)+ "', RENTED='" + (rented_t)+ "', DUE_DATE='" + (due_da)+ "', FEE='" + (fee1)+ "', ADDITIONAL_FEE='" + (addi_fee)+ "', STATUS='" + (status_1)+ "' where TRANSACTION_ID = '" + (abc1) + "'";

        stmt.executeUpdate(sql10);
        a.setText("");
       b.setText("");
       z.setText("");
       d.setText("");
       e.setText("");
        f.setText("");
        g.setText("");
         h.setSelectedItem("");
JOptionPane.showMessageDialog(null, "Table TRANSACTIONS Updated!");

}
         catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
      
       updatetable ();
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            {
            TRANS_detils lin = new TRANS_detils ();
            lin.setVisible (true);
            this.dispose();
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
         try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/video_lending","root","1234");
        Statement stmt=con.createStatement();
        String abc  = (String) jList1.getSelectedValue();
        String sql9 = "Select * from transactions where TRANSACTION_ID = '" + (abc) + "'";
        ResultSet rs = stmt.executeQuery(sql9);
            while (rs.next())
        {
            String traid = rs.getString("TRANSACTION_ID");
            String cusi= rs.getString("CUSTOMER_ID");
            String mov= rs.getString("MOVIE_ID");
            String ren= rs.getString("RENTED");
            String due= rs.getString("DUE_DATE");
            String fee_1= rs.getString("FEE");
            String addi= rs.getString("ADDITIONAL_FEE");
            String sta= rs.getString("STATUS");
            a.setText(traid);
            b.setText(cusi);
            z.setText(mov);
            d.setText(ren);
            e.setText(due);
            f.setText(fee_1);
            g.setText(addi);
            h.setSelectedItem(sta);
        }
    }
    catch(ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }  
               updatetable ();

        
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultListModel list=(DefaultListModel) jList1.getModel();
        list.clear();
     String sql_1="Select * from transactions";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/video_lending","root","1234");
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery(sql_1);
        while(rs.next()){
            String abc=rs.getString("TRANSACTION_ID");
            list.addElement(abc);
        }
        jList1.setModel(list);
    }
    catch(Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
        
               updatetable ();

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyTyped
 char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_aKeyTyped

    private void bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyTyped
 char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_bKeyTyped

    private void zKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zKeyTyped
 char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_zKeyTyped

    private void dKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dKeyTyped
 
    }//GEN-LAST:event_dKeyTyped

    private void gKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gKeyTyped
 char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_gKeyTyped

    private void fKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fKeyTyped
 char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_fKeyTyped

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hActionPerformed

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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new update().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TRANSACTION_ID;
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JTextField d;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JTextField g;
    private javax.swing.JComboBox<String> h;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField z;
    // End of variables declaration//GEN-END:variables
}
