package kapitel_15;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Aufgabe_1 {
	
	private void run() {
		Scanner scanner = new Scanner(System.in);
		int abc = scanner.nextInt();
		
		System.out.println("Startwert: "+abc);
		System.out.println("Endwert: "+(abc+4));
		
		for (int i = 0; i < 5; i++) {
			System.out.println(abc++);
		}
	}
	
	
	public static void main(String[] args) {
		Aufgabe_1 schleife = new Aufgabe_1();
		schleife.run();
	}
}
