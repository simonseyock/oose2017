
public class Singleton {
	private static Singleton instance;
	
	public int value;
	
	private Singleton() {
		value = 17;
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
