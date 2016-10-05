package constructor;

public abstract class AbstrKlasse {
		
		String black;
		boolean boo;
		int nummer = 5;
	
		public void zaehler() {
			System.out.println("ddddd");
		}
		
		public AbstrKlasse(String farbe, boolean boo, int nummer) {
			this.black = farbe;
			this.boo = boo;
			this.nummer = nummer;
		}
		
		public abstract void runner();
}
