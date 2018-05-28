/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_final;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author veivesh
 */
public class sendMessage {
    String customer;

    public sendMessage(String message,Connection c) {
        try {
            //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //Connection c = DB.getConnect();
            String send = "Insert into userrequest (cusId, message) values (?,?)";
            PreparedStatement s = c.prepareStatement(send);
            s.setString(1, c.getClientInfo("cusId"));
            s.setString(2, message);
            
            int rowsInserted = s.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null,"You're request has been send to the administrator.");
//                System.out.println("A new user was inserted successfully!");
            }
            welcome wel = new welcome(c);
            wel.setVisible(true);
            
        } catch (Exception ex) {
            Logger.getLogger(sendMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
  
    }

    public sendMessage(String mov, String yr, Connection c) {
        try {
            //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //Connection c = DB.getConnect();
            String temp = "'"+ mov + "'" + " (" + yr + ")";
            String send = "Insert into userrequest (cusId, message) values (?,?)";
            PreparedStatement s = c.prepareStatement(send);
            s.setString(1, c.getClientInfo("cusId"));
            s.setString(2, "Requesting a copy of "+temp);
            
            int rowsInserted = s.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null,"You're request has been send to the administrator.");
                System.out.println("A new user was inserted successfully!");
            }
            welcome wel = new welcome(c);
            wel.setVisible(true);
            
            
        } catch (Exception ex) {
            Logger.getLogger(sendMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

    }
    
    public sendMessage(Connection c){
        try {
            String send = "Insert into userrequest (cusId, message) values (?,?)";
            PreparedStatement s = c.prepareCall(send);
            s.setString(1, c.getClientInfo("cusId"));
            s.setString(2, "The User needs to update his information");
            
            int rowsInserted = s.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null,"You're request has been send to the administrator.");
//                System.out.println("A new user was inserted successfully!");
            }
            welcome wel = new welcome(c);
            wel.setVisible(true);
            
        } catch (Exception ex) {
            Logger.getLogger(sendMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

