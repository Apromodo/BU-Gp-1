
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Date;

public class Bilp203_1 {
public Bilp203_1(){
JFrame frame = new JFrame("Text Sampler");
frame.setSize(450, 180);
frame.setLayout(null);
BilesenleriEkle(frame.getContentPane());
frame.setVisible(true);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private void BilesenleriEkle(Container contentPane) {
JPanel panel = new JPanel();

JLabel textLabel = new JLabel("JTextField:");
JLabel passLabel = new JLabel("JPasswordField:");
JLabel formatLabel = new JLabel("JFormattedTextField:");
JLabel label = new JLabel("Bir alana veri girdikten sonra Enter tuşuna basınız.");

JTextField field = new JTextField();
JPasswordField pass = new JPasswordField();
JFormattedTextField format = new JFormattedTextField();

panel.setBorder(new TitledBorder("Text Fields"));
panel.setBounds(5,5,400,120);
panel.setLayout(null);

textLabel.setBounds(10,15,120,20);
passLabel.setBounds(10,35,120,20);
formatLabel.setBounds(10,55,120,20);
label.setBounds(10, 80, 300, 20);

field.setBounds(150, 15, 120, 20);
pass.setBounds(150,35,120,20);
format.setBounds(150,55,120,20);

textLabel.setHorizontalAlignment(SwingConstants.RIGHT);
passLabel.setHorizontalAlignment(SwingConstants.RIGHT);
formatLabel.setHorizontalAlignment(SwingConstants.RIGHT);

format.setValue(new Date());
format.setEditable(false);

panel.add(textLabel);
panel.add(field);
panel.add(passLabel);
panel.add(pass);
panel.add(formatLabel);
panel.add(format);
panel.add(label);
contentPane.add(panel);
}

public static void main(String[] args) {
new Bilp203_1();
}
}