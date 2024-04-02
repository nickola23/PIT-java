package osnovni;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Kalkulator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final Action action = new SwingAction();
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator frame = new Kalkulator();
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
	public Kalkulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(55, 28, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(55, 59, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(55, 96, 228, 20);
		contentPane.add(textField_2);
		
		int i = 0;
		double br;
		double nizbr[] = new double[23], nizop[]  = new double[23];
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());
				double result = num1 - num2;
				textField_2.setText(Double.toString(result));
			}
		});
		btnNewButton_1.setBounds(173, 58, 50, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());
				double result = num1 / num2;
				textField_2.setText(Double.toString(result));
			}
		});
		btnNewButton_3.setBounds(233, 58, 50, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());
				double result = num1 + num2;
				textField_2.setText(Double.toString(result));
			}
		});
		btnNewButton.setBounds(173, 27, 50, 23);
		contentPane.add(btnNewButton);
		
		JButton btnX = new JButton("x");
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());
				double result = num1 * num2;
				textField_2.setText(Double.toString(result));
			}
		});
		btnX.setBounds(233, 27, 50, 23);
		contentPane.add(btnX);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.setBounds(55, 239, 50, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("2");
		btnNewButton_2_1.setBounds(115, 239, 50, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.setBounds(173, 239, 50, 23);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("4");
		btnNewButton_2_3.setBounds(55, 273, 50, 23);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("5");
		btnNewButton_2_4.setBounds(115, 273, 50, 23);
		contentPane.add(btnNewButton_2_4);
		
		JButton btnNewButton_2_5 = new JButton("6");
		btnNewButton_2_5.setBounds(173, 273, 50, 23);
		contentPane.add(btnNewButton_2_5);
		
		JButton btnNewButton_2_6 = new JButton("7");
		btnNewButton_2_6.setBounds(55, 307, 50, 23);
		contentPane.add(btnNewButton_2_6);
		
		JButton btnNewButton_2_7 = new JButton("8");
		btnNewButton_2_7.setBounds(115, 307, 50, 23);
		contentPane.add(btnNewButton_2_7);
		
		JButton btnNewButton_2_8 = new JButton("9");
		btnNewButton_2_8.setBounds(173, 307, 50, 23);
		contentPane.add(btnNewButton_2_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(55, 206, 240, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_2_8_1 = new JButton("-");
		btnNewButton_2_8_1.setBounds(245, 239, 50, 23);
		contentPane.add(btnNewButton_2_8_1);
		
		JButton btnNewButton_2_8_2 = new JButton("+");
		btnNewButton_2_8_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nizbr[i] = Double.parseDouble(textField_3.getText());
				textField_3.setText(textField_3.getText() + " + ");
			}
		});
		btnNewButton_2_8_2.setBounds(245, 273, 50, 57);
		contentPane.add(btnNewButton_2_8_2);
		
		JButton btnNewButton_2_8_4 = new JButton("x");
		btnNewButton_2_8_4.setBounds(55, 341, 50, 23);
		contentPane.add(btnNewButton_2_8_4);
		
		JButton btnNewButton_2_8_5 = new JButton("-");
		btnNewButton_2_8_5.setBounds(115, 341, 50, 23);
		contentPane.add(btnNewButton_2_8_5);
		
		JButton btnNewButton_2_8_6 = new JButton("=");
		btnNewButton_2_8_6.setBounds(173, 341, 125, 23);
		contentPane.add(btnNewButton_2_8_6);
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
