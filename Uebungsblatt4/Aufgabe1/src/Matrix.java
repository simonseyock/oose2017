
public class Matrix {
	// Array of rows
	private double[][] values;
	
	public Matrix(double[][] v) {
		values = v;
	}
	
	public Matrix(int rows, int cols) {
		values = new double[cols][rows];
//		for (int i=0; i<cols; i++) {
//			for (int j=0; j<rows; j++) {
//				values[i][j] = 0;
//			}
//		}
	}
	
	public String toString() {
		String result = "";
		for (int i=0; i<values.length; i++){
			for (int j=0; j<values[i].length; j++){
				result += values[i][j] + " "; 
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
	
	public int getRowCount() {
		return values.length;
	}
	
	public int getColCount() {
		if (values.length == 0) {
			return 0;
		}
		return values[0].length;
	}
}
