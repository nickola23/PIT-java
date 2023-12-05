package osnovni;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Glavna {
	
	Frame f = new Frame("CheckBox");
	Label l1 = new Label("Prva");
	Label l2 = new Label("Druga");
	Checkbox c1 = new Checkbox("Python");
	Checkbox c2 = new Checkbox("Java");
	
	public Glavna() {
		f.setLayout(null);
		f.setBounds(100, 100, 400, 400);
		f.setVisible(true);
		l1.setBounds(50, 50, 200, 20);
		l2.setBounds(50, 80, 200, 20);
		c1.setBounds(150, 150, 150, 20);
		c2.setBounds(150, 180, 150, 20);
		f.add(c1);
		f.add(c2);
		f.add(l1);
		f.add(l2);
		c1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
			  l1.setText("Potvrdili ste Python : " + (e.getStateChange() == 1 ? "Potvrdjeno" : "Nepotvrdjeno"));
				
			}
		});
		c2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
			  l2.setText("Potvrdili ste Python : " + (e.getStateChange() == 1 ? "Potvrdjeno" : "Nepotvrdjeno"));
				
			}
		});
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
				System.exit(1);
				
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
	}
	
	public static void main(String[] args) {
		new Glavna();

	}

}
