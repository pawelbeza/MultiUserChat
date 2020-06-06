/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import Client.Client;
import java.awt.Color;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * <h1>Login_Form</h1>
 * Tworzy okno do logowania się
 * @author Arkadiusz Dawid
 */
public class Login_Form extends javax.swing.JFrame {

    /**
    * Creates new form Login_Form
     */
    public Login_Form() {
        initComponents();
        
        // center the form
        this.setLocationRelativeTo(null);
        
        // create a black border for the global panel
        Border glob_panel_border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        jPanel1.setBorder(glob_panel_border);
        
        // create a black border for the close & minimize jlabels
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Paweł Bęza
    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jLabel_login = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jTextField_Username = new JTextField();
        jPasswordField = new JPasswordField();
        jButton_Login = new JButton();
        jLabel_Create_Account = new JLabel();
        jLabel_minimize = new JLabel();
        jLabel_close = new JLabel();
        jPanel_title = new JPanel();
        jLabel3 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        var contentPane = getContentPane();

        //======== jPanel1 ========
        {
            jPanel1.setBackground(new Color(153, 153, 255));
            jPanel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,jPanel1. getBorder( )) );

            //======== jPanel2 ========
            {
                jPanel2.setBackground(new Color(204, 204, 255));

                //======== jPanel3 ========
                {
                    jPanel3.setBackground(Color.white);

                    //---- jLabel_login ----
                    jLabel_login.setBackground(Color.white);
                    jLabel_login.setIcon(new ImageIcon(getClass().getResource("/images/user-icon.png")));
                    jLabel_login.setOpaque(true);

                    //---- jLabel_password ----
                    jLabel_password.setBackground(Color.white);
                    jLabel_password.setIcon(new ImageIcon(getClass().getResource("/images/lock-icon.png")));
                    jLabel_password.setOpaque(true);

                    //---- jTextField_Username ----
                    jTextField_Username.setFont(new Font("Verdana", Font.PLAIN, 24));
                    jTextField_Username.setForeground(new Color(153, 153, 153));
                    jTextField_Username.setText("username");
                    jTextField_Username.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusGained(FocusEvent e) {
                            jTextField_UsernameFocusGained(e);
                        }
                        @Override
                        public void focusLost(FocusEvent e) {
                            jTextField_UsernameFocusLost(e);
                        }
                    });

