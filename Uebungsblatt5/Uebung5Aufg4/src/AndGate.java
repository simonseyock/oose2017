public class AndGate extends Component {
	@Override
	public boolean function(java.util.ArrayList<Component> inputs) {
		for (Component c : inputs) {
			if (!c.state)
				return false; // gebe false zur¨uck sobald ein Eingang false
		}
		return true; // falls kein Eingang false gebe true zur¨uck
	}
}
