package hotel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import java.sql.ResultSet;
import java.util.Date;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckOut extends JFrame {

	private JPanel contentPane;
	Choice choice_CustomerID;
	private JTextField textFieldRoomNo;
	private JTextField textField_CIn;
	private JLabel lblNewLabel_COut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckOut frame = new CheckOut();
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
	public CheckOut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 779);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHECK OUT INFO");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(384, 47, 722, 76);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer ID");
		lblNewLabel_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(84, 224, 193, 36);
		contentPane.add(lblNewLabel_1);
		
		choice_CustomerID = new Choice();
		choice_CustomerID.setFont(new Font("Book Antiqua", Font.PLAIN, 22));
		choice_CustomerID.setBounds(313, 224, 245, 33);
		contentPane.add(choice_CustomerID);
		
		JLabel lblNewLabel_1_1 = new JLabel("Room No");
		lblNewLabel_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(84, 323, 193, 36);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Check In Time");
		lblNewLabel_1_2.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(84, 429, 193, 36);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Check Out Time");
		lblNewLabel_1_3.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1_3.setBounds(84, 524, 193, 36);
		contentPane.add(lblNewLabel_1_3);
		
		textFieldRoomNo = new JTextField();
		textFieldRoomNo.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		textFieldRoomNo.setBounds(313, 323, 245, 32);
		contentPane.add(textFieldRoomNo);
		textFieldRoomNo.setColumns(10);
		
		textField_CIn = new JTextField();
		textField_CIn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_CIn.setColumns(10);
		textField_CIn.setBounds(313, 433, 269, 32);
		contentPane.add(textField_CIn);
		
		Date date = new Date();
		JLabel  lblNewLabel_COut= new JLabel(""+date);
		lblNewLabel_COut.setFont(new Font("STZhongsong", Font.PLAIN, 16));
		lblNewLabel_COut.setBounds(313, 524, 269, 36);
		contentPane.add(lblNewLabel_COut);
		
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Reception Re = new Reception();
				Re.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("STZhongsong", Font.BOLD, 18));
		btnNewButton_1.setBounds(594, 635, 106, 49);
		contentPane.add(btnNewButton_1);
		
		
		
		try {
			Conn conn = new Conn();
			String query ="select * from addcustomer";
			ResultSet Rs = conn.s.executeQuery(query);
		    while (Rs.next()) {
		    	choice_CustomerID.add(Rs.getString("id"));
		    	textFieldRoomNo.setText(Rs.getString("room"));
		    	textField_CIn.setText(Rs.getString("addcustomercol"));
		    	
		    	}
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
		
		JButton btnNewButton = new JButton("Check Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conn conn = new Conn();
				String query ="delete from addcustomer where id='"+ choice_CustomerID.getSelectedItem()+"'";
				String query1 = "update addrooms set availablity= 'Available' where roomnumber= '"+textFieldRoomNo.getText()+"'";
				try {
					conn.s.executeUpdate(query);
					conn.s.executeUpdate(query1);
					
					JOptionPane.showMessageDialog(null,"Customer Checked Out Successfully...");
					setVisible(false);
				}catch(Exception e1) {
			    	e1.printStackTrace();
			    }
			}
		});
		btnNewButton.setFont(new Font("STZhongsong", Font.BOLD, 17));
		btnNewButton.setBounds(334, 635, 152, 49);
		contentPane.add(btnNewButton);
		
	}
}
