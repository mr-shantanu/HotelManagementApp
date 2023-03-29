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
import java.awt.Choice;
import java.awt.Checkbox;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Department extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Department frame = new Department();
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
	public Department() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1038, 849);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DEPARTMENT AND BUDGET");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(168, 60, 742, 80);
		contentPane.add(lblNewLabel);
		
		
		
			
			table = new JTable();
			table.setBackground(new Color(240, 230, 140));
			table.setFont(new Font("STZhongsong", Font.PLAIN, 18));
			table.setBounds(195, 245, 610, 425);
			contentPane.add(table);
			
			try {
				Conn conn = new Conn();
				String query ="select * from depatment";
				ResultSet Rs = conn.s.executeQuery(query);
				table.setModel(DbUtils.resultSetToTableModel(Rs));
				
				JLabel lblNewLabel_1 = new JLabel("  Department");
				lblNewLabel_1.setFont(new Font("STZhongsong", Font.BOLD, 21));
				lblNewLabel_1.setBounds(195, 209, 304, 34);
				contentPane.add(lblNewLabel_1);
				
				JLabel lblNewLabel_1_1 = new JLabel("  Budget");
				lblNewLabel_1_1.setFont(new Font("STZhongsong", Font.BOLD, 21));
				lblNewLabel_1_1.setBounds(501, 209, 304, 34);
				contentPane.add(lblNewLabel_1_1);
				
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						Reception Re = new Reception ();
						Re.setVisible(true);
						}
				});
				btnNewButton.setFont(new Font("STZhongsong", Font.PLAIN, 22));
				btnNewButton.setBounds(404, 732, 128, 42);
				contentPane.add(btnNewButton);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
    	
	}
}
