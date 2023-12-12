package osnovni;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Glavna {
	
	Frame f = new Frame("GroupBox");
	Label l = new Label("label");
	CheckboxGroup cg = new CheckboxGroup();	
	Checkbox c1 = new Checkbox("C++", cg, false);
	Checkbox c2 = new Checkbox("Java", cg, true);
	public Glavna() {
		f.setBounds(200, 200, 400, 400);
		f.setLayout(null);
		f.setVisible(true);
		l.setBounds(50, 50, 200, 20);
		c1.setBounds(100, 100, 100, 20);
		c2.setBounds(100, 150, 100, 20);
		f.add(c1);
		f.add(c2);
		f.add(l);
		f.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		c1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				l.setText("Izabrali ste C++");
				
			}
		});
		c2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				l.setText("Izabrali ste Java");
				
			}
		});
	}
	
	public static void main(String[] args) {
		new Glavna();
	}

}
