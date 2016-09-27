package gui;


import java.awt.Color;

import javax.swing.JButton;

import root.Stein;

public class Feld extends JButton  {

	private Brett brett;
	private Stein stein = null;
	private boolean istSchwarz;
	private int zeile;
	private int spalte;
	
	public Feld(Brett brett, boolean schwarz, int zeile, int spalte) {
		this.brett = brett;
		istSchwarz = schwarz;
		this.zeile = zeile;
		this.spalte = spalte;
	}
	
	public int getZeile() {
		return zeile;
	}
	
	public int getSpalte() {
		return spalte;
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
