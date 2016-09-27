package gui;


import javax.swing.JButton;

import root.Stein;

public class Feld extends JButton  {

	private Brett brett;
	private Stein stein = null;
	private boolean istSchwarz;
	
	public Feld(Brett brett, boolean schwarz) {
		this.brett = brett;
		istSchwarz = schwarz;
	}
	
	public void setStein(Stein stein) {
		this.stein = stein;
	}
}
