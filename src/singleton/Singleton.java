package singleton;

public class Singleton {
	
	private static final Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("Singleton object has been created.");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}

}
