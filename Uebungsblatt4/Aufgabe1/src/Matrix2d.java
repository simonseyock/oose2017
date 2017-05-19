
public class Matrix2d {
	// Array of rows
	private double[][] values;

	private int size;

	public Matrix2d(double... vs) {
		size = (int) Math.sqrt(vs.length);
		if (vs.length != size * size) {
			throw new UnsupportedOperationException("Amount of parameters is not quadratic.");
		}
		values = new double[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				values[i][j] = vs[i*size + j];
			}
		}
	}
	
	public Matrix2d(double[][] vs) {
		size = vs.length;
		for (double[] row: vs) {
			if (row.length != size) {
				throw new UnsupportedOperationException("Matrix is not quadratic.");
			}
		}
		values = vs;
	}

	public Matrix2d(int size) {
		values = new double[size][size];
	}

	public String toString() {
		String result = "";
		for (double[] row: values) {
			for (double v: row) {
				result += v + " ";
			}
			result += "\n";
		}
		return result;
	}

	public Object applyOperator(Operator o) {
		return o.execute(this);
	}

	public double get(int row, int col) {
		return values[row][col];
	}

	public int getSize() {
		return size;
	}
}
