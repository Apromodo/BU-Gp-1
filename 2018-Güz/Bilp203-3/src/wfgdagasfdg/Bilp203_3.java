package wfgdagasfdg;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bilp203_3 {

public Bilp203_3(){

JFrame frame = new JFrame("Button Demo");

frame.setSize(180,200);
frame.setVisible(true);
BilesenleriEkle(frame.getContentPane());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);



}

private void BilesenleriEkle(Container frame){

JPanel panel = new JPanel();
JLabel label = new JLabel("Adınız: ");
JTextField field= new JTextField(10);
JTextField field1=new JTextField(10);
JButton button =new JButton("TAMAM");

field1.setEditable(false);
field1.setBorder(null);

button.addActionListener(new ActionListener(){

@Override
public void actionPerformed(ActionEvent e) {

field1.setText(field.getText());
field.setText(null);

}





}
);




panel.add(label);
panel.add(field);
panel.add(button);
panel.add(field1);
frame.add(panel);




}


public static void main(String[] args){





//Bilp203_3();
}





}
