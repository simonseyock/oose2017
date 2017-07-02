
public class Main {

	public static void main(String[] args) {
		for (int dim = 300; dim <= 1000; dim += 20) {
			System.out.println("Testing with Matrices of size " + dim + "x" + dim);

			BigMatrix a = new BigMatrix(dim);
			a.randomInit();
			BigMatrix b = new BigMatrix(dim);
			b.randomInit();

			long time = System.currentTimeMillis();
			BigMatrix stRes = a.multiplyST(b);
			long stTime = System.currentTimeMillis() - time;
			System.out.println("ST: " + stTime);

			time = System.currentTimeMillis();
			BigMatrix mtRes = a.multiplyMT(b);
			long mtTime = System.currentTimeMillis() - time;
			System.out.println("MT: " + mtTime);

			System.out.println("Rel: " + (double)stTime / mtTime);

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
