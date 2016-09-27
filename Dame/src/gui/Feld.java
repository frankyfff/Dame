package gui;


import java.awt.Color;

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
		stein.setFeld(this);
		this.setForeground(stein.getSchwarz() ? Color.black : Color.white);
		setText("O");
	}
	
	public Brett getBrett() {
		return brett;
	}
	
	public Stein getStein(){
		return stein;
	}
	
	public void wegStein() {
		stein = null;
		brett.merkeBeginn();
		setText("");
	}
}
