package osnovni;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Glavna {
	
	Frame f = new Frame("Vezba 4.1");
	
	public Glavna() {
		f.setBounds(100, 100, 500, 500);
		f.setLayout(null);
		f.setVisible(true);
		Label l1 = new Label("Prvi broj");
		Label l2 = new Label("Drugi broj");
		Label l3 = new Label("Resenje je");
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		Button b1 = new Button("Izracunaj");
		Button b2 = new Button("Izracunaj");
		MenuBar traka = new MenuBar();
		Menu meni = new Menu("Glavni meni");
		Dialog z = new Dialog(f, "Zbir", false);
		Dialog r = new Dialog(f, "Razlika", false);
		meni.add("Zbir");
		meni.add("Razlika");
		meni.add("Izlaz");
		traka.add(meni);
		f.setMenuBar(traka);
		z.setLayout(null);
		r.setLayout(null);
		z.setBounds(200, 200, 400, 400);
		r.setBounds(200, 200, 400, 400);
		l1.setBounds(50, 50, 100, 20);
		l2.setBounds(200, 50, 100, 20);
		l3.setBounds(125, 180, 100, 20);
		b1.setBounds(125, 125, 100, 30);
		b2.setBounds(125, 125, 100, 30);
		tf1.setBounds(50, 75, 100, 20);
		tf2.setBounds(200, 75, 100, 20);
		z.add(l1);
		z.add(l2);
		z.add(l3);
		z.add(tf1);
		z.add(tf2);
		z.add(b1);
		r.add(l1);
		r.add(l2);
		r.add(l3);
		r.add(tf1);
		r.add(tf2);
		r.add(b2);
		
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
		z.addWindowListener(new WindowListener() {
			
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
				z.dispose();
				
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
		r.addWindowListener(new WindowListener() {
			
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
				r.dispose();
				
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

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double m = Double.parseDouble(tf1.getText());
				double n = Double.parseDouble(tf2.getText());
				double sum = m + n;
				l3.setText("Resenje je " +  Double.toString(sum));
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double m = Double.parseDouble(tf1.getText());
				double n = Double.parseDouble(tf2.getText());
				double sum = m - n;
				l3.setText("Resenje je " + Double.toString(sum));
			}
		});
		meni.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String komanda = e.getActionCommand();
				if(komanda.equals("Zbir")) z.setVisible(true);
				else  if(komanda.equals("Razlika")) r.setVisible(true);
				else if(komanda.equals("Izlaz")) System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Glavna();

	}

}
