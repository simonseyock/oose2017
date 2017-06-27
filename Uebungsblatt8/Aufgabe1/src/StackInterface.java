import java.util.List;


public interface StackInterface<T> extends List<T>{
	
	public void push(T v);
	public T pop();
	
	

}
