public class Main {

	public static void main(String[] args) {
		 Food food;
		 food = new Cauliflower();
		 System.out.println(food.getMeal());
		 
		 // Variable food wird mit einem Element aus Klasse Spaghetti ueberschrieben
		 // Das geht, da die Variable food vom Typ Food ist und Spaghetti ein
		 // von Food abgeleiteter Typ ist.
		 food = new Spaghetti(); 
		 System.out.println(food.getMeal());
		 food = new Pizza();
		 System.out.println(food.getMeal());
		 
		 Student student = new Student();
		 
		 // Da die Klasse Student mehrere Methoden mit dem Name eat hat,
		 // wird anhand der statischen Typen immer die spezifischste Methodensignatur ausgewaehlt.
		 // D.h. Zuerst wird ueberprueft, ob eine Signatur mit dem statischen Typen der uebergebenen
		 // Variable uebereinstimmt, wenn nicht, dann wird ueberprueft ob eine Signatur mit dem Typen
		 // der direkten Elternklasse uebereinstimmt, dann die Elternklasse davon usw.
		 
		 // statischer Typ Cauliflower, spezifischste Signatur ist void eat(Cauliflower)
		 Cauliflower essen1 = new Cauliflower();
		 student.eat(essen1);

		 // statischer Typ Spaghetti, spezifischste Signatur ist void eat(Food)
		 Spaghetti essen2 = new Spaghetti();
		 student.eat(essen2);

		 // statischer Typ Food, spezifischste Signatur ist void eat(Food)
		 Food essen = new Cauliflower();
		 student.eat(essen);
	}
}
