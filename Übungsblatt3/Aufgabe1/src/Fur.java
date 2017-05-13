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
	
	public boolean equals(Object o){
		if (o instanceof Fur){
			Fur s = (Fur)o;
			return s.length == length;
		}
		return false;
	}
}