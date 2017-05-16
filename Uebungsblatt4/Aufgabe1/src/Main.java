
public class Main {

	public static void main(String[] args) {
		Matrix m1 = new Matrix(new double[][] {
			new double[] { 2,3 },
			new double[] {-1,2 }
		});
		
		System.out.println(m1.toString());
		
		System.out.println(m1.applyOperator(new DeterminantOperator()));
		System.out.println(m1.applyOperator(new TraceOperator()));
	}

}
