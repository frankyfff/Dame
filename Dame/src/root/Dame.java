package root;

import gui.Feld;

public class Dame extends Stein {

	public Dame(Feld feld, boolean schwarz) {
		super(feld, schwarz);
	}

	public boolean istOk(Feld feld) {
		
		int dX = feld.getSpalte() - getFeld().getSpalte();
		int dY = feld.getZeile() - getFeld().getZeile();
		
		if (Math.abs(dX) != Math.abs(dY)) {
			return false;
		} else if (Math.abs(dX) == 0) {
			return false;
		} 
		return true;
	}
	
	public String getSymbol() {
		return "\u25c9";
	}

}
