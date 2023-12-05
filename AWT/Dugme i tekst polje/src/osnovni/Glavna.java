package osnovni;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Glavna {
	ZatvaranjeProzora p = new ZatvaranjeProzora(this);
	Frame f = new Frame("Dugme i Tekst Polje");
	TextField tf = new TextField();
	Button b = new Button("Klikni");
	Label l = new Label();
	
	Glavna() {
		f.setLayout(null);
		//f.setSize(400, 300);
		f.setBounds(200, 200, 400, 300);
		
		tf.setBounds(150, 100, 100, 20);
		f.add(tf);
		
		b.setBounds(150, 150, 100, 20);
		f.add(b);
		
		l.setBounds(150, 80, 100, 10);
		f.add(l);
		
		f.setVisible(true);
		f.addWindowListener(p);
		Akcija a = new Akcija(this);
		b.addActionListener(a);
	}

	public static void main(String[] args) {
		new Glavna();
	}

}
