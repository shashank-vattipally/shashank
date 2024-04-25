package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;

public class BOOKSTORE {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BOOKSTORE window = new BOOKSTORE();
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
	public BOOKSTORE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ITEMS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(93, 38, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(186, 37, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PRICE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(93, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 68, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\712HEn9SNwL._AC_UF1000,1000_QL80_.jpg"));
		lblNewLabel_2.setBounds(14, 162, 247, 235);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\medium_bb9f2c35b7180820e05f4adbe78844edaf44adbc.jpg"));
		lblNewLabel_3.setBounds(309, 162, 209, 235);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BOOK STORE APP");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(176, 11, 137, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS:499");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(93, 133, 86, 18);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS:999");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(396, 137, 76, 14);
		frame.getContentPane().add(lblNewLabel_6);
	}

}
