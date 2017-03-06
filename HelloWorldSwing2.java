package helloWorldSwing2;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloWorldSwing extends JFrame {
	JPanel content = new JPanel();
	JLabel label = new JLabel("<html><b>Hello world!</b></html>");

	public HelloWorldSwing() {
		content.add(label);
		this.setContentPane(content);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		HelloWorldSwing window = new HelloWorldSwing();
	}

}
