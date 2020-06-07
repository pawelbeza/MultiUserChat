package test;

import Server.Server;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ServerTest {
    private Server server;

    ServerTest() {
        server = new Server();
    }

    /**
     * Testowanie metody addClient(), która dodaje nowych klientów do serwera
     * @throws IOException
     */
    @Test
    void addClient() throws IOException {
        assertArrayEquals(server.getUsernames(), new String[]{});
        String[] usernames = new String[]{"Bob", "Jacob", "Emma", "Sophia", "Lily", "William", "Emily", "Matthew"};

        for (int ind = 0; ind < usernames.length; ind++) {
            server.addClient(usernames[ind], null);
            String[] serverUsernames = server.getUsernames();
            Arrays.sort(serverUsernames);
            String[] arrayCmp = Arrays.copyOfRange(usernames, 0, ind + 1);
            Arrays.sort(arrayCmp);
            assertArrayEquals(serverUsernames, arrayCmp);
        }
    }

    /**
     * Testowanie metody isOnline(), która sprawdza czy klient o danej nazwie jest online
     */
    @Test
    void isOnline() {
        assertFalse(server.isOnline("Bob"));

        server.addClient("Bob", null);
        server.addClient("Sophie", null);
        assertTrue(server.isOnline("Bob"));
        assertTrue(server.isOnline("Sophie"));

        server.removeClient("Sophie");
        assertFalse(server.isOnline("Sophie"));
        assertTrue(server.isOnline("Bob"));

        server.removeClient("Bob");
        assertFalse(server.isOnline("Sophie"));
        assertFalse(server.isOnline("Bob"));
    }

    /**
     * Testowanie metody removeClient(), która usuwa klienta o danej nazwie z serwera
     */
    @Test
    void removeClient() {
        assertFalse(server.isOnline("Bob"));
        server.addClient("Bob", null);
        assertTrue(server.isOnline("Bob"));
        server.removeClient("Bob");
        assertFalse(server.isOnline("Bob"));
    }
}