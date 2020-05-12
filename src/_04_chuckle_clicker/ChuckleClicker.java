package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton("Joke");
	JButton b2 = new JButton("punchline");

	void run() {
		makeButtons();
	}

	void makeButtons() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(b1);
		panel.add(b2);
		frame.add(panel);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		} else if (e.getSource() == b2) {
			JOptionPane.showMessageDialog(null, "He wanted to get to the other side.");
		}
	}
}
