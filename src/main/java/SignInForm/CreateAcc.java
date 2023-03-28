package SignInForm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Modules.MyButton;

public class CreateAcc {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAcc window = new CreateAcc();
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
	public CreateAcc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void showPanel1(final JFrame framet, final JPanel firstPanel) {
		@SuppressWarnings("serial")
		final JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                int w = getWidth();
                int h = getHeight();
                Color color1 = new Color(255,80,106); 
                Color color2 = new Color(165,164,241);
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, w, h);
            }
        };
		panel.setBounds(0, 0, 1216, 748);
		framet.getContentPane().add(panel);
		panel.setLayout(null);
		//panel.setVisible(false);
		
		
		// giửa các label và textfield với nhau đều sẽ cách chiều cao là 106 
		// 
		JLabel userName = new JLabel("Username:");
		userName.setForeground(new Color(255, 255, 255));
		userName.setFont(new Font("Tahoma", Font.PLAIN, 24));
		userName.setBounds(300, 130, 165, 30);
		panel.add(userName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPassword.setBounds(300, 236, 165, 30);
		panel.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblConfirmPassword.setBounds(300, 342, 200, 30);
		panel.add(lblConfirmPassword);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblEmail.setBounds(300, 448, 200, 30);
		panel.add(lblEmail);
		
		final JTextField userNameText =  new JTextField();
		userNameText.setCaretColor(new Color(255, 255, 255));
		userNameText.setForeground(new Color(255, 255, 255));
		userNameText.setFont(new Font("Tahoma", Font.PLAIN, 31));
		userNameText.setBorder(null);
		userNameText.setBounds(300, 149, 629, 57);
		userNameText.setOpaque(false);
		panel.add(userNameText);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(300, 201, 629, 5);
		panel.add(panel_1);
		
		final JPasswordField passwordField = new JPasswordField(); // điền password
		passwordField.setCaretColor(new Color(255, 255, 255));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 31));
		passwordField.setBorder(null);
		passwordField.setBounds(300, 255, 629, 57);
		passwordField.setOpaque(false);
		panel.add(passwordField);
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(300, 307, 629, 5);
		panel.add(panel_1_1);
		
		
		final JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setCaretColor(new Color(255, 255, 255));
		passwordField_1.setForeground(new Color(255, 255, 255));
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		passwordField_1.setBorder(null);
		passwordField_1.setBounds(300, 361, 629, 57);
		passwordField_1.setOpaque(false);
		panel.add(passwordField_1);
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(300, 413, 629, 5);
		panel.add(panel_1_2);
		
		final JTextField EmailText = new JTextField();
		EmailText.setCaretColor(new Color(255, 255, 255));
		EmailText.setForeground(new Color(255, 255, 255));
		EmailText.setFont(new Font("Tahoma", Font.PLAIN, 31));
		EmailText.setBorder(null);
		EmailText.setBounds(300, 467, 629, 57);
		EmailText.setOpaque(false);
		panel.add(EmailText);
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(300, 519, 629, 5);
		panel.add(panel_2);

		MyButton btnNewButton = new MyButton("Submit", new Color(255, 95, 163), new Color(222, 88, 145), new Color(232, 0, 98));
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (userNameText.getText().isEmpty() || passwordField.getText().isEmpty() 
						|| passwordField_1.getText().isEmpty() || EmailText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Yêu cầu điền đầy đủ thông tin!");
				} else if (!passwordField.getText().equals(passwordField_1.getText())) {
					JOptionPane.showMessageDialog(null, "Password và confirm password không khớp!");
				} else {
					panel.setVisible(false);
					SMSreceive.showSMSpanel(framet, panel, EmailText.getText());
				}
			}
		});	
		btnNewButton.setRadius(50);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 34));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(500, 567, 232, 61);
		panel.add(btnNewButton);
		
		MyButton mbtnBack = new MyButton("Back", new Color(255, 95, 163), new Color(222, 88, 145), new Color(232, 0, 98));
		mbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstPanel.setBounds(0, 0, 1232, 787);
				panel.setVisible(false);
				firstPanel.setVisible(true);
			}
		});
		mbtnBack.setRadius(50);
		mbtnBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		mbtnBack.setFocusPainted(false);
		mbtnBack.setBorder(null);
		mbtnBack.setBounds(10, 11, 120, 49);
		panel.add(mbtnBack);
		
		
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1232, 787);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 800, 1232, 787);
		frame.getContentPane().add(panel_3);
		panel_3.setVisible(false);
		
		showPanel1(frame, panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nút back sẽ thực hiện chức năng quay lại trang trước đó và đây KHÔNG PHẢI file xuất phát");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 5, 629, 34);
		panel_3.add(lblNewLabel);
	}
}
