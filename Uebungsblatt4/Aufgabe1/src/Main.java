
public class Main {

	public static void main(String[] args) {
		Matrix2d m1 = new Matrix2d(2, 3, -1, 2);
		Operator alloperators[] = { new DeterminantOperator(), new TraceOperator(), new SymmetryOperator(),
				new TransposeOperator() };
		for (Operator o : alloperators) {
			System.out.println("Ergebnis " + o.getClass().toString());
			System.out.println(m1.applyOperator(o).toString());
		}
	}

}
