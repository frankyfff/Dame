package kapitel_50;

public class Videoband {
	
	public String titel;
	public int laenge;
	public boolean vorhanden;
	public String verleihPreis;
	
	public Videoband(String ttl) {
		titel = ttl;
		laenge = 90;
		vorhanden = true;
	}
	
	public Videoband(String ttl, int len, String preis) {
		titel = ttl;
		laenge = len;
		verleihPreis = preis;
		vorhanden = true;
	}
	
	public void anzeigen() {
		System.out.println(titel+","+laenge+" Min., Vorhanden "+vorhanden+" Verleihpreis: " + verleihPreis);
	}
	
}

