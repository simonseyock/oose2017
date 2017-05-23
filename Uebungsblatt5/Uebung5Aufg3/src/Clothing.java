public class Clothing extends Product {

	protected int size;
	protected String material;

	public Clothing(String name, String desc, double price, int size,
			String material) {
		super(name, desc, price);
		this.size = size;
		this.material = material;

	}

	public String toString() {
		return super.toString() + " -  Size " + size + " -  Material "
				+ material;
	}

}
