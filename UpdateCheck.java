package hotel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateCheck extends JFrame {

	private JPanel contentPane;
	Choice CustomerID;
	private JLabel lblNewLabel_2;
	private JTextField textField_Name;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_CheckinTime;
	private JTextField textField_Deposite;
	private JTextField textField_PendingAmount;
	private JLabel lblNewLabel_6;
	private JTextField textField_RoomNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCheck frame = new UpdateCheck();
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
	public UpdateCheck() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1114, 827);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Status");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(412, 56, 678, 77);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer ID");
		lblNewLabel_1.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(63, 164, 184, 37);
		contentPane.add(lblNewLabel_1);
		
		CustomerID = new Choice();
		CustomerID.setFont(new Font("Book Antiqua", Font.PLAIN, 22));
		CustomerID.setBounds(292, 164, 245, 33);
		contentPane.add(CustomerID);
		
		lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(63, 312, 184, 37);
		contentPane.add(lblNewLabel_2);
		
		textField_Name = new JTextField();
		textField_Name.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_Name.setBounds(292, 312, 245, 37);
		contentPane.add(textField_Name);
		textField_Name.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Check in Time");
		lblNewLabel_3.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(63, 397, 184, 37);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Deposite");
		lblNewLabel_4.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(63, 493, 184, 37);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Pending Amount");
		lblNewLabel_5.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_5.setBounds(63, 580, 184, 37);
		contentPane.add(lblNewLabel_5);
		
		textField_CheckinTime = new JTextField();
		textField_CheckinTime.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_CheckinTime.setColumns(10);
		textField_CheckinTime.setBounds(292, 397, 333, 37);
		contentPane.add(textField_CheckinTime);
		
		textField_Deposite = new JTextField();
		textField_Deposite.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_Deposite.setColumns(10);
		textField_Deposite.setBounds(292, 480, 245, 37);
		contentPane.add(textField_Deposite);
		
		textField_PendingAmount = new JTextField();
		textField_PendingAmount.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_PendingAmount.setColumns(10);
		textField_PendingAmount.setBounds(292, 569, 245, 37);
		contentPane.add(textField_PendingAmount);
		
		lblNewLabel_6 = new JLabel("Room No.");
		lblNewLabel_6.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		lblNewLabel_6.setBounds(63, 232, 184, 37);
		contentPane.add(lblNewLabel_6);
		
		textField_RoomNo = new JTextField();
		textField_RoomNo.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		textField_RoomNo.setColumns(10);
		textField_RoomNo.setBounds(292, 232, 245, 37);
		contentPane.add(textField_RoomNo);

		
		JButton btnNewButton = new JButton("CHECK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id= CustomerID.getSelectedItem();
				
				try {
					Conn conn = new Conn();
					String query="select * from addcustomer where id='"+id+"'";
					ResultSet rs =conn.s.executeQuery(query);
					while(rs.next()) {
						textField_RoomNo.setText(rs.getString("room"));
						textField_Name.setText(rs.getString("name"));
						textField_CheckinTime.setText(rs.getString("addcustomercol"));
						textField_Deposite.setText(rs.getString("diposit"));
						
					}
					ResultSet rs2 =conn.s.executeQuery("select * from addrooms where roomnumber ='"+textField_RoomNo.getText()+"'");
					while(rs2.next()) {
						String price= rs2.getString("rprice");
						int amountPaid = Integer.parseInt(price) - Integer.parseInt(textField_Deposite.getText())	;	
						textField_PendingAmount.setText("" + amountPaid);
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		btnNewButton.setBounds(219, 704, 123, 42);
		contentPane.add(btnNewButton);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id= CustomerID.getSelectedItem();
				String name= textField_Name.getText();
				String room= textField_RoomNo.getText();
				String pending= textField_PendingAmount.getText();
				
				Conn conn = new Conn();
				try {
					conn.s.executeUpdate("update addcustomer set  id= '"+id+"' ,room= '"+room+"' ,diposit= '"+pending+"' where id='"+id+"'");
					JOptionPane.showMessageDialog(null,"Customer Updated Successfully...");
					setVisible(false);
					Reception Re = new Reception();
					Re.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnUpdate.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		btnUpdate.setBounds(408, 704, 129, 42);
		contentPane.add(btnUpdate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Reception Re = new Reception();
				Re.setVisible(true);
			}
		});
		btnBack.setFont(new Font("STZhongsong", Font.PLAIN, 21));
		btnBack.setBounds(627, 704, 123, 42);
		contentPane.add(btnBack);
		
				try {
			Conn conn = new Conn();
			ResultSet rs =conn.s.executeQuery("select * from addcustomer");
			while(rs.next()) {
				CustomerID.add(rs.getString("id"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
