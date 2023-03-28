package UI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.PointerInfo;

@SuppressWarnings("serial")
public class littelTinyFrame extends JFrame{
	JLabel lblNewLabel;
	
	public littelTinyFrame() {
		getContentPane().setBackground(new Color(176, 176, 255));
		getContentPane().setLayout(null);
		
		initComponent();
	}
	public void setTextLable(String textt) {
		PointerInfo pointer = MouseInfo.getPointerInfo();
        int mouseX = pointer.getLocation().x;
        int mouseY = pointer.getLocation().y;
		setBounds(700,mouseY+20, 400,200);
		setVisible(true);
		
		lblNewLabel.setText(textt);
	}
	public void turnOff() {
		setVisible(false);
	}
	
	private void initComponent() {
		setUndecorated(true);
		setVisible(false);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(59, 56, 287, 82);
		getContentPane().add(lblNewLabel);
	}
}
