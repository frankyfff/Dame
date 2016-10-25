package gui;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import root.Dame;
import root.Stein;

public class Feld extends JButton {

	private Brett brett;
	private Stein stein = null;
	private boolean istSchwarz;
	private int zeile;
	private int spalte;
	
	public Feld(Brett brett, boolean schwarz, int zeile, int spalte) {
		this.brett = brett;
		this.istSchwarz = schwarz;
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
		setStein(stein, false);
	}
	
	public void setStein(Stein stein, boolean init) {
		
		if (!init && stein.getClass().getCanonicalName().equals("root.Einfach") && (zeile == 0 || zeile == 9)) {
			stein = new Dame(this, stein.getSchwarz());
		}
		
		this.stein = stein;
		stein.setFeld(this);
		setForeground(stein.getSchwarz() ? Color.BLACK : Color.WHITE);
		this.setFont(new Font("Dialog", 1 , 45));
		setText(stein.getSymbol());
	}
	
	public Brett getBrett() {
		return brett;
	}
	
	public Stein getStein() {
		return stein;
	}
	
	public void wegStein() {
		stein = null;
		brett.merkeBeginn();
		setText("");
	}
}
