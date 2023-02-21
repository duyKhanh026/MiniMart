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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Modules.MyButton;
import Modules.PanelRound;
import Modules.SendMail;

import javax.swing.JEditorPane;

public class SMSreceive {

	private JFrame frame;
	private static JTextField codeText;
	private static String codeSMS ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMSreceive window = new SMSreceive();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	public static String getCodeSMS() {
		return codeSMS;
	}
	public static void setCodeSMS(String CodeSMS) {
		codeSMS = CodeSMS;
	}
	@SuppressWarnings("static-access")
	private static void getSMScode(String mel) {
		SendMail smsMail = new SendMail();
		if (mel.equals("")) {
			setCodeSMS("000");
		} else {
			setCodeSMS(smsMail.send(mel));
		}
	}

	/**
	 * Create the application.
	 */
	public SMSreceive() {
		initialize();
	}
	public static void showSMSpanel(JFrame framet, final JPanel firstPanel, String emailStr) {
		getSMScode(emailStr);
		
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
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(275, 168, 651, 320);
		panel_1.setOpaque(false);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JEditorPane dtrpnTheConfirmationCode = new JEditorPane();
		dtrpnTheConfirmationCode.setFont(new Font("Tahoma", Font.PLAIN, 32));
		dtrpnTheConfirmationCode.setText("The confirmation code has been sent to this email.");
		dtrpnTheConfirmationCode.setBounds(38, 36, 553, 93);
		dtrpnTheConfirmationCode.setOpaque(false);
		panel_1.add(dtrpnTheConfirmationCode);
		
		JLabel lblNewLabel_1 = new JLabel(emailStr);
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(38, 129, 603, 31);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SMS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(260, 186, 118, 31);
		panel_1.add(lblNewLabel_2);
		
		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(275, 168, 651, 320);
		panel.add(panel_3_1);
		panel_3_1.setOpaque(false);
		panel_3_1.setLayout(null);
		panel_3_1.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("Successful!");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(236, 64, 206));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNewLabel_3.setBounds(10, 50, 631, 113);
		panel_3_1.add(lblNewLabel_3);
		
		MyButton mbtnBackToSign = new MyButton("Back to Sign in", new Color(255, 95, 163), new Color(222, 88, 145), new Color(232, 0, 98));
		mbtnBackToSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				SignUp.SignUpForm();
			}
		});
		mbtnBackToSign.setRadius(50);
		mbtnBackToSign.setFont(new Font("Tahoma", Font.PLAIN, 28));
		mbtnBackToSign.setFocusPainted(false);
		mbtnBackToSign.setBorder(null);
		mbtnBackToSign.setBounds(190, 228, 256, 49);
		panel_3_1.add(mbtnBackToSign);
		
		codeText = new JTextField();
		codeText.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					  if (codeText.getText().isEmpty()) {
						  JOptionPane.showMessageDialog(null, "Please enter the sms!");
					  } else {
						  if (codeText.getText().equals(getCodeSMS())) {
							  panel_3_1.setVisible(true);
							  panel_1.setVisible(false);
						  } else {
							  JOptionPane.showMessageDialog(null, "Mã vừa nhập không đúng!");
						  }
					  }
				}
			}
		});
		codeText.setHorizontalAlignment(SwingConstants.CENTER);
		codeText.setFont(new Font("Tahoma", Font.PLAIN, 22));
		codeText.setBounds(230, 228, 181, 31);
		codeText.setOpaque(false);
		codeText.setBorder(null);
		panel_1.add(codeText);
		codeText.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(229, 258, 185, 3);
		panel_1.add(panel_2);
	
		
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
		
		final PanelRound panel_12 = new PanelRound();
		panel_12.setBackground(new Color(255, 255, 255));
		panel_12.setRoundTopRight(200);
		panel_12.setRoundBottomRight(100);
		panel_12.setRoundTopLeft(100);
		panel_12.setRoundBottomLeft(200);
		panel_12.setBounds(275, 168, 651, 320);
		panel.add(panel_12);
		panel_12.setLayout(null);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1216, 748);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 800, 1232, 787);
		frame.getContentPane().add(panel_3);
		panel_3.setVisible(false);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nút back sẽ thực hiện chức năng quay lại trang trước đó và đây KHÔNG PHẢI file xuất phát");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 5, 629, 34);
		panel_3.add(lblNewLabel);
		
		showSMSpanel(frame,panel_3, "");
		
		
	}
}
