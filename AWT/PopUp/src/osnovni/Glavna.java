package osnovni;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Popup;

public class Glavna {

	Frame f = new Frame("Rad sa PopUp");
	PopupMenu pop = new PopupMenu("Imene");
	public Glavna() {
		f.setBounds(200, 200, 400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.add(pop);
		MenuItem cut = new MenuItem("Iseci");
		MenuItem copy = new MenuItem("Kopiraj");
		MenuItem paste = new MenuItem("Nalepi");
		cut.setActionCommand("Iseci");
		copy.setActionCommand("Kopiraj");
		paste.setActionCommand("Nalepi");
		pop.add(cut);
		pop.add(copy);
		pop.add(paste);
		f.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				pop.show(f, e.getX(), e.getY());
				
			}
		});
		cut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle("Izabrali ste " + cut.getActionCommand());
			}
		});
		copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle("Izabrali ste " + copy.getActionCommand());
			}
		});
		paste.addActionListener(new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) {
			f.setTitle("Izabrali ste " + paste.getActionCommand());
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
