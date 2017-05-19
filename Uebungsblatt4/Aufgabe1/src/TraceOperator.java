
public class TraceOperator implements Operator {

	public Object execute(Matrix2d m) {
		double result=0;
		for (int i=0; i<m.getSize(); i++){
			result += m.get(i,i);
		}
		return result;
	}
}
