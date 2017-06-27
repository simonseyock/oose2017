
public class PartialMultiplyThread extends Thread {

	private BigMatrix A;
	private BigMatrix B;
	private int start;
	private int end;
	
	private BigMatrix result;
	
	PartialMultiplyThread(BigMatrix a, BigMatrix b, int s, int e) {
		A = a;
		B = b;
		start = s;
		end = e;
	}
	
	@Override
	public void run() {
		int dim = A.getDimension();
		
		int startRow = start / dim;
		int endRow = end / dim;
		
		result = new BigMatrix(dim);

		for (int i = startRow; i <= endRow; i++) {
			int startCol = (i == startRow) ? start % dim : 0;
			int endCol = (i == endRow) ? end % dim : dim;

			for (int j = startCol; j < endCol; j++) {
				double value = 0;
				for (int k=0; k<dim; k++) {
					value += A.get(i, k) * B.get(k, j);
				}
				result.set(i, j, value);
			}
		}
	}

	BigMatrix getResult()
	{
		return result;
	}
}
