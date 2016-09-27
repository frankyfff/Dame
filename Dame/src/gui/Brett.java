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
						f.setStein(new Einfach(f,false));
					} else if (z >= 6) {
						f.setStein(new Einfach(f, true));
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
	
	public void merkeEnde() {
		istZugbeginn = true;
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
			
			if (getZugbeginn()) {
				st = f.getStein();
				f.wegStein();
			} else if(st.istOk(f)) {
				f.setStein(st);
			} else {
				st.getFeld().setStein(st);
			}
			
		}
		
	}
	
	FeldListener fl = new FeldListener();
	
}













