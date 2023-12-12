package osnovni;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Glavna {
	
	Frame f = new Frame();
	Button b1 = new Button("Napred");
	Button b2 = new Button("Nazad");
	Button b3 = new Button("Reset");
	Button b4 = new Button("Izlaz");
	Label l = new Label("0");
	
	public int n = 0;
	
	public Glavna() {
		f.setBounds(200, 200, 400, 400);
		b1.setBounds(100, 100, 60, 20);
		b2.setBounds(200, 100, 60, 20);
		b3.setBounds(100, 200, 60, 20);
		b4.setBounds(200, 200, 60, 20);
		l.setBounds(300, 300, 100, 20);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n += 5;
				l.setText(Integer.toString(n));
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n -= 5;
				l.setText(Integer.toString(n));
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n = 0;
				l.setText(Integer.toString(n));
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		f.setVisible(true);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(l);
		
	}
	
	public static void main(String[] args) {
		new Glavna();
	}

}
