package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brett extends JFrame {

	private JPanel jPanel1;
	private JButton jButton;
	
	public Brett() {
		initComponents();
	}
	
	private void initComponents() {
		
		jPanel1 = new JPanel();
		jButton = new JButton();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
	}
}
