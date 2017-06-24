package aufgabe1;

public class TestTrace {
	public static void main(String[] args) {
		CallEg eg = new CallEg(); // use default constructor
		try {
			eg.methodA();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
	}
}

//Programm gibt 4mal den gleichen Stacktrace aus.
//Ausgehend vom Fehler (Division durch Null in Zeile 24). 
//Der Fehler wird durch throw weitergegeben.