package lesson150316;

public class DatabaseConnection {
	
	private static final int MAX_CONNECTIONS = 3;
	private static int Counter = 0;
	
	{
		Counter++;
	}
	
	
	public static DatabaseConnection create() {
		if (Counter >= MAX_CONNECTIONS) {
			return null;
		}
	    return new DatabaseConnection();
    }

	
	public DatabaseConnection() {
		
	}
	
	static public void free_any() {
		Counter--;
    }

	public void free() {
		Counter--;
    }
	
}
