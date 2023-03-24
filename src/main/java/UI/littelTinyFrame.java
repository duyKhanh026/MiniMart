package UI;

import javax.swing.JFrame;
import java.awt.Color;

@SuppressWarnings("serial")
public class littelTinyFrame extends JFrame{
	public littelTinyFrame() {
		getContentPane().setBackground(new Color(176, 176, 255));
		initComponent();
	}
	private void initComponent() {
		setSize(400, 200);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setVisible(true);
	}
}
