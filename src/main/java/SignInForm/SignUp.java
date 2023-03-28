package SignInForm;

import Modules.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp {

	private static JFrame frame;
	private static JTextField usernametext;
	private static JPanel panel_1;
	private static JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
		initialize();
	}
	
	public static void SignUpForm() {
		@SuppressWarnings("serial")	
		final JPanel panel = new JPanel() {  // làm phần background
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                int w = getWidth();
                int h = getHeight();
                GradientPaint gp = new GradientPaint(0, 0, new Color(255,80,106),0, getHeight(), new Color(165,164,241));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, w, h);
            }
        };
		panel.setBorder(null);
		panel.setBounds(0, 0, 1216, 748);
		frame.getContentPane().add(panel);
		panel.setLayout(null);	
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(297, 242, 165, 30);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPassword.setBounds(297, 348, 165, 30);
		panel.add(lblPassword);
		
		usernametext = new JTextField(); // điền thông tin username
		usernametext.setCaretColor(new Color(255, 255, 255));
		usernametext.setForeground(new Color(255, 255, 255));
		usernametext.setFont(new Font("Tahoma", Font.PLAIN, 30));
		usernametext.setBorder(null);
		usernametext.setBounds(297, 261, 629, 57);
		usernametext.setOpaque(false);
		//usernametext.setBackground(new Color(0,0,0,0));  không thể dùng đc 
		panel.add(usernametext);
		panel_1 = new JPanel();
		panel_1.setBounds(297, 313, 629, 5);
		panel.add(panel_1);
		
		passwordField = new JPasswordField(); // điền password
		passwordField.setCaretColor(new Color(255, 255, 255));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		passwordField.setBorder(null);
		passwordField.setBounds(297, 367, 629, 57);
		passwordField.setOpaque(false);
		panel.add(passwordField);
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(297, 419, 629, 5);
		panel.add(panel_1_1);
		
		MyButton btun = new MyButton("Sign In", new Color(255, 95, 163), new Color(222, 88, 145), new Color(232, 0, 98));
		btun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Không thành công!");
			}
		});
		btun.setBounds(297, 459, 244, 61);
		btun.setFont(new Font("Tahoma", Font.PLAIN, 34));
		btun.setRadius(50);
		btun.setFocusPainted(false);
		btun.setBorder(null);
		panel.add(btun);
		
		MyButton mbtnSignUp = new MyButton("Sign Up", new Color(255, 95, 163), new Color(222, 88, 145), new Color(232, 0, 98));
		mbtnSignUp.setText("Sign in with SMS");
		mbtnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				CreateAcc.showPanel1(frame, panel); // đến trang tạo acc
			}
		});
		mbtnSignUp.setRadius(50);
		mbtnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 34));
		mbtnSignUp.setFocusPainted(false);
		mbtnSignUp.setBorder(null);
		mbtnSignUp.setBounds(578, 459, 348, 61);
		panel.add(mbtnSignUp);
		
		JLabel lblNewLabel_1 = new JLabel("ĐĂNG NHẬP");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(489, 91, 251, 61);
		panel.add(lblNewLabel_1);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1232, 787);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		SignUpForm();
	}
}