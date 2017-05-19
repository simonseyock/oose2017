public class TransposeOperator implements Operator {

	public Object execute(Matrix2d m) {
		int size = m.getSize();
		double[][] temp = new double[size][size];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				temp[j][i] = m.get(i, j);
		return new Matrix2d(temp);
	}
}
