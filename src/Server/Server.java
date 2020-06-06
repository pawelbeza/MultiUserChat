package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * <h1> klasa Server </h1>
 * Serwer obsługujący zapytania klientów
 * @author pawel
 */
public class Server {
    /**
     * HashMapa przechowuje informacje o aktualnie zalogowanych klientach i
     * przyporządkowanych do nich klientach. Umożliwia ona dostępność w czasie
     * stałym do dowolnego z wątków, którym będziemy przekazywali wiadomości 
     * od serwera
     */
    private static HashMap<String, ClientHandler> clientHandlers = new HashMap<>();

    /**
     * Nasłuchuje na porcie 6868 oczekując na zapytania od nowych klientów
     * Każdy nowy klient otrzymuje osobny wątek, który będzie obsługiwał
     * jego zapytania
     * @throws IOException wyrzuca wyjątkiem jeśli metoda socketa wyrzuci wyjątek
     */
    @SuppressWarnings("InfiniteLoopStatement")
    public void listen() throws IOException {
        ServerSocket serverSocket = new ServerSocket(6868);

        while (true) {
            Socket socket = serverSocket.accept();
            
            ClientHandler clientHandler = new ClientHandler(this, socket);
            new Thread(clientHandler).start();
        }
    }
    
    /**
     * Zwraca tablicę nazw wszystkich użytkowników, którzy aktualnie są online
     * @return tablica nazw użytkowników, którzy aktualnie są online
     */
    public String[] getUsernames() {
        return clientHandlers.keySet().toArray(new String[0]);
    }
    
    /**
     * Dodaje nowego użytkonwika oraz obsługujący go wątek do HashMapy
     * @param username nazwa użytkownika
     * @param handler wątek obsługujący zapytania użytkownika
     */
    public void addClient(String username, ClientHandler handler) {
        clientHandlers.put(username, handler);
    }
    
    /**
     * Zwraca tablicę wszystkich wątków, które obsługują użytkowników będących
     * akutalnie online
     * @return tablica wątków obsługujących zapytania użytkownika
     */
    public ClientHandler[] getClientHandlers() {
        return clientHandlers.values().toArray(new ClientHandler[0]);
    }

    /**
     * Zwraca w czasie stałym wątek, który jest przyporządkowany do użytkownika
     * o nazwie <b>username</b>
     * @param username nazwa użytkownika
     * @return wątek przyporządkowany do użytkownika
     */ 
    public ClientHandler getClientHandler(String username) {
        return clientHandlers.get(username);
    }
    
    /**
     * Zwraca informacje o tym czy użytkownik o nazwie <b>username</b> jest
     * aktualnie online
     * @param username nazwa użytkownika
     * @return wartość logiczna mówiąca czy użytkownik o podanej nazwie jest online
     */
    public boolean isOnline(String username) {
        return clientHandlers.containsKey(username);
    }
    
    /**
     * Usuwa użytkownika wraz z przyporządkowanym do niego obiektem klasy
     * ClientHandler z HashMapy
     * @param username nazwa użytkownika
     */
    public void removeClient(String username) {
        clientHandlers.remove(username);
    }
}
