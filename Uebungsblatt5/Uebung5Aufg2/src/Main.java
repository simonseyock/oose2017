
public class Main {

	public static void main(String[] args) {
		Auto auto1 = new Lastwagen();
//		System.out.println(auto1.reifen); // Ausgabe 1: 4, wählt Eigenschaft Reifen vom statischen Typ Auto
//		System.out.println(((Lastwagen) auto1).reifen);  // Ausgabe 2: 8, statischer Typ von auto1 durch cast zu Lastwagen geändert (Überdeckung)
//		System.out.println(auto1.getReifen()); // Ausgabe 3: 8, Methode getReifen in Lastwagen wird überschrieben. Methodenauswahl hängt vom dynamischen Typ ab.
//		System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4: 8, wie in 3 und dynamischer Typ verändert sich nicht

//		System.out.println(auto1.reifen); // Ausgabe 1: 4, wählt Eigenschaft Reifen vom statischen Typ Auto
//		System.out.println(((Lastwagen) auto1).reifen);  // Ausgabe 2: 8, statischer Typ von auto1 durch cast zu Lastwagen geändert (Überdeckung)
//		System.out.println(auto1.getReifen()); // Ausgabe 3: 4, Methode getReifen aus Auto greift auf reifen aus Auto zu
//		System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4: 4, getReifen nicht mehr in Lastwage, greift auf Methode in Elternklasse Auto und dann wie in 3)

		System.out.println(auto1.reifen); // Ausgabe 1: 4, wählt Eigenschaft Reifen vom statischen Typ Auto
		System.out.println(((Lastwagen) auto1).reifen);  // Ausgabe 2: 8, statischer Typ von auto1 durch cast zu Lastwagen geändert (Überdeckung)
//		System.out.println(auto1.getReifen()); // Ausgabe 3: Compilerfehler, statischer Typ Auto hat keine Methode getReifen
		System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4: 8, statischer Typ Lastwagen hat getReifen

	}

}
