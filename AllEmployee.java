package hotel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AllEmployee extends JFrame {

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
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllEmployee frame = new AllEmployee();
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
	public AllEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 783);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPOLYEE INFO");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(339, 43, 505, 72);
		contentPane.add(lblNewLabel);
		
		
		
		table = new JTable();
		table.setFont(new Font("STZhongsong", Font.PLAIN, 16));
		table.setBounds(49, 188, 937, 425);
		contentPane.add(table);
		
		try {
			Conn conn = new Conn();
			String query ="select * from employee";
			ResultSet Rs = conn.s.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(Rs));
			
			lblNewLabel_1 = new JLabel("NAME");
			lblNewLabel_1.setFont(new Font("STZhongsong", Font.BOLD, 17));
			lblNewLabel_1.setBounds(51, 165, 115, 23);
			contentPane.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setFont(new Font("STZhongsong", Font.BOLD, 17));
			lblNewLabel_2.setBounds(165, 165, 115, 23);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("SALARY");
			lblNewLabel_3.setFont(new Font("STZhongsong", Font.BOLD, 17));
			lblNewLabel_3.setBounds(283, 165, 115, 23);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("MOBILE");
			lblNewLabel_4.setFont(new Font("STZhongsong", Font.BOLD, 17));
			lblNewLabel_4.setBounds(400, 165, 115, 23);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("EMAIL");
			lblNewLabel_5.setFont(new Font("STZhongsong", Font.BOLD, 17));
			lblNewLabel_5.setBounds(515, 165, 115, 23);
			contentPane.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("ID");
			lblNewLabel_6.setFont(new Font("STZhongsong", Font.BOLD, 17));
			lblNewLabel_6.setBounds(633, 165, 115, 23);
			contentPane.add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setFont(new Font("STZhongsong", Font.BOLD, 17));
			lblNewLabel_7.setBounds(762, 224, 115, 23);
			contentPane.add(lblNewLabel_7);
			
			lblNewLabel_8 = new JLabel("New label");
			lblNewLabel_8.setFont(new Font("STZhongsong", Font.BOLD, 17));
			lblNewLabel_8.setBounds(798, 231, 115, 23);
			contentPane.add(lblNewLabel_8);
			
			lblNewLabel_9 = new JLabel("GENDER");
			lblNewLabel_9.setFont(new Font("STZhongsong", Font.BOLD, 17));
			lblNewLabel_9.setBounds(758, 165, 115, 23);
			contentPane.add(lblNewLabel_9);
			
			lblNewLabel_10 = new JLabel("JOB");
			lblNewLabel_10.setFont(new Font("STZhongsong", Font.BOLD, 17));
			lblNewLabel_10.setBounds(871, 165, 115, 23);
			contentPane.add(lblNewLabel_10);
			
			btnNewButton = new JButton("BACK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Reception Re = new  Reception();
					Re.setVisible(true);
					
				}
			});
			btnNewButton.setFont(new Font("STZhongsong", Font.PLAIN, 18));
			btnNewButton.setBounds(430, 661, 123, 48);
			contentPane.add(btnNewButton);
		}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
