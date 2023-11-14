package Osnovni;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Glavna implements WindowListener{
	
	Button b = new Button("Klikni me");
	Frame f = new Frame("Prvi program");
	Label l = new Label("Labela");
	TextField tf = new TextField("Tekst u polju");
	
	Glavna(){
		f.setLayout(null);
		f.setBounds(500, 100, 300, 300);
		l.setBounds(50, 100, 100, 20);
		tf.setBounds(50 , 150, 100, 20);
		b.setBounds(50, 200, 100, 20);
		f.add(b);
		f.add(l);
		f.add(tf);
		f.setVisible(true);
		f.addWindowListener(this);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l.setText(tf.getSelectedText());
				
			}
		});
	}

	public static void main(String[] args) {
		
		new Glavna();

	}

	@Override
	public void windowOpened(WindowEvent e) {
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
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
