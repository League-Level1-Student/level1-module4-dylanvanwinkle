package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	Random r = new Random();
	int ran;
	JButton b;
	JButton mole;
	Dimension d = new Dimension(100, 50);
	JPanel p = new JPanel();
	JFrame frame = new JFrame();

	public void run() {
		 ran = r.nextInt(24);
		 make();
		frame.setSize(600, 600);
		frame.add(p);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
void speak(String words) { 
   /* try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }*/
System.out.println(words);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == mole) {
	}else {
		speak("You missed the mole.");
		frame.dispose();
		make();
	}
}
public void make() {
	p = new JPanel();
	frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(p);
	for (int i = 0; i < 24; i++) {
		if (ran == i) {
			this.mole = new JButton("mole");
			mole.setPreferredSize(d);
			mole.addActionListener(this);
			p.add(mole);

		} else {
			this.b = new JButton();
			b.setPreferredSize(d);
			b.addActionListener(this);
			p.add(b);
		}
	}
}
}