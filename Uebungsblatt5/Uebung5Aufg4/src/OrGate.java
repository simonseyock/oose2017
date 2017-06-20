
public class OrGate extends Component {
	@Override
	public boolean function(java.util.ArrayList<Component> inputs) {
		for (Component c : inputs) {
			if (c.state) {
				return true; // gebe true zurück falls einer wahr ist
			}
		}
		return false; // falls alle falsch sind
	}

}
