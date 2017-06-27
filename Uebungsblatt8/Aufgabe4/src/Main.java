
public class Main {

	public static void main(String[] args) {
		for (int dim = 300; dim <= 1000; dim += 20) {
			System.out.println("Testing with Matrices of size " + dim + "x" + dim);
			BigMatrix a = new BigMatrix(dim);
			a.randomInit();
			BigMatrix b = new BigMatrix(dim);
			b.randomInit();

			long time = System.currentTimeMillis();
			BigMatrix mtRes = a.multiplyMT(b);
			System.out.println("MT: " + (System.currentTimeMillis() - time));
			time = System.currentTimeMillis();
			BigMatrix stRes = a.multiplyST(b);
			System.out.println("ST: " + (System.currentTimeMillis() - time));

			for (int i = 0; i < dim; i++) {
				for (int j = 0; j < dim; j++) {
					if (mtRes.get(i,j) != stRes.get(i,j)) {
						throw new RuntimeException("Multiplication Not Correct");
					}
				}
			}
		}
	}
}
