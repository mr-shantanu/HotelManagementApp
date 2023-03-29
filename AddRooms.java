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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddRooms extends JFrame {

	private JPanel contentPane;
	private JTextField txtroomnumber;
	private JTextField roomprice;
	private JComboBox comboBox_availablity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRooms frame = new AddRooms();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AddRooms() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1173, 805);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD ROOMS");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(247, 58, 665, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Room Number");
		lblNewLabel_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(113, 226, 191, 46);
		contentPane.add(lblNewLabel_1);
		
		txtroomnumber = new JTextField();
		txtroomnumber.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		txtroomnumber.setBounds(462, 228, 191, 42);
		contentPane.add(txtroomnumber);
		txtroomnumber.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Availablity ");
		lblNewLabel_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(113, 311, 191, 46);
		contentPane.add(lblNewLabel_1_1);
		
	    comboBox_availablity = new JComboBox();
		comboBox_availablity.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		comboBox_availablity.setModel(new DefaultComboBoxModel(new String[] {"Available", "Occupied"}));
		comboBox_availablity.setBounds(462, 313, 191, 42);
		contentPane.add(comboBox_availablity);
		
		JLabel lblNewLabel_1_2 = new JLabel("Room Status");
		lblNewLabel_1_2.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(113, 397, 191, 46);
		contentPane.add(lblNewLabel_1_2);
		
		JComboBox comboBox_roomstatus = new JComboBox();
		comboBox_roomstatus.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		comboBox_roomstatus.setModel(new DefaultComboBoxModel(new String[] {"Clean", "Dirty"}));
		comboBox_roomstatus.setBounds(462, 402, 191, 37);
		contentPane.add(comboBox_roomstatus);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Room Price");
		lblNewLabel_1_2_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_2_1.setBounds(113, 477, 191, 46);
		contentPane.add(lblNewLabel_1_2_1);
		
		roomprice = new JTextField();
		roomprice.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		roomprice.setColumns(10);
		roomprice.setBounds(462, 479, 191, 42);
		contentPane.add(roomprice);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Room Type");
		lblNewLabel_1_2_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_2_1_1.setBounds(113, 556, 191, 46);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnCancel.setBounds(421, 677, 143, 46);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\shant\\Downloads\\images (2)1.jpg"));
		lblNewLabel_2.setBounds(675, 183, 474, 458);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_rtype = new JComboBox();
		comboBox_rtype.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		comboBox_rtype.setModel(new DefaultComboBoxModel(new String[] {"Single Bed", "Double Bed", "AC Single Bed", "AC Double Bed", "Non AC Single Bed", "Non AC Double Bed"}));
		comboBox_rtype.setBounds(467, 565, 186, 37);
		contentPane.add(comboBox_rtype);
		

		JButton btnaddroom = new JButton("Add Room");
		btnaddroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roomnumber = txtroomnumber.getText();
				String availablity = (String) comboBox_availablity.getSelectedItem();
				String rstatus = (String) comboBox_roomstatus.getSelectedItem();
				
				String rprice = roomprice.getText();
		    	String rtype = (String) comboBox_rtype.getSelectedItem();
		    	
		    	try {
					Conn c = new Conn();
					String que ="insert into addrooms values('" + roomnumber + "','" + rstatus + "','" + availablity + "','" + rprice + "','" + rtype + "')";
					c.s.executeUpdate(que);
					
					JOptionPane.showMessageDialog(null,"New Room added Successfully...");
					setVisible(false);
					
		    	}catch(Exception e1) {
					e1.printStackTrace();
				}
		    	
			}
		});
		btnaddroom.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnaddroom.setBounds(174, 677, 164, 46);
		contentPane.add(btnaddroom);
	}
}
