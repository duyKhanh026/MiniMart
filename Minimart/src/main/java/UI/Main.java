package UI;

import Menu.Menu;
import Modules.PanelBorder;
import event.EventMenu;
import java.awt.Color;

@SuppressWarnings("serial")
public class Main extends Modules.ResizableFrame {

	/**
	 * Create the application.
	 */
	public Main() {
		init();
	}

	private void init() {
		setTitle("Mini Mart");
		setBounds(0,0, 1475, 787);
		setLocationRelativeTo(null);
		panelBorder = new PanelBorder();
		panelBorder.setBackground(new Color(255, 255, 255));
		getContentPane().add(panelBorder);
		panelBorder.setLayout(null);
		
		final Form_Home fHome = new Form_Home();
		fHome.setBounds(267, 11, 1182, 185);
		panelBorder.add(fHome);
		fHome.setVisible(false);
		
		Menu menu = new Menu();
		menu.setBounds(0, 0, 250, 748);
		menu.initMoving(this);
		menu.addEventMenu(new EventMenu() {
            public void menuIndexChange(int index) {
            	fHome.setVisible(index == 0);
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
