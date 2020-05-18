package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	Random r = new Random();
	int ran;
	int molecount = 0;
	JButton b;
	JButton mole;
	Dimension d = new Dimension(100, 50);
	JPanel p = new JPanel();
	JFrame frame = new JFrame();
	Date sd;
	int mc = 0;

	public void run() {
		make();
		frame.add(p);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	sd = new Date();
	}

	void speak(String words) {
		/*
		 * try { Runtime.getRuntime().exec("say " + words).waitFor(); } catch (Exception
		 * e) { e.printStackTrace(); }
		 */
		System.out.println(words);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == mole) {
			molecount++;
			make();
			if (molecount >= 10) {
endGame(sd,molecount);
			}
		} else {
			if (mc == 0) {
				speak("You missed the mole.");	
			}else if (mc == 1) {
				speak("Hi");	
			}else if (mc == 2) {
				speak("bye");	
			}else if (mc == 3) {
				speak("Somthing");	
			}else if (mc == 4) {
				speak("You lose");	
				System.exit(0);
			}
			mc++;
			make();
		}
	}

	public void make() {
		ran = r.nextInt(24);
		p = new JPanel();
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(p);
		frame.setSize(600, 600);

		for (int i = 0; i < 24; i++) {
			if (ran == i) {
				this.mole = new JButton();
				this.mole.setText("mole");
				this.mole.setPreferredSize(d);
				this.mole.addActionListener(this);
				p.add(mole);

			} else {
				this.b = new JButton();
				b.setPreferredSize(d);
				b.addActionListener(this);
				p.add(b);
			}
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
}