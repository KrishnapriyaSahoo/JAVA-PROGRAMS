import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class LabelExample2 extends Frame implements ActionListener
{  
    JTextField tf; JLabel l; JButton b;  
    LabelExample2()
	{  
        tf=new JTextField();  
        tf.setBounds(50,50, 150,20);  
        l=new JLabel();  
        l.setBounds(50,100, 250,20);      
        b=new JButton("Find Name");  
        b.setBounds(50,150,95,30);  
        b.addActionListener(this);    
        add(b);add(tf);add(l);    
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e) {  
        try{
			String name=tf.getText();
			l.setText("My Name is  "+name);
           }catch(Exception ex){System.out.println(ex);}  
    }  
    public static void main(String[] args) {  
        new LabelExample2();  
    } }  
