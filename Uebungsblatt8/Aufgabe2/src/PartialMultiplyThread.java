
public class PartialMultiplyThread implements Runnable {

	private BigMatrix A;
	private BigMatrix B;
	private int start;
	private int end;
	
	private BigMatrix result;
	
	public PartialMultiplyThread(BigMatrix a, BigMatrix b, int s, int e) {
		A = a;
		B = b;
		start = s;
		end = e;
	}
	
	@Override
	public void run() {
		int dim = A.getDimension();
		
		int startRow = start / dim;
		int startCol = start % dim;
		int endRow = end / dim;
		int endCol = end % dim;
		
		result = new BigMatrix(dim);
		
		for (int i=startRow; i<endRow; i++) {
			for (int j=startCol; j<endCol; j++) {
				double value = 0;
				for (int k=0; k<dim; k++) {
					value += A.get(i, k) * B.get(k, j);
				}
				result.set(i, j, value);
			}
		}
	}

	public BigMatrix getResult()
	{
		return result;
	}
}
