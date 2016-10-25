package kapitel_33;

public class BankKontoTester {
	
	public static void main(String[] args) {
		
	    Bankkonto bobsKonto  = new Bankkonto( "999", "Bob", 100 );
	    Bankkonto jillsKonto = new Bankkonto( "111", "Jill", 500 );

	    bobsKonto.verarbeiteAuszahlung( 50 );
	    bobsKonto.verarbeiteEinzahlung( 150 );
	    bobsKonto.verarbeiteAuszahlung( 50 );

	    jillsKonto.verarbeiteEinzahlung( 500 );
	    jillsKonto.verarbeiteAuszahlung( 100 );
	    jillsKonto.verarbeiteAuszahlung( 100 );
	    jillsKonto.verarbeiteEinzahlung( 100 );

	    bobsKonto.anzeigen();
	    jillsKonto.anzeigen();
	}
}
