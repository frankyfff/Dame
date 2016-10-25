package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import root.Einfach;
import root.Stein;


public class Brett extends JFrame{
	
	private JPanel jPanel1;
	private FeldListener fl = new FeldListener();
	private Feld[][] feld = new Feld[10][10];
	private boolean istZugbeginn = true;
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
				f.setBackground(schwarz ? Color.DARK_GRAY : Color.LIGHT_GRAY);
				
				if (schwarz) {
					if (z <= 3) {
						f.setStein(new Einfach(f, false), true);
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
	
	public boolean getZugBeginn() {
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
		
		if (ziel.getStein() != null) {
			return false;
		}
		
		int x1 = stein.getFeld().getSpalte();
		int y1 = stein.getFeld().getZeile();
		int x2 = ziel.getSpalte();
		int y2 = ziel.getZeile();
		
		int dX = x2 - x1;
		int dY = y2 - y1;
		
		if (Math.abs(dX) > 1) {
			int dx1 = dX > 0 ? 1 : -1;
			int dy1 = dY > 0 ? 1 : -1;
			
			Feld fletzt = feld[y2 - dy1][x2 - dx1];
			Stein stletzt = fletzt.getStein();
			
			if (stletzt.getSchwarz() == stein.getSchwarz()) {
				return false;
			}
			
			if ((stein.getClass().getCanonicalName().equals("root.Einfach")) && (stletzt == null)){
					return false;
			}
			
			if (Math.abs(dX) > 2) {
				int z = y1 + dy1;
				int sp = x1 + dx1;
				
				for (int i = 0; i < Math.abs(dX) - 2; i++) {
					if (feld[z][sp].getStein() != null) {
						return false;
					}
					z += dy1;
					sp += dx1;
				}
			}
			fletzt.wegStein();
		}
		return true;
	}

	private void initComponents() {
		jPanel1 = new JPanel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jPanel1.setLayout(new GridLayout(10, 10));
		getContentPane().add(jPanel1, BorderLayout.CENTER);
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
				for (int sp = 0; sp < feld.length; sp++) {
					if (evt.getSource() == feld[z][sp]) {
						System.out.println("Feld "+z+", "+sp+" geklickt!");
						f = feld.clone()[z][sp];
						break;
					} else {

					}
				}
			}
			
			int amZugMem = amZug;
			if (getZugBeginn()) {
				if ((st = f.getStein()) != null) {
					if (st.getSchwarz() && ((amZug & amZugSCHWARZ) != 0) || !st.getSchwarz() && ((amZug & amZugWEISS)) != 0) {
						f.wegStein();
					}
				}
			} else if (st.istOk(f) && istOk(st, f)){
				f.setStein(st);
			} else {
				st.getFeld().setStein(st);
				amZug = amZugMem;
			}
			
		}
	}
}
