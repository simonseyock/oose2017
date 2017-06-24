package aufgabe1;

class CallEg {
	public void methodA() throws ArithmeticException {
		try{
			methodB();
		}catch (ArithmeticException e){
			e.printStackTrace();
			throw e;
		} 
	}

	public void methodB() throws ArithmeticException {
		try{
			methodC();
		}catch (ArithmeticException e){
			e.printStackTrace();
			throw e;
		} 
	}

	public void methodC() throws ArithmeticException {
		try{
			double a=1/0;
		}catch (ArithmeticException e){
			e.printStackTrace();
			throw e;
		} 
	}
}
