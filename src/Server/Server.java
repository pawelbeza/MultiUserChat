package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {

    private static HashMap<String, ClientHandler> clientHandlers = new HashMap<>();

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6868);
        /* Server listening to the port 6868 waiting for the request */
        while (true) {
            Socket socket = serverSocket.accept();
            
            ClientHandler clientHandler = new ClientHandler(socket);
            new Thread(clientHandler).start();
        }
    }
    
    public static String[] getUsernames() {
        return clientHandlers.keySet().toArray(new String[0]);
    }
    
    public static void addClient(String username, ClientHandler handler) {
        clientHandlers.put(username, handler);
    }
    
    public static ClientHandler[] getClientHandlers() {
        return clientHandlers.values().toArray(new ClientHandler[0]);
    }

    public static ClientHandler getClientHandler(String username) {
        return clientHandlers.get(username);
    }
    
    public static boolean isOnline(String username) {
        return clientHandlers.containsKey(username);
    }
    
    public static void removeClient(String username) {
        clientHandlers.remove(username);
    }
}
