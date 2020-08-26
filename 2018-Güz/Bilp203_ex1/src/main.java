            
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import javax.swing.*;
 import javax.swing.JFrame;

public class main {

public main(){
JFrame frame = new JFrame("Frame - Panel - Button");

frame.setSize(800, 600);
frame.setLayout(null);
biseylerekle(frame.getContentPane());
frame.setVisible(true);
frame.setLocationRelativeTo(null);

}
private void biseylerekle(Container contentPane) {
JPanel panel1 = new JPanel();
JPanel panel2 = new JPanel();
JPanel panel3 = new JPanel();
JPanel panel4 = new JPanel();
JButton buton1 = new JButton("Button1");
JButton buton2 = new JButton("Button2");
JButton buton3 = new JButton("Button3");
JLabel yaz1=new JLabel("TUĞBA ALTINDAĞ abi... ");
JLabel yaz2=new JLabel("Hillo");
     JTextField elyazi1 = new JTextField();
     JTextField elyazi2 = new JTextField();
              JTextArea tear = new JTextArea();
              JTextArea tear2 = new JTextArea();
              
panel1.setVisible(true);
panel1.setBorder(new TitledBorder("PANEL 1"));
panel1.setBounds(38,34,133,120);
contentPane.add(panel1);
contentPane.add(panel2);
contentPane.add(panel3);
contentPane.add(panel4);
panel1.add(buton1);
panel1.add(buton2);
panel1.add(buton3);
panel2.setVisible(true);
panel2.setBorder(new TitledBorder("PANEL 2"));
panel2.setBounds(223,34,133,120);
panel2.add(yaz1);
panel2.add(yaz2);

panel3.setVisible(true);
panel3.setBorder(new TitledBorder("PANEL 3"));
panel3.setBounds(400,34,133,120);
panel3.setLayout(null);
 elyazi1.setBounds(15,20,100,20);
 elyazi2.setBounds(15,50,100,20);
 panel3.add(elyazi1);
 panel3.add(elyazi2);
 
 tear.setBounds(15,20,100,20);
 tear2.setBounds(15,50,100,20);
 panel4.setVisible(true);
 panel4.setBorder(new TitledBorder("PANEL 4"));
 panel4.setBounds(575,34,133,120);
 panel4.setLayout(null);
 panel4.add(tear);
 panel4.add(tear2);
}
public static void main(String[] args) {
new main();
}

}          