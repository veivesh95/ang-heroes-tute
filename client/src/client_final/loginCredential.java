/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_final;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author veivesh
 */
public class loginCredential {
    
    public loginCredential(String pw) {
        try{
            Connection c = DB.getConnect();
            Statement s = c.createStatement();
            String checkUser = "Select * from customer where nic = '"+ pw  + "'";
            ResultSet r = s.executeQuery(checkUser);

            if(r.next()){
                c.setClientInfo("cusId", r.getString("customerId"));
                c.setClientInfo("fname", r.getString("fname"));
                c.setClientInfo("lname", r.getNString("lname"));
                JOptionPane.showMessageDialog(null, "Welcome "+r.getNString("fname")+" "+r.getNString("lname"));
                
//                login log = new login();
//                log.setVisible(false);
                
                welcome wel = new welcome(c);
                wel.setVisible(true);
                
                
//                JOptionPane.showMessageDialog(null, );
            }
            else
                JOptionPane.showMessageDialog(null, "User is not in the database. Please do not hesitate to ask the administrator for more information.");
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
    