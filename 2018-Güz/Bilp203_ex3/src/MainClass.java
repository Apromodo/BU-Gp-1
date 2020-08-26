import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainClass {

    public MainClass() {
        
        
        JFrame frame = new JFrame("Uygulama4");
        
        frame.setSize(600,100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        BilesenleriEkle(frame.getContentPane());
        
        
        
        
    }
    
    String[] auto= {"ABS","CD ÇALAR","HAVA YASTIĞI","KLİMA"};
    
    
    
    private void BilesenleriEkle(Container contentPane) {

        JPanel panel= new JPanel();
        JComboBox cb = new JComboBox(auto);
        JRadioButton rbtn1 = new JRadioButton("Araba");
        JRadioButton rbtn2 = new JRadioButton("Jip");
        JButton btn =new JButton("Seçim");
        JTextField tf=new JTextField(10);
        
        tf.setEditable(false);
        
        ButtonGroup group= new ButtonGroup();
        group.add(rbtn1);
        group.add(rbtn2);
        panel.add(cb);
        panel.add(rbtn1);
        panel.add(rbtn2);
        panel.add(btn);
        panel.add(tf);
        contentPane.add(panel);
        
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(rbtn1.isSelected()) {
                    
                    
                    tf.setText(cb.getSelectedItem()+" "+rbtn1.getText());
                    
                    
                }else {
                    
                    tf.setText(cb.getSelectedItem()+" "+rbtn2.getText());
                    
                }
                
            }            
        });;
        
    }
    public static void main(String[] args) {
    
        new MainClass();
        
    }

}
