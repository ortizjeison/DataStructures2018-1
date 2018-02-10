package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class myjframe extends JFrame {

	private JPanel contentPane;
	private JTextField numA;
	private JTextField numB;
	private JButton button;
	final 	Calculadora my_calc = new Calculadora();
	
	public myjframe() {
		setTitle("My calculadora");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		numA = new JTextField();
		numA.setBounds(72, 53, 114, 19);
		contentPane.add(numA);
		numA.setColumns(10);
		
		numB = new JTextField();
		numB.setBounds(72, 109, 114, 19);
		contentPane.add(numB);
		numB.setColumns(10);
		
		JButton sum_btn = new JButton("+");
		

		
		sum_btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				int suma = my_calc.sumar(numA.getText(), numB.getText());
				JOptionPane.showMessageDialog(null, suma);
			}
		});
		sum_btn.setBounds(208, 79, 62, 25);
		contentPane.add(sum_btn);
		
		button = new JButton("/");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int div = my_calc.div(numA.getText(), numB.getText());
				} catch (DivisionCero e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
		});
		button.setBounds(200, 144, 117, 25);
		contentPane.add(button);
	}
}
