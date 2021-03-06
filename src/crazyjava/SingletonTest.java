package crazyjava;


class Singleton{
	
	private static Singleton instance;
	public Singleton() {
	}
	public static Singleton getInstance() {
		synchronized (instance) {
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
		
	}
	
}


public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
	}

}
