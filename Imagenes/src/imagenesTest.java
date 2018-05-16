import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class imagenesTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imagenesTest window = new imagenesTest();
					window.frame.setVisible(true);


					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public imagenesTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0,1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panelsito = new JPanel();
		panelsito.setBounds(0, 0, 1000, 1000);
		frame.getContentPane().add(panelsito);
		
		
		


		
		JLabel ficha = new JLabel("");
		ficha.setBounds(0, 0, 500, 500);
		panelsito.add(ficha);
		ImageIcon fichita = new ImageIcon(getClass().getResource("fichita.png"));
		ficha.setIcon(fichita);
		
		/////
		JLabel lab = new JLabel("");
		lab.setBounds(0, 0, 1000, 1000);
		panelsito.add(lab);
		ImageIcon ico = new ImageIcon(getClass().getResource("tablero.png"));
		lab.setIcon(ico);		

	}
}
