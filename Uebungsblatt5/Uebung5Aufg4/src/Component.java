import java.util.ArrayList;

public abstract class Component {
	ArrayList<Component> predecessors = new ArrayList<Component>();
	boolean state = false;

	void connectTo(Component target) {
		target.predecessors.add(this);
	}

	abstract boolean function(ArrayList<Component> inputs);

	void evaluate() {
		state = function(predecessors);
	}
}