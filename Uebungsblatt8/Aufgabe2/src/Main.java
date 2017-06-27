
public class Main {

	public static void main(String[] args) {
		BigMatrix a = new BigMatrix(300);
		a.randomInit();
		BigMatrix b = new BigMatrix(300);
		b.randomInit();
		
		a.multiplyMT(b);
	}
}
