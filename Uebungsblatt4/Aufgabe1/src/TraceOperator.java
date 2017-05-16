
public class TraceOperator implements Operator {

	public Object execute(Matrix m) {
		if (m.getRowCount() != m.getColCount()) {
			throw new UnsupportedOperationException("TraceOperator can only handle quadratic matrices.");
		}		
		double result=0;
		for (int i=0; i<m.getRowCount(); i++){
			result += m.get(i,i);
		}
		return result;
	}
	

}
