package UI;

import Modules.PanelRound;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TopBar extends PanelRound{

	public TopBar() {
		setBackground(new Color(0, 0, 255));
		setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		add(btnNewButton, BorderLayout.EAST);
	}
}
