package _11_whack_a_mole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	JPanel p = new JPanel();
	JFrame frame = new JFrame();
public void run() {
	for (int i = 0; i < 24; i++) {
		JButton b = new JButton();
		p.add(b);
	}
	frame.setSize(400, 400);
	frame.add(p);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
