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
	
	public Feld getFeld() {
		return feld;
	}
	
	public boolean istOk(Feld feld) {
		
		int dX = feld.getSpalte() - getFeld().getSpalte();
		int dY = feld.getZeile() - getFeld().getZeile();
		
		if (Math.abs(dX) != Math.abs(dY)) {
			return false;
		} else if (Math.abs(dX) == 0 || Math.abs(dX) > 2) {
			return false;
		} else if (getSchwarz() && dY > 0 || !getSchwarz() && dY < 0) {
			return false;
		}
		return true;
	}
}
