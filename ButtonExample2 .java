import java.awt.event.*;  
import javax.swing.*;    
public class ButtonExample2 
{  
	public static void main(String[] args) 
	{  
		JFrame f=new JFrame("Mamuni");  
		final JTextField tf=new JTextField();  
		tf.setBounds(50,50,150,20);  
		JButton b=new JButton("Click Here");  
		b.setBounds(50,100,95,30);  
		b.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{
				String name=tf.getText();
				tf.setText("Welcome to Nalanda College. "+name);  
			}  
		});  
		f.add(b);f.add(tf);  
		f.setSize(400,400);  
		f.setLayout(null);  
		f.setVisible(true);   
	}  
}  
