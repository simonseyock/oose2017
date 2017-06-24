package aufgabe1;

public class Main {

	public static void main(String[] args) {
		List<Double> liste = new List<Double>(); // <-- Erzeugen einer Liste, die Doubles speichert
		liste.add(1.123);
		liste.add(11.23);
		System.out.println(liste.toString());
		for (Double val: liste) { // <-- Ist moeglich durch Implementierung des Iterable Interface
			System.out.println(val / 100);	
		}
	}

}
