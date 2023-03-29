package hotel.management.system;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class RoomSearch extends JFrame {

	private JPanel contentPane1;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JButton btnSubmit;
	private JCheckBox chckbxNewCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomSearch frame = new RoomSearch();
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
	public RoomSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1216, 803);
		contentPane1 = new JPanel();
		contentPane1.setBackground(new Color(255, 165, 0));
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SEARCH  FOR ROOMS ");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(300, 56, 805, 63);
		contentPane1.add(lblNewLabel);
		
		table = new JTable();
		table.setBackground(new Color(245, 222, 179));
		table.setFont(new Font("STZhongsong", Font.PLAIN, 14));
		table.setBounds(32, 282, 920, 332);
		contentPane1.add(table);
		
		try {
			Conn conn = new Conn();
			String query ="select * from addrooms";
			ResultSet Rs = conn.s.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(Rs));
			
			lblNewLabel_2 = new JLabel("  Room No.");
			lblNewLabel_2.setBackground(new Color(255, 215, 0));
			lblNewLabel_2.setFont(new Font("STZhongsong", Font.BOLD, 14));
			lblNewLabel_2.setBounds(32, 245, 180, 35);
			contentPane1.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("Room Status");
			lblNewLabel_3.setBackground(new Color(0, 0, 0));
			lblNewLabel_3.setFont(new Font("STZhongsong", Font.BOLD, 14));
			lblNewLabel_3.setBounds(222, 245, 139, 35);
			contentPane1.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel(" Availablity");
			lblNewLabel_4.setFont(new Font("STZhongsong", Font.BOLD, 14));
			lblNewLabel_4.setBounds(402, 245, 104, 35);
			contentPane1.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel(" Room Price");
			lblNewLabel_5.setFont(new Font("STZhongsong", Font.BOLD, 14));
			lblNewLabel_5.setBounds(583, 245, 104, 35);
			contentPane1.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel(" Room Type");
			lblNewLabel_6.setFont(new Font("STZhongsong", Font.BOLD, 14));
			lblNewLabel_6.setBounds(769, 245, 104, 35);
			contentPane1.add(lblNewLabel_6);
			
			JButton btnNewButton = new JButton("BACK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Reception Re = new Reception();
					Re.setVisible(true);
				}
			});
			btnNewButton.setFont(new Font("STZhongsong", Font.BOLD, 22));
			btnNewButton.setBounds(517, 674, 120, 46);
			contentPane1.add(btnNewButton);
			
			lblNewLabel_1 = new JLabel("Set Type");
			lblNewLabel_1.setFont(new Font("STZhongsong", Font.PLAIN, 18));
			lblNewLabel_1.setBounds(51, 161, 120, 27);
			contentPane1.add(lblNewLabel_1);
			
			comboBox = new JComboBox();
			comboBox.setFont(new Font("STZhongsong", Font.PLAIN, 18));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Single Bed", "Double Bed", "AC Single Bed", "AC Double Bed", "Non AC Single Bed", "Non AC Double Bed"}));
			comboBox.setBounds(156, 160, 195, 28);
			contentPane1.add(comboBox);
			
			chckbxNewCheckBox = new JCheckBox("Only Diplay Available");
			chckbxNewCheckBox.setFont(new Font("STZhongsong", Font.PLAIN, 18));
			chckbxNewCheckBox.setBounds(594, 160, 233, 35);
			contentPane1.add(chckbxNewCheckBox);
			btnSubmit = new JButton("SUBMIT");
			btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Conn conn = new Conn();
						
						String query ="select * from addrooms where rtype=' " + comboBox.getSelectedItem()+"'";
						String query1 ="select * from addrooms where availablity='Available ' AND rtype='"+comboBox.getSelectedItem()+"'";
						ResultSet Rs ;
						if(chckbxNewCheckBox.isSelected()) {
							 Rs = conn.s.executeQuery(query1);
							
							
						}else {
							 Rs = conn.s.executeQuery(query);
							
							
						}
						
						table.setModel(DbUtils.resultSetToTableModel(Rs));
					}catch(Exception e1) {
						e1.printStackTrace();}
				}
			});
			btnSubmit.setFont(new Font("STZhongsong", Font.BOLD, 22));
			btnSubmit.setBounds(340, 674, 131, 46);
			contentPane1.add(btnSubmit);
			setVisible(false);
			
					}catch(Exception e1) {
			e1.printStackTrace();
	}
		


	}	
}
