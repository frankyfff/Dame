package kapitel_15;

import java.util.Scanner;

public class Aufgabe_2 {

	
	
	public static void main(String[] args) {
	
		Aufgabe_2 aufgabe_2 = new Aufgabe_2();
		aufgabe_2.lauefer();
	}

	private void lauefer() {
		
		Scanner scanner = new Scanner(System.in);
		String var = scanner.nextLine();
		
		System.out.println("Eingabe: "+var);
		
		for (int i = 0; i < var.length(); i++) {
			System.out.println(var);
		}
		
	}
}
