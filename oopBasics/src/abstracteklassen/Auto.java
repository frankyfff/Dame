package abstracteklassen;

public abstract class Auto {

	private boolean anOderAus;
	private int raeder;
	private int tuer;
	
	public Auto(boolean anOderAus, int reader, int tuer) {
		this.anOderAus = anOderAus;
		this.raeder = reader;
		this.tuer = tuer;
	}
}
