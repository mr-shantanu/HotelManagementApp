package hotel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.proteanit.sql.*;

import java.awt.Font;
import java.sql.ResultSet;

import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Room extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Room frame = new Room();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Room() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1216, 803);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AVAILABLE ROOMS ");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(300, 56, 805, 63);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBackground(new Color(245, 222, 179));
		table.setFont(new Font("STZhongsong", Font.PLAIN, 14));
		table.setBounds(32, 189, 527, 425);
		contentPane.add(table);
		
		try {
			Conn conn = new Conn();
			String query ="select * from addrooms";
			ResultSet Rs = conn.s.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(Rs));
			
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\shant\\Downloads\\images (2)1.jpg"));
			lblNewLabel_1.setBounds(591, 129, 450, 523);
			contentPane.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("  Room No.");
			lblNewLabel_2.setBackground(new Color(255, 215, 0));
			lblNewLabel_2.setFont(new Font("STZhongsong", Font.BOLD, 14));
			lblNewLabel_2.setBounds(32, 154, 104, 35);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("Room Status");
			lblNewLabel_3.setBackground(new Color(0, 0, 0));
			lblNewLabel_3.setFont(new Font("STZhongsong", Font.BOLD, 14));
			lblNewLabel_3.setBounds(136, 154, 104, 35);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel(" Availablity");
			lblNewLabel_4.setFont(new Font("STZhongsong", Font.BOLD, 14));
			lblNewLabel_4.setBounds(241, 154, 104, 35);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel(" Room Price");
			lblNewLabel_5.setFont(new Font("STZhongsong", Font.BOLD, 14));
			lblNewLabel_5.setBounds(347, 154, 104, 35);
			contentPane.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel(" Room Type");
			lblNewLabel_6.setFont(new Font("STZhongsong", Font.BOLD, 14));
			lblNewLabel_6.setBounds(455, 154, 104, 35);
			contentPane.add(lblNewLabel_6);
			
			JButton btnNewButton = new JButton("BACK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Reception Re = new Reception();
					Re.setVisible(true);
				}
			});
			btnNewButton.setFont(new Font("STZhongsong", Font.BOLD, 22));
			btnNewButton.setBounds(534, 677, 120, 46);
			contentPane.add(btnNewButton);
			setVisible(false);
		}catch(Exception e1) {
			e1.printStackTrace();				}
	
	}
}
