package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Zadatak1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zadatak1 frame = new Zadatak1();
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
	public Zadatak1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnOK = new JButton("OK");
		btnOK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblOK.setText("Kliknuo si OK dugme");
			}
		});
		
		JLabel label_4 = new JLabel("");
		btnOK.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		JButton btnOK_2 = new JButton("2");
		btnOK_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		JButton btnOK_1 = new JButton("1");
		btnOK_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		JLabel label_2 = new JLabel("");
		
		JLabel label_3 = new JLabel("");
		
		JButton btnOK_5 = new JButton("5");
		btnOK_5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		JLabel label_5 = new JLabel("");
		
		JLabel label_1 = new JLabel("");
		
		JLabel lblOK = new JLabel("Klikni ovo dugme");
		lblOK.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		
		JLabel label = new JLabel("");
		
		JButton btnOK_3 = new JButton("3");
		btnOK_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		JButton btnOK_4 = new JButton("4");
		btnOK_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(label_4);
		contentPane.add(btnOK);
		contentPane.add(btnOK_2);
		contentPane.add(btnOK_1);
		contentPane.add(label_2);
		contentPane.add(label_3);
		contentPane.add(btnOK_5);
		contentPane.add(label_5);
		contentPane.add(label_1);
		contentPane.add(lblOK);
		contentPane.add(label);
		contentPane.add(btnOK_3);
		contentPane.add(btnOK_4);
		
		
	}
}
