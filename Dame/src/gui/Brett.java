package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import root.*;

public class Brett extends JFrame {

	JPanel jpanel1;
	JButton jbutton;
	private Feld[][] feld = new Feld[10][10]; 
	
	
	//Constructor
	public Brett() {
		
		initComponents();
		
		getContentPane().removeAll();
		
		boolean schwarz = true;
		for (int z = 0; z < feld.length; z++) {
			for (int sp = 0; sp < feld[z].length; sp++) {
				
				Feld  f = new Feld(this, schwarz);
				feld[z][sp] = f;
				f.addActionListener(fL);
				
				if (schwarz) {
					f.setBackground(Color.darkGray);
				} else {									//Ternäre Operator
					f.setBackground(Color.lightGray);		// f.setBachground(schwarz ? Color.darkGray : lightGray);
				}
				
				if (schwarz) {
					if (z <= 3) {
						f.setStein(new Einfach(f, false));
						f.setForeground(Color.white);
						f.setText("O");
					} else if (z >= 6) {
						f.setStein(new Einfach(f, true));
						f.setText("O");
						f.setForeground(Color.black);
					}
				}
				
				jpanel1.add(f);
				schwarz = !schwarz;
			}
			schwarz = !schwarz;
		}
		
		getContentPane().add(jpanel1, BorderLayout.CENTER);
		pack();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		
		jpanel1 = new JPanel();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(500, 500));
		
		jpanel1.setLayout(new GridLayout(10, 10));
		
		getContentPane().add(jpanel1, BorderLayout.CENTER);
		pack();
	}
	
	
	public static void main(String[] args) {
		//Teil 7 anschauen
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Brett().setVisible(true);
			}
		});
	}
	
	private class FeldListener implements ActionListener {
		
		public void actionPerformed(ActionEvent evt) {
			for (int z = 0; z < feld.length; z++) {
				for (int sp = 0; sp < feld.length; sp++) {
					if (evt.getSource() == feld[z][sp]) {
						System.out.println("Feld: "+ z +" "+sp);
					}
				}
			}
		}
	}
	
	FeldListener fL = new FeldListener();
	
	
}
