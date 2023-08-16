package END;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class O3_RadioButton {

	public static void main(String[] args) {
		
		RadioDemo obj = new RadioDemo();

	}

}

class RadioDemo extends JFrame implements ActionListener , ItemListener
{
	JTextField t1 ;
	JButton b1;
	JRadioButton r1 , r2;
	JLabel l ;
	JCheckBox c1 , c2;
	
	public RadioDemo()
	{
		
		t1 = new JTextField(15);
		
		b1 = new JButton("OK");
		
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		
		l = new JLabel("Greeting");
		
		c1 = new JCheckBox("Dancing");
		c2 = new JCheckBox("Singing");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		add(t1);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(b1);
		add(l);
		
		c1.addItemListener(this);
		
		b1.addActionListener(this);
		
		
		setLayout(new FlowLayout());     
		setVisible(true);
		setSize(300,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String name = t1.getText();
		
		if(r1.isSelected())
		{
			name = "Mr." + name;
		}
		else {
			name = "Ms." + name;
		}
		
		if(c1.isSelected())
		{
			name = name + " Dancer";
		}
		if(c2.isSelected())
		{
			name = name + " Singer";
		}
		l.setText(name);
	}
	
	public void itemStateChanged(ItemEvent il)
	{
		System.out.println("Dancer");
		
	}
}
