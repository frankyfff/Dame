package constructor;

public class KindsKlasse extends AbstrKlasse {
	
	
	
	public KindsKlasse(String farbe, boolean boo, int nummer) {
		super(farbe, boo, nummer);
	}

	public static void main(String[] args) {
		KindsKlasse kindsKlasse = new KindsKlasse("gruen", true, 4);
		kindsKlasse.zaehler();
		kindsKlasse.runner();
		
		System.out.println(kindsKlasse.nummer);
	}

	@Override
	public void runner() {
		System.out.println("sdsd");
	}
}
