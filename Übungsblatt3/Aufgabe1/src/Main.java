
public class Main {

	public static void main(String[] args) {
		Sheep S1 = new Sheep("Dolly", new Fur(10));

		System.out.println(S1.equals(S1));
		Sheep S2 = S1.deepclone();
		System.out.println(S1.equals(S2));
		System.out.println(S1.toString());
		System.out.println(S2.toString());

		S2.name = "Tolly";
		S2.shear();

		System.out.println(S1.equals(S2));

		System.out.println(S1.toString());
		System.out.println(S2.toString());

	}
	
	// interface Cloneable:
	// Implementierung:
	// http://beginnersbook.com/2015/01/cloneable-interface-in-java-object-cloning/
	// interview with a developer of java core features about the interface Cloneable:
	// http://www.artima.com/intv/bloch13.html

	// Warum Cloneable nicht empfohlen wird:
	// 1. Das Interface ist irrefuehrend, da es keine Methode clone enthaelt.
	// Normalerweise dienen Interfaces dazu, Objekte gleich behandeln zu koennen.
	// Dies wird durch dieses Interface nicht ermoeglicht.
	// 2. Es erzwingt das Behandlen der CloneNotSupported Exception.
	// 3. Es erlaubt Zugriff auf die Methode Object.clone, die einen shallow clone des
	// Objektes erzeugt. Dies wird als unsauber angesehen, da dies ein Weg ist ausserhalb
	// der Syntax der Sprache ein neues Objekt zur erstellen ('It's based on field copies,
	// and it's "extra-linguistic." It creates an object without calling a constructor.',
	// Josh Bloch, http://www.artima.com/intv/bloch13.html)
}
