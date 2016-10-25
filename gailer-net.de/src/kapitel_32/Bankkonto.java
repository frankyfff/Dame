package kapitel_32;

public class Bankkonto {
	
	String kontonummer;
	String kontoinhaber;
	int kontostand;
	
	public Bankkonto(String kontonummer, String kontoinhaber, int kontostand) {
		this.kontonummer = kontonummer;
		this.kontoinhaber = kontoinhaber;
		this.kontostand = kontostand;
	}
	
	public void verarbeiteEinzahlung(int betrag) {
		kontostand = kontostand + betrag;
	}
	
	public void verarbeiteAuszahlung(int betrag) {
		
		int gebuehr;
		if (kontostand < 100000) {
			gebuehr = 15;
		} else {
			gebuehr = 0;
		}
		kontostand = kontostand - betrag - gebuehr;
	}
	
	public int aktuellerKontostand() {
		return kontostand;
	}
	
	public void anzeigen() {
		System.out.println(kontonummer+'\t'+kontoinhaber+'\t'+kontostand);
	}
	
	public void verarbeiteScheck(Bankkonto abzugKonto, Bankkonto zielKonto, int scheckBetrag) {
		abzugKonto.kontostand = abzugKonto.kontostand - scheckBetrag;
		zielKonto.kontostand = zielKonto.kontostand + scheckBetrag;
	}
}
