
public class NandGate extends Component {
	@Override
	public boolean function(java.util.ArrayList<Component> inputs) {
		for (Component c : inputs) {
			if (!c.state) {
				return true; // falls einer falsch ist -> vgl mit OrGate
			}
		}
		return false; // falls alle wahr sind
	}

}
