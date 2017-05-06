package doublefloat;

public class DoubleFloatComparison {

	public static void main(String[] args) {
		System.out.println(6.5 == 6.5f);
		System.out.println(6.4 == 6.4f);
		
//		Bei den Vergleichen werden die Ausdrücke 6.5 und 6.4 implizit als double
//		Gleitkommazahlen aufgefasst und die Zahlen 6.5f und 6.4f explizit als float 
//		Gleitkommazahlen.
		
//		Die Dezimalzahl 6.5 besitzt eine nicht periodische Binärzahldarstellung (110.1), 
//		die sowohl mit der Genauigkeit einer float, als auch einer double Variable 
//		dargestellt werden kann. Dadurch ergibt Vergleich 6.5 == 6.5f true.
		
//		Die Dezimalzahl 6.4 besitzt eine periodische Binärzahldarstellung 
//		(110,011001100110...). Da in einer double Variable mehr Stellen als in einer float 
//		Variable abgespeichert werden können unterscheiden sich die Zahlen und der 
//		Vergleich 6.4 == 6.4f ergibt false.
	}
}
