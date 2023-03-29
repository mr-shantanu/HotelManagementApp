package hotel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerInfo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerInfo frame = new CustomerInfo();
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
	public CustomerInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1068, 764);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER INFO");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(289, 59, 644, 74);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setFont(new Font("STZhongsong", Font.PLAIN, 14));
		table.setBounds(86, 208, 897, 375);
		contentPane.add(table);
		
		try {
			Conn conn = new Conn();
			String query ="select * from addcustomer";
			ResultSet Rs = conn.s.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(Rs));
			
			lblNewLabel_1 = new JLabel(" Name");
			lblNewLabel_1.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_1.setBounds(86, 179, 89, 29);
			contentPane.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel(" ID");
			lblNewLabel_2.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_2.setBounds(176, 179, 89, 29);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel(" Name");
			lblNewLabel_3.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_3.setBounds(305, 244, 89, 29);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel(" ID Type");
			lblNewLabel_4.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_4.setBounds(265, 179, 89, 29);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("Mobile");
			lblNewLabel_5.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_5.setBounds(357, 179, 89, 29);
			contentPane.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel(" Age");
			lblNewLabel_6.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_6.setBounds(445, 179, 89, 29);
			contentPane.add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel(" Gender");
			lblNewLabel_7.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_7.setBounds(534, 179, 89, 29);
			contentPane.add(lblNewLabel_7);
			
			lblNewLabel_8 = new JLabel(" Country");
			lblNewLabel_8.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_8.setBounds(623, 179, 89, 29);
			contentPane.add(lblNewLabel_8);
			
			lblNewLabel_9 = new JLabel(" Name");
			lblNewLabel_9.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_9.setBounds(752, 244, 89, 29);
			contentPane.add(lblNewLabel_9);
			
			lblNewLabel_10 = new JLabel(" Deposite");
			lblNewLabel_10.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_10.setBounds(711, 179, 89, 29);
			contentPane.add(lblNewLabel_10);
			
			lblNewLabel_11 = new JLabel(" Room");
			lblNewLabel_11.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_11.setBounds(799, 179, 89, 29);
			contentPane.add(lblNewLabel_11);
			
			lblNewLabel_12 = new JLabel(" Check in Time");
			lblNewLabel_12.setFont(new Font("STZhongsong", Font.BOLD, 15));
			lblNewLabel_12.setBounds(894, 179, 89, 29);
			contentPane.add(lblNewLabel_12);
			
			btnNewButton = new JButton("BACK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Reception R = new  Reception();
					R.setVisible(true);
					
				}
			});
			btnNewButton.setFont(new Font("STZhongsong", Font.PLAIN, 17));
			btnNewButton.setBounds(435, 641, 99, 38);
			contentPane.add(btnNewButton);
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
