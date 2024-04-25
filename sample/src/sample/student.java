package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class student {

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
					student window = new student();
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
	public student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(177, 135, 186));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(69, 24, 216, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NO");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(21, 56, 67, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BRANCH");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(21, 106, 67, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PROG LAGS");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(20, 167, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NAME");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_4.setBounds(21, 67, 46, 34);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(21, 123, 19, -3);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("GENDER");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_6.setBounds(21, 131, 46, 25);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(106, 49, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 74, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "CS", "AIML", "DS", "IOT"}));
		comboBox.setToolTipText("select");
		comboBox.setBounds(106, 102, 86, 22);
		frame.getContentPane().add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE");
		rdbtnNewRadioButton.setBounds(106, 132, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
		rdbtnNewRadioButton_1.setBounds(232, 132, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C");
		chckbxNewCheckBox.setBounds(106, 166, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PYTHON");
		chckbxNewCheckBox_1.setBounds(215, 166, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("JAVA");
		chckbxNewCheckBox_2.setBounds(314, 166, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() 
		public void actionperformed(ActionEvent e) {
			String roll=tb1.getText();
			String name=tb2.getText();
			String branch=(string)cb1.getSelectedItem(;)
		    String gender="";
			string langs="";
			if(r1.isSelected())
			{
				gender="male";
			}
			if(r2.isSelected())
			{
				gender="female";
			}
			if(c1.isSelected())
			{				
				langs=langs+"c";
			}
			if(c2.isSelected())
			{
				langs=langs+"java";
			}
			if(c3.isSelected())
				
			{
				langs=langs+"python";
			}
		    J0ptionPane.showMessageDialog(btnNewButton,"ROLL: "+roll+"\n Name"+name+"\n Branch"+branch+"\n GENDER"+gender+"\n PROG LAGS"+langs);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setBounds(106, 211, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
