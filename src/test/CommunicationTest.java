package test;

import Client.Client;
import Server.Server;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommunicationTest {
    Server server;
    Client clientBob, clientLilly, clientWilliam;

    CommunicationTest() throws IOException {
        server = new Server();
        (new Thread(() -> {
            try {
                server.listen();
            } catch (IOException ignored) {
            }
        })).start();
        clientBob = new Client("Bob", false);
        clientLilly = new Client("Lilly", false);
        clientWilliam = new Client("William", false);
    }

    /**
     * Testowanie wysyłania wiadomości między klientami
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    void sendMsg() throws IOException, InterruptedException {
        clientBob.sendMsg("message#Hello#Lilly");
        Thread.sleep(10);
        assertEquals("message#Bob#Hello", clientLilly.getLastReceivedMsg());

        clientLilly.sendMsg("message#Hi What's up?#Bob");
        Thread.sleep(10);
        assertEquals("message#Lilly#Hi What's up?", clientBob.getLastReceivedMsg());

        clientLilly.sendMsg("message#Hey#Bob#William");
        Thread.sleep(10);
        assertEquals("message#Lilly#Hey", clientBob.getLastReceivedMsg());
        assertEquals("message#Lilly#Hey", clientWilliam.getLastReceivedMsg());
    }

    /**
     * Testowanie wylogowywania użytkownika i testowanie czy odpowiednia informacja zostanie wysłana na pozostałych
     * klientów będących online
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    void logout() throws IOException, InterruptedException {
        clientBob.logout();
        Thread.sleep(10);
        assertEquals("updateUIList#Lilly#William", clientLilly.getLastReceivedMsg());
        assertEquals("updateUIList#Lilly#William", clientWilliam.getLastReceivedMsg());

        clientLilly.logout();
        Thread.sleep(10);
        assertEquals("updateUIList#William", clientWilliam.getLastReceivedMsg());
    }


}
