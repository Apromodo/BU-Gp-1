
	import javax.swing.*;
	import java.awt.*;

	public class ArabaSecim {
	public ArabaSecim() {
	JFrame frame = new JFrame("Araba Seçim");
	frame.setSize(500,100);
	BilesenleriEkle(frame.getContentPane());
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void BilesenleriEkle(Container contentPane) {
	String[] auto = {"ABS", "CD Çalar", "Hava Yastığı", "Klima"};

	JPanel panel = new JPanel();
	JComboBox comboBox = new JComboBox(auto);
	JButton button = new JButton("SECİM");
	JTextField field = new JTextField(10);
	JRadioButton araba = new JRadioButton("Araba");
	JRadioButton jip = new JRadioButton("Jip");
	ButtonGroup group = new ButtonGroup();
	group.add(araba);
	group.add(jip);

	field.setEditable(false);

	panel.add(comboBox);
	panel.add(araba);
	panel.add(jip);
	panel.add(button);
	panel.add(field);

	contentPane.add(panel);
	}

	public static void main(String[] args) {
	new ArabaSecim();
	}
	}
