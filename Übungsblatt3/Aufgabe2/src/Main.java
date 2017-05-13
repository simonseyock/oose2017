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
	}
}
