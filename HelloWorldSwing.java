package helloWorldSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloWorldSwing {
	
	public static void createGUI() {
		JFrame window = new JFrame("Hello world!");
		JPanel content = new JPanel();
		JLabel label = new JLabel("Hello world!");
		window.setContentPane(content);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		content.add(label);
		window.pack();
		window.setVisible(true);
	}

	public static void main(String[] args) {
		createGUI();
	}

}
