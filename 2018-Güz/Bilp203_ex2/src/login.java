      
import javax.swing.JFrame;

import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import javax.swing.*;

public class login{

public login(){
JFrame frame = new JFrame("Text Sampler Demo");

frame.setSize(400, 200);
frame.setLayout(null);
loginform(frame.getContentPane());
frame.setVisible(true);
frame.setLocationRelativeTo(null);

}


public void loginform(Container contentPane) {

JPanel panel1= new JPanel();
JLabel yazi1 = new JLabel("JTextField :");
JTextField yazitext1=new JTextField();
JLabel pw1label= new JLabel("JPasswordField :");
JPasswordField pw1 = new JPasswordField();
JLabel tarihlabel = new JLabel("JFormattedField :");
JFormattedTextField tarih1=new JFormattedTextField();


contentPane.add(panel1);



panel1.setVisible(true);
panel1.setLayout(null);
panel1.setBorder(new TitledBorder("Text Fields"));
panel1.setBounds(7, 0, 370, 150);


yazi1.setBounds(50,30,100,20);
yazitext1.setBounds(140,30,125,20);
pw1label.setBounds(16,60,100,20);
pw1.setBounds(140,60,125,20);
tarihlabel.setBounds(16,90,100,20);
tarih1.setBounds(140,90,100,20);


panel1.add(pw1);
panel1.add(yazi1);
panel1.add(yazitext1);
panel1.add(pw1label);
panel1.add(tarihlabel);
panel1.add(tarih1);



}



public static void main(String[] args) {


new login();

}


}