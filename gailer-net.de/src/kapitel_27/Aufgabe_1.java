package kapitel_27;

import java.awt.Point;
import java.util.Scanner;

public class Aufgabe_1 {
	
	 private int x1, x2;
	 private int y1, y2;
	 private Point a;
	 private Point b;
	
	
	public Aufgabe_1(int x1, int y1, int x2, int y2) {
		
		a = new Point(x1, y1);
		b = new Point(x2, y2);
		
		System.out.println("Werte für X1: ");
		Scanner scanner = new Scanner(System.in);
		x1 = scanner.nextInt();
		
		System.out.println("Werte für X2: ");
		Scanner scanner_2 = new Scanner(System.in);
		x2 = scanner_2.nextInt();
		
		System.out.println("Werte für Y1: ");
		Scanner scanner_3 = new Scanner(System.in);
		y1 = scanner_3.nextInt();
		
		System.out.println("Werte für Y2: ");
		Scanner scanner_4 = new Scanner(System.in);
		y2 = scanner_4.nextInt();
		
		
		System.out.println("X1: "+x1);
		System.out.println("X2: "+x2);
		System.out.println("Y1: "+y1);
		System.out.println("Y2: "+y2);
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		
		
		Aufgabe_1 aufgbabe_1 = new Aufgabe_1(5,6,7,8);
	}
}
