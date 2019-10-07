package kea.chatprogram.server;

public class MainServer {

    public static void main(String[] args) {

        ChatServer server = new ChatServer(8989); //Any unreserved port here should be sufficient.
        server.execute();
    }
}
