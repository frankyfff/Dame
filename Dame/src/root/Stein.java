package root;

import gui.*;

public abstract class Stein {

	private Feld feld;
	private boolean istSchwarz;
	
	public Stein(Feld feld, boolean schwarz) {
		this.feld = feld;
		istSchwarz = schwarz;
	}
}
