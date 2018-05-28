package admin;



import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHAHIK
 */
public class Customer extends javax.swing.JFrame {
    
    final void List(){
        
        try {
      
         Connection c = DB.getConnect();
      Statement stmt = c.createStatement();
      
        String Querey = "SELECT * FROM customer";
        ResultSet rs = stmt.executeQuery(Querey);
        
        DefaultListModel LMD = new DefaultListModel();
        
        while (rs.next()) {
        
            LMD.addElement (rs.getString(1)); 
            
            
        }
        
        List1.setModel(LMD);
        
        
        
    }
        
         catch (SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     
     }
   }

    public Customer() {
        initComponents();
        this.setLocationRelativeTo(null);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        pt = new javax.swing.JComboBox<String>();
        add = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        rdate = new javax.swing.JTextField();
        viewlist = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<String>();
        Delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        acc = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        con = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        custid = new javax.swing.JTextField();
        cTimetable = new javax.swing.JButton();
        Back_cus = new javax.swing.JButton();
        iReport = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("CUSTOMER  REGISTRATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 280, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("First Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 100, 30));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 190, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Last Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("NIC   :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, 14));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("Address  :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Payment Type :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 120, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("Registered Date :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 565, 130, 20));

        lname.setToolTipText("");
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 190, 30));

        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });
        getContentPane().add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 190, 30));

        pt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Card" }));
        getContentPane().add(pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 100, 30));
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 220, 70));

        Update.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, 100, 30));

        Save.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, 90, 30));

        rdate.setText(" YYYY- MM - DD");
        rdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdateActionPerformed(evt);
            }
        });
        getContentPane().add(rdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 100, 30));

        viewlist.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        viewlist.setText("View");
        viewlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewlistActionPerformed(evt);
            }
        });
        getContentPane().add(viewlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 90, 30));

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 110, 310));

        Delete.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, 100, 30));

        jLabel8.setText(" ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setText("Account Type :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 120, 30));

        acc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        acc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Premium", "Normal" }));
        getContentPane().add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 100, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setText("Contact Number :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel13.setText("Customer ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 90, 20));
        getContentPane().add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 200, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setText("Customer ID :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, -1));

        custid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custidActionPerformed(evt);
            }
        });
        getContentPane().add(custid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 190, 30));

        cTimetable.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cTimetable.setText("Customer Table");
        cTimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTimetableActionPerformed(evt);
            }
        });
        getContentPane().add(cTimetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 170, 30));

        Back_cus.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Back_cus.setText("Back");
        Back_cus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_cusActionPerformed(evt);
            }
        });
        getContentPane().add(Back_cus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 80, 30));

        iReport.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        iReport.setText("iReport");
        iReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iReportActionPerformed(evt);
            }
        });
        getContentPane().add(iReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 100, 30));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 680));

        setBounds(0, 0, 848, 719);
    }// </editor-fold>//GEN-END:initComponents

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void rdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdateActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        
        
        if (custid.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Leave Fields Empty !!");
           
           }
        else if (fname.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Leave Fields Empty !!");
           
           }
        else if (lname.getText().equals(""))
             {
            JOptionPane.showMessageDialog(null,"You Can't Leave Fields Empty !!");
           
           }
        else if (nic.getText().equals(""))
             {
            JOptionPane.showMessageDialog(null,"You Can't Leave Fields Empty !!");
           
           }
       else if (add.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Leave Fields Empty !!");
           
           }
      else if (con.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Leave Fields Empty !!");
           
           }
       else if (pt.getSelectedItem().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Leave Fields Empty !!");
           
           }
       else if (acc.getSelectedItem().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Leave Fields Empty !!");
           
           }
       else if (rdate.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Leave Fields Empty !!");
           
           }
           
    try {
       
        Connection c = DB.getConnect();
          Statement stmt = c.createStatement();
      
        String Querey  = "INSERT INTO customer (customerId,fname, lname, nic, address,contact,payType,accType,regDate)"
                + " VALUES ('"+custid.getText()+"','"+fname.getText()+"','"+lname.getText()+"','"+nic.getText()+"','"+add.getText()+"','"+con.getText()+"','"+pt.getSelectedItem()+"','"+acc.getSelectedItem()+"','"+rdate.getText()+"')";
    
       
        
        stmt.execute(Querey);
         
        JOptionPane.showMessageDialog(null, "Customer details Added");
           
           custid.setText(null);
           fname.setText(null);
           lname.setText(null);
           nic.setText(null);
           add.setText(null);
           con.setText(null);
           pt.setSelectedItem(null);
           con.setText(null);
           acc.setSelectedItem(null);
           rdate.setText(null);
           
           
    }
     
     catch (SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     
     }
        
    
            
    }//GEN-LAST:event_SaveActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
             
         
        if (custid.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Update Empty Fields !!");
           
           }
        else if (fname.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Update Empty Fields !!");
           
           }
        else if (lname.getText().equals(""))
             {
            JOptionPane.showMessageDialog(null,"You Can't Update Empty Fields !!");
           
           }
        else if (nic.getText().equals(""))
             {
            JOptionPane.showMessageDialog(null,"You Can't Update Empty Fields !!");
           
           }
       else if (add.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Update Empty Fields !!");
           
           }
      else if (con.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Update Empty Fields !!");
           
           }
       else if (pt.getSelectedItem().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Update Empty Fields !!");
           
           }
       else if (acc.getSelectedItem().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Update Empty Fields !!");
           
           }
       else if (rdate.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null,"You Can't Update Empty Fields !!");
           
           }
         
        try {
        
        Connection c = DB.getConnect();
        Statement stmt = c.createStatement();
        
      
       String Querey  = "UPDATE customer SET customerId ='"+custid.getText()+"', fname = '"+fname.getText()+"',lname= '"+lname.getText()+"',nic = '"+nic.getText()+"', address ='"+add.getText()+"' ,contact = '"+con.getText()+"',payType = '"+pt.getSelectedItem()+"',accType = '"+acc.getSelectedItem()+"',regDate = '"+rdate.getText()+"' WHERE customerId = '"+List1.getSelectedValue()+"' ";
               
      stmt.execute(Querey); 
      
      //JOptionPane.showMessageDialog(null,"Updated Successfully");
      
      List();
    }//GEN-LAST:event_UpdateActionPerformed

            catch (SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     
     }
        
    }
    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        
        try {
        
       
         Connection c = DB.getConnect();
         Statement stmt = c.createStatement();
        
      
        String Querey = "SELECT * FROM Customer WHERE customerId = '"+List1.getSelectedValue()+"'";
        ResultSet rs = stmt.executeQuery(Querey);
        
        DefaultListModel LMD = new DefaultListModel();
        
        while (rs.next()) {
        
           custid.setText(rs.getString(1)); 
           add.setText(rs.getString(5));
           fname.setText(rs.getString(2));
           lname.setText(rs.getString(3));
           nic.setText(rs.getString(4));
           pt.setSelectedItem(rs.getString(7));
           rdate.setText(rs.getString(9));
           con.setText(rs.getString(6));
           acc.setSelectedItem(rs.getString(8));
        }
         
        }
        
               catch (SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     
     }
    }//GEN-LAST:event_List1ValueChanged

    private void viewlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewlistActionPerformed
          List();
    }//GEN-LAST:event_viewlistActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
              try {
      
        
         Connection c = DB.getConnect();
         Statement stmt = c.createStatement();
        
      
       String Querey  = "DELETE FROM customer WHERE customerId = '"+List1.getSelectedValue()+"'";
        stmt.execute(Querey); 
      
      JOptionPane.showMessageDialog(null,"Deleted Successfuly");
      
      List();
    }                                      

            catch (SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     
     }
       
    }//GEN-LAST:event_DeleteActionPerformed

    private void cTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTimetableActionPerformed
       
        customertable a = new customertable();
     //   a.cid.setText(custid.getText());
        a.setVisible(true);
        this.dispose();
        //customertable cust = new customertable();
        //cust.setVisible(true);
    }//GEN-LAST:event_cTimetableActionPerformed

    private void Back_cusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_cusActionPerformed
        // TODO add your handling code here:
        this.dispose();
        welcome wel = new welcome();
        wel.setVisible(true);
    }//GEN-LAST:event_Back_cusActionPerformed

    private void iReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iReportActionPerformed
      try {

reportCall rep = new reportCall("C:\\Users\\Divvya\\Desktop\\New folder (3)\\Video Lending\\Customer.jasper","CustId");


        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iReportActionPerformed

    private void custidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custidActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_cus;
    private javax.swing.JButton Delete;
    private javax.swing.JList<String> List1;
    private javax.swing.JButton Save;
    private javax.swing.JButton Update;
    private javax.swing.JComboBox<String> acc;
    private javax.swing.JTextField add;
    private javax.swing.JButton cTimetable;
    private javax.swing.JTextField con;
    private javax.swing.JTextField custid;
    private javax.swing.JTextField fname;
    private javax.swing.JButton iReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField nic;
    private javax.swing.JComboBox<String> pt;
    private javax.swing.JTextField rdate;
    private javax.swing.JButton viewlist;
    // End of variables declaration//GEN-END:variables
}
