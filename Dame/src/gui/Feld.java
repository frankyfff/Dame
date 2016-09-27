package gui;


import javax.swing.JButton;

public class Feld extends JButton  {

	private Brett brett;
	private boolean istSchwarz;
	
	public Feld(Brett brett, boolean schwarz) {
		this.brett = brett;
		istSchwarz = schwarz;
	}
}
