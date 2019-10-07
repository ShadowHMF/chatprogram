package kea.chatprogram.client;

public class MainClient {
    public static void main(String[] args) {

        ChatClient client = new ChatClient("Localhost", 8989); //Should correspond with the Server port
        client.execute();
    }
}
