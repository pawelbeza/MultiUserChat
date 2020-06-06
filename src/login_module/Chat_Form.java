/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_module;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import Client.Client;
import java.awt.Color;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Chat_form</h1>
 * Tworzy główne okno programu, czyli chat.
 * @author Arkadiusz Dawid
 */
public class Chat_Form extends javax.swing.JFrame {
    private final String username;
    private final Client client;
    /**
     * Creates new form Chat_Form
     * @param client klient
     * @param username nazwa użytkownika
     */
    public Chat_Form(Client client, String username) {
        initComponents();
        
        this.client = client;
        this.username = username;
        nickname.setText("Your nickname: " + username);
    }

    /*
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Paweł Bęza
    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        yourConvLabel = new JLabel();
        jPanel5 = new JPanel();
        onlineUsersText = new JLabel();
        jPanel7 = new JPanel();
        jScrollPane2 = new JScrollPane();
        conversationBox = new JTextArea();
        jPanel8 = new JPanel();
        jScrollPane1 = new JScrollPane();
        onlineUsersList = new JList<>();
        jButton1 = new JButton();
        jPanel9 = new JPanel();
        messageBox = new JTextField();
        jPanel6 = new JPanel();
        nickname = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                formWindowClosing(e);
            }
        });
        var contentPane = getContentPane();

        //======== jPanel1 ========
        {
            jPanel1.setBackground(Color.white);
            jPanel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
            javax.swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax
            .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
            .awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),jPanel1. getBorder()));jPanel1. addPropertyChangeListener(new java.beans.
            PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".
            equals(e.getPropertyName()))throw new RuntimeException();}});

            //======== jPanel2 ========
            {
                jPanel2.setBackground(new Color(153, 153, 255));

                //---- jLabel1 ----
                jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 36));
                jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel1.setText("C H A T");

                //======== jPanel3 ========
                {
                    jPanel3.setBackground(new Color(204, 204, 255));

                    //======== jPanel4 ========
                    {
                        jPanel4.setBackground(new Color(245, 245, 255));

                        //---- yourConvLabel ----
                        yourConvLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
                        yourConvLabel.setHorizontalAlignment(SwingConstants.CENTER);
                        yourConvLabel.setText("Your conversation");

                        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
                        jPanel4.setLayout(jPanel4Layout);
                        jPanel4Layout.setHorizontalGroup(
                            jPanel4Layout.createParallelGroup()
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(yourConvLabel, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                        jPanel4Layout.setVerticalGroup(
                            jPanel4Layout.createParallelGroup()
                                .addComponent(yourConvLabel, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        );
                    }

                    //======== jPanel5 ========
                    {
                        jPanel5.setBackground(new Color(245, 245, 255));

                        //---- onlineUsersText ----
                        onlineUsersText.setFont(new Font("Tahoma", Font.PLAIN, 18));
                        onlineUsersText.setHorizontalAlignment(SwingConstants.CENTER);
                        onlineUsersText.setText("Online users");
                        onlineUsersText.setAutoscrolls(true);
                        onlineUsersText.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

                        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
                        jPanel5.setLayout(jPanel5Layout);
                        jPanel5Layout.setHorizontalGroup(
                            jPanel5Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(onlineUsersText, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                        jPanel5Layout.setVerticalGroup(
                            jPanel5Layout.createParallelGroup()
                                .addComponent(onlineUsersText, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        );
                    }

                    //======== jPanel7 ========
                    {
                        jPanel7.setBackground(Color.white);

                        //======== jScrollPane2 ========
                        {

                            //---- conversationBox ----
                            conversationBox.setEditable(false);
                            conversationBox.setColumns(20);
                            conversationBox.setRows(5);
                            conversationBox.setWrapStyleWord(true);
                            jScrollPane2.setViewportView(conversationBox);
                        }

                        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
                        jPanel7.setLayout(jPanel7Layout);
                        jPanel7Layout.setHorizontalGroup(
                            jPanel7Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane2)
                                    .addContainerGap())
                        );
                        jPanel7Layout.setVerticalGroup(
                            jPanel7Layout.createParallelGroup()
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane2)
                                    .addContainerGap())
                        );
                    }

                    //======== jPanel8 ========
                    {
                        jPanel8.setBackground(Color.white);

                        //======== jScrollPane1 ========
                        {

                            //---- onlineUsersList ----
                            onlineUsersList.setFont(new Font("Tahoma", Font.PLAIN, 14));
                            onlineUsersList.setModel(new AbstractListModel<String>() {
                                String[] values = {
                                    "Item 1",
                                    "Item 2",
                                    "Item 3",
                                    "Item 4",
                                    "Item 5"
                                };
                                @Override
                                public int getSize() { return values.length; }
                                @Override
                                public String getElementAt(int i) { return values[i]; }
                            });
                            jScrollPane1.setViewportView(onlineUsersList);
                        }

                        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
                        jPanel8.setLayout(jPanel8Layout);
                        jPanel8Layout.setHorizontalGroup(
                            jPanel8Layout.createParallelGroup()
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1)
                                    .addContainerGap())
                        );
                        jPanel8Layout.setVerticalGroup(
                            jPanel8Layout.createParallelGroup()
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }

                    //---- jButton1 ----
                    jButton1.setBackground(new Color(61, 61, 255));
                    jButton1.setFont(new Font("Verdana", Font.PLAIN, 24));
                    jButton1.setText("SEND");
                    jButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    jButton1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            jButton1MouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            jButton1MouseExited(e);
                        }
                    });
                    jButton1.addActionListener(e -> jButton1ActionPerformed(e));

                    //======== jPanel9 ========
                    {

                        //---- messageBox ----
                        messageBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        messageBox.setForeground(new Color(153, 153, 153));
                        messageBox.setText("Write here");
                        messageBox.addFocusListener(new FocusAdapter() {
                            @Override
                            public void focusGained(FocusEvent e) {
                                messageBoxFocusGained(e);
                            }
                            @Override
                            public void focusLost(FocusEvent e) {
                                messageBoxFocusLost(e);
                            }
                        });
                        messageBox.addActionListener(e -> messageBoxActionPerformed(e));

                        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
                        jPanel9.setLayout(jPanel9Layout);
                        jPanel9Layout.setHorizontalGroup(
                            jPanel9Layout.createParallelGroup()
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(messageBox)
                                    .addContainerGap())
                        );
                        jPanel9Layout.setVerticalGroup(
                            jPanel9Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(messageBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                        );
                    }

                    GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                    jPanel3.setLayout(jPanel3Layout);
                    jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                    );
                    jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup()
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup()
                                    .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                //======== jPanel6 ========
                {
                    jPanel6.setBackground(new Color(133, 133, 255));

                    //---- nickname ----
                    nickname.setFont(new Font("Tahoma", Font.PLAIN, 18));
                    nickname.setHorizontalAlignment(SwingConstants.CENTER);
                    nickname.setText("Your nickname:");

                    GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
                    jPanel6.setLayout(jPanel6Layout);
                    jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup()
                            .addComponent(nickname, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                    jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup()
                            .addComponent(nickname, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    );
                }

                GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup()
                        .addComponent(jLabel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup()
                                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup()
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Aktualizacja listy użytkowników
     * @param users tablica użytkowników
     */
    public void updateUserList(String[] users) {
        onlineUsersList.setListData(users);
    }
            
