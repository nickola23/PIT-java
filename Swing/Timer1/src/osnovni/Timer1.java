package osnovni;

import java.awt.EventQueue;

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

public class Timer1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final Action action = new SwingAction();
	
	Timer tm;
	int i = 0, korak = 1;
	ActionListener osluskivac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Timer1 frame = new Timer1();
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
	public Timer1() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBroj = new JLabel("0");
		lblBroj.setBounds(279, 234, 46, 14);
		contentPane.add(lblBroj);
		
		JButton btnNapred = new JButton("Napred");
		
		btnNapred.setBounds(123, 308, 89, 23);
		contentPane.add(btnNapred);
		
		JButton btnStop = new JButton("Stop");
		
		btnStop.setBounds(386, 308, 89, 23);
		contentPane.add(btnStop);
		
		JButton btnNazad = new JButton("Nazad");
		
		btnNazad.setBounds(123, 274, 89, 23);
		contentPane.add(btnNazad);
		
		JButton btnReset = new JButton("Reset");
		
		btnReset.setBounds(386, 274, 89, 23);
		contentPane.add(btnReset);
		
		btnNapred.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				korak = 1;
				tm.start();
			}
		});
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tm.stop();
			}
		});
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				korak = -1;
				tm.start();
			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = 0;
				lblBroj.setText(Integer.toString(i));
				tm.stop();
			}
		});
		osluskivac = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblBroj.setText(Integer.toString(i));
				i += korak;
			}
		};
		tm = new Timer(100, osluskivac);
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
