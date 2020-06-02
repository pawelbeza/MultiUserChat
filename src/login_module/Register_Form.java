/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_module;

import java.awt.Color;
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
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton_Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Nickname = new javax.swing.JTextField();
        jTextField_Username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField_1 = new javax.swing.JPasswordField();
        jPasswordField_2 = new javax.swing.JPasswordField();
        jLabel_login = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jPanel_title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton_Register.setBackground(new java.awt.Color(61, 61, 255));
        jButton_Register.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton_Register.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Register.setText("REGISTER");
        jButton_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseExited(evt);
            }
        });
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("nickname:");

        jTextField_Nickname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("username:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("confirm password:");

        jPasswordField_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_1ActionPerformed(evt);
            }
        });

        jPasswordField_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_2ActionPerformed(evt);
            }
        });

        jLabel_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_login.setForeground(new java.awt.Color(0, 153, 204));
        jLabel_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_login.setText(">> Click here to login if you already have an account <<");
        jLabel_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_loginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Nickname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField_1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(jPasswordField_2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_minimize.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_minimize.setText(" - ");
        jLabel_minimize.setAlignmentY(0.0F);
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_close.setText("x");
        jLabel_close.setAlignmentY(0.0F);
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jPanel_title.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("R E G I S T E R");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_minimize)
                            .addComponent(jLabel_close))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
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
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JPasswordField jPasswordField_1;
    private javax.swing.JPasswordField jPasswordField_2;
    private javax.swing.JTextField jTextField_Nickname;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
