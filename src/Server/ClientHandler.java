package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;

/**
 * ClientHandler przetwarza zapytania klienta
 * @author pawel
 */
public class ClientHandler implements Runnable {
    private final Socket socket;
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;
    private String username;

    /**
     * Zainicjalizowanie socketa oraz strumieni wejściowych i wyjściowych
     * @param socket zainicjalizowanie punktu końcowego dla serwera i klienta
     * @throws IOException wyrzuca wyjątkiem jeśli metoda listen wyrzuci wyjątek
     */
    public ClientHandler(Socket socket) throws IOException {
        this.socket = socket;
        inputStream = new DataInputStream(socket.getInputStream());
        outputStream = new DataOutputStream(socket.getOutputStream());
    }

    /**
     * Obsługa zapytań klienta
     */
    @Override
    public void run() {
        while (true) {
            try {
                String receivedInput = inputStream.readUTF();
                String[] input = receivedInput.split("#");
                                
                if (input.length == 1 && input[0].equals("logout")) {           
                    break;
                }
                else if (input.length == 2 && input[0].equals("login")) {
                    username = input[1];
                    login();
                }
                else if (input.length > 2 && input[0].equals("message")) {
                    String[] receivers = Arrays.copyOfRange(input, 2, input.length);
                    sendMsg(receivers, "message#" + username + "#" + input[1]);
                }
                
            } catch (IOException e) {
                break;
            }           
        }
        try
        {
            logout();
            socket.close();            
            inputStream.close(); 
            outputStream.close();
        } catch(IOException e) {            
        } 
    }
    
    /**
     * Wylogowanie klienta - usunięcie klienta z HashMapy klientów oraz wysłanie
     * wiadomośi do innych klinetów będących online, aby zaktualizować GUI
     * @throws IOException 
     */
    private void logout() throws IOException {
        Server.removeClient(username);
        updateUIList();
    }
    
    /**
     * Zalogowanie klienta - dodanie klienta do HashMapy klientów oraz wysłanie
     * wiadomości do innych klientów będących online, aby zaktualizować GUI
     * @throws IOException 
     */
    private void login() throws IOException {
        Server.addClient(username, this);
        updateUIList();
    }
    
    /**
     * Pisanie wiadomości <b>msg</b> do strumienia wyjściowego
     * @param msg
     * @throws IOException 
     */
    private void writeOutputStream(String msg) throws IOException {
        outputStream.writeUTF(msg);
    }
    
    /**
     * Wysłanie wiadomości do wszystkich klientów będących online, aby
     * zaktualizować GUI
     * @throws IOException 
     */
    private void updateUIList() throws IOException {
        String msg = "updateUIList#" + String.join("#", Server.getUsernames());
        for (ClientHandler handler : Server.getClientHandlers())
            handler.writeOutputStream(msg);
    }

    /**
     * Wysłanie wiadomości <b>msg></b> do wszystkich klientów z tablicy
     * <b>receivers</b>
     * @param receivers
     * @param msg
     * @throws IOException 
     */
    private void sendMsg(String[] receivers, String msg) throws IOException {
        for (String user : receivers)
            if (Server.isOnline(user))
                Server.getClientHandler(user).writeOutputStream(msg);
    }
}
