package osnovni;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import java.awt.event.ActionListener;

public class Paint3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint3 frame = new Paint3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Paint3() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
	int [] x =  {50, 150 , 25, 150};
	int [] y = {50, 100, 150, 200};
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
//		g.drawLine(100, 100, 300, 300);
//		g.drawRect(100, 100, 100, 150);
//		g.draw3DRect(100, 100, 200, 150, true);
//		g.drawRoundRect(100, 100, 200, 150, 50, 50);
//		g.drawArc(100, 100, 150, 150, 45, 135);
//		g.drawString("Proba", 100, 100);
//		g.drawOval(100, 100, 150, 100);
		g.setColor(Color.red);
//		g.fillArc(100, 100, 150, 150, 45, 120);
//		g.fillOval(100, 100, 100, 100);
//		g.drawPolygon(x, y, 3);
//		g.drawPolyline(x, y, 4);
		g.fillPolygon(x, y, 4);
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
