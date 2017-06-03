
public class XorGate extends Component {
	@Override
	public boolean function(java.util.ArrayList<Component> inputs) {
		int counter = 0;
		for (Component c : inputs) {
			if (c.state) {
				counter++; // inkrementiere countervariable
			}
		}
		if (counter % 2 != 0)
			return true; // test auf ungerade Anzahl
		else
			return false;
	}

}
