package Aufgabe2;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double distance(Point p) {
		
		return Math.sqrt(Math.pow((this.getX() - p.x), 2) + Math.pow((this.getY() - p.y), 2));
	}
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void printPoint(){
		
		System.out.println("X-Koordinate:" + this.getX() + "; Y-Koordinate:" + this.getY());
	}

}
