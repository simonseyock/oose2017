import java.util.concurrent.TimeUnit;

public class Tester {
	private Component inputA = new PassGate();
	private Component inputB = new PassGate();
	private Circuit circuit = new Circuit();
	
	private boolean testUntimedComponent(Component c, Boolean[] inputsA, Boolean[] inputsB, Boolean[] expectedResults) {
		// input validation:
		// Component should not have other components connected
		// arrays should have the same size
		
		circuit.exitgates.clear();
		circuit.exitgates.add(c);
		
		inputA.connectTo(c);
		if (inputsB != null) {
			inputB.connectTo(c);
		}
		
		for (int i=0; i<inputsA.length; i++) {
			inputA.state = inputsA[i];
			if (inputsB != null) {
				inputB.state = inputsB[i];
			}
			if (circuit.simulate().get(0) != expectedResults[i]) {
				c.predecessors.clear();
				return false;
			}
		}
		
		c.predecessors.clear();
		return true;
	}
	
	private boolean testTimeGate(TimeGate tg, int runs) {
		circuit.exitgates.clear();
		circuit.exitgates.add(tg);
		
		for (int i=0; i<runs; i++) {
			boolean now = circuit.simulate().get(0);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			boolean then = circuit.simulate().get(0);
			if (now == then) {
				return false;
			}
		}
		
		return true;
	}
	
	private void printTestResult(boolean success) {
		System.out.println("Test completed " + (!success? "not ": "") + "successfully.");
	}
	
	public void testComponents() {
		System.out.println("Testing AndGate.");
		this.printTestResult(this.testUntimedComponent(new AndGate(), 
				new Boolean[] {false, false, true, true},
				new Boolean[] {false, true, false, true},
				new Boolean[] {false, false, false, true}));
		System.out.println("Testing OrGate.");
		this.printTestResult(this.testUntimedComponent(new OrGate(), 
				new Boolean[] {false, false, true, true},
				new Boolean[] {false, true, false, true},
				new Boolean[] {false, true, true, true}));
		System.out.println("Testing NotGate.");
		this.printTestResult(this.testUntimedComponent(new NotGate(), 
				new Boolean[] {false, true},
				null,
				new Boolean[] {true, false}));
		System.out.println("Testing XorGate.");
		this.printTestResult(this.testUntimedComponent(new XorGate(), 
				new Boolean[] {false, false, true, true},
				new Boolean[] {false, true, false, true},
				new Boolean[] {false, true, true, false}));
		System.out.println("Testing NandGate.");
		this.printTestResult(this.testUntimedComponent(new NandGate(), 
				new Boolean[] {false, false, true, true},
				new Boolean[] {false, true, false, true},
				new Boolean[] {true, true, true, false}));
		System.out.println("Testing NorGate.");
		this.printTestResult(this.testUntimedComponent(new NorGate(), 
				new Boolean[] {false, false, true, true},
				new Boolean[] {false, true, false, true},
				new Boolean[] {true, false, false, false}));
		System.out.println("Testing TimeGate.");
		this.printTestResult(this.testTimeGate(new TimeGate(), 5));
	}
}
