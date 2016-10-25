package kapitel_27;

import java.awt.Point;

public class Aufgabe_2 {
	
	private int x1, x2, y1, y2;
	private Point e, f;
	
	public Aufgabe_2(int a, int b, int c, int d) {
		
		x1 = a;
		x2 = c;
		y1 = b;
		y2 = d;
		
		
		e = new Point(x1, y1);
		f= new Point(x2, y2);
		
		System.out.println("X1: "+x1);
		System.out.println("X2: "+x2);
		System.out.println("Y1: "+y1);
		System.out.println("Y2: "+y2);
		
		if (e.equals(f)) {
			System.out.println("Kordinaten Punkte sind gleich");
		} else {
			System.out.println("Punkte unterscheiden sich");
		}
	}
	
	public static void main(String[] args) {
		Aufgabe_2 aufgabe_2 = new Aufgabe_2(5,11,5,10);
	}
}
