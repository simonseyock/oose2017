package aufgabe2;

import java.util.LinkedList;
import java.util.Queue;

public class Konto {

	private double kontostand;
	private int kontonummer;
	private String besitzer;
	
	private Queue<Double> protokoll = new LinkedList<Double>();

	public Konto(double kontostand, int kontonummer, String besitzer) {
		super();
		this.kontostand = kontostand;
		this.kontonummer = kontonummer;
		this.besitzer = besitzer;
	}

	public void aendereKontostand(double amount) {
		if (kontostand + amount < 0) {
			System.out.println("Auszahlung wird verweigert");
		} else {
			kontostand += amount;
			protokoll.add(amount);
		}
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Besitzer: " + besitzer + "\n");
		builder.append("Kontonummer: " + kontonummer + "\n");
		builder.append("Kontoaenderungen: " + "\n");
		for (double amount: protokoll) {
			builder.append("  " + amount + "\n");
		}			
		builder.append("Kontostand: " + kontostand + "\n");
		return builder.toString();
	}
	
	public void kontoauszug(){
		System.out.println(toString());
		protokoll.clear();
	}

	public double getKontostand() {
		return kontostand;
	}

}
