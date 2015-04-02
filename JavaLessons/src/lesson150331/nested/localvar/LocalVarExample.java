package lesson150331.nested.localvar;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LocalVarExample {

	public static void main(final String[] args) {
		
		System.out.println("Enter your name: ");
	    Scanner scanner = new Scanner(System.in);
		
	    final String name = scanner.nextLine();
//	    if (args.length == 0) {
//	    	System.out.println("Usage: give name as first parametrs!!!");
//	    	System.exit(0);
//	    }
	    
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	    
	    service.schedule(new Runnable() {
			@Override
			public void run() {
				System.out.println("hello!" + name);
			}
		}, 3, TimeUnit.SECONDS);
    }
}
