/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Forms;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * <h1>Register_Form</h1>
 * Tworzy okno do rejestracji
 * @author Arkadiusz Dawid
 */
public class Register_Form extends javax.swing.JFrame {

    /**
     * Creates new form Register_Form
     */
    public Register_Form() {
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
        jButton_Register = new JButton();
        jLabel1 = new JLabel();
        jTextField_Nickname = new JTextField();
        jTextField_Username = new JTextField();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jPasswordField_1 = new JPasswordField();
        jPasswordField_2 = new JPasswordField();
        jLabel_login = new JLabel();
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
            jPanel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder (
            new javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e"
            , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
            , new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 )
            ,java . awt. Color .red ) ,jPanel1. getBorder () ) );

            //======== jPanel2 ========
            {
                jPanel2.setBackground(new Color(204, 204, 255));

                //======== jPanel3 ========
                {
                    jPanel3.setBackground(Color.white);

                    //---- jButton_Register ----
                    jButton_Register.setBackground(new Color(61, 61, 255));
                    jButton_Register.setFont(new Font("Verdana", Font.PLAIN, 24));
                    jButton_Register.setForeground(Color.white);
                    jButton_Register.setText("REGISTER");
                    jButton_Register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    jButton_Register.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            jButton_RegisterMouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            jButton_RegisterMouseExited(e);
                        }
                    });
                    jButton_Register.addActionListener(e -> jButton_RegisterActionPerformed(e));

                    //---- jLabel1 ----
                    jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 18));
                    jLabel1.setText("nickname:");

                    //---- jTextField_Nickname ----
                    jTextField_Nickname.setFont(new Font("Tahoma", Font.PLAIN, 18));

                    //---- jTextField_Username ----
                    jTextField_Username.setFont(new Font("Tahoma", Font.PLAIN, 18));

                    //---- jLabel2 ----
                    jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 18));
                    jLabel2.setText("username:");

                    //---- jLabel4 ----
                    jLabel4.setFont(new Font("Tahoma", Font.PLAIN, 18));
                    jLabel4.setText("password:");

                    //---- jLabel5 ----
                    jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 18));
                    jLabel5.setText("confirm password:");

                    //---- jPasswordField_1 ----
                    jPasswordField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
                    jPasswordField_1.addActionListener(e -> jPasswordField_1ActionPerformed(e));

                    //---- jPasswordField_2 ----
                    jPasswordField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
                    jPasswordField_2.addActionListener(e -> jPasswordField_2ActionPerformed(e));

                    //---- jLabel_login ----
                    jLabel_login.setFont(new Font("Tahoma", Font.PLAIN, 14));
                    jLabel_login.setForeground(new Color(0, 153, 204));
                    jLabel_login.setHorizontalAlignment(SwingConstants.CENTER);
                    jLabel_login.setText(">> Click here to login if you already have an account <<");
                    jLabel_login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    jLabel_login.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            jLabel_loginMouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            jLabel_loginMouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            jLabel_loginMouseExited(e);
                        }
                    });

                    GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                    jPanel3.setLayout(jPanel3Layout);
                    jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup()
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup()
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1, GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_Username, GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Nickname, GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField_1, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_login, GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jButton_Register, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(200, Short.MAX_VALUE))
                    );
                    jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField_Nickname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField_Username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jPasswordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jPasswordField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jButton_Register, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_login)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    jLabel3.setText("R E G I S T E R");

                    GroupLayout jPanel_titleLayout = new GroupLayout(jPanel_title);
                    jPanel_title.setLayout(jPanel_titleLayout);
                    jPanel_titleLayout.setHorizontalGroup(
                        jPanel_titleLayout.createParallelGroup()
                            .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    );
                    jPanel_titleLayout.setVerticalGroup(
                        jPanel_titleLayout.createParallelGroup()
                            .addComponent(jLabel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    );
                }

                GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup()
                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap(184, Short.MAX_VALUE)
                            .addComponent(jPanel_title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(jLabel_minimize, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_close, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_minimize)
                                        .addComponent(jLabel_close))
                                    .addGap(71, 71, 71))
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jPanel_title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)))
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
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Zmienia wygląd przycisku <b>REGISTER</b>
     * @param evt zdarzenie najechania myszką na przycisk
     */
    private void jButton_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseEntered

        // set jButton background
        jButton_Register.setBackground(new Color(31,31,255));

    }//GEN-LAST:event_jButton_RegisterMouseEntered

    /**
     * Przywraca pierwotny wygląd przycisku <b>REGISTER</b>
     * @param evt zdarzenie odjechania myszki od przycisku <b>REGISTER</b>
     */
    private void jButton_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseExited

        // set jButton background
        jButton_Register.setBackground(new Color(61,61,255));

    }//GEN-LAST:event_jButton_RegisterMouseExited

    /**
     * Sprawdza dane wpisane przez użytkownika
     * Jeśli wszystko się zgadza - rejestruje nowego użytkownika, tzn. dodaje
     * nowy rekord w bazie danych w tabeli <b>users</b>
     * W przeciwnym wypadku wyświetla stosowny komunikat
     * @param evt zdarzenie kliknięcia przycisku <b>REGISTER</b>
     */
    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed

        String nickname = jTextField_Nickname.getText();
        String username = jTextField_Username.getText();
        String pass1 = String.valueOf(jPasswordField_1.getPassword());
        String pass2 = String.valueOf(jPasswordField_2.getPassword());
        
        if(verifyFields())
        {
            if(!checkUsername(username))
            {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `users`(`nickname`, `username`, `password`) VALUES (?,?,?)";
                
                try {
                    ps = My_CNX.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, nickname);
                    ps.setString(2, username);
                    ps.setString(3, pass1);
                    
                    if(ps.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Your account has been created");
                        
                        Login_Form lf = new Login_Form();
                        lf.setVisible(true);
                        lf.pack();
                        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Error");
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_jButton_RegisterActionPerformed

    /**
     * Minimalizuje okno rejestracji
     * @param evt zdarzenie kliknięcia w przycisk <b>minimize</b>
     */
    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabel_minimizeMouseClicked

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
     * Zamyka okno rejestracji
     * @param evt zdarzenie kliknięcia w przycisk <b>close</b>
     */
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabel_closeMouseClicked

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

    private void jPasswordField_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_1ActionPerformed

    private void jPasswordField_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_2ActionPerformed

    /**
     * Zamyka okno rejestracji
     * Otwiera okno logowania
     * @param evt zdarzenie kliknięcia w przycisk <b>Login</b>
     */
    private void jLabel_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMouseClicked

        Login_Form lf = new Login_Form();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_loginMouseClicked

    /**
     * Zmienia kolor przycisku <b>Login</b>
     * @param evt zdarzenie najechania myszką na przycisk <b>Login</b>
     */
    private void jLabel_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMouseEntered

        jLabel_login.setForeground(new Color(0,53,104));

    }//GEN-LAST:event_jLabel_loginMouseEntered

    /**
     * Przywraca pierwotny kolor przycisku <b>Login</b>
     * @param evt zdarzenie odjechania myszki od przycisku <b>Login</b>
     */
    private void jLabel_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMouseExited

        jLabel_login.setForeground(new Color(0,153,204));

    }//GEN-LAST:event_jLabel_loginMouseExited
    
    /**
     * Weryfikuje treść w polach do rejestracji, tzn. sprawdza czy żadne pole
     * nie jest puste, czy oba hasła w polach <b>password</b> oraz
     * <b>confirm password</b> są takie same
     * @return zwraca <b>true</b> jeśli użytkownik wszystko wpisał prawidłowo
     */
    public boolean verifyFields()
    {
        String nickname = jTextField_Nickname.getText();
        String uname = jTextField_Username.getText();
        String pass1 = String.valueOf(jPasswordField_1.getPassword());
        String pass2 = String.valueOf(jPasswordField_2.getPassword());
        
        // check empty fields
        if(nickname.trim().equals("") || uname.trim().equals("") || pass1.trim().equals("") || pass2.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One or more fields are empty", "Empty fields", 2);
            return false;
        }
        
        // check if the two password fields are equal
        else if(!pass1.equals(pass2))
        {
            JOptionPane.showMessageDialog(null, "Passwords do not match", "Confirm password", 2);
            return false;
        }
        
        // if everything is ok
        else{
            return true;
        }
    }
    
    // function to check if the entered username already exists in the database
    /**
     * Sprawdza, czy podana nazwa użytkownika w trakcie rejestracji nie jest
     * już zajęta przez innego użytkownika
     * @param username sprawdzana nazwa użytkownika
     * @return zwraca <b>true</b> jeśli poda nazwa użytkownika już istnieje w bazie
     */
    public boolean checkUsername(String username)
    {
        PreparedStatement st;
        ResultSet rs;
        boolean username_exists = false;
        
        String query = "SELECT * FROM `users` WHERE `username` = ?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                username_exists = true;
                JOptionPane.showMessageDialog(null, "This username is already taken, choose another one", "Username failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exists;
    }
    
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
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Paweł Bęza
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JButton jButton_Register;
    private JLabel jLabel1;
    private JTextField jTextField_Nickname;
    private JTextField jTextField_Username;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPasswordField jPasswordField_1;
    private JPasswordField jPasswordField_2;
    private JLabel jLabel_login;
    private JLabel jLabel_minimize;
    private JLabel jLabel_close;
    private JPanel jPanel_title;
    private JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
