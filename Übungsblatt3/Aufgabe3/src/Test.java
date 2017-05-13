public class Test {
	public static void main(String[] args) {
		C1 a = new C2();
		C2 b = new C2();

		((C2) a).f1();
		// Ausgabe: C2::f1
		// In a ist eine Instanz von C2 gespeichert. Da f ein (nicht-statische bzw.)
		// Instanzmethode ist, ist diese an die Instanz gebunden.
		// Da die Klasse C2 die Methode f1 von C1 ueberschreibt, wird diese
		// ausgefuehrt (dynamisches Binden)

		((C1) b).f1();
		// Ausgabe: C2::f1
		// In b ist eine Instanz von C2 gespeichert. Argumentation wie oben.

		System.out.println(a.s);
		// Ausgabe: 1
		// Da s eine statische Eigenschaft ist, ist diese an den Typ der Variable
		// von a gebunden. Dieser ist C1.
		// Um Verwirrungen zu vermeiden ist es besser auf statische Eigenschaften 
		// ueber den Typ zuzugreifen. i.e.:
		// System.out.println(C1.s);

		b.f1();
		// Ausgabe: C2::f1
		// Da die Klasse C2 die Methode f1 von C1 ueberschreibt, wird diese
		// ausgefuehrt.
		
		b.f2();
		// Ausgabe: C1::f2
		// Da die Klasse C2 die Methode f2 von C1 nicht ueberschreibt, wird die
		// Methode f2 der Elternklasse ausgefuehrt.
		
		b.f3();
		// Ausgabe: C2::f3

		// C1 c = new C1(); c.f3();
		// Ausgabe: java.lang.Error --> Method f3() is undefined for the type C1
		// Die Methode f3 ist im Typ C1 nicht implementiert
		
		// C1 c = new C1(); ((C2) c).f1();
		// Ausgabe: java.lang.ClassCastException --> C1 cannot be cast to C2
		// Eine Elternklasse kann nicht in einen Subtyp gecastet werden.
		// Andersherum funktioniert es automatisch.
		// Der Compiler merkt den Fehler noch nicht, da ja in einer Variable
		// vom Typ der Elternklasse auch eine Instanz der Subklasse gespeichert werden
		// kann - diese koennte gecastet werden.
	}
}
