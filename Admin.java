package hotel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1215, 812);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnaddeemployee = new JButton("Add Employee");
		btnaddeemployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEmployee Ae=new AddEmployee();
				Ae.setVisible(true);
			}
		});
		btnaddeemployee.setFont(new Font("STZhongsong", Font.BOLD, 22));
		btnaddeemployee.setBounds(128, 267, 231, 66);
		contentPane.add(btnaddeemployee);
		
		JButton btnAddRooms = new JButton("Add Rooms");
		btnAddRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddRooms Ar=new AddRooms();
				Ar.setVisible(true);
			}
		});
		btnAddRooms.setFont(new Font("STZhongsong", Font.BOLD, 22));
		btnAddRooms.setBounds(128, 409, 231, 66);
		contentPane.add(btnAddRooms);
		
		JButton btnNewButton_2 = new JButton("Add Drivers");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddDrivers AD=new AddDrivers();
				AD.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("STZhongsong", Font.BOLD, 22));
		btnNewButton_2.setBounds(128, 547, 231, 66);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("ADMIN PANNEL");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(277, 69, 669, 98);
		contentPane.add(lblNewLabel);
		
	}
}
