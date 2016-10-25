package kapitel_50;

public class Musikvideo extends Videoband {

	private String kuenstler;
	private String kategorie;
	
	public Musikvideo(String ttl,int len, String preis,String kuenstler, String kategorie) {
		super(ttl, len, preis);
		this.kuenstler = kuenstler;
		this.kategorie = kategorie;
	}
	
	public void anzeigen() {
		super.anzeigen();
		System.out.println("Kuenstler: "+kuenstler+" Kategorie: "+kategorie);
	}

}
