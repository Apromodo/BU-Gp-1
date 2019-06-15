import javax.swing.border.TitledBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainClass {

	public MainClass() {

		JFrame frame = new JFrame("Counter");
		frame.setSize(500, 100);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		bilesenler(frame.getContentPane());

	}

	int[] dizi = { 1, 2, 3, 4, 5 };

	private void bilesenler(java.awt.Container contentPane) {

		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder("Counter"));

		JLabel lb1 = new JLabel("Counter:");
		JTextField tf1 = new JTextField(5);
		tf1.setText("0");
		tf1.setEditable(false);
		JRadioButton ust = new JRadioButton("Up");
		JRadioButton alt = new JRadioButton("Down");
		ButtonGroup grup = new ButtonGroup();
		grup.add(ust);
		grup.add(alt);

		JLabel step = new JLabel("Step:");
		JComboBox cb = new JComboBox();
		cb.addItem(0);
		cb.addItem(1);
		cb.addItem(2);
		cb.addItem(3);
		cb.addItem(4);
		cb.addItem(5);

		JButton btn = new JButton("COUNT");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int sayac = 0;
				if (ust.isSelected()) {

					sayac = Integer.parseInt(tf1.getText()) + cb.getSelectedIndex();

					tf1.setText(String.valueOf(sayac));

				} else {

					sayac = Integer.parseInt(tf1.getText()) - cb.getSelectedIndex();

					tf1.setText(String.valueOf(sayac));

				}

			}

		});

		panel1.add(lb1);
		panel1.add(tf1);
		panel1.add(ust);
		panel1.add(alt);
		panel1.add(step);
		panel1.add(cb);
		panel1.add(btn);

		contentPane.add(panel1);

	}

	public static void main(String[] args) {

		new MainClass();

	}

}
