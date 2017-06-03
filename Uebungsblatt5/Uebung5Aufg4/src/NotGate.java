
public class NotGate extends Component {
	@Override
	public boolean function(java.util.ArrayList<Component> inputs) {
		if (inputs.size() == 0) {
			// throw new RuntimeException("");
			return this.state;
		}
		return !inputs.get(0).state;
	}
}
