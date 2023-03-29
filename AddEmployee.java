package hotel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_age;
	private JTextField textField_salary;
	private JTextField textField_phoneno;
	private JTextField textField_email;
	private JTextField textField_adhaar;
	private JComboBox comboBoxjob;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee frame = new AddEmployee();
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
	public AddEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1103, 801);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Employee");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 38));
		lblNewLabel.setBounds(209, 26, 538, 72);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(86, 149, 208, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age");
		lblNewLabel_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(86, 287, 208, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(86, 345, 208, 37);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel job = new JLabel("Job");
		job.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		job.setBounds(86, 407, 208, 37);
		contentPane.add(job);
		
		textField = new JTextField();
		textField.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textField.setBounds(333, 146, 356, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rbmale = new JRadioButton("Male");
		rbmale.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		rbmale.setBounds(345, 353, 119, 21);
		contentPane.add(rbmale);
		
		
		
		textField_age = new JTextField();
		textField_age.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textField_age.setColumns(10);
		textField_age.setBounds(345, 284, 236, 43);
		contentPane.add(textField_age);
		
		JRadioButton rbfemale = new JRadioButton("Female");
		rbfemale.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		rbfemale.setBounds(535, 353, 119, 21);
		contentPane.add(rbfemale);
		//grouping the radio btn
				ButtonGroup bg =new ButtonGroup();
				bg.add(rbmale);
				bg.add(rbfemale);
		
		 comboBoxjob = new JComboBox();
		comboBoxjob.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		comboBoxjob.setModel(new DefaultComboBoxModel(new String[] {"Front Desk Clerk", "Porters", "House Keeping Kitchen Staff", "Chef", "Manager", "Accoutant", "Room Service"}));
		comboBoxjob.setBounds(333, 407, 219, 37);
		contentPane.add(comboBoxjob);
		
		JLabel salary = new JLabel("Salary");
		salary.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		salary.setBounds(86, 475, 208, 37);
		contentPane.add(salary);
		
		JLabel pnoneno = new JLabel("Phone No.");
		pnoneno.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		pnoneno.setBounds(86, 536, 208, 37);
		contentPane.add(pnoneno);
		
		JLabel email = new JLabel("Email");
		email.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		email.setBounds(86, 616, 208, 37);
		contentPane.add(email);
		
		textField_salary = new JTextField();
		textField_salary.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textField_salary.setColumns(10);
		textField_salary.setBounds(333, 469, 356, 43);
		contentPane.add(textField_salary);
		
		textField_phoneno = new JTextField();
		textField_phoneno.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textField_phoneno.setColumns(10);
		textField_phoneno.setBounds(333, 536, 356, 43);
		contentPane.add(textField_phoneno);
		
		textField_email = new JTextField();
		textField_email.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textField_email.setColumns(10);
		textField_email.setBounds(333, 610, 356, 43);
		contentPane.add(textField_email);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String age = textField_age.getText();
				String salary = textField_salary.getText();
				String phoneno = textField_phoneno.getText();
				String email = textField_email.getText();
				String adhaar = textField_adhaar.getText();
				String gender = null;
				
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null,"Employee Name is Mandetory...");
					setVisible(false);
				}
				
				if(rbmale.isSelected()) {
					gender = "male";
				}else if((rbfemale.isSelected())) {
					gender ="female";
				}
				String job = (String)comboBoxjob.getSelectedItem();
				try {
					Conn conn = new Conn();
					String query ="insert into employee values('" + name + "','" + age + "','" + salary + "','" + phoneno + "','" + email + "','" + adhaar + "','" + gender + "','" + job + "')";
					conn.s.executeUpdate(query);
					
					JOptionPane.showMessageDialog(null,"Employee added Successfully...");
					setVisible(false);
				}catch(Exception e1) {
					e1.printStackTrace();				}
			}
		});
		btnNewButton.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnNewButton.setBounds(421, 687, 148, 43);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_adhaar = new JLabel("Adhaaar No.");
		lblNewLabel_adhaar.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_adhaar.setBounds(86, 219, 208, 37);
		contentPane.add(lblNewLabel_adhaar);
		
		textField_adhaar = new JTextField();
		textField_adhaar.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textField_adhaar.setColumns(10);
		textField_adhaar.setBounds(333, 213, 356, 43);
		contentPane.add(textField_adhaar);
	}
}
