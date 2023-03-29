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
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField UserName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1128, 730);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 0));
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(8, 8, 8, 8));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(90, 159, 851, 294);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 16));
		lblNewLabel.setBounds(43, 48, 223, 41);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("STZhongsong", Font.BOLD, 16));
		lblNewLabel_1.setBounds(43, 146, 223, 41);
		panel.add(lblNewLabel_1);
		
		UserName = new JTextField();
		UserName.setBounds(298, 50, 232, 41);
		panel.add(UserName);
		UserName.setColumns(10);
		
		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//action perform
				String user = UserName.getText();
				String pass = passwordField.getText();
				
				try {
					Conn c = new Conn();
					String q ="select * from login where username ='" + user + "' and password = '" + pass +"'";
					ResultSet rs= c.s.executeQuery(q);					
					
//					PreparedStatement p=Conn.prepareStatement(q);
//			
//					p.setString(1,user);
//					p.setString(2,pass);
//					ResultSet set=p.executeQuery();
					
					
					
					if(((ResultSet) rs).next()) 
							{
						setVisible(false);
						Dashboard d=new Dashboard();
						d.setVisible(true);
						
					}else {
						JOptionPane.showMessageDialog(null,"Invalid User Name or Password");
						setVisible(false);
					}
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		Login.setForeground(new Color(169, 169, 169));
		Login.setBackground(new Color(0, 255, 0));
		Login.setFont(new Font("STZhongsong", Font.PLAIN, 14));
		Login.setBounds(298, 217, 106, 41);
		panel.add(Login);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Cancel.setForeground(new Color(169, 169, 169));
		Cancel.setBackground(new Color(255, 0, 0));
		Cancel.setFont(new Font("STZhongsong", Font.PLAIN, 14));
		Cancel.setBounds(442, 217, 106, 41);
		panel.add(Cancel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(298, 147, 232, 43);
		panel.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\shant\\Downloads\\default1.png"));
		lblNewLabel_2.setBounds(594, -76, 446, 449);
		panel.add(lblNewLabel_2);
	}
}
