
public class Main {

	public static void main(String[] args) {
		// Ben¨otigte Komponenten instanzieren
		
		Component in1 = new PassGate(); // A
		Component in2 = new PassGate(); // B
		
		Component n1 = new NotGate();
		Component a1 = new AndGate();
		Component a2 = new AndGate();
		Component o1 = new OrGate();
		
		// Bauteile vernetzen
		
		in1.connectTo(o1);
		in2.connectTo(o1);
		
		in1.connectTo(a1);
		in2.connectTo(a1);
		
		a1.connectTo(n1);
		
		o1.connectTo(a2);
		n1.connectTo(a2);
		
		// Circuit-Klasse instanzieren und Ausgang von AND registrieren
		Circuit c1 = new Circuit();
		c1.exitgates.add(a2);
		in1.state = true; // Eingang A festlegen
		in2.state = false; // Eingang B festlegen
		
		// Schaltung simulieren und Wert des ersten und einzigen Ausgang ausgeben
		System.out.println(c1.simulate().get(0));
		
		Tester tester = new Tester();
		tester.testComponents();
	}

}
