/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/*
 *
 * @author Kaushe
 */
public class movietable extends javax.swing.JFrame {


    public movietable() {
        setTitle ("Movie Table");
        Connection c = DB.getConnect();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        View = new javax.swing.JButton();
        iReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie ID", "Image ID", "Movie Name", "Price", "Year", "Lead", "Genre", "Duration", "Rating", "Addedby", "Total", "Available", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 828, 242));

        Back.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 253, -1, -1));

        View.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        getContentPane().add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 253, -1, -1));

        iReport.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        iReport.setText("iReport");
        iReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iReportActionPerformed(evt);
            }
        });
        getContentPane().add(iReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 253, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Divvya\\Desktop\\images\\neww.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void viewtable() {
    
    
    String sql="Select * from movie";
        try {
        Class.forName("com.mysql.jdbc.Driver");
         Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/video_lending","root", "1234");
          Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next())
        {
            String movieID= rs.getString("movieID");
            String imageID= rs.getString("imgId");
            String moviename= rs.getString("name");
            String price= rs.getString("price");
            String year= rs.getString("year");
            String lead= rs.getString("lead");
            String genre= rs.getString("genre");
            String duration= rs.getString("duration");
            String rating= rs.getString("rating");
            String Addedby= rs.getString("addedby");
            String total= rs.getString("total");
            String available= rs.getString("available");
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            model.addRow(new Object []{
               movieID,imageID,moviename,price,year,lead,genre,duration,rating,Addedby,total,available});
          
        }
     //   model.setColumnIdentifiers(newIdentifiers);
    }
        catch(ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
       this.dispose();
       addmovies add = new addmovies();
       add.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        
        viewtable();
        /*String sql="Select * from movie";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/video_lending","root", "1234");
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next())
        {
        String movieID= rs.getString("movieID");
        String imageID= rs.getString("imgId");
        String moviename= rs.getString("name");
        String price= rs.getString("price");
        String year= rs.getString("year");
        String lead= rs.getString("lead");
        String genre= rs.getString("genre");
        String duration= rs.getString("duration");
        String rating= rs.getString("rating");
        String Addedby= rs.getString("addedby");
        String total= rs.getString("total");
        String available= rs.getString("available");
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.addRow(new Object []{
        movieID,imageID,moviename,price,year,lead,genre,duration,rating,Addedby,total,available});
        
        }
        //   model.setColumnIdentifiers(newIdentifiers);
        }
        catch(Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
        }*/
    }//GEN-LAST:event_ViewActionPerformed

    private void iReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iReportActionPerformed
        try {

reportCall rep = new reportCall("C:\\Users\\Divvya\\Desktop\\New folder (3)\\Video Lending\\MovieiReport.jasper","MovieId");


        } catch (JRException ex) {
            Logger.getLogger(movietable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_iReportActionPerformed

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
            java.util.logging.Logger.getLogger(movietable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(movietable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(movietable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(movietable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movietable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton View;
    private javax.swing.JButton iReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
