/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.awt.Cursor;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
/**
 *
 * @author HYPERLINKS
 */
public class reports {
 static Connection con = null;
    public static void CallReport(JPanel p, String sql, String reportName){

 Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR);
            con = (Connection) DBManager.ConnectDB();
        try {
              HashMap parameter= new HashMap();


              try {
            //con = (Connection)DBManager.ConnectDB();
            JasperDesign jd = JRXmlLoader.load("Reports\\"+reportName+".jrxml");
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jd);
            JasperPrint jspPrint = JasperFillManager.fillReport(jasperReport, null, con);
            JRViewer jv = new JRViewer(jspPrint);



                 p.removeAll();
    p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    p.setPreferredSize(new java.awt.Dimension(1000, 700));
    p.setLayout(new java.awt.BorderLayout());
    p.add(jv);
    p.repaint();
    p.revalidate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR); //turn off the wait cursor
        DBManager.close(con);
    }
}
