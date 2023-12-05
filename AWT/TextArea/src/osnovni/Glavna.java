package osnovni;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Glavna {
	
	Frame f = new Frame("Brojanje reci i recenica");
	Label l1 = new Label("Broj reci je");
	Label l2 = new Label("Broj recenica je");
	TextArea t = new TextArea();
	Button b = new Button("Prebroj");
	
	public Glavna() {
		f.setLayout(null);
		f.setBounds(100, 100, 400, 400);
		f.setVisible(true);
		l1.setBounds(50, 50, 100, 20);
		l2.setBounds(200, 50, 200, 20);
		t.setBounds(50, 80, 300, 200);
		b.setBounds(150, 300, 100, 30);
		f.add(b);
		f.add(t);
		f.add(l1);
		f.add(l2);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = t.getText();
				String niz[] = s.split("\\s");
				l1.setText("Broj reci je " + niz.length);
				l2.setText("Broj karaktera je " + s.length());
				
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
