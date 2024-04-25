package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class METROTICKETBOOKING {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METROTICKETBOOKING window = new METROTICKETBOOKING();
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
	public METROTICKETBOOKING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 517, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(141, 11, 208, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(51, 67, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(51, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(51, 165, 88, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(276, 67, 118, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String s=(String) cb1.getSelectedItem();
				int nt=(int)jsp1.getValue();
				int bill=0;
				if(equals(d))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please check stastions");
				}
				else
				{
					bill=bill+nt*45;
					JOptionPane.showMessageDialog(btnNewButton, "NAME :"+name+"\n SOURCE :"+s+"");
					
				}
			}
		});
		btnNewButton.setBounds(219, 207, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setBounds(141, 64, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KAVADIGUDA", "JNTU", "LB NAGAR", "NARAYANA GUDA"}));
		cb1.setBounds(141, 113, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "MIYAPUR", "AMEERPET", "PANJAGUTTA"}));
		cb2.setBounds(141, 161, 86, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_5 = new JLabel("JOURNEY DATE");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(276, 117, 88, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSpinner jsp1 = new JSpinner();
		jsp1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		jsp1.setBounds(396, 64, 88, 20);
		frame.getContentPane().add(jsp1);
		
		JSpinner jsp2 = new JSpinner();
		jsp2.setModel(new SpinnerDateModel(new Date(1713810600000L), new Date(1713810600000L), new Date(1714329000000L), Calendar.DAY_OF_YEAR));
		jsp2.setBounds(396, 114, 88, 20);
		frame.getContentPane().add(jsp2);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\green-line-metro-route_0_1200.jpg"));
		lblNewLabel_6.setBounds(0, 0, 501, 252);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
