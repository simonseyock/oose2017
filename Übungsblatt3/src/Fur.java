public class Fur {
	public int length;

	public Fur(int length) {
		this.length = length;
	}

	public String toString() {
		return "Felllaenge: " + length;
	}
	
	public Fur clone() {
		return new Fur(length);
	}
}