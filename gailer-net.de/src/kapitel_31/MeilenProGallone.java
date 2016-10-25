package kapitel_31;

public class MeilenProGallone {
	
	public static void main(String[] args) {
		Auto auto = new Auto(32456, 32810, 10.6);
		
		System.out.println("Meilen pro Gallone: " + auto.berechneMPG());
	}
}
