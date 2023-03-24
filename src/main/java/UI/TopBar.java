package UI;

import Modules.PanelRound;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class TopBar extends JPanel{

	public TopBar() {
		setBackground(new Color(128, 128, 255));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 255));
		panel.setPreferredSize(new Dimension(110, 0));;
		add(panel, BorderLayout.EAST);
		
		
		
		final JLabel lblNewLabel = new JLabel("XXX");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 2, 65, 28);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
			}
		});
		panel.setLayout(null);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel.add(lblNewLabel);
		
		PanelRound Pr1_1 = new PanelRound();
		Pr1_1.setBounds(7,3, 100, 26);
		Pr1_1.setRoundTopRight(20);
		Pr1_1.setBackground(new Color(255, 255, 255));
		panel.add(Pr1_1);
	}
}
