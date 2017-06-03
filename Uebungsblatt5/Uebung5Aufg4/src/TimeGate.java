
public class TimeGate extends Component {
	@Override public boolean function(java.util.ArrayList<Component> inputs) {
		return System.currentTimeMillis() / 1000 % 2 == 0; // teilen durch integer 1000 um Millisekunden in Skeunden umzurechnen,
		//anschließend module 2 überprüfung ungerade
	}
}
