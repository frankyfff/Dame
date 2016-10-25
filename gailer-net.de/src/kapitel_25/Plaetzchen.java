package kapitel_25;

public class Plaetzchen {
	
//	private String sort = "";
//	private String groesse = "";
//	private String form = "";
	
	public void ausgeben(String sorte, String groesse, String form, boolean verzierung) {
		
		String temp;
		if (verzierung) {
			temp = "ja";
		} else {
			temp = "nein";
		}
		
		System.out.println("Sorte: "+sorte+"-|-"+"Groesse: "+groesse+"-|-"+"Form: "+form+"|"+"Verzierung: "+temp);
	}
	
	public static void main(String[] args) {
		Plaetzchen plaetzchen = new Plaetzchen();
		plaetzchen.ausgeben("Kokos", "mittel", "rund", false);
		plaetzchen.ausgeben("ananas", "klein", "quadratisch", false);
		plaetzchen.ausgeben("Honigkuchen", "gross", "quadratisch", true);
	}
}
