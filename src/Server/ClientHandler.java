package Server;

import login_module.Login_Form;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientHandler implements Runnable {
    private final Socket socket;
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;
    private String username;

    public ClientHandler(Socket socket) throws IOException {
        this.socket = socket;
        inputStream = new DataInputStream(socket.getInputStream());
        outputStream = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        while (true) {
            try {
                String receivedInput = inputStream.readUTF();
                String[] input = receivedInput.split("#");
                                
                if (input.length == 1 && input[0].equals("logout")) {           
                    Server.removeClient(username);
                    updateUIList();
                    socket.close();
                    break;
                }
                else if (input.length == 2 && input[0].equals("login")) {
                    username = input[1];
                    Server.addClient(username, this);
                    updateUIList();
                }
                else if (input.length > 2 && input[0].equals("message")) {
                    String[] receivers = Arrays.copyOfRange(input, 2, input.length);
                    sendMsg(receivers, "message#" + username + "#" + input[1]);
                }
                
            } catch (IOException e) {
                e.printStackTrace();
            }           
        }
        try
        { 
            inputStream.close(); 
            outputStream.close(); 
        } catch(IOException e){ 
            e.printStackTrace(); 
        } 
    }
    
    private void writeOutputStream(String msg) throws IOException {
        outputStream.writeUTF(msg);
    }
    
    private void updateUIList() throws IOException {
        String msg = "updateUIList#" + String.join("#", Server.getUsernames());
        for (ClientHandler handler : Server.getClientHandlers())
            handler.writeOutputStream(msg);
    }

    private void sendMsg(String[] receivers, String msg) throws IOException {
        for (String user : receivers)
            if (Server.isOnline(user))
                Server.getClientHandler(user).writeOutputStream(msg);
    }
}
