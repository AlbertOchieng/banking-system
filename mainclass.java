package banking;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HYPERLINKS
 */
public class mainclass extends javax.swing.JFrame {

    /**
     * Creates new form mainclass
     */
    public mainclass() {
        initComponents();
        makeFrameFullSize();
    }
 private void makeFrameFullSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        System.out.println(screenSize.height);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jButtonwithdraw = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtoncashDeposit = new javax.swing.JButton();
        jButtonallwithdar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButtonalldeposits = new javax.swing.JButton();
        jButtonAcountopen = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setOpaque(false);

        jDesktopPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2), "Quick Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(0, 204, 255))); // NOI18N
        jDesktopPane2.setOpaque(false);

        jButtonwithdraw.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonwithdraw.setText("Cash Withdrawals");
        jButtonwithdraw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonwithdraw.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonwithdrawActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButtonwithdraw);
        jButtonwithdraw.setBounds(20, 120, 130, 40);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton4.setText("Account Balnce ");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButton4);
        jButton4.setBounds(20, 70, 130, 40);

        jButtoncashDeposit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtoncashDeposit.setText("Deposit Cash ");
        jButtoncashDeposit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtoncashDeposit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtoncashDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncashDepositActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButtoncashDeposit);
        jButtoncashDeposit.setBounds(20, 170, 130, 40);

        jButtonallwithdar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonallwithdar.setText("All Wihdrawals ");
        jButtonallwithdar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonallwithdar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonallwithdar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonallwithdarActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButtonallwithdar);
        jButtonallwithdar.setBounds(20, 270, 130, 40);

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton8.setText("Clients List ");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButton8);
        jButton8.setBounds(20, 220, 130, 40);

        jButtonalldeposits.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonalldeposits.setText("All Deposits ");
        jButtonalldeposits.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonalldeposits.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonalldeposits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonalldepositsActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButtonalldeposits);
        jButtonalldeposits.setBounds(20, 320, 130, 40);

        jButtonAcountopen.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonAcountopen.setText("Account Opening ");
        jButtonAcountopen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAcountopen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAcountopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcountopenActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButtonAcountopen);
        jButtonAcountopen.setBounds(20, 20, 130, 40);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton7.setText("Reports");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButton7);
        jButton7.setBounds(20, 370, 130, 40);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton5.setText("Close Account ");
        jButton5.setToolTipText("");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButton5);
        jButton5.setBounds(20, 420, 130, 40);

        jDesktopPane1.add(jDesktopPane2);
        jDesktopPane2.setBounds(0, 40, 160, 620);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)), "Menu Bar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jMenuBar1.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fin/6.PNG"))); // NOI18N
        jMenu1.setText("Bank Accounts");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fin/10.PNG"))); // NOI18N
        jMenuItem13.setText("New Account");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fin/12.PNG"))); // NOI18N
        jMenuItem14.setText("Edit Account");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fin/14.PNG"))); // NOI18N
        jMenuItem15.setText("Close Account");
        jMenu1.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fin/7.PNG"))); // NOI18N
        jMenuItem16.setText("Client List");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fin/15.PNG"))); // NOI18N
        jMenu2.setText("Withdrawals");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N

        jMenuItem9.setText("Cash Withdrawal");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Withdrawal Statement");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("All Transactions");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Roll Back Transaction");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fin/7.PNG"))); // NOI18N
        jMenu3.setText("Deposits");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N

        jMenuItem5.setText("Cash Deposit");
        jMenu3.add(jMenuItem5);

        jMenuItem8.setText("Deposit Statement");
        jMenu3.add(jMenuItem8);

        jMenuItem7.setText("Account Balace");
        jMenu3.add(jMenuItem7);

        jMenuItem6.setText("All Deposits");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fin/4.PNG"))); // NOI18N
        jMenu4.setText("Reports");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N

        jMenuItem2.setText("All Clients");
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Transactions");
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("Deposits");
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcountopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcountopenActionPerformed
       accountopening acounts = new accountopening();
        jDesktopPane1.add(acounts);
        acounts.setBounds(310, 30,995, 591);
        acounts.setVisible(true);
    }//GEN-LAST:event_jButtonAcountopenActionPerformed

    private void jButtoncashDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncashDepositActionPerformed
       casheposit cashdep = new casheposit();
        jDesktopPane1.add(cashdep);
        cashdep.setBounds(310, 80,802,390);
        cashdep.setVisible(true);
    }//GEN-LAST:event_jButtoncashDepositActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         allClients allclients = new allClients();
        jDesktopPane1.add(allclients);
        allclients.setBounds(310,80,980, 511);
        allclients.setVisible(true);


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
 jButtonAcountopenActionPerformed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButtonwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonwithdrawActionPerformed
        withdraw cashwithd = new withdraw();
        jDesktopPane1.add(cashwithd);
        cashwithd.setBounds(310, 80,810, 402);
        cashwithd.setVisible(true);
    }//GEN-LAST:event_jButtonwithdrawActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AccountBalance acBalance = new AccountBalance();
        jDesktopPane1.add(acBalance);
        acBalance.setBounds(310, 100,726, 341);
        acBalance.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonalldepositsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonalldepositsActionPerformed
        AllDeposits alldeposits = new AllDeposits();
        jDesktopPane1.add(alldeposits);
        alldeposits.setBounds(310, 80,978,488);
        alldeposits.setVisible(true);
    }//GEN-LAST:event_jButtonalldepositsActionPerformed

    private void jButtonallwithdarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonallwithdarActionPerformed
        AllAccountWithdrawals allwithd = new AllAccountWithdrawals();
        jDesktopPane1.add(allwithd);
        allwithd.setBounds(310, 80,978,488);
        allwithd.setVisible(true);
    }//GEN-LAST:event_jButtonallwithdarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        ReportsFrame Reports = new ReportsFrame();
        jDesktopPane1.add(Reports);
        Reports.setBounds(310, 30,967, 620);
        Reports.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
     jButtonAcountopenActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
jButton8ActionPerformed(evt);       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }

               
                //TextureLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            
               UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
      

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new mainclass().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonAcountopen;
    private javax.swing.JButton jButtonalldeposits;
    private javax.swing.JButton jButtonallwithdar;
    private javax.swing.JButton jButtoncashDeposit;
    private javax.swing.JButton jButtonwithdraw;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
