package Aufgabe2;

public class Point3D extends Point {
	
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public double distance(Point3D p) {
		
		return Math.sqrt(Math.pow((this.getX() - p.getX()), 2) + Math.pow((this.getY() - p.getY()), 2) + Math.pow((this.getZ() - p.getZ()), 2));
	}

	public int getZ() {
		return z;
	}

}
