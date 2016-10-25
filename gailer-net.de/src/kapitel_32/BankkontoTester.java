package kapitel_32;



public class BankkontoTester {
	
	private Bankkonto abzugKonto;
	
	public static void main(String[] args) {
		
	    Bankkonto konto1 = new Bankkonto( "123", "Bob", 100 );
	    Bankkonto konto2 = new Bankkonto( "456", "Jill", 900 );
	    Bankkonto konto3;

	    konto1.anzeigen() ;
	    konto2.anzeigen() ;

	    konto3 = konto1;
	    konto3.anzeigen() ;
		
	}
	
}
