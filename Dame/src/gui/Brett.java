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
	}
	
	private void initComponents() {
		
		jPanel1 = new JPanel();
		jButton = new JButton();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jPanel1.setLayout(new GridLayout(10,10));
		jButton.setText("BBB");
		jPanel1.add(jButton);
		
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
