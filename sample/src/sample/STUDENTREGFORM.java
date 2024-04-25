package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class STUDENTREGFORM {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STUDENTREGFORM window = new STUDENTREGFORM();
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
	public STUDENTREGFORM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REG FORM");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(124, 11, 207, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(35, 59, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MARKS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(35, 183, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ROLL NO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(35, 101, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BRANCH");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(35, 141, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(146, 56, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(146, 98, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		tb3 = new JTextField();
		tb3.setBounds(146, 180, 86, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "IT", "CSE"}));
		cb1.setBounds(146, 137, 86, 22);
		frame.getContentPane().add(cb1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String rollno=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String marks=tb3.getText();
				int m=Integer.parseInt(marks);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q="insert into student values ('"+name+"','"+rollno+"',"+ "'"+branch+"','"+m+"')";
					Statement stn=(Statement) con.createStatement();
					((java.sql.Statement) stn).executeUpdate(q);
					JOptionPane.showMessageDialog(btnNewButton, "inserted successfully");
					con.close();
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			 }	
			});
		btnNewButton.setBounds(173, 211, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	
		}
}