package STUDENTREG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class STUDLOGINPAGE {

	private JFrame frame;
	private JTextField tb1;
	private JTextField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STUDLOGINPAGE window = new STUDLOGINPAGE();
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
	public STUDLOGINPAGE() {
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
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(158, 25, 95, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l1 = new JLabel("NAME");
		l1.setFont(new Font("Tahoma", Font.BOLD, 11));
		l1.setBounds(39, 85, 46, 14);
		frame.getContentPane().add(l1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(39, 138, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton b1 = new JButton("SUBMIT");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=tb1.getText();
			    String password=p1.getText();
			    try
			    {
			    	Connection con=DriverManager.getConnection("jdbc:mysql:3306/mydb","root","mrec");
			    	PreparedStatement st=con.prepareStatement("select name,password from users where name=? amd password =?");
			    	st.setString(1, name);
			    	st.setString(2, password);
			    	Resultset rs=st.executeQuery();
			    	if(rs.next())
			    	{
			    		JOptionPane.showMessageDialog(b1,"valid user" );
		
			    		
			    	}
			    	else
			    	{
			    		JOptionPane.showMessageDialog(b1,"Invalid user" );
			    	}
			    }
			    catch(SQLException e1)
			    {
			    	e1.printStackTrace();
			    }	
			}
		});
		b1.setBounds(175, 191, 89, 23);
		frame.getContentPane().add(b1);
		
		tb1 = new JTextField();
		tb1.setBounds(128, 82, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JTextField();
		p1.setBounds(128, 132, 86, 20);
		frame.getContentPane().add(p1);
		p1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\images.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
