package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class SignUp {

	private JFrame frame;
	private JTextField textField;
	private JPanel panel_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1232, 787);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		@SuppressWarnings("serial")
		JPanel panel = new JPanel() {
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
		frame.getContentPane().add(panel);
		panel.setLayout(null);	
		
		panel_1 = new JPanel();
		panel_1.setBounds(300, 266, 629, 5);
		panel.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(300, 372, 629, 5);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(300, 195, 165, 30);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPassword.setBounds(300, 301, 165, 30);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setCaretColor(new Color(255, 255, 255));
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 34));
		textField.setBorder(null);
		textField.setBounds(300, 214, 629, 61);
		textField.setOpaque(false);
		panel.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setCaretColor(new Color(255, 255, 255));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 34));
		passwordField.setBorder(null);
		passwordField.setBounds(300, 320, 629, 61);
		passwordField.setOpaque(false);
		panel.add(passwordField);
		
		@SuppressWarnings("serial")
		JButton btnNewButton = new JButton("Sign In") ;
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btnNewButton.setBounds(300, 437, 180, 68);
		panel.add(btnNewButton);
		
		
		
		
		
		
	}
}
