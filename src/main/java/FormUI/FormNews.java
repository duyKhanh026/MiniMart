package FormUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class FormNews extends JPanel{
	public FormNews() {
		setLayout(null);
		
		
		initComponent();
	}
	private void initComponent() {
		JLabel lblNewLabel = new JLabel("News");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(98, 71, 140, 68);
		add(lblNewLabel);
	}
}
