package Osnovni;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Glavna {

	Frame f = new Frame("Rad sa menijem");
	
	public Glavna() {
		f.setBounds(100, 100, 500, 300);
		f.setLayout(null);
		f.setVisible(true);
		MenuBar traka = new MenuBar();
		Menu prvi = new Menu("Prvi meni");
		Menu drugi = new Menu("Drugi meni");
		prvi.add("Meni 1 stavka 1");
		prvi.add("Meni 1 stavka 2");
		prvi.add("Izlaz");
		drugi.add("Meni 2 stavka 1");
		drugi.add("Meni 2 stavka 2");
		traka.add(prvi);
		traka.add(drugi);
		f.setMenuBar(traka);
		
		prvi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String komanda = e.getActionCommand();
				if(komanda.equals("Izlaz")) System.exit(0);
				else f.setTitle("Izabrali ste " + komanda);
			}
		});
		drugi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String komanda = e.getActionCommand();
				if(komanda.equals("Izlaz")) System.exit(0);
				else f.setTitle("Izabrali ste " + komanda);
			}
		});
	}

	public static void main(String[] args) {
		new Glavna();
	}

}
