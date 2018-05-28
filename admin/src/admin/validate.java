/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author divvya
 */
public class validate {

    public static boolean isEmpty(String s) {
        if (s.length() > 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
            return false;
        }
    }

    public static boolean isEmpty(String s1, String s2, String s3, String s4, String s5, String s6) {
        if (s1.length() == 0 || s2.length() == 0 || s3.length() == 0 || s4.length() == 0 || s5.length() == 0 || s6.length() == 0) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
            return false;
        } else {
            return true;
        }

    }

    public static boolean isNic(String s) {
        if (s.length() == 10) {
            if ((s.indexOf('V')) >= 0 || (s.indexOf('v')) >= 0) {
                if ((s.charAt(9) == 'v') || (s.charAt(9) == 'V')) {
                    for (int i = 0; i < s.length() - 1; i++) {
                        Character.isDigit(i);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return false;
    }

    public static boolean isContact(String s) {
        if (s.length() == 10) {
            if (!Pattern.matches("^[0-9]*$", s)) {
                JOptionPane.showMessageDialog(null, "One or more fields has an invalid value.");
                return false;
            } else {
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Contact Number must have 10 digits.");
            return false;
        }
    }

    public static boolean ischar(String s) {
        if (!Pattern.matches("^[a-zA-Z]*$", s)) {
            JOptionPane.showMessageDialog(null, "One or more fields has an invalid value.");
            return false;
        } else {
            return true;
        }

    }

    public static boolean isNumber(String s) {
        if (!Pattern.matches("^[0-9]*$", s)) {
            JOptionPane.showMessageDialog(null, "One or more fields has an invalid value.");
            return false;
        } else {
            return true;
        }
    }

    public static boolean isEmail(String s) {
      
        if(s.indexOf('@')>0){
            return true;
            
        }
       else
         {
             JOptionPane.showMessageDialog(null, "Invalid Email Id..Please enter a  valid email.");
             return false;
          }
        }  
  }
 
