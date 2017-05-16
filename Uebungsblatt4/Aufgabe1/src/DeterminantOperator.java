
public class DeterminantOperator implements Operator {

	public Object execute(Matrix m) {
		if (m.getRowCount() != 2 || m.getColCount() != 2) {
			throw new UnsupportedOperationException("DeterminantOperator can only handle 2x2 matrices.");
		}
		return m.get(0,0) * m.get(1,1) - m.get(0,1) * m.get(1,0);
	}

}
