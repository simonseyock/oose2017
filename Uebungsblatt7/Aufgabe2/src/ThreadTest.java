
public class ThreadTest {

	// 1. Erweitern der Klasse Thread
	// Vorteil: Methode start() kann ueberschrieben werden
	
	// 2. implementieren des Interface Runnable
	// Vorteil: Klasse kann von anderer Basisklasse als Thread erben
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new DateCommand());
		t1.start();
		Thread t2 = new Thread(new CounterCommand());
		t2.start();
	}

}