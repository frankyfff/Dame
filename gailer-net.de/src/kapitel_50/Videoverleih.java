package kapitel_50;

public class Videoverleih {
	
	public static void main(String[] args) {
		
		Videoband artikelA = new Videoband("Microcosmos", 90, "5€");
		Spielfilm artikelB = new Spielfilm("Jaws", 120,"5€","Spielberg", "PG");
		
		artikelA.anzeigen();
		artikelB.anzeigen();
	}
	
}
