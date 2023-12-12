package osnovni;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Glavna {
	
	Frame f = new Frame("GroupBox");
	Label l = new Label("label");
	Button b = new Button("OK");
	Choice c = new Choice();
	Glavna(){
		f.setBounds(200, 200, 400, 400);
		l.setBounds(100, 50, 200, 20);
		b.setBounds(300, 150, 50, 20);
		c.setBounds(100, 150, 100, 20);
		f.setLayout(null);
		f.setVisible(true);
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
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "Izabrali ste jezik: " + c.getSelectedItem();
				l.setText(text);
			}
		});
		c.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String text = "Izabrali ste jezik: " + c.getSelectedItem();
				l.setText(text);
				
			}
		});
		c.add("Java");
		c.add("C++");
		c.add("Python");
		c.add("Pascal");
		c.add("C#");
		f.add(c);
		f.add(b);
		f.add(l);
	}

	public static void main(String[] args) {
		new Glavna();

	}

}
