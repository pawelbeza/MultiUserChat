/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import GUI_Forms.ChatForm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Client czyta oraz wysyła wiadomości do innych użytkowników
 *
 * @author pawel
 */
public class Client {
    final static int serverPort = 6868;
    final private String username;
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;
    private final Socket socket;
    private final InetAddress ip;
    private final ChatForm chat;
    private boolean isOnline = true;
    private String receivedInput;

    /**
     * Inicjalizowanie socketów, strumieni I/O oraz GUI
     *
     * @param username nazwa użytkownika
     * @throws IOException          wyrzuca wyjątek jeśli metoda socketa wyrzuci wyjątek
     * @throws UnknownHostException wyrzuca wyjątek jeśli metoda listen wyrzuci wyjątek
     */
    public Client(String username) throws IOException {
        this(username, true);
    }

    /**
     * @return ostatnią wiadomość otrzymaną przez klienta
     */
    public String getLastReceivedMsg() {
        return receivedInput;
    }

    /**
     * Inicjalizowanie socketów oraz strumieni z opcjonalnym włączeniem GUI
     *
     * @param username nazwa użytkownika
     * @throws IOException          wyrzuca wyjątek jeśli metoda socketa wyrzuci wyjątek
     * @throws UnknownHostException wyrzuca wyjątek jeśli metoda listen wyrzuci wyjątek
     */
    public Client(String username, boolean enableGUI) throws IOException {
        this.username = username;
        chat = new ChatForm(this, username);

        ip = InetAddress.getByName("localhost");
        socket = new Socket(ip, serverPort);

        inputStream = new DataInputStream(socket.getInputStream());
        outputStream = new DataOutputStream(socket.getOutputStream());
        sendMsg("login#" + username);
        reader();

        if (enableGUI) {
            // show a new form
            chat.setVisible(true);
            chat.pack();
            chat.setLocationRelativeTo(null);
        }
    }

    /**
     * Zapisuje wiadomość do strumienia wyjściowego
     *
     * @param msg treść wiadomości
     * @throws IOException wyrzuca wyjątek jeśli metoda strumienia wyrzuci wyjątek
     */
    public void sendMsg(String msg) throws IOException {
        outputStream.writeUTF(msg);
    }

    /**
     * Czyta wiadomości dostarczane do użytkownika
     */
    public void reader() {
        /* thread reading messages sent by server */
        new Thread(() -> {
            while (isOnline) {
                try {
                    receivedInput = inputStream.readUTF();
                    String[] input = receivedInput.split("#");

                    if (input.length >= 2 && input[0].equals("updateUIList")) {
                        String[] usersArr = Arrays.copyOfRange(input, 1, input.length);
                        chat.updateUserList(usersArr);
                    } else if (input.length == 3 && input[0].equals("message")) {
                        chat.receivedMsg(input[1], input[2]);
                    }
                } catch (IOException e) {
                    break;
                }
            }
        }).start();
    }

    /**
     * Wylogowuje użytkownika tj. zamyka wszystkie strumienie i wysyła wiadomość
     * do serwera, że użytkownik jest offline
     *
     * @throws IOException wyrzuca wyjątek jeśli metoda strumienia wyrzuci wyjątek
     */
    public void logout() throws IOException {
        isOnline = false;
        sendMsg("logout");
        inputStream.close();
        outputStream.close();
    }
}
