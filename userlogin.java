/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;


/**
 *
 * @author HYPERLINKS
 */
public class userlogin extends javax.swing.JFrame {

private Timer loadTimer;
public static int ConnStatus = 0;
int Login;
public String users;
Statement st;
   Connection con = null;
 
    /**
     * Creates new form userlogin
     */
    public userlogin() {
        initComponents();
        ConnStatus = 0;
     
        //jDialog1.setVisible(true); 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelog = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        juser = new javax.swing.JTextField();
        jLLoading = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log IN Form");
        setBounds(new java.awt.Rectangle(470, 100, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(153, 255, 102));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel8.setText("UserName");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel9.setText("Password");

        jPassword.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });

        juser.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        juser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                juserKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelogLayout = new javax.swing.GroupLayout(jPanelog);
        jPanelog.setLayout(jPanelogLayout);
        jPanelogLayout.setHorizontalGroup(
            jPanelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(juser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelogLayout.setVerticalGroup(
            jPanelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelogLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(juser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(jPanelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jLayeredPane1.add(jPanelog);
        jPanelog.setBounds(80, 40, 320, 150);

        jLLoading.setText("Loading...................");
        jLayeredPane1.add(jLLoading);
        jLLoading.setBounds(0, 240, 450, 14);

        jProgressBar1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(255, 102, 0));
        jProgressBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jProgressBar1.setStringPainted(true);
        jProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar1StateChanged(evt);
            }
        });
        jProgressBar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jProgressBar1PropertyChange(evt);
            }
        });
        jLayeredPane1.add(jProgressBar1);
        jProgressBar1.setBounds(0, 260, 500, 10);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setText("Student Banking   Management system ");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(120, 280, 230, 16);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton4.setText("SignIn");
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setMargin(new java.awt.Insets(2, 5, 2, 14));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4);
        jButton4.setBounds(90, 200, 130, 24);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton5.setText("Reset");
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setMargin(new java.awt.Insets(2, 5, 2, 14));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton5);
        jButton5.setBounds(240, 200, 150, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jProgressBar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jProgressBar1PropertyChange
      
    }//GEN-LAST:event_jProgressBar1PropertyChange

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jProgressBar1.setValue(5);
        CheckConnection();
    }//GEN-LAST:event_formWindowOpened

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
      
        
        String user = juser.getText();
        String pass = jPassword.getText();
        //String usertype=jCousertype.getSelectedItem().toString();
       users=juser.getText();
       
       
        try {
          con = DBManager.ConnectDB();
               st = con.createStatement();
               ResultSet rs = st.executeQuery("Select * from users WHERE  Username='"+ user + "' and Password='"+ pass + "'");
              
             if(rs.next()){
                   if(   (rs.getString ("UserName").equals(user) && rs.getString("Password").equals(pass) ) ){
                   jPanelog.setVisible(false);
                   ConnStatus = 1;
                   jLLoading.setForeground(Color.black);

                    Progress();  
                    jButton4.setFocusable(false);
                    juser.setText("");
                   jPassword.setText("");
                   
                     ConnStatus = 0;
               }
                 else {
                    JOptionPane.showMessageDialog(null, "Access Denied! Invalid User Name or Password!!!", "Access Denied!", JOptionPane.ERROR_MESSAGE);
                    juser.setText("");
                    jPassword.setText("");
                    
                    ConnStatus = 0;
               }  
               }
   
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Access Denied! Invalid User Name or Password!!", "Access Denied!", JOptionPane.ERROR_MESSAGE);
            juser.setText("");
            
            jPassword.setText("");
                   
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressBar1StateChanged
      int progVal = jProgressBar1.getValue();
        if (progVal < 11) {
            jLLoading.setText("Loading ...Initialization...........");  
        } 
        else if (progVal < 20) {
            jLLoading.setText("Establishing Connection .................");
        }
        else if (progVal < 25) {
            jLLoading.setText("Connection Establishined .................");
        }
        else if (progVal < 30) {
            jLLoading.setText("Loading .....Database............");
        } else if (progVal < 40) {
            jLLoading.setText("Loading ...Admninistrators.........");
        }
        else if (progVal < 55) {
            jLLoading.setText("Loading ...Checking Users.............");
        }
          else if (progVal < 65) {
            jLLoading.setText("Loading ...Users...........");
        }
        else if (progVal < 75) {
            jLLoading.setText("Loading ... Checking Tables........");
        }
         else if (progVal < 80) {
            jLLoading.setText("Loading ... loading Tables.............");
        }
        else if (progVal < 90) {
            jLLoading.setText("Loading .....Validating Data........");
        } else if (progVal < 100) {
            jLLoading.setText("Loading ...Finishing............");
        } else {
            jLLoading.setText("Loading .....DONE!!");
        }
    }//GEN-LAST:event_jProgressBar1StateChanged

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
         juser.setText("");
         jPassword.setText("");
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void juserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_juserKeyPressed
       if( evt.getKeyCode() == KeyEvent.VK_ENTER){
        jButton4MouseClicked(null);
        }
    }//GEN-LAST:event_juserKeyPressed

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        if( evt.getKeyCode() == KeyEvent.VK_ENTER){
        jButton4MouseClicked(null);
        }
    }//GEN-LAST:event_jPasswordKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

      public void Progress(){
        loadTimer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
                if (jProgressBar1.getValue()==100)
                { 
                    
                   mainclass fm=new  mainclass();
                  
                    loadTimer.stop();
                  
                   fm.setVisible(true);
                   dispose();
                   setCursor(null); //turn off the wait cursor
                }
                else
                {
                    jProgressBar1.setValue(jProgressBar1.getValue()+1);
                     setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                }
            }
        });
        loadTimer.start();
        
        //jProgressBar1.setValue(WIDTH);
               
    }
     
     public void CheckConnection(){   
        if(ConnStatus == 1){
         Progress();
        }else{
                jLLoading.setForeground(Color.blue);
                jLLoading.setText("Loading ...: LogIn to Continue");
               
        }
    }
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
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }

           
             
                //TextureLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
             //UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
             UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
           //  UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
             
                
          

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new userlogin().setVisible(true);
                   
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLLoading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanelog;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField juser;
    // End of variables declaration//GEN-END:variables
}
