package root;

import gui.*;

public abstract class Stein {

	private Feld feld;
	private boolean istSchwarz;
	
	public Stein(Feld feld, boolean schwarz) {
		this.feld = feld;
		istSchwarz = schwarz;
	}
	
	public void setFeld(Feld feld) {
		this.feld = feld;
		feld.getBrett().merkeEnde();
	}
	
	public boolean getSchwarz() {
		return istSchwarz;
	}
}
