/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author veivesh
 */
public class reportCall {

//    String path;

    reportCall(String path) throws JRException {
//        this.path = path;
        Connection c = DB.getConnect();
        JasperPrint jp = JasperFillManager.fillReport(path, null, c);
        JasperViewer.viewReport(jp, false);
    }

    reportCall(String path, String para) throws JRException {
//        this.path = path;
        Connection c = DB.getConnect();
//        String path = "C:\\Users\\veivesh\\Desktop\\sampleReport.jasper";
        HashMap parameter = new HashMap();
        parameter.put(para, JOptionPane.showInputDialog("Enter value:"));
        JasperPrint jp = JasperFillManager.fillReport(path, parameter, c);
        JasperViewer.viewReport(jp, false);
    }

}
