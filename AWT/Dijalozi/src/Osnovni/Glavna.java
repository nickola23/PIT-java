package Osnovni;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Glavna {
	
	Frame f = new Frame("Rad sa dijalozima");
	
	public Glavna() {
		f.setBounds(100, 100, 300, 300);
		f.setLayout(null);
		f.setVisible(true);
		Button b1 = new Button("Otvori dijalog");
		Button b2 = new Button("OK");
		Label l = new Label("Klikni OK za izlaz");
		l.setBounds(50, 50, 100, 20);
		b1.setBounds(100, 100, 100, 30);
		b2.setBounds(70, 75, 60, 30);
		f.add(b1);
		Dialog d = new Dialog(f, "Prozor dijaloga", false);
		d.setLayout(null);
		d.setSize(200, 200);
		d.add(b2);
		d.add(l);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				d.setVisible(true);
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
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
	}
	
	public static void main(String[] args) {
		new Glavna();
	}

}
