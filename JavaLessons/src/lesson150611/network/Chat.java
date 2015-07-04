package lesson150611.network;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Chat implements Runnable {

    List<ChatClientHandler> clients = new LinkedList<>();

    BlockingQueue<String> _messages = new LinkedBlockingQueue<>();

    public void addClient(final ChatClientHandler handeler) {
        clients.add(handeler);
    }

    public void removeClient(final ChatClientHandler handeler) {
        clients.remove(handeler);
    }

    public void broadcast(final String message) {
        try {
            _messages.put(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            String message;
            try {
                message = _messages.take();
                for (ChatClientHandler chatClientHandler : clients) {
                    chatClientHandler.send(message);
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
