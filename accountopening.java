 package banking;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import java.util.Date;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HYPERLINKS
 */
public class accountopening extends javax.swing.JInternalFrame {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
      String var = "";
      String BankCode="01108312";
      public int AccountNumber=0;
      public int newrow;
    /**
     * Creates new form accountopening
     */
    public accountopening() {
        initComponents();
        accountNumGenerator();
        String sql="Select*from bankaccounts";
        fillTableWthdRecords(sql);
        int count=jTabclients.getRowCount();
       curRow.setText(""+count);
    }

 public void updateSave(String QUERRY) {
        try {
            con = (com.mysql.jdbc.Connection) DBManager.ConnectDB();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(QUERRY);
            pst.execute();
            con.close();
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, e);
        }

   }

  public void fillTableWthdRecords(String QUERRYs) {
        try {
            com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DBManager.ConnectDB();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(QUERRYs);
            rs = pst.executeQuery();
            jTabclients.setModel(DbUtils.resultSetToTableModel(rs));
            jTabclients.getColumnModel().getColumn(0).setPreferredWidth(130);
            jTabclients.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTabclients.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTabclients.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTabclients.getColumnModel().getColumn(4).setPreferredWidth(170);
            jTabclients.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTabclients.getColumnModel().getColumn(6).setPreferredWidth(120);
            jTabclients.getColumnModel().getColumn(7).setPreferredWidth(120);
            jTabclients.getColumnModel().getColumn(8).setPreferredWidth(170);
            jTabclients.getColumnModel().getColumn(9).setPreferredWidth(120);
            jTabclients.getColumnModel().getColumn(10).setPreferredWidth(120);
            jTabclients.getColumnModel().getColumn(11).setPreferredWidth(120);
            jTabclients.getColumnModel().getColumn(12).setPreferredWidth(120);
            jTabclients.getColumnModel().getColumn(13).setPreferredWidth(170);
            jTabclients.getColumnModel().getColumn(14).setPreferredWidth(100);

              con.close();
       int count=jTabclients.getRowCount();
       curRow.setText(""+count);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }



public void accountNumGenerator(){
            Date curDate = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy");
            // format = new SimpleDateFormat("HH:mm:ss");
            String DateToStr = format.format(curDate);
            int year = Integer.parseInt(DateToStr) % 100;

                 con = (Connection) DBManager.ConnectDB();
            try {

                String sql = "SELECT lastACnumber FROM accountmonitoring     ";
                pst = (PreparedStatement) con.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {

                    String add = rs.getString("lastACnumber");
                    int add2 = Integer.parseInt(add);
                     AccountNumber = add2 + 1;
                    if (AccountNumber < 10) {
                        var = "000";
                    }
                    if (AccountNumber > 10 && AccountNumber < 100) {
                        var = "00";
                    }
                    if (AccountNumber > 100 && AccountNumber < 1000) {
                        var = "0";
                    }


                    acnumber.setText( BankCode+ year +var + AccountNumber);

                }
  con.close();

            } catch (Exception e) {
            }
}

public void Clear(){
acnumber.setText("");
name.setText("");
jCombofaculty.setSelectedIndex(0);
IdNumber.setText("");
jTexCourse.setText("");
jTephoneNumber.setText("");
jCombstudyYear.setSelectedIndex(0);
jTextemail.setText("");
jTextuniversity.setText("");
physicalAdd.setText("");
((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
jComboAccountType.setSelectedIndex(0);
((JTextField) jDateCdob.getDateEditor().getUiComponent()).setText("");
chequelegibilty.setText("");
jlabelImage.setIcon(null);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jTexCourse = new javax.swing.JTextField();
        acnumber = new javax.swing.JTextField();
        jTephoneNumber = new javax.swing.JTextField();
        IdNumber = new javax.swing.JTextField();
        jTextuniversity = new javax.swing.JTextField();
        physicalAdd = new javax.swing.JTextField();
        chequelegibilty = new javax.swing.JTextField();
        jCombofaculty = new javax.swing.JComboBox();
        jDateCdob = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextemail = new javax.swing.JTextField();
        jComboAccountType = new javax.swing.JComboBox();
        jCombstudyYear = new javax.swing.JComboBox();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jlabelImage = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldseach = new javax.swing.JTextField();
        selec = new javax.swing.JPanel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        acnum = new javax.swing.JTextField();
        jTextFieldname = new javax.swing.JTextField();
        jTextField7idnum = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabclients = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        curRow = new javax.swing.JTextField();
        selecs = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Name");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(30, 140, 90, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText(" University");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(30, 370, 100, 14);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Course Name");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(30, 300, 90, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Year of Study");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(30, 330, 100, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Faculty");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(30, 260, 60, 14);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Account Number");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(30, 110, 110, 14);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("ID Number");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(40, 170, 80, 14);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Phone Number");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(30, 200, 90, 14);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Opening  Date");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(360, 430, 90, 14);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText(" Physical Address");
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(360, 370, 91, 14);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("DOB");
        jDesktopPane1.add(jLabel12);
        jLabel12.setBounds(40, 430, 40, 14);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Cheque Legibility");
        jDesktopPane1.add(jLabel13);
        jLabel13.setBounds(40, 400, 100, 14);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("New Account Opening");
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(300, 10, 211, 24);

        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jDesktopPane1.add(name);
        name.setBounds(140, 140, 230, 20);

        jTexCourse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane1.add(jTexCourse);
        jTexCourse.setBounds(140, 300, 200, 20);

        acnumber.setEditable(false);
        acnumber.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        acnumber.setForeground(new java.awt.Color(255, 0, 153));
        acnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acnumberActionPerformed(evt);
            }
        });
        jDesktopPane1.add(acnumber);
        acnumber.setBounds(140, 110, 230, 20);

        jTephoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTephoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTephoneNumberKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jTephoneNumber);
        jTephoneNumber.setBounds(140, 200, 190, 20);

        IdNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        IdNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdNumberKeyTyped(evt);
            }
        });
        jDesktopPane1.add(IdNumber);
        IdNumber.setBounds(140, 170, 190, 20);

        jTextuniversity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextuniversity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextuniversityKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jTextuniversity);
        jTextuniversity.setBounds(140, 370, 200, 20);

        physicalAdd.setEditable(false);
        physicalAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        physicalAdd.setForeground(new java.awt.Color(255, 0, 51));
        jDesktopPane1.add(physicalAdd);
        physicalAdd.setBounds(460, 370, 220, 20);

        chequelegibilty.setEditable(false);
        chequelegibilty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chequelegibilty.setForeground(new java.awt.Color(255, 0, 51));
        jDesktopPane1.add(chequelegibilty);
        chequelegibilty.setBounds(140, 400, 200, 20);

        jCombofaculty.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jCombofaculty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Year Faculty-", "Information Science and Technology", "Commerce", "Law", "Health Science", "Education", "Procurement", "Applied Science", "Agriculture", " " }));
        jDesktopPane1.add(jCombofaculty);
        jCombofaculty.setBounds(140, 270, 230, 20);

        jDateCdob.setToolTipText("date of Birth");
        jDateCdob.setDateFormatString("yyyy-MM-dd");
        jDateCdob.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jDateCdob.setOpaque(false);
        jDesktopPane1.add(jDateCdob);
        jDateCdob.setBounds(140, 430, 150, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Account Type");
        jDesktopPane1.add(jLabel14);
        jLabel14.setBounds(30, 230, 80, 14);

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jDesktopPane1.add(jDateChooser2);
        jDateChooser2.setBounds(460, 430, 160, 20);

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(820, 140, 140, 30);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(820, 180, 140, 30);

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(820, 230, 140, 30);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton4);
        jButton4.setBounds(820, 280, 140, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("Email Address");
        jDesktopPane1.add(jLabel15);
        jLabel15.setBounds(360, 400, 80, 14);

        jTextemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextemailKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jTextemail);
        jTextemail.setBounds(460, 400, 220, 20);

        jComboAccountType.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jComboAccountType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Account type-", "Salary Account", "Current Account" }));
        jComboAccountType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboAccountTypeItemStateChanged(evt);
            }
        });
        jDesktopPane1.add(jComboAccountType);
        jComboAccountType.setBounds(140, 230, 150, 20);

        jCombstudyYear.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jCombstudyYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Year of Study-", "1st  Year", "2nd  Year", "3rd  Year", "4th  Year" }));
        jDesktopPane1.add(jCombstudyYear);
        jCombstudyYear.setBounds(140, 330, 150, 20);

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Image", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 13))); // NOI18N
        jDesktopPane2.setOpaque(false);

        jlabelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane2.add(jlabelImage);
        jlabelImage.setBounds(10, 20, 140, 160);

        jDesktopPane1.add(jDesktopPane2);
        jDesktopPane2.setBounds(440, 110, 160, 190);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton5.setText("Load Image");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton5);
        jButton5.setBounds(450, 310, 150, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel17.setText("Image Path");
        jDesktopPane1.add(jLabel17);
        jLabel17.setBounds(360, 340, 80, 16);

        path.setEditable(false);
        path.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jDesktopPane1.add(path);
        path.setBounds(460, 340, 220, 19);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel21.setText("Search");
        jDesktopPane1.add(jLabel21);
        jLabel21.setBounds(570, 60, 50, 20);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 51));
        jLabel22.setText("(Enter bank account number then press enter)");
        jDesktopPane1.add(jLabel22);
        jLabel22.setBounds(590, 90, 230, 10);

        jTextFieldseach.setBackground(new java.awt.Color(255, 204, 204));
        jTextFieldseach.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextFieldseach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldseachActionPerformed(evt);
            }
        });
        jTextFieldseach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldseachKeyPressed(evt);
            }
        });
        jDesktopPane1.add(jTextFieldseach);
        jTextFieldseach.setBounds(620, 60, 190, 22);

        jTabbedPane1.addTab("New Account", jDesktopPane1);

        jDesktopPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "Search Single Account", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        jDesktopPane3.setOpaque(false);

        acnum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane3.add(acnum);
        acnum.setBounds(170, 30, 230, 20);

        jTextFieldname.setEditable(false);
        jTextFieldname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane3.add(jTextFieldname);
        jTextFieldname.setBounds(170, 60, 380, 20);

        jTextField7idnum.setEditable(false);
        jTextField7idnum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDesktopPane3.add(jTextField7idnum);
        jTextField7idnum.setBounds(170, 90, 140, 20);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("ID Number");
        jDesktopPane3.add(jLabel16);
        jLabel16.setBounds(80, 90, 75, 14);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setText("Name");
        jDesktopPane3.add(jLabel18);
        jLabel18.setBounds(110, 60, 31, 14);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setText("Account Number");
        jDesktopPane3.add(jLabel19);
        jLabel19.setBounds(50, 30, 88, 14);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jDesktopPane3.add(jButton6);
        jButton6.setBounds(410, 30, 140, 25);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton7.setText("Clear Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jDesktopPane3.add(jButton7);
        jButton7.setBounds(560, 30, 130, 25);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 255));
        jLabel20.setText("ALL Clients Accounts");

        jTabclients.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTabclients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTabclients.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTabclients.getTableHeader().setResizingAllowed(false);
        jTabclients.getTableHeader().setReorderingAllowed(false);
        jTabclients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabclientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabclients);

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton8.setText("Edit Table Selection");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        curRow.setEditable(false);
        curRow.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        curRow.setForeground(new java.awt.Color(255, 0, 255));

        selecs.setEditable(false);
        selecs.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        selecs.setForeground(new java.awt.Color(255, 0, 255));

        jButton9.setText("Next >>");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Previous <<");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selecLayout = new javax.swing.GroupLayout(selec);
        selec.setLayout(selecLayout);
        selecLayout.setHorizontalGroup(
            selecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecLayout.createSequentialGroup()
                .addGroup(selecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(selecLayout.createSequentialGroup()
                        .addGroup(selecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(selecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(selecLayout.createSequentialGroup()
                                    .addGap(346, 346, 346)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(selecLayout.createSequentialGroup()
                                    .addGap(99, 99, 99)
                                    .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(selecLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton9)
                                .addGap(3, 3, 3)
                                .addComponent(jButton10)
                                .addGap(18, 18, 18)
                                .addGroup(selecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selecLayout.createSequentialGroup()
                                        .addComponent(curRow)
                                        .addGap(18, 18, 18)
                                        .addComponent(selecs, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        selecLayout.setVerticalGroup(
            selecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selecLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(selecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(curRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bank Account Records", selec);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Clear();
       accountNumGenerator();
        String sql222="Select*from bankaccounts";
        fillTableWthdRecords(sql222);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboAccountTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboAccountTypeItemStateChanged
        int selec = jComboAccountType.getSelectedIndex();
        if (selec == 0) {
            physicalAdd.setEditable(false);
            jDateCdob.setEnabled(false);
            chequelegibilty.setEditable(false);;

        } else if (selec == 1) {
            physicalAdd.setEditable(true);
            jDateCdob.setEnabled(false);
            chequelegibilty.setText("NOT Legible");
            chequelegibilty.setEditable(false);
            ((JTextField) jDateCdob.getDateEditor().getUiComponent()).setText("00-00-0000");
            physicalAdd.setText("");
        } else {
            physicalAdd.setEditable(false);
            jDateCdob.setEnabled(true);
            chequelegibilty.setText("Cheque Book To be Issued");
            physicalAdd.setText("NOT Applicable");
            chequelegibilty.setEditable(false);
            ((JTextField) jDateCdob.getDateEditor().getUiComponent()).setText("");
        }
    }//GEN-LAST:event_jComboAccountTypeItemStateChanged

    private void IdNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdNumberKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "enter numbers only", "Error", JOptionPane.ERROR_MESSAGE);
        }


        int legth = IdNumber.getText().length();
        if (legth >= 8) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_IdNumberKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_TAB) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Enter Alphabet letters  only(A-Z)", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int legth = name.getText().length();
        if (legth >= 25) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nameKeyTyped

    private void jTephoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTephoneNumberKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "enter numbers only", "Error", JOptionPane.ERROR_MESSAGE);
        }


        int legth = jTephoneNumber.getText().length();
        if (legth >= 10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTephoneNumberKeyTyped

    private void jTextemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextemailKeyTyped
        char c = evt.getKeyChar();
        int legth = jTextemail.getText().length();
        if (legth >= 30) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextemailKeyTyped

    private void jTextuniversityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextuniversityKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_TAB) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Enter Alphabet letters  only(A-Z)", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int legth = jTextuniversity.getText().length();
        if (legth >= 15) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextuniversityKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            con = (com.mysql.jdbc.Connection) DBManager.ConnectDB();

            //code for data verifacation to ensure no null fields
            if(jlabelImage.getIcon()==null){
          JOptionPane.showMessageDialog(this, "Please load Account holders' Image", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (acnumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Account Number", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (jCombofaculty.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(this, "Please enter Faculty", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (IdNumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter ID Number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTexCourse.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Course Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTephoneNumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Client Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (jCombstudyYear.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please select Year Of Study", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTextemail.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "please enter Email Address", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTextuniversity.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter University Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (physicalAdd.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "  Enter Physical Address", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (jComboAccountType.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "please selectAccount Type .", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (((JTextField) jDateCdob.getDateEditor().getUiComponent()).getText().equals("")) {
                JOptionPane.showMessageDialog(this, " SELECT Date of Birth! ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().equals("")) {
                JOptionPane.showMessageDialog(this, " SELECT Account opening Date ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (chequelegibilty.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Cheque", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

                try{
                  int acnumbrer =AccountNumber;
                String sql2="INSERT  INTO `mainaccount`(`AccountNumber`, `Name`, `IdNumber`, `AccountBalance`, `AccountType`, `OpeningDate`, `Contact`) VALUES ('" + acnumber.getText() + "','" + name.getText() + "','" + IdNumber.getText() + "','0000','" + jComboAccountType.getSelectedItem() + "','" + ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText() + "','" + jTephoneNumber.getText() + "') ";
                String sql = "INSERT INTO bankaccounts(AccountNumber,Name,IdNumber,University,Faculty,Course,StudyYear,PhoneNumber,EmailAddress,AccountType,OpeningDate,DOB,Address,ChequeIssue,AccountStatus) VALUES ('" + acnumber.getText() + "','" + name.getText() + "','" + IdNumber.getText() + "','" + jTextuniversity.getText() + "','" + jCombofaculty.getSelectedItem() + "','" + jTexCourse.getText() + "','" + jCombstudyYear.getSelectedItem() + "','" + jTephoneNumber.getText() + "','" + jTextemail.getText() + "','" + jComboAccountType.getSelectedItem() + "','" + ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText() + "','" + ((JTextField) jDateCdob.getDateEditor().getUiComponent()).getText() + "','" + physicalAdd.getText() + "','" + chequelegibilty.getText() + "','ACTIVE')";
                updateSave(sql);

                String sql3="UPDATE accountmonitoring SET  lastACnumber='"+acnumbrer+"' WHERE staff=1";
                 updateSave(sql2);
                 updateSave(sql3);

               String sql22 = "insert into images (Id,AccountNumber,image) values (?,?,?)";
                 pst = con.prepareStatement(sql22);
                pst.setString(1, "0");
                pst.setString(2, acnumber.getText());
                pst.setBytes(3, person_image);
                pst.execute();


                JOptionPane.showMessageDialog(this, "Account Opening Successful!!!", "Student Record", JOptionPane.INFORMATION_MESSAGE);
                
                Clear();
               accountNumGenerator();
               String sql222="Select*from bankaccounts";
               fillTableWthdRecords(sql222);
              } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
  con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        ImageIcon format = null;
        JFileChooser jchooser = new JFileChooser();
        jchooser.setDialogTitle("Se+arch image path");
        jchooser.showOpenDialog(null);
        File f = jchooser.getSelectedFile();
                  filename = f.getAbsolutePath();
              //Creating an ImageIcon out of the selected file
                ImageIcon image = new ImageIcon(f.getAbsolutePath());
                // Get width and height of picture Label
                java.awt.Rectangle rect = jlabelImage.getBounds();
                //    // Scaling the Image to fit in the picture Label
                Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
                // Converting the image back to ImageIcon to make it acceptable by picture Label
                image = new ImageIcon(scaledImage);
                jlabelImage.setIcon(image);
                filename = f.getAbsolutePath();
               path.setText(filename);


       try{
            File image1=new File (filename);
            FileInputStream fis=new FileInputStream(image1);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte [] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf, 0, readNum);
            }
           person_image=bos.toByteArray();//converts image to binary string of array
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if(jlabelImage.getIcon()==null){
          JOptionPane.showMessageDialog(this, "Please load Account holders' Image", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (acnumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Account Number", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (jCombofaculty.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(this, "Please enter Faculty", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (IdNumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter ID Number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTexCourse.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Course Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTephoneNumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Client Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (jCombstudyYear.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please select Year Of Study", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTextemail.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "please enter Email Address", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTextuniversity.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter University Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (physicalAdd.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "  Enter Physical Address", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (jComboAccountType.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "please selectAccount Type .", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (((JTextField) jDateCdob.getDateEditor().getUiComponent()).getText().equals("")) {
                JOptionPane.showMessageDialog(this, " SELECT Date of Birth! ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().equals("")) {
                JOptionPane.showMessageDialog(this, " SELECT Account opening Date ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (chequelegibilty.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Cheque", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

        try{
//            String sql22 = "update images set image='"+person_image+"'  where AccountNumber = '" + acnum.getText() + "' ";
//                pst = con.prepareStatement(sql22);
//                pst.execute();
                String sql2="UPDATE `mainaccount` set `Name`='" + name.getText() + "', `IdNumber`='" + IdNumber.getText() + "',AccountType='" + jComboAccountType.getSelectedItem() + "',OpeningDate='" + ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText() + "', `Contact`='" + jTephoneNumber.getText() + "'  where AccountNumber = '" + acnumber.getText() + "'  ";
                String sql = "Update bankaccounts set`Name`='" + name.getText() + "', `IdNumber`='" + IdNumber.getText() + "',University='" + jTextuniversity.getText() + "',Faculty='" + jCombofaculty.getSelectedItem() + "',Course='" + jTexCourse.getText() + "',StudyYear='" + jCombstudyYear.getSelectedItem() + "',PhoneNumber='" + jTephoneNumber.getText() + "',EmailAddress='" + jTextemail.getText() + "',AccountType='" + jComboAccountType.getSelectedItem() + "',OpeningDate='" + ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText() + "',DOB='" + ((JTextField) jDateCdob.getDateEditor().getUiComponent()).getText() + "',Address='" + physicalAdd.getText() + "',ChequeIssue='" + chequelegibilty.getText() + "'  where AccountNumber = '" + acnumber.getText() + "' ";
                updateSave(sql);
                updateSave(sql2);

                Clear();
               accountNumGenerator();
               String sql222="Select*from bankaccounts";
               fillTableWthdRecords(sql222);
  con.close();
          JOptionPane.showMessageDialog(this, "Persons Record updated","Error message",JOptionPane.INFORMATION_MESSAGE);
       }
       catch(SQLException | HeadlessException e){

       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed


        try {

            con = DBManager.ConnectDB();


            String sql = "select * from mainaccount where AccountNumber = '" + acnum.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {

                String add1 = rs.getString("Name");
                jTextFieldname.setText(add1);
                String add11 = rs.getString("IdNumber");
                jTextField7idnum.setText(add11);


                String QUERRY = "SELECT*FROM `bankaccounts` where AccountNumber='" + acnum.getText() + "'";
                fillTableWthdRecords(QUERRY);
            } else {
                JOptionPane.showMessageDialog(this, "Persons With Account Number  " + acnum.getText() + " does not exist");
                jTextFieldname.setText("");
                acnum.setText("");
                jTextField7idnum.setText("");
                String sql22 = "Select*from bankaccounts";
                fillTableWthdRecords(sql22);
                return;

            }
  con.close();
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextFieldname.setText("");
        acnum.setText("");
        jTextField7idnum.setText("");
        String sql = "Select*from bankaccounts";
        fillTableWthdRecords(sql);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextFieldseachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldseachKeyPressed
       char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
           Clear();

     try {





            con = DBManager.ConnectDB();


            String sql = "select * from bankaccounts where AccountNumber = '" + jTextFieldseach.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {


                String add1 = rs.getString("Name");
                jTextFieldname.setText(add1);
                name.setText(add1);
                String add11 = rs.getString("IdNumber");
                jTextField7idnum.setText(add11);
                IdNumber.setText(add11);
                String add2 = rs.getString("AccountNumber");
                acnumber.setText(add2);
                acnum.setText(add2);
                String add3 = rs.getString("University");
                jTextuniversity.setText(add3);
                String add4 = rs.getString("Faculty");
                jCombofaculty.setSelectedItem(add4);
                String add5 = rs.getString("Course");
                jTexCourse.setText(add5);
                String add6 = rs.getString("StudyYear");
                jCombstudyYear.setSelectedItem(add6);
                String add7 = rs.getString("PhoneNumber");
                jTephoneNumber.setText(add7);
                String add8= rs.getString("EmailAddress");
                jTextemail.setText(add8);
                String add9 = rs.getString("AccountType");
                jComboAccountType.setSelectedItem(add9);

                String add10 = rs.getString("OpeningDate");
                ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText(add10);
                String add12 = rs.getString("DOB");
              ((JTextField) jDateCdob.getDateEditor().getUiComponent()).setText(add12);

                 String add13 = rs.getString("Address");
                physicalAdd.setText(add13);
                String add14= rs.getString("ChequeIssue");
                chequelegibilty.setText(add14);


             String sql1= "select * from images where AccountNumber = '" + jTextFieldseach.getText() + "'";
            pst=con.prepareStatement(sql1);
            rs=  pst.executeQuery();
            if(rs.next()){
             byte[]Imagedata=rs.getBytes("image");
                BufferedImage buff_Image=ImageIO.read(new ByteArrayInputStream(Imagedata) );
                 format = new ImageIcon(buff_Image);
                 java.awt.Rectangle rect = jlabelImage.getBounds();
                //    // Scaling the Image to fit in the picLabel
                Image scaledImage =  format.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
                // Converting the image back to ImageIcon to make it acceptable by picLabel
                 format = new ImageIcon(scaledImage);
                jlabelImage.setIcon(format);
            }

                 String QUERRY = "SELECT*FROM `bankaccounts` where AccountNumber='" + jTextFieldseach.getText() + "'";
                fillTableWthdRecords(QUERRY);

            } else {
                JOptionPane.showMessageDialog(this, "Persons With Account Number  " + jTextFieldseach.getText() + " does not exist");
                jTextFieldname.setText("");
                acnum.setText("");
                jTextField7idnum.setText("");
                String sql22 = "Select*from bankaccounts";
                fillTableWthdRecords(sql22);
            }
              con.close();
        } catch (SQLException | IOException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }
    }//GEN-LAST:event_jTextFieldseachKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

            if (jCombofaculty.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(this, "Please enter Faculty", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (IdNumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter ID Number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTexCourse.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Course Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTephoneNumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Client Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (jCombstudyYear.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please select Year Of Study", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

        try {
              JOptionPane.showMessageDialog(this, "Are you sure want to delete This Record?", "Warning message", JOptionPane.WARNING_MESSAGE);

            int P = JOptionPane.showConfirmDialog(null, acnumber.getText() + " will be parmanently from Bank Account Database?", "Confirmation ", JOptionPane.YES_NO_OPTION);
            if (P == 0) {

                con = DBManager.ConnectDB();
                String sql = "DELETE FROM bankaccounts WHERE  AccountNumber = '" + acnumber.getText() + "'";
                updateSave(sql);
                Clear();
               accountNumGenerator();
               String sql222="Select*from bankaccounts";
               fillTableWthdRecords(sql222);
                JOptionPane.showMessageDialog(this, "Record Successfully deleted", "Record", JOptionPane.INFORMATION_MESSAGE);

            }
con.close();
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

           Clear();

     try {

            con = DBManager.ConnectDB();
   int row= jTabclients.getSelectedRow();

  String table_click= jTabclients.getModel().getValueAt(row, 0).toString();

            String sql = "select * from bankaccounts where AccountNumber = '" +table_click+ "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {


                String add1 = rs.getString("Name");
                jTextFieldname.setText(add1);
                name.setText(add1);
                String add11 = rs.getString("IdNumber");
                jTextField7idnum.setText(add11);
                IdNumber.setText(add11);
                String add2 = rs.getString("AccountNumber");
                acnumber.setText(add2);
                acnum.setText(add2);
                String add3 = rs.getString("University");
                jTextuniversity.setText(add3);
                String add4 = rs.getString("Faculty");
                jCombofaculty.setSelectedItem(add4);
                String add5 = rs.getString("Course");
                jTexCourse.setText(add5);
                String add6 = rs.getString("StudyYear");
                jCombstudyYear.setSelectedItem(add6);
                String add7 = rs.getString("PhoneNumber");
                jTephoneNumber.setText(add7);
                String add8= rs.getString("EmailAddress");
                jTextemail.setText(add8);
                String add9 = rs.getString("AccountType");
                jComboAccountType.setSelectedItem(add9);

                String add10 = rs.getString("OpeningDate");
                ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText(add10);
                String add12 = rs.getString("DOB");
              ((JTextField) jDateCdob.getDateEditor().getUiComponent()).setText(add12);

                 String add13 = rs.getString("Address");
                physicalAdd.setText(add13);
                String add14= rs.getString("ChequeIssue");
                chequelegibilty.setText(add14);


             String sql1= "select * from images where AccountNumber = '" + table_click + "'";
            pst=con.prepareStatement(sql1);
            rs=  pst.executeQuery();
            if(rs.next()){
             byte[]Imagedata=rs.getBytes("image");
                BufferedImage buff_Image=ImageIO.read(new ByteArrayInputStream(Imagedata) );
                 format = new ImageIcon(buff_Image);
                 java.awt.Rectangle rect = jlabelImage.getBounds();
                //    // Scaling the Image to fit in the picLabel
                Image scaledImage =  format.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
                // Converting the image back to ImageIcon to make it acceptable by picLabel
                 format = new ImageIcon(scaledImage);
                jlabelImage.setIcon(format);
            }

                 String QUERRY = "SELECT*FROM `bankaccounts` where AccountNumber='" + table_click+ "'";
                fillTableWthdRecords(QUERRY);
               jTabbedPane1.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Table Selection ");
                jTextFieldname.setText("");
                acnum.setText("");
                jTextField7idnum.setText("");
                String sql22 = "Select*from bankaccounts";
                fillTableWthdRecords(sql22);
            }
              con.close();
        } catch (SQLException | IOException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTabclientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabclientsMouseClicked
       int row= jTabclients.getSelectedRow();
       selecs.setText(""+row);
    }//GEN-LAST:event_jTabclientsMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
try{
       if(selecs.getText().equals("")){
       JOptionPane.showMessageDialog(this, "Select any row first in the table first","error message",JOptionPane.ERROR_MESSAGE);
       return;
       }

        int rowss=Integer.parseInt(selecs.getText());
       int lasts=Integer.parseInt(curRow.getText());
        newrow=rowss+1;
      if(rowss==lasts){
       JOptionPane.showMessageDialog(this, "Select this is the last row","error message",JOptionPane.ERROR_MESSAGE);
         jTabclients.changeSelection(newrow-1,0, closable, isIcon);
       return;
       }

 while(newrow <= Integer.parseInt(curRow.getText())){
       jTabclients.clearSelection();
      jTabclients.changeSelection(newrow,0, closable, isIcon);
       selecs.setText(""+newrow);
break;
}
   }
catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
      try {

          int row= jTabclients.getSelectedRow();

          String table_click= jTabclients.getModel().getValueAt(row, 0).toString();


            con = DBManager.ConnectDB();
            String sql = "select * from mainaccount where AccountNumber = '" +table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {

                String add1 = rs.getString("Name");
                jTextFieldname.setText(add1);
                String add11 = rs.getString("IdNumber");
                jTextField7idnum.setText(add11);
                acnum.setText(table_click);


            } else {
                JOptionPane.showMessageDialog(this, "Persons With Account Number  " +table_click + " does not exist");


            }
  con.close();
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    try{
       if(selecs.getText().equals("")){
       JOptionPane.showMessageDialog(this, "Select any row first in the table first","error message",JOptionPane.ERROR_MESSAGE);
       return;
       }

        int rowss=Integer.parseInt(selecs.getText());
       int lasts=Integer.parseInt(curRow.getText());
        newrow=--rowss;
      if(rowss==lasts){
       JOptionPane.showMessageDialog(this, "Select this is the last row","error message",JOptionPane.ERROR_MESSAGE);
         jTabclients.changeSelection(newrow,0, closable, isIcon);
       return;
       }

 while(newrow <= Integer.parseInt(curRow.getText())){
       jTabclients.clearSelection();
      jTabclients.changeSelection(newrow,0, closable, isIcon);
       selecs.setText(""+newrow);
break;
}
   }
catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
      try {

          int row= jTabclients.getSelectedRow();

          String table_click= jTabclients.getModel().getValueAt(row, 0).toString();


            con = DBManager.ConnectDB();
            String sql = "select * from mainaccount where AccountNumber = '" +table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {

                String add1 = rs.getString("Name");
                jTextFieldname.setText(add1);
                String add11 = rs.getString("IdNumber");
                jTextField7idnum.setText(add11);
                acnum.setText(table_click);


            } else {
                JOptionPane.showMessageDialog(this, "Persons With Account Number  " +table_click + " does not exist");


            }
  con.close();
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void acnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acnumberActionPerformed

    private void jTextFieldseachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldseachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldseachActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdNumber;
    private javax.swing.JTextField acnum;
    private javax.swing.JTextField acnumber;
    private javax.swing.JTextField chequelegibilty;
    private javax.swing.JTextField curRow;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboAccountType;
    private javax.swing.JComboBox jCombofaculty;
    private javax.swing.JComboBox jCombstudyYear;
    private com.toedter.calendar.JDateChooser jDateCdob;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTabclients;
    private javax.swing.JTextField jTephoneNumber;
    private javax.swing.JTextField jTexCourse;
    private javax.swing.JTextField jTextField7idnum;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldseach;
    private javax.swing.JTextField jTextemail;
    private javax.swing.JTextField jTextuniversity;
    private javax.swing.JLabel jlabelImage;
    private javax.swing.JTextField name;
    private javax.swing.JTextField path;
    private javax.swing.JTextField physicalAdd;
    private javax.swing.JPanel selec;
    private javax.swing.JTextField selecs;
    // End of variables declaration//GEN-END:variables


    private ImageIcon format = null;
    String filename = null;
    byte [] person_image = null;




}
