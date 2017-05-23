import java.util.HashSet;


public class Catalogue{
	
	protected HashSet<Product> products;

	public Catalogue(){
		products = new HashSet<Product>();
	}
	
	public void printMe(){
		for(Product p: products){
			System.out.println(p.toString());
		}
	}
	
	public void addProduct(Product p){
		products.add(p);
	}
	
	public void printMehrwertSteuer(){
		for(Product p:products){
			System.out.println(p.getPriceWithTax());
		}
	}
	
	public static void main(String[] args) {

		Catalogue c = new Catalogue();
		c.addProduct(new Product("Papier", "A4", 2.52));
		c.addProduct(new Clothing("Hemd", "Herren-Hemd", 33.61, 48, "Baumwolle"));
		c.printMe();
		c.printMehrwertSteuer();

	}

}
