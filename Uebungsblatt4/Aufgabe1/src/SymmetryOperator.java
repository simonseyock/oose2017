public class SymmetryOperator implements Operator {

	public Object execute(Matrix2d m) {
		int size = m.getSize();
		for (int i=0; i<size-1; i++) {
			for (int j=i+1; j<size; j++) {
				if (m.get(i, j) != m.get(j, i)) {
					return false;
				}
			}
		}
		return true;
	}
}
