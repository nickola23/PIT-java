package osnovni;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Glavna {
	
	Frame f = new Frame();
	Label l1 = new Label("Ime");
	Label l2 = new Label("Prezime");
	Label l3 = new Label("Grad");
	Label l4 = new Label("Nadimak");
	Label l5 = new Label("Nacin unosa");
	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	TextField tf3 = new TextField();
	TextField tf4 = new TextField();
	Choice c = new Choice();
	TextArea t = new TextArea();
	Button b = new Button("Dodaj");
	Glavna(){
		f.setBounds(200, 200, 400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(100,100,450,450);
		f.setVisible(true);
		l1.setBounds(20,50,50,20);
		tf1.setBounds(80, 50, 100, 20);
		l2.setBounds(200, 50, 80, 20);
		tf2.setBounds(280, 50, 100, 20);
		l3.setBounds(20,100,50,20);
		tf3.setBounds(80, 100, 100, 20);
		l4.setBounds(200, 100, 80, 20);
		tf4.setBounds(280, 100, 100, 20);
		l5.setBounds(20, 150, 100, 20);
		c.setBounds(20, 170, 200, 20);
		c.add("Izaberite opciju");
		c.add("Ime + grad");
		c.add("Ime + prezime");
		c.add("Ime + prezime + nadimak");
		c.add("Ime + prezime + nadimak + grad");
		t.setBounds(50,200,200,200);
		b.setBounds(270,250,80,30);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.add(c);
		f.add(t);
		f.add(b);
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
				String ime = tf1.getText();
				String prezime = tf2.getText();
				String grad = tf3.getText();
				String nadimak = tf4.getText();
				String unos = c.getSelectedItem();
				switch (unos) {
                case "Ime + prezime":
                    t.append(ime + " " + prezime + "\n");
                    break;
                case "Ime + prezime + nadimak":
                    t.append(ime + " " + prezime + " " + nadimak + "\n");
                    break;
                case "Ime + grad":
                    t.append(ime + " " + grad + "\n");
                    break;
                case "Prezime + grad":
                    t.append(prezime + " " + grad + "\n");
                    break;
                case "Ime + prezime + nadimak + grad":
                    t.append(ime +" "+prezime + " "+ nadimak+  " " + grad + "\n");
                    break;
                default:
                    break;
            }
				
			}
		});
	}

	public static void main(String[] args) {
		new Glavna();

	}

}
