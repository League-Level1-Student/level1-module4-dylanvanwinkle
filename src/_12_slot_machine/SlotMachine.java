package _12_slot_machine;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	Random r = new Random();
	int ran;
	JButton spin;
	JPanel p = new JPanel();
	JFrame frame = new JFrame();

	public void run() {

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
public void make() {
	ran = r.nextInt(3);
	p = new JPanel();
	frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(p);
	frame.setSize(600, 600);

	for (int i = 0; i < 3; i++) {
		if (ran == 1) {


		} else {

		}
	}
}
}