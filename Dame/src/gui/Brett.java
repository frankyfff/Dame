package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brett extends JFrame {

	private JPanel jPanel1;
	private Feld[][] feld = new Feld[10][10];
	private JButton jButton;
	
	public Brett() {
		initComponents();
		
		getContentPane().removeAll();
		
		for (int z = 0; z < feld.length; z++) {
			for (int sp = 0; sp < feld[z].length; sp++) {
				Feld f = new Feld(this);
				feld[z][sp] = f;
				jPanel1.add(f);
			}
		}
		
		getContentPane().add(jPanel1, BorderLayout.CENTER);
		pack();
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
}
