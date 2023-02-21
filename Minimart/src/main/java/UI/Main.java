package UI;

import Menu.Menu;
import Modules.PanelBorder;
import event.EventMenu;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Main extends JFrame {

	/**
	 * Create the application.
	 */
	public Main() {
		init();
	}

	private void init() {
		setTitle("Mini Mart");
		setBounds(0,0, 1467, 787);
		setLocationRelativeTo(null);
		panelBorder = new PanelBorder();
		panelBorder.setBackground(new Color(240, 240, 240));
		getContentPane().add(panelBorder);
		panelBorder.setLayout(null);
		
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(251, 0, 1202, 748);
		scrollPane.setBorder(null);
		panelBorder.add(scrollPane);
		
		Form_Home fHome = new Form_Home();
		fHome.setBounds(0, 0, 1000, 400);
		scrollPane.setViewportView(fHome);
		
		Menu menu = new Menu();
		menu.setBounds(0, 0, 250, 748);
		menu.initMoving(this);
		menu.addEventMenu(new EventMenu() {
            public void menuIndexChange(int index) {
            	scrollPane.setVisible(index == 0);
            }
        });
		panelBorder.add(menu);
		
		
	}
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable( ) {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}
	
	private Modules.PanelBorder panelBorder;
}
