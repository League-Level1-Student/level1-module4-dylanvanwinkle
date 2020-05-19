package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	Random r = new Random();
	int ran;
	JButton spin = new JButton("spin");
	JPanel p = new JPanel();
	JFrame frame = new JFrame();
	String cherry = "cherry.jpg";
	String dice = "dice.png";
	String seven = "seven.png";
	JLabel l1;
	JLabel l2;
	JLabel l3;

	public void run() {
		p.add(spin);
		frame.add(p);
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		spin.addActionListener(this);
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

	public void make1() {
		ran = r.nextInt(3);

		if (ran == 0) {
			try {
				l1 = createLabelImage(cherry);
				p.add(l1);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (ran == 1) {
			try {
				l1 = createLabelImage(dice);
				p.add(l1);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (ran == 2) {
			try {
				l1 = createLabelImage(seven);
				p.add(l1);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void make2() {
		ran = r.nextInt(3);

		if (ran == 0) {
			try {
				l2 = createLabelImage(cherry);
				p.add(l2);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (ran == 1) {
			try {
				l2 = createLabelImage(dice);
				p.add(l2);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (ran == 2) {
			try {
				l2 = createLabelImage(seven);
				p.add(l2);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void make3() {
		ran = r.nextInt(3);

		if (ran == 0) {
			try {
				l3 = createLabelImage(cherry);
				p.add(l3);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (ran == 1) {
			try {
				l3 = createLabelImage(dice);
				p.add(l3);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (ran == 2) {
			try {
				l3 = createLabelImage(seven);
				p.add(l3);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// 1. Remove existing JPanel from frame
		frame.remove(p);
		
		// 2. Create new JPanel and add it to frame
		p = new JPanel();
		p.add(spin);
		p.setPreferredSize(new Dimension(600,600));
		
		make1();
		make2();
		make3();
		
		// 3. Repaint frame
		frame.add(p);
		frame.pack();
		System.out.println(l1);
		System.out.println(l2);
		if (l1 == l2 && l1 == l3 && l2 == l3 && l2 == l3) {
			JOptionPane.showMessageDialog(null, "You Win!!!!");
		}
	}
}