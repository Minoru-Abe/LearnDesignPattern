package singleton;

public class SingletonMain {
	
	public static void main (String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1==singleton2) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
