/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import com.mysql.jdbc.Connection;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.swing.JRViewer;
/**
 *
 * @author HYPERLINKS
 */
public class ReportsFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReportsFrame
     */
    public ReportsFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboreport = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        ReportPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)), "Report Selection Panel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 13))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel1.setText("Select Report ");

        jComboreport.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jComboreport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Preview-", "Client Account Details", "Client Main Account", "Account Deposits", "Account Withdrawals", " " }));
        jComboreport.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboreportItemStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton1.setText("Preview");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboreport, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboreport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ReportPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)), "Report Preview Panel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 13))); // NOI18N

        javax.swing.GroupLayout ReportPanelLayout = new javax.swing.GroupLayout(ReportPanel);
        ReportPanel.setLayout(ReportPanelLayout);
        ReportPanelLayout.setHorizontalGroup(
            ReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ReportPanelLayout.setVerticalGroup(
            ReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Student Banking Reports");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(329, 329, 329))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboreportItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboreportItemStateChanged


    }//GEN-LAST:event_jComboreportItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int selection=jComboreport.getSelectedIndex();

       //No report is selected
       if(selection==0){
       JOptionPane.showMessageDialog(this, "Nothing Report is Selcted for preview", "", JOptionPane.WARNING_MESSAGE);

       }

       //Client Account Details
if(selection==1){
     String QUERRY="select*from bankaccounts";
        //"SELECTbankaccounts.`AccountNumber` AS bankaccounts_AccountNumber,bankaccounts.`Name` AS bankaccounts_Name bankaccounts.`IdNumber` AS bankaccounts_IdNumber, bankaccounts.`University` AS bankaccounts_University, bankaccounts.`Faculty` AS bankaccounts_Faculty,bankaccounts.`Course` AS bankaccounts_Course,bankaccounts.`StudyYear` AS bankaccounts_StudyYear, bankaccounts.`PhoneNumber` AS bankaccounts_PhoneNumber,bankaccounts.`EmailAddress` AS bankaccounts_EmailAddress, bankaccounts.`AccountType` AS bankaccounts_AccountType,bankaccounts.`OpeningDate` AS bankaccounts_OpeningDate,accounts.`DOB` AS bankaccounts_DOB, bankaccounts.`Address` AS bankaccounts_Address,bankaccounts.`ChequeIssue` AS bankaccounts_ChequeIssue, bankaccounts.`AccountStatus` AS bankaccounts_AccountStatus FROM   `bankaccounts` bankaccounts";

       setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
       String QUERRY2="select*from bankaccounts";
          Connection con = (Connection) DBManager.ConnectDB();
        try {

         JasperReport jasperReport = JasperCompileManager.compileReport("Reports\\report2.jrxml");
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(QUERRY2);
            JasperPrint jspPrint=JasperFillManager.fillReport(jasperReport, null,con);
              JRViewer jv = new JRViewer(jspPrint);
                 ReportPanel.removeAll();
                 // JasperViewer jv = new  JasperViewer(jspPrint);
                 setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    ReportPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    ReportPanel.setPreferredSize(new java.awt.Dimension(1000, 700));
    ReportPanel.setLayout(new java.awt.BorderLayout());
    ReportPanel.add(jv);
    ReportPanel.repaint();
    ReportPanel.revalidate();
    } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
      setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

       }

        //Client Main Account report

        if(selection==2){
      String QUERRY=" ";
       setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
       String QUERRY1="select*from mainaccount";
          Connection con = (Connection) DBManager.ConnectDB();
        try {

         JasperReport jasperReport = JasperCompileManager.compileReport("Reports\\MainAccount.jrxml");
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(QUERRY1);
            JasperPrint jspPrint=JasperFillManager.fillReport(jasperReport, null,con);
              JRViewer jv = new JRViewer(jspPrint);
                 ReportPanel.removeAll();
                 // JasperViewer jv = new  JasperViewer(jspPrint);
                 setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    ReportPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    ReportPanel.setPreferredSize(new java.awt.Dimension(1000, 700));
    ReportPanel.setLayout(new java.awt.BorderLayout());
    ReportPanel.add(jv);
    ReportPanel.repaint();
    ReportPanel.revalidate();
    } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
         setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
       }
        //Account Deposits report
         if(selection==3){
              setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
      String QUERRY3="select*from bankdeposits";
          Connection con = (Connection) DBManager.ConnectDB();
        try {

         JasperReport jasperReport = JasperCompileManager.compileReport("Reports\\Deposits.jrxml");
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(QUERRY3);
            JasperPrint jspPrint=JasperFillManager.fillReport(jasperReport, null,con);
              JRViewer jv = new JRViewer(jspPrint);
                 ReportPanel.removeAll();
                 // JasperViewer jv = new  JasperViewer(jspPrint);
                 setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    ReportPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    ReportPanel.setPreferredSize(new java.awt.Dimension(1000, 700));
    ReportPanel.setLayout(new java.awt.BorderLayout());
    ReportPanel.add(jv);
    ReportPanel.repaint();
    ReportPanel.revalidate();
    } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
         setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
       }
         //Account Withdrawals Report
        if(selection==4){
             setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
     String QUERRY4="select*from withdrawals";
          Connection con = (Connection) DBManager.ConnectDB();
        try {

         JasperReport jasperReport = JasperCompileManager.compileReport("Reports\\withdrawals.jrxml");
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(QUERRY4);
            JasperPrint jspPrint=JasperFillManager.fillReport(jasperReport, null,con);
              JRViewer jv = new JRViewer(jspPrint);
                 ReportPanel.removeAll();
                 // JasperViewer jv = new  JasperViewer(jspPrint);
                 setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    ReportPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    ReportPanel.setPreferredSize(new java.awt.Dimension(1000, 700));
    ReportPanel.setLayout(new java.awt.BorderLayout());
    ReportPanel.add(jv);
    ReportPanel.repaint();
    ReportPanel.revalidate();
    } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
         setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ReportPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboreport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
