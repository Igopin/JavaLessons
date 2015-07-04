package lesson150611.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TimeServerClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("time-A.timefreq.bldrdoc.gov", 13);
            Scanner scanner = new Scanner(socket.getInputStream());
            
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
