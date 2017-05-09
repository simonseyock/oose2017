
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Sheep S1 = new Sheep("Dolly" , new Fur (10));
 
 System.out.println(S1.equals(S1));
 Sheep S2 =  S1.deepclone();
 System.out.println(S1.equals(S2));
 System.out.println(S1.toString());
 System.out.println(S2.toString());
 
 S2.name = "Tolly";
 S2.shear();
 
 System.out.println(S1.equals(S2));
 
 System.out.println(S1.toString());
 System.out.println(S2.toString());
 
	}

}