                    //---- jPasswordField ----
                    jPasswordField.setFont(new Font("Verdana", Font.PLAIN, 24));
                    jPasswordField.setForeground(new Color(153, 153, 153));
                    jPasswordField.setText("password");
                    jPasswordField.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusGained(FocusEvent e) {
                            jPasswordFieldFocusGained(e);
                        }
                        @Override
                        public void focusLost(FocusEvent e) {
                            jPasswordFieldFocusLost(e);
                        }
                    });

                    //---- jButton_Login ----
                    jButton_Login.setBackground(new Color(61, 61, 255));
                    jButton_Login.setFont(new Font("Verdana", Font.PLAIN, 24));
                    jButton_Login.setForeground(Color.white);
                    jButton_Login.setText("LOGIN");
                    jButton_Login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    jButton_Login.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            jButton_LoginMouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            jButton_LoginMouseExited(e);
                        }
                    });
                    jButton_Login.addActionListener(e -> jButton_LoginActionPerformed(e));

                    //---- jLabel_Create_Account ----
                    jLabel_Create_Account.setFont(new Font("Tahoma", Font.PLAIN, 14));
                    jLabel_Create_Account.setForeground(new Color(0, 153, 204));
                    jLabel_Create_Account.setHorizontalAlignment(SwingConstants.CENTER);
                    jLabel_Create_Account.setText(">> Click here to create new account <<");
                    jLabel_Create_Account.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    jLabel_Create_Account.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            jLabel_Create_AccountMouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            jLabel_Create_AccountMouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            jLabel_Create_AccountMouseExited(e);
                        }
                    });

                    GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                    jPanel3.setLayout(jPanel3Layout);
                    jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup()
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup()
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel_password, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_login, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_Username)
                                            .addComponent(jPasswordField, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(217, 217, 217)
                                        .addComponent(jButton_Login, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel_Create_Account, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                    jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup()
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Username)
                                    .addComponent(jLabel_login, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_password, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jButton_Login, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jLabel_Create_Account)
                                .addContainerGap())
                    );
                }

                //---- jLabel_minimize ----
                jLabel_minimize.setFont(new Font("Verdana", Font.BOLD, 24));
                jLabel_minimize.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel_minimize.setText(" - ");
                jLabel_minimize.setAlignmentY(0.0F);
                jLabel_minimize.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                jLabel_minimize.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jLabel_minimizeMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        jLabel_minimizeMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        jLabel_minimizeMouseExited(e);
                    }
                });

                //---- jLabel_close ----
                jLabel_close.setFont(new Font("Verdana", Font.BOLD, 24));
                jLabel_close.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel_close.setText("x");
                jLabel_close.setAlignmentY(0.0F);
                jLabel_close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                jLabel_close.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jLabel_closeMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        jLabel_closeMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        jLabel_closeMouseExited(e);
                    }
                });

                //======== jPanel_title ========
                {
                    jPanel_title.setBackground(new Color(153, 153, 255));

                    //---- jLabel3 ----
                    jLabel3.setFont(new Font("Verdana", Font.PLAIN, 36));
                    jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
                    jLabel3.setText("L O G I N");

                    GroupLayout jPanel_titleLayout = new GroupLayout(jPanel_title);
                    jPanel_title.setLayout(jPanel_titleLayout);
                    jPanel_titleLayout.setHorizontalGroup(
                        jPanel_titleLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel_titleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    jPanel_titleLayout.setVerticalGroup(
                        jPanel_titleLayout.createParallelGroup()
                            .addGroup(jPanel_titleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup()
                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap(168, Short.MAX_VALUE)
                            .addComponent(jPanel_title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83)
                            .addComponent(jLabel_minimize, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_close, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup()
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_minimize)
                                        .addComponent(jLabel_close))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel_title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                );
            }

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Zmienia wygląd przycisku <b>minimize</b>
     * @param evt zdarzenie najechania myszką na przycisk <b>minimize</b>
     */
    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    /**
     * Przywraca pierwotny wygląd przycisku <b>minimize</b>
     * @param evt zdarzenie odjechania myszką od przycisku <b>minimize</b>
     */
    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    /**
     * Zmienia wygląd przycisku <b>close</b>
     * @param evt zdarzenie najechania myszką na przycisk <b>close</b>
     */
    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jLabel_closeMouseEntered

    /**
     * Przywraca pierwotny wygląd przycisku <b>close</b>
     * @param evt zdarzenie odjechania myszką od przycisku <b>close</b>
     */
    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_jLabel_closeMouseExited

    /**
     * Usuwa placeholder "username" i zmienia kolor czcionki z szarego na czarny
     * @param evt zdarzenie uzyskania "focusu" przez pole do wpisania nazwy użytkownika
     */
    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
        
        // clear the textfield on focus if the text is "username"
        if(jTextField_Username.getText().trim().toLowerCase().equals("username")){
            jTextField_Username.setText("");
            jTextField_Username.setForeground(Color.BLACK);
        }
        
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    /**
     * Przywraca placeholder "username" i szary kolor czcionki, jeśli użytkownik nic nie wpisał
     * @param evt zdarzenie utraty "focusu" przez pole do wpisania nazwy użytkownika
     */
    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost
        
        // if the text field is equal to username or empty
        // we will set the "username" text in the field on focus lost event
        
        if(jTextField_Username.getText().trim().equals("") || 
                jTextField_Username.getText().trim().toLowerCase().equals("username")){
            jTextField_Username.setText("username");
            jTextField_Username.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    /**
     * Usuwa placeholder "password" i zmienia kolor czcionki z szarego na czarny
     * @param evt uzyskania "focusu" przez pole do wpisania hasła
     */
    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        
        // clear the password field on focus if the text is "password"
        
        // get the password text
        String pass = String.valueOf(jPasswordField.getPassword());
        
        if(pass.trim().toLowerCase().equals("password")){
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.BLACK);
        }
        
    }//GEN-LAST:event_jPasswordFieldFocusGained

    /**
     * Przywraca placeholder "password" i szary kolor czcionki, jeśli użytkownik nic nie wpisał
     * @param evt zdarzenie utraty "focusu" przez pole do wpisania hasła
     */
    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        
        // if the password field is equal to "password" or empty
        // we will set the "password" text in the field on focus lost event
        
        // get the password text
        String pass = String.valueOf(jPasswordField.getPassword());
        
        if(pass.trim().equals("") || pass.trim().toLowerCase().equals("password")){
            jPasswordField.setText("password");
            jPasswordField.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_jPasswordFieldFocusLost

    /**
     * Zmienia kolor przycisku <b>LOGIN</b>
     * @param evt zdarzenie najechania myszką na przycisk <b>LOGIN</b>
     */
    private void jButton_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseEntered
        
        // set jButton background
        jButton_Login.setBackground(new Color(31,31,255));
        
    }//GEN-LAST:event_jButton_LoginMouseEntered

    /**
     * Przywraca pierwotny kolor przyciskowi <b>LOGIN</b>
     * @param evt zdarzenie odjechania myszki od przycisku <b>LOGIN</b>
     */
    private void jButton_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseExited
        
        // set jButton background
        jButton_Login.setBackground(new Color(61,61,255));
        
    }//GEN-LAST:event_jButton_LoginMouseExited

    /**
     * Minimalizuje okno logowania
     * @param evt zdarzenie kliknięcia w przycisk <b>minimize</b>
     */
    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    /**
     * Zamyka okno logowania
     * @param evt zdarzenie kliknięcia w przycisk <b>close</b>
     */
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_jLabel_closeMouseClicked

    /**
     * Sprawdza poprawność wpisanych loginu i hasła
     * Loguje użytkownia, jeśli wszystko się zgadza
     * W przeciwnym razie wyświetla stosowny komunikat o błędzie
     * @param evt zdarzenie kliknięcia w przycisk <b>LOGIN</b>
     */
    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        
        PreparedStatement st;
        ResultSet rs;
        
        // get the username & password
        String username = jTextField_Username.getText();
        String password = String.valueOf(jPasswordField.getPassword());
        
        // create a select query to check if the username & the
        // password exist in the database
        String query = "SELECT * FROM `users` WHERE `username` = ? AND `password` = ?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                Client client = new Client(username);
                this.dispose();
            }else{
                // error message
                JOptionPane.showMessageDialog(null, "Invalid Username / Password", "Login Error", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton_LoginActionPerformed

    /**
     * Zmienia kolor przycisku <b>Create_Account</b>
     * @param evt zdarzenie najechania myszką na przycisk <b>Create_Account</b>
     */
    private void jLabel_Create_AccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseEntered
        
        jLabel_Create_Account.setForeground(new Color(0,53,104));
        
    }//GEN-LAST:event_jLabel_Create_AccountMouseEntered

    /**
     * Przywraca pierwotny kolor przycisku <b>Create_Account</b>
     * @param evt zdarzenie odjechania myszki od przycisku <b>Create_Account</b>
     */
    private void jLabel_Create_AccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseExited
        
        jLabel_Create_Account.setForeground(new Color(0,153,204));
        
    }//GEN-LAST:event_jLabel_Create_AccountMouseExited

    /**
     * Otwiera okno od rejestracji, zamyka okno od logowania
     * @param evt zdarzenie kliknięcia w przycisk <b>Create_Account</b>
     */
    private void jLabel_Create_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseClicked
        Register_Form rf = new Register_Form();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jLabel_Create_AccountMouseClicked

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
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Paweł Bęza
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JLabel jLabel_login;
    private JLabel jLabel_password;
    private JTextField jTextField_Username;
    private JPasswordField jPasswordField;
    private JButton jButton_Login;
    private JLabel jLabel_Create_Account;
    private JLabel jLabel_minimize;
    private JLabel jLabel_close;
    private JPanel jPanel_title;
    private JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
