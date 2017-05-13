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

public class Sheep {
	public String name;
	public Fur fur;

	public Sheep(String name, Fur fur) {
		this.name = name;
		this.fur = fur;
	}

	public void shear() {
		fur.length = 0;
	}

	public String toString() {
		return "Name: " + name + " " + fur.toString();
	}
	
	public boolean equals(Object o){
		if (o instanceof Sheep){
			Sheep s = (Sheep)o;
			return s.name.equals(name) && s.fur.equals(fur);
		}
		return false;
	}
	
	public Sheep shallowclone() {
		return new Sheep(name, fur);
	}
	
	public Sheep deepclone(){
		Fur newFur = fur.clone();
		String newname = name;
		return new Sheep(newname, newFur);
	}
}