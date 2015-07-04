package lesson150611.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {

    private static class SocketHandler implements Runnable {

        private Socket _socket;
        private PrintStream _ps;

        public SocketHandler(final Socket socket) {
            _socket = socket;
        }

        @Override
        public void run() {
            try {
                _ps = new PrintStream(_socket.getOutputStream());
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
                return;
            }
            
            try(Scanner scanner = new Scanner(_socket.getInputStream())) {

                while (scanner.hasNextLine()) {
                    String nextLine = scanner.nextLine();
                    process(nextLine);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void process(String nextLine) {
            _ps.println(nextLine);
        }
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Started to listening on port 10000:");
        ExecutorService service = Executors.newCachedThreadPool();
        try (ServerSocket serverSocket = new ServerSocket(10000)) {

            while (true) {
                Socket socket = serverSocket.accept();
                service.execute(new SocketHandler(socket));
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
