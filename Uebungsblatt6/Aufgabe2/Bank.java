package aufgabe2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Bank {

	private HashSet<Konto> konten = new HashSet();
	private double ruecklage = 10000000;
	private Queue<Double> investments = new LinkedList();
	private Queue<Double> changes = new LinkedList();

	public void newKonto(double ks, int knr, String name) {
		konten.add(new Konto(ks, knr, name));
	}

	public void addKonto(Konto k) {
		konten.add(k);
	}

	public void removeKonto(Konto k) {
		konten.remove(k);
	}
	
	public void transferKontoTo(Konto k, Bank b) {
		removeKonto(k);
		b.addKonto(k);
	}

	public double gesamtBetrag() {
		double gesamt = 0;
		for (Konto k : konten) {
			gesamt += k.getKontostand();
		}
		return gesamt;
	}
	
	public void invest() {
		double investment = Math.min(gesamtBetrag(), ruecklage / 2);
		double change = investment * ThreadLocalRandom.current().nextDouble(-0.3, 0.2);
		ruecklage += change;
		investments.add(investment);
		changes.add(change);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jahresbericht\n");
		
		// iteratoren um durch die linked list zu iterieren (Ausnutzen der links)
		Iterator<Double> investment = investments.iterator();
		Iterator<Double> change = changes.iterator();
		
		builder.append("Enwicklung der Ruecklagen: \n");
		
		// gehen davon aus, dass investments und changes gleich viele elemente enthalten
		while (investment.hasNext()) {
			builder.append("  Investment: " + investment.next() + " Veraenderung: " + change.next() + "\n");
		}
		
		builder.append("Ruecklagenendstand: " + ruecklage + "\n");
		
		builder.append("Enwicklung der Konten: \n");
		
		for (Konto k: konten) {
			builder.append(k.toString());
		}
		
		return builder.toString();
	}
	
	public double getRuecklage() {
		return ruecklage;
	}

	public void setRuecklage(double ruecklage) {
		this.ruecklage = ruecklage;
	}

	public void jahresbericht() {
		System.out.println(toString());
		investments.clear();
		changes.clear();
	}

}
