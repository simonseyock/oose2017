
public class Main {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); // error
		Singleton s = Singleton.getInstance();
		System.out.println(s == Singleton.getInstance());
		System.out.println(s.value);
		s.value = 12;
		System.out.println(Singleton.getInstance().value);
	}
}
