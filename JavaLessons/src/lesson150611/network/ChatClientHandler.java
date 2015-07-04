package lesson150611.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ChatClientHandler implements Runnable {
    
    private static Random random = new Random();
    
    private static ExecutorService sender = Executors.newCachedThreadPool();

    private Socket _socket;
    private PrintStream _ps;
    private String _name;
    private Chat _chat ;

    private int _delay;

    private ExecutorService _sender;
    
    public ChatClientHandler(ExecutorService sender, final Chat chat, final Socket socket) {
        _sender = sender;
        _chat = chat;
        _socket = socket;
        _delay = random.nextInt(5000);
    }

    @Override
    public void run() {
        _chat.addClient(this);
        try {
            _ps = new PrintStream(_socket.getOutputStream());
            _ps.print("Enter your name: ");
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            return;
        }
        
        try(Scanner scanner = new Scanner(_socket.getInputStream())) {
            _name = scanner.nextLine();

            _ps.print("Welcome, " + _name + "!");
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                process(nextLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void process(String message) {
        
        
        if (message.equals("!bye")) {
            try {
                _chat.broadcast(_name + ">" + "Bye-bye!");
                _socket.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return;
        }
        _chat.broadcast(_name + ">" + message);
    }

    public void send(final String message) {

        sender.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(_delay);
                } catch (InterruptedException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                _ps.println(message);
            }
        });
    }
    
}