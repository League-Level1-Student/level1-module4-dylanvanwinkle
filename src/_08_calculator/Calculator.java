package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField t1 = new JTextField(10);
	JTextField t2 = new JTextField(10);
	JButton b1 = new JButton("add");
	JButton b2 = new JButton("sub");
	JButton b3 = new JButton("mul");
	JButton b4 = new JButton("div");
	JLabel l = new JLabel();
	double nt1;
	double nt2;

	public void run() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(t1);
		panel.add(t2);
		frame.add(panel);
		frame.pack();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	public double add(double n1, double n2) {
		return n1 + n2;
	}

	public double sub(double n1, double n2) {
		return n1 - n2;
	}

	public double mul(double n1, double n2) {
		return n1 * n2;
	}

	public double div(double n1, double n2) {
		return n1 / n2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		nt1 = Double.parseDouble(t1.getText());
		nt2 = Double.parseDouble(t2.getText());
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
l.setText(add(nt1,nt2) + "");
		} else if (e.getSource() == b2) {
			l.setText(sub(nt1,nt2) + "");
		} else if (e.getSource() == b3) {
			l.setText(mul(nt1,nt2) + "");
		} else if (e.getSource() == b4) {
			l.setText(div(nt1,nt2) + "");
		}
		panel.add(l);
		frame.add(panel);
		frame.pack();
	}

}
