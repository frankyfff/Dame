package kapitel_25;

public class StringTester {
	public static void main(String[] args) {
		
		String str1;
		String str2;
		
		int laenge1, laenge2;
		
		str1 = new String("Eier");
		str2 = new String("und Schinken");
		
		laenge1 = str1.length();
		laenge2 = str2.length();
		
		System.out.println("Gesamtlaenge: "+(laenge1+laenge2));
		
	}
}
