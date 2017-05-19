package Aufgabe2;

public class Main {

	public static void main(String[] args) {

		Point p1 = new Point(6, 8);
		Point p2 = new Point(2, 6);
		
		Point3D P1 = new Point3D(1, 2, 3);
		Point3D P2 = new Point3D(2, 3, 4);
		
		
		System.out.println(p1.distance(p2));
		
		System.out.println(P1.distance(P2));
		

	}

}
