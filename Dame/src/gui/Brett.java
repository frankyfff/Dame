package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import root.*;

public class Brett extends JFrame {

	private JPanel jPanel1;
	private Feld[][] feld = new Feld[10][10];
	private JButton jButton;
	private boolean istZugbeginn = true;
	
	/*
	 * weiﬂ 1:		00000001 
	 * schwarz 2:	00000010
	 * beide 3:		00000011
	 * */
	private final int amZugWEISS = 1;
	private final int amZugSCHWARZ = 2;
	private int amZug = amZugWEISS;
	
	public Brett() {
		initComponents();
		
		getContentPane().removeAll();
		
		boolean schwarz = true;
		for (int z = 0; z < feld.length; z++) {
			for (int sp = 0; sp < feld[z].length; sp++) {
				Feld f = new Feld(this, schwarz, z, sp);
				
				feld[z][sp] = f;
				
				f.addActionListener(fl);
				
				if (schwarz) {
					f.setBackground(Color.darkGray);		//f.setBackground(schwarz ? Color.darkGray : Color.lightGray)
				} else {
					f.setBackground(Color.lightGray);
				}
				
				if (schwarz) {
					if (z <= 3) {
						f.setStein(new Einfach(f,false), true);
					} else if (z >= 6) {
						f.setStein(new Einfach(f, true), true);
					}
				}
				
				jPanel1.add(f);
				schwarz = !schwarz;
			}
			schwarz = !schwarz;
		}
		
		getContentPane().add(jPanel1, BorderLayout.CENTER);
		pack();
	}
	
	private boolean getZugbeginn() {
		return istZugbeginn;
	}
	
	public void merkeBeginn() {
		istZugbeginn = false;
	}
	
	public void merkeEnde(Stein stein) {
		
		if (stein.getClass().getCanonicalName().equals("root.Einfach")) {
			amZug = stein.getSchwarz() ? amZugWEISS : amZugSCHWARZ;
		} 
		istZugbeginn = true;
	}
	
	public boolean istOk(Stein stein, Feld ziel) {
		
		//Zielfeld besetzt
		if (ziel.getStein() != null) {
			return false;
		}
		
		//Zug l‰nger als 1 feld
		int x1 = stein.getFeld().getSpalte();
		int y1 = stein.getFeld().getZeile();
		int x2 = ziel.getSpalte();
		int y2 = ziel.getZeile();
		
		int dX = x2 - x1;
		int dY = y2 - y1;
		
		if (Math.abs(dX) > 1) {
			int dX1 = dX > 0 ? 1 : -1;
			int dY1 = dY > 0 ? 1 : -1;
			//Letztes Feld:
				Feld fletzt = feld[y2 -dY1][x2 -dX1];
				Stein stletzt = fletzt.getStein();
				//Stein eigener Farbe
				if (stletzt.getSchwarz() == stein.getSchwarz()) {
					return false;
				}
				//Einfacher Stein: leer
				if (stein.getClass().getCanonicalName().equals("root.Einfach") && stletzt == null) {
					return false;
				}
			//Zug l‰nger als 2
			if (Math.abs(dX) > 2) {
				int z = y1 + dY1;
				int sp = x1 + dX1;
				//Erstes bis VORletztes Feld:
				for (int i = 0; i < Math.abs(dX) -2; i++) {
					//Feld besetzt
					if (feld[z][sp].getStein() != null) {
						return false;
					}
					z += dY1;
					sp += dX1;
				}
			}
			fletzt.wegStein();
		}
		return true;
	}
	
	
	private void initComponents() {
		
		jPanel1 = new JPanel();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jPanel1.setLayout(new GridLayout(10,10));
		
		getContentPane().add(jPanel1, BorderLayout.CENTER);
		
		setLocationRelativeTo(null);
		
		pack();
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Brett().setVisible(true);
			}
		});
	}
	
	private class FeldListener implements ActionListener {

		Stein st = null;
		public void actionPerformed(ActionEvent evt) {
			
			Feld f = null;
			for (int z = 0; z < feld.length; z++) {
				for (int sp = 0; sp < feld[z].length; sp++) {
					if (evt.getSource() == feld[z][sp]) {
						System.out.println("Feld: " + z + " Spalte: " + sp);
						f = feld[z][sp];
						break;
					}
				}
			}
			int amZugMem = amZug;
			if (getZugbeginn()) {
				if ((st = f.getStein()) != null) {
					if (st.getSchwarz() && ((amZug & amZugSCHWARZ) != 0) || !st.getSchwarz() && ((amZug & amZugWEISS) != 0)) {
						f.wegStein();
					}
				}
				f.wegStein();
			} else if(st.istOk(f) && istOk(st, f)) {
				f.setStein(st);
			} else {
				st.getFeld().setStein(st);
				amZug = amZugMem;
			}
			
		}
		
	}
	
	FeldListener fl = new FeldListener();
	
}













