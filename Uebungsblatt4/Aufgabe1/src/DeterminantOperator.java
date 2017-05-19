
public class DeterminantOperator implements Operator {

	public Object execute(Matrix2d m) {
		if (m.getSize() != 2) {
			throw new UnsupportedOperationException("DeterminantOperator can only handle 2x2 matrices.");
		}
		return m.get(0,0) * m.get(1,1) - m.get(0,1) * m.get(1,0);
	}

}
