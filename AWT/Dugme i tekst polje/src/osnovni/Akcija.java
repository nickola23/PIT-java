package osnovni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Akcija implements ActionListener {
	Glavna g;
	public Akcija(Glavna g) { this.g = g; }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = g.tf.getText();
		g.f.setTitle(s);
	}

}
