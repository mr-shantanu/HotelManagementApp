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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddDrivers extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textField_Age;
	private JTextField textField_CarName;
	private JTextField textField_mobile;
	private JTextField textFieldLocation;
	private JTextField textField_Model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDrivers frame = new AddDrivers();
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
	public AddDrivers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 827);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD DRIVERS");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(401, 58, 632, 83);
		contentPane.add(lblNewLabel);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textFieldName.setBounds(357, 181, 235, 42);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblNewLabel_name = new JLabel("Name");
		lblNewLabel_name.setFont(new Font("STZhongsong", Font.BOLD, 22));
		lblNewLabel_name.setBounds(132, 181, 201, 42);
		contentPane.add(lblNewLabel_name);
		
		JLabel lblNewLabel_age = new JLabel("Age");
		lblNewLabel_age.setFont(new Font("STZhongsong", Font.BOLD, 22));
		lblNewLabel_age.setBounds(132, 269, 201, 42);
		contentPane.add(lblNewLabel_age);
		
		JLabel lblNewLabel_gender = new JLabel("Gender");
		lblNewLabel_gender.setFont(new Font("STZhongsong", Font.BOLD, 22));
		lblNewLabel_gender.setBounds(132, 350, 201, 42);
		contentPane.add(lblNewLabel_gender);
		
		JLabel lblNewLabel_cname = new JLabel("Car Name");
		lblNewLabel_cname.setFont(new Font("STZhongsong", Font.BOLD, 22));
		lblNewLabel_cname.setBounds(669, 269, 201, 42);
		contentPane.add(lblNewLabel_cname);
		
		JLabel lblNewLabel_availablity = new JLabel("Availablity");
		lblNewLabel_availablity.setFont(new Font("STZhongsong", Font.BOLD, 22));
		lblNewLabel_availablity.setBounds(132, 538, 201, 42);
		contentPane.add(lblNewLabel_availablity);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile");
		lblNewLabel_1_1_1.setFont(new Font("STZhongsong", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(132, 451, 201, 42);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_Age = new JTextField();
		textField_Age.setColumns(10);
		textField_Age.setBounds(357, 274, 235, 42);
		contentPane.add(textField_Age);
		
		textField_CarName = new JTextField();
		textField_CarName.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_CarName.setColumns(10);
		textField_CarName.setBounds(875, 274, 235, 42);
		contentPane.add(textField_CarName);
		
		textField_mobile = new JTextField();
		textField_mobile.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textField_mobile.setColumns(10);
		textField_mobile.setBounds(357, 451, 235, 42);
		contentPane.add(textField_mobile);
		
		JComboBox comboBoxAvailablity = new JComboBox();
		comboBoxAvailablity.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		comboBoxAvailablity.setModel(new DefaultComboBoxModel(new String[] {"Available", "Busy"}));
		comboBoxAvailablity.setBounds(357, 538, 225, 42);
		contentPane.add(comboBoxAvailablity);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBoxGender.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		comboBoxGender.setBounds(357, 350, 225, 42);
		contentPane.add(comboBoxGender);
		
		JLabel lblNewLabel_Location = new JLabel("Location");
		lblNewLabel_Location.setFont(new Font("STZhongsong", Font.BOLD, 22));
		lblNewLabel_Location.setBounds(669, 181, 201, 42);
		contentPane.add(lblNewLabel_Location);
		
		textFieldLocation = new JTextField();
		textFieldLocation.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textFieldLocation.setColumns(10);
		textFieldLocation.setBounds(875, 181, 235, 42);
		contentPane.add(textFieldLocation);
		
		textField_Model = new JTextField();
		textField_Model.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textField_Model.setColumns(10);
		textField_Model.setBounds(875, 391, 235, 42);
		contentPane.add(textField_Model);
		
		JLabel lblNewLabel_cname_1 = new JLabel("Car Model");
		lblNewLabel_cname_1.setFont(new Font("STZhongsong", Font.BOLD, 22));
		lblNewLabel_cname_1.setBounds(669, 391, 201, 42);
		contentPane.add(lblNewLabel_cname_1);
		
		JButton btnAddDriver = new JButton("Add Driver");
		btnAddDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldName.getText();
				String age = textField_Age.getText();
				String gender = (String) comboBoxGender.getSelectedItem();
				String mobile = textField_mobile.getText();
				String avaiblity = (String) comboBoxAvailablity.getSelectedItem();
				String location = textFieldLocation.getText();
				String cname = textField_Model.getText();
				String cmodel = textField_CarName.getText();
				
				try {
					Conn conn = new Conn();
					String query ="insert into adddriver values('" + name + "','" + age + "','" + gender + "','" + mobile + "','" + avaiblity + "','" + location + "','" + cname + "','" + cmodel + "')";
					conn.s.executeUpdate(query);
					
					JOptionPane.showMessageDialog(null,"Driver added Successfully...");
					setVisible(false);
				}catch(Exception e1) {
					e1.printStackTrace();				}
			}
			
		});
		btnAddDriver.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnAddDriver.setBounds(432, 665, 160, 49);
		contentPane.add(btnAddDriver);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnCancel.setBounds(685, 665, 160, 49);
		contentPane.add(btnCancel);
	}
}