    private void messageBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageBoxActionPerformed
    
    /**
     * Po kliknięciu w przycisk <b>SEND</b> rozsyłana jest wiadomość
     * @param evt zdarzenie kliknięcia w przycisk
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String msgText = messageBox.getText();
        messageBox.setText("");
        
        List<String> selectedReceivers = onlineUsersList.getSelectedValuesList(); 
        String receivers = String.join("#", selectedReceivers);
        String msg = "message#" + msgText + "#" + receivers;
        try {
            client.sendMsg(msg);
        } catch (IOException ex) {
            Logger.getLogger(Chat_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Zamyka okno chatu, wylogowuje użytkownika
     * @param evt zdarzenie zamknięcia okna chatu
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            client.logout();
        } catch (IOException ex) {
            Logger.getLogger(Chat_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowClosing

    /** 
     * Zmienia kolor przycisku <b>SEND</b> po najechaniu myszką
     * @param evt zdarzenie najechania myszką na przycisk
     */
    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(31,31,255));
    }//GEN-LAST:event_jButton1MouseEntered

    /**
     * Przywraca kolor przycisku <b>SEND</b> po odsunięciu myszki
     * @param evt zdarzenie odsunięcia myszki od przycisku
     */
    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(61,61,255));
    }//GEN-LAST:event_jButton1MouseExited

    /**
     * Usuwa placeholder "write here" i zmienia kolor czcionki z szarego na czarny
     * @param evt zdarzenie uzyskania "focusu" przez pole do wpisywania nowej wiadomości
     */
    private void messageBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_messageBoxFocusGained
        if(messageBox.getText().trim().toLowerCase().equals("write here")){
            messageBox.setText("");
            messageBox.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_messageBoxFocusGained

    /**
     * Przywraca placeholder "write here" i kolor czcionki na szary, jeśli użytkownik nic nie wpisał
     * @param evt zdarzenie utracenia "focusu" przez pole do wpisywania nowej wiadomości 
     */
    private void messageBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_messageBoxFocusLost
        if(messageBox.getText().trim().equals("")){
            messageBox.setText("Write here");
            messageBox.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_messageBoxFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Paweł Bęza
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel jLabel1;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JLabel yourConvLabel;
    private JPanel jPanel5;
    private JLabel onlineUsersText;
    private JPanel jPanel7;
    private JScrollPane jScrollPane2;
    private JTextArea conversationBox;
    private JPanel jPanel8;
    private JScrollPane jScrollPane1;
    private JList<String> onlineUsersList;
    private JButton jButton1;
    private JPanel jPanel9;
    private JTextField messageBox;
    private JPanel jPanel6;
    private JLabel nickname;
    // End of variables declaration//GEN-END:variables

    /**
     * Uaktualnia okienko chatu o nową wiadomość
     * @param author nick nadawcy wiadomości
     * @param msg treść wiadomości
     */
    public void receivedMsg(String author, String msg) {
        conversationBox.append("New message from: " + author + "\n" + msg + "\n");
    }
}
