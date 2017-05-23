public class Praktikant extends Angestellter {

	public Praktikant(String vorname, String nachname, int alter) {
		super(vorname, nachname, alter, 400);
	}

	public void increaseSalary(int amount) {
		throw new UnsupportedOperationException("The Salary can't be changed!");
	}

}
