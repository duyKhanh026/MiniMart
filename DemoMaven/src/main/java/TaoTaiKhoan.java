import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TaoTaiKhoan {

	private JFrame frame;
	private JTextField userNameText;
	private JTextField EmailText;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private String code;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaoTaiKhoan window = new TaoTaiKhoan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TaoTaiKhoan() {
		initialize();
	}
	

	public void setSMS(String c) {
		this.code = c;
	} public String getSMS() {
		return this.code;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Tạo tài khoản");
		frame.setBounds(100, 100, 450, 295);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 256);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel userName = new JLabel("Username:");
		userName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userName.setBounds(10, 11, 96, 30);
		panel.add(userName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(10, 51, 96, 30);
		panel.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConfirmPassword.setBounds(10, 100, 155, 30);
		panel.add(lblConfirmPassword);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(10, 151, 96, 30);
		panel.add(lblEmail);
		
		userNameText = new JTextField();
		userNameText.setFont(new Font("Tahoma", Font.PLAIN, 15));
		userNameText.setColumns(10);
		userNameText.setBounds(161, 11, 263, 30);
		panel.add(userNameText);
		
		EmailText = new JTextField();
		EmailText.setFont(new Font("Tahoma", Font.PLAIN, 15));
		EmailText.setColumns(10);
		EmailText.setBounds(161, 149, 263, 30);
		panel.add(EmailText);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(161, 55, 263, 30);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField_1.setBounds(161, 100, 263, 30);
		panel.add(passwordField_1);
		

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 434, 256);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 434, 256);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Thành Công!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(10, 56, 414, 75);
		panel_2.add(lblNewLabel_2);
		panel_2.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Nhập mã xác nhận đã gửi vào tài khoản:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 414, 35);
		panel_1.add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 45, 414, 35);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setBounds(102, 110, 228, 41);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().isEmpty()) 
					JOptionPane.showMessageDialog(null, "Vui lòng điền SMS!");
				else {
					if (textField.getText().equals(getSMS())) {
						panel_1.setVisible(false);
						panel_2.setVisible(true);
					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(163, 177, 105, 41);
		panel_1.add(btnNewButton_1);
		panel_1.setVisible(false);
		
		JButton btnNewButton = new JButton("Submit");
		
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (userNameText.getText().isEmpty() || passwordField.getText().isEmpty() 
						|| passwordField_1.getText().isEmpty() || EmailText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Yêu cầu điền đầy đủ thông tin!");
				} else if (!passwordField.getText().equals(passwordField_1.getText())) {
					JOptionPane.showMessageDialog(null, "Password và confirm password không khớp!");
				} else {
					panel_1.setVisible(true);
					panel.setVisible(false);
					lblNewLabel_1.setText(EmailText.getText());
					SendMail sMail = new SendMail();
					@SuppressWarnings("static-access")
					String code =  sMail.send(EmailText.getText());
					setSMS(code);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(137, 193, 133, 52);
		panel.add(btnNewButton);		
		
	}
}
