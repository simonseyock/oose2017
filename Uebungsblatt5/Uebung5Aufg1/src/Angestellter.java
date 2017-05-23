public class Angestellter {
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	
	public Angestellter(String vorname, String nachname, int alter, int gehalt){
		this.vorname=vorname;
		this.nachname=nachname;
		this.alter=alter;
		this.gehalt=gehalt;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getAlter() {
		return alter;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void age() {
		alter++;
	}

	public void increaseSalary(int amount) {
		gehalt += amount;
	}
}
