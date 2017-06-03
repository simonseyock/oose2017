import java.util.ArrayList;

public class Circuit {
	ArrayList<Component> exitgates = new ArrayList<Component>();

	public ArrayList<Boolean> simulate() {
		ArrayList<Boolean> results = new ArrayList<Boolean>();
		for (Component c : exitgates) {
			revaluate(c);
			results.add(c.state);
		}
		return results;
	}

	public void revaluate(Component c) {
		for (Component pre : c.predecessors)
			revaluate(pre);
		c.evaluate();
	}
}
