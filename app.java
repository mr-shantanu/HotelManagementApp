package hotel.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class app extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app frame = new app();
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
	public app() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1179, 841);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to Hotel Management System");
		lblNewLabel_2.setBackground(new Color(255, 165, 0));
		lblNewLabel_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_2.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel_2.setBounds(63, 10, 997, 192);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enter the System");
		btnNewButton.setIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login j=new Login();
				j.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(127, 255, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("STZhongsong", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(470, 434, 222, 65);
		contentPane.add(btnNewButton);
		JLabel lblNewLabel = new JLabel("Welcome to Hotel Management System");
		lblNewLabel.setBackground(new Color(173, 255, 47));
		lblNewLabel.setForeground(new Color(240, 255, 255));
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 45));
		lblNewLabel.setBounds(75, 52, 944, 84);
		
		
	}
}
