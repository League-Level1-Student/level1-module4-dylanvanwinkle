package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JFrame frame = new JFrame();
	JButton b1 = new JButton("Trick");
	JButton b2 = new JButton("Treat");
	JPanel panel = new JPanel();
	String trickPic = "https://live.staticflickr./com4109/4985420598_1ab2e4c434_b.jpg";
	String treatPic = "https://live.staticflickr./com4109/4985420598_1ab2e4c434_b.jpg";

	public void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		panel.add(b1);
		panel.add(b2);
		frame.add(panel);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			showPictureFromTheInternet(trickPic);
		}else if (e.getSource() == b2) {
			showPictureFromTheInternet(treatPic);
		}
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}