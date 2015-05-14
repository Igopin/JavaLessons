package lesson150423.patterns.visitor.commands;

import lesson150423.patterns.visitor.commands.server.Server;
import lesson150423.patterns.visitor.commands.shared.Command;

public class Chat {
    public static void main(String[] args) {
        Server server = new Server();
        
        server.recived(new Command.Login());
        server.recived(new Command.Message());
    }

}
