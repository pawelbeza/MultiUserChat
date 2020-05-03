/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import login_module.Chat_Form;

/**
 *
 * @author pawel
 */
public class Client {
    final static int serverPort = 6868;
    final private String username;
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;
    private final Socket socket;
    private final Scanner scanner;
    private final InetAddress ip;
    private final Chat_Form chat;
    private boolean isOnline = true;
    
    public Client(String username) throws IOException, UnknownHostException {
        this.username = username;
        scanner = new Scanner(System.in);
        chat = new Chat_Form(this, username);

        ip = InetAddress.getByName("localhost");
        socket = new Socket(ip, serverPort);
        
        inputStream = new DataInputStream(socket.getInputStream());
        outputStream = new DataOutputStream(socket.getOutputStream());        
        sendMsg("login#" + username);        
        reader();
        
        // show a new form
        chat.setVisible(true);
        chat.pack();
        chat.setLocationRelativeTo(null);
        
    }
    
    public void sendMsg(String msg) throws IOException {
        outputStream.writeUTF(msg);    
    }
    
    public void reader() {
        /* thread reading messages sent by server */
        new Thread(() -> {
            while (isOnline) {
                try {
                    String receivedInput = inputStream.readUTF();
                    String[] input = receivedInput.split("#");
                    
                    if (input.length >= 2 && input[0].equals("updateUIList")) {
                        String[] usersArr = Arrays.copyOfRange(input, 1, input.length);
                        chat.updateUserList(usersArr);
                    }
                    else if (input.length == 3 && input[0].equals("message")) {
                        chat.receivedMsg(input[1], input[2]);
                    }                    
                } catch (IOException e) {
                    break;
                }
            } 
        }).start();
    }
    
    public void logout() throws IOException {
        isOnline = false;
        sendMsg("logout");
        inputStream.close(); 
        outputStream.close(); 
    }
}
