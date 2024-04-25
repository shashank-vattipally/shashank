package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MOVIETICKETBOOKING {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MOVIETICKETBOOKING window = new MOVIETICKETBOOKING();
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
	public MOVIETICKETBOOKING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 460, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(126, 11, 219, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(35, 59, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(171, 56, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "HANUMAN", "PREMALU", "TILLU SQUARE"}));
		cb1.setBounds(168, 105, 89, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6"}));
		cb2.setBounds(168, 156, 89, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(35, 109, 76, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(35, 160, 123, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton b1 = new JButton("CONFIRM");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						String name=tb1.getText();				 
						String movie=(String) cb1.getSelectedItem();						   
						String ticket=(String) cb2.getSelectedItem();
						int nt=Integer.parseInt(ticket);
						int bill=0;
						if(movie.equals("HANUMAN"))
						{
							bill=bill+nt*150;
						}
						if(movie.equals("PREMALU"))
						{
							bill=bill+nt*250;
						}
						if(movie.equals("TILLU SQUARE"))
						{
							bill=bill+nt*350;
						}
						int res=0;
						res=JOptionPane.showConfirmDialog(b1,"NAME:"+name+"\n MOVIE NAME : "+movie+"\n NUMBER OF TICKETS :"+nt+ "\n AMOUNT :"+bill );
						if(res== YES_OPTION)
						{
							JOptionPane.showMessageDialog(b1,"BOOKING CONFIRMED");
							
						}
						else
						{
							JOptionPane.showMessageDialog(b1,"BOOKING CANCLLED");
						}
			}
		});
		
	
		b1.setBounds(187, 227, 89, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\movie.jpg"));
		lblNewLabel_4.setBounds(0, 0, 451, 261);
		frame.getContentPane().add(lblNewLabel_4);
		
		
	}
}
