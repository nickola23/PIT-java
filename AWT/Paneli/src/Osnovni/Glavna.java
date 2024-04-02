package Osnovni;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Glavna {
	
	Frame f = new Frame("Rad sa dijalozima");
	
	public Glavna() {
		f.setBounds(100, 100, 500, 500);
		f.setLayout(null);
		f.setVisible(true);
		dodajPanele();
		
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
	
	public void dodajPanele() {
		f.setLayout(new GridLayout(2, 2));
		Panel flow = new Panel();
		Panel card = new Panel();
		Panel border = new Panel();
		Panel grid = new Panel();
		card.setLayout(new CardLayout());
		border.setLayout(new BorderLayout());
		grid.setLayout(new GridLayout(2, 3));
		dodajTastere(flow);
		dodajTastere(card);
		dodajTastere(border);
		dodajTastere(grid);
		f.add(flow);
		f.add(card);
		f.add(border);
		f.add(grid);
	}
	
	public void dodajTastere(Panel p) {
		p.add("North", new Button("Jedan"));
		p.add("West", new Button("Dva"));
		p.add("East", new Button("Tri"));
		p.add("South", new Button("Cetiri"));
		p.add("Center", new Button("Pet"));
	}

	public static void main(String[] args) {
		new Glavna();

	}

}
