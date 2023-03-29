package hotel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reception extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reception frame = new Reception();
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
	public Reception() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1212, 820);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reception");
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(325, 60, 720, 70);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButtoncustomer = new JButton("New Customer");
		btnNewButtoncustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AddCustomer Ac = new AddCustomer();
				Ac.setVisible(true);
			}
		});
		btnNewButtoncustomer.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnNewButtoncustomer.setBounds(75, 196, 218, 51);
		contentPane.add(btnNewButtoncustomer);
		
		JButton btnAvailableRooms_1 = new JButton(" Rooms");
		btnAvailableRooms_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Room R = new Room();
				R.setVisible(true);
			}
		});
		btnAvailableRooms_1.setFont(new Font("STZhongsong", Font.PLAIN, 18));
		btnAvailableRooms_1.setBounds(87, 288, 187, 51);
		contentPane.add(btnAvailableRooms_1);
		
		JButton btnDepartments = new JButton("Departments");
		btnDepartments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Department De = new Department();
				De.setVisible(true);
			}
		});
		btnDepartments.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnDepartments.setBounds(87, 391, 187, 51);
		contentPane.add(btnDepartments);
		
		JButton btnAllEmployee = new JButton("Employee Info");
		btnAllEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AllEmployee AE = new AllEmployee();
				AE.setVisible(true);
			}
		});
		btnAllEmployee.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnAllEmployee.setBounds(87, 496, 187, 51);
		contentPane.add(btnAllEmployee);
		
		JButton btnInfo = new JButton("Customer Info");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CustomerInfo CI = new  CustomerInfo();
				CI.setVisible(true);
				
			}
		});
		btnInfo.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnInfo.setBounds(87, 595, 187, 51);
		contentPane.add(btnInfo);
		
		JButton btnManager = new JButton("Manager");
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ManagerInfo MI = new  ManagerInfo();
				MI.setVisible(true);
				
			}
		});
		btnManager.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnManager.setBounds(481, 196, 187, 51);
		contentPane.add(btnManager);
		
		JButton btnAvailableRooms = new JButton("Check Out");
		btnAvailableRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                setVisible(false);
				
				CheckOut CO = new CheckOut();
				CO.setVisible(true);
			}
		});
		btnAvailableRooms.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnAvailableRooms.setBounds(481, 436, 187, 51);
		contentPane.add(btnAvailableRooms);
		
		JButton btnPenddingStatus = new JButton("Pendding Status");
		btnPenddingStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				UpdateCheck UC = new UpdateCheck();
				UC.setVisible(true);
			}
		});
		btnPenddingStatus.setFont(new Font("STZhongsong", Font.PLAIN, 18));
		btnPenddingStatus.setBounds(481, 288, 187, 51);
		contentPane.add(btnPenddingStatus);
		
		JButton btnServieceRoom = new JButton("Search Room");
		btnServieceRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				RoomSearch RS = new RoomSearch();
				RS.setVisible(true);
			}
		});
		btnServieceRoom.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnServieceRoom.setBounds(87, 684, 187, 51);
		contentPane.add(btnServieceRoom);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				app ap = new app();
				ap.setVisible(true);
			}
		});
		btnLogOut.setFont(new Font("STZhongsong", Font.PLAIN, 22));
		btnLogOut.setBounds(481, 609, 187, 51);
		contentPane.add(btnLogOut);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\shant\\Downloads\\reception-sign-177.jpg"));
		lblNewLabel_1.setBounds(707, 200, 468, 505);
		contentPane.add(lblNewLabel_1);
	}
}
