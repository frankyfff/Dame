package kapitel_33;

public class Bankkonto {

	private String kontonummer;
	private String kontoinhaber;
	private int kontostand;
	private int zaehler;
	
	public Bankkonto(String kontonummer, String kontoinhaber, int kontostand) {
		this.kontonummer = kontonummer;
		this.kontoinhaber = kontoinhaber;
		this.kontostand = kontostand;
	}
	
	public int aktuellerKontostand() {
		return kontostand;
	}
	
	public void verarbeiteEinzahlung(int betrag) {
		inkrementZaehler();
		kontostand = kontostand + betrag;
	}
	
	public void verarbeiteAuszahlung(int betrag) {
		inkrementZaehler();
		int gebuehr;
		if (kontostand < 100000) {
			gebuehr = 15;
		} else {
			gebuehr = 0;
		}
		kontostand = kontostand - betrag - gebuehr;
	}
	
	private void inkrementZaehler() {
		zaehler = zaehler + 1;
	}
	
	public void anzeigen() {
		System.out.println("Kontunummer: "+kontonummer+'\n'+"Kontoinhaber: "+kontoinhaber+'\n'+"Kontostand: "+kontostand+'\n'+"Zähler: "+zaehler);
	}
}
