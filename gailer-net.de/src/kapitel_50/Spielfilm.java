package kapitel_50;

public class Spielfilm extends Videoband {
	
	private String regisseur;
	private String bewertung;
	
	public Spielfilm(String ttl, int leange, String preis, String reg, String bew) {
		super(ttl, leange, preis);
		this.regisseur = reg;
		this.bewertung = bew;
	}
	
	public void anzeigen() {
		System.out.println( titel + ", " + laenge + " Min. verfuegbar:" + vorhanden+" Preis: "+ verleihPreis );
		System.out.println( "Regisseur: " + regisseur + "  " + bewertung );
	}
	
}
