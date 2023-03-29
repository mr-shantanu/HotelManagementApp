package hotel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Choice;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import java.sql.ResultSet;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textField_cName;
	private JTextField textField_Idnumber;
	private JTextField textFieldmobile;
	private JTextField textField_Age;
	private JComboBox comboBox_Idtype;
	private JComboBox comboBoxGender;
	
	private JTextField textField_Country;
	
	private Choice croom;
	private JTextField textField_deposit;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer frame = new AddCustomer();
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
	public AddCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1214, 819);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NEW CUSTOMER INFO");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(247, 10, 711, 98);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Name");
		lblNewLabel_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(50, 171, 213, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID Type");
		lblNewLabel_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(50, 245, 213, 46);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ID Number");
		lblNewLabel_1_2.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(50, 322, 213, 46);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Mobile No.");
		lblNewLabel_1_3.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_3.setBounds(50, 411, 213, 46);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Age");
		lblNewLabel_1_4.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_4.setBounds(50, 499, 213, 46);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Gender");
		lblNewLabel_1_5.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_5.setBounds(50, 589, 213, 46);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Country");
		lblNewLabel_1_6.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_6.setBounds(650, 428, 213, 46);
		contentPane.add(lblNewLabel_1_6);
		
		textField_cName = new JTextField();
		textField_cName.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_cName.setBounds(317, 171, 242, 39);
		contentPane.add(textField_cName);
		textField_cName.setColumns(10);
		
		textField_Idnumber = new JTextField();
		textField_Idnumber.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_Idnumber.setColumns(10);
		textField_Idnumber.setBounds(317, 326, 242, 39);
		contentPane.add(textField_Idnumber);
		
		comboBox_Idtype = new JComboBox();
		comboBox_Idtype.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		comboBox_Idtype.setModel(new DefaultComboBoxModel(new String[] {"Adhaar Card", "Driving Licence", "Voter Id", "Passport"}));
		comboBox_Idtype.setBounds(323, 260, 236, 31);
		contentPane.add(comboBox_Idtype);
		
		textFieldmobile = new JTextField();
		textFieldmobile.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textFieldmobile.setColumns(10);
		textFieldmobile.setBounds(317, 418, 242, 39);
		contentPane.add(textFieldmobile);
		
		textField_Age = new JTextField();
		textField_Age.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_Age.setColumns(10);
		textField_Age.setBounds(317, 499, 242, 39);
		contentPane.add(textField_Age);
		
		comboBoxGender = new JComboBox();
		comboBoxGender.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Male ", "Female", "Others"}));
		comboBoxGender.setBounds(317, 606, 242, 29);
		contentPane.add(comboBoxGender);
		
		textField_Country = new JTextField();
		textField_Country.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_Country.setColumns(10);
		textField_Country.setBounds(883, 418, 242, 39);
		contentPane.add(textField_Country);
		
		JLabel lblNewLabel_1_7 = new JLabel("Allocated Room");
		lblNewLabel_1_7.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_7.setBounds(650, 171, 213, 46);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Check In Time");
		lblNewLabel_1_8.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_8.setBounds(650, 245, 213, 46);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Deposite");
		lblNewLabel_1_9.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_9.setBounds(650, 322, 213, 46);
		contentPane.add(lblNewLabel_1_9);
		
		
		croom  = new Choice();
		croom.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 21));
		croom.setBounds(904, 186, 190, 46);
		
		
		try {
			Conn c = new Conn();
			String que ="select * from addrooms where availablity = 'Available'";
			ResultSet set = c.s.executeQuery(que);
			while(set.next()) {
				croom.add(set.getString("roomnumber"));
			}
			contentPane.add(croom);
			
			
    	}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		
		textField_deposit = new JTextField();
		textField_deposit.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_deposit.setColumns(10);
		textField_deposit.setBounds(883, 326, 242, 39);
		contentPane.add(textField_deposit);
		
		Date date = new Date();
		JLabel lblNewLabel_Checkin = new JLabel(""+date);
		lblNewLabel_Checkin.setFont(new Font("STZhongsong", Font.PLAIN, 16));
		lblNewLabel_Checkin.setBounds(883, 251, 253, 39);
		contentPane.add(lblNewLabel_Checkin);
		
		JButton btnNewButtonAdd = new JButton("Add");
		btnNewButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_cName.getText();
				String id = textField_Idnumber.getText();
				String idtype = (String) comboBox_Idtype.getSelectedItem();
				String mobile = textFieldmobile.getText();
				String age = textField_Age.getText();
				String gender = (String) comboBoxGender.getSelectedItem();
				String country = textField_Country.getText();
				String diposit = textField_deposit.getText();
				String room = croom.getSelectedItem();
				String time = lblNewLabel_Checkin.getText();
				
				try {
					Conn conn = new Conn();
					String query ="insert into addcustomer values('" + name + "','" + id + "','" + idtype + "','" + mobile + "','" + age + "','" + gender + "','" + country + "','" + diposit + "','" + room + "','" + time + "')";
					String query1 ="update addrooms set availablity = 'Occupied' where roomnumber = '" +room + "'";			
					conn.s.executeUpdate(query);
					conn.s.executeUpdate(query1);
					
					
					
					JOptionPane.showMessageDialog(null,"Customer added Successfully...");
					setVisible(false);
				}catch(Exception e1) {
					e1.printStackTrace();				}
			}
				
			
		});
		btnNewButtonAdd.setFont(new Font("STZhongsong", Font.PLAIN, 18));
		btnNewButtonAdd.setBounds(740, 615, 123, 52);
		contentPane.add(btnNewButtonAdd);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reception Re = new Reception();
				Re.setVisible(true);
			}
		});
		btnCancel.setFont(new Font("STZhongsong", Font.PLAIN, 18));
		btnCancel.setBounds(934, 615, 123, 52);
		contentPane.add(btnCancel);
		
		
		
	}
}
