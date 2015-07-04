package lesson150611.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {

    public static void main(String[] args) {
        
        System.out.println("Started to listening on port 10001:");
        ExecutorService service = Executors.newCachedThreadPool();
        Chat chat = new Chat();

        service.execute(chat);
        
        try (ServerSocket serverSocket = new ServerSocket(10001)) {
            while (true) {
                Socket socket = serverSocket.accept();
                service.execute(new ChatClientHandler(service, chat, socket));
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
