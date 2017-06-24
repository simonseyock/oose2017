package aufgabe2;

public class Main {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.newKonto(8000000, 12345, "M.Mustermann");
		Bank b2 = new Bank();
		b2.newKonto(8000000, 11111, "M.Mustermann");
		Bank b3 = new Bank();
		b3.newKonto(8000000, 23456, "M.Mustermann");
		
		b1.setRuecklage(1000000);
		b2.setRuecklage(7000000);
		b3.setRuecklage(20000000);
		
		for (int i=0; i<100; i++){
			b1.invest();
			b2.invest();
			b3.invest();
		}
		b1.jahresbericht();
		double absolut = 1000000 - b1.getRuecklage();
		System.out.println("absolut aenderung: " + absolut);
		System.out.println("relative aenderung: " + absolut / 1000000);
		System.out.println();
		System.out.println();
		
		b2.jahresbericht();
		absolut = 7000000 - b2.getRuecklage();
		System.out.println("absolut aenderung: " + absolut);
		System.out.println("relative aenderung: " + absolut / 7000000);
		System.out.println();
		System.out.println();
		
		b3.jahresbericht();
		absolut = 20000000 - b3.getRuecklage();
		System.out.println("absolut aenderung: " + absolut);
		System.out.println("relative aenderung: " + absolut / 20000000);
	}

}
