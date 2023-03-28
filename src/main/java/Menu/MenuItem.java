package Menu;

import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Font;


@SuppressWarnings("serial")
public class MenuItem extends javax.swing.JPanel{

	private final Model_Menu data;
	public MenuItem(Model_Menu dataMenu) {
		this.data = dataMenu;
        setOpaque(false);
        initComponents();
        if (data.getType() == Model_Menu.MenuType.MENU) {
			lbIcon.setIcon(data.toIcon());
			lbName.setText(data.getName());
		} else {
			lbName.setText(" ");
		}
	}
	private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbName.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        lbName.setForeground(new java.awt.Color(226, 226, 226));
        lbName.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(lbIcon)
        			.addGap(18)
        			.addComponent(lbName, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(lbIcon, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        		.addComponent(lbName, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        this.setLayout(layout);
	}
	
	public void setSelected(boolean selected) {
		if (data.getType() == Model_Menu.MenuType.MENU) {
			if (selected) {
				lbIcon.setIcon(data.toIconSelected());
				lbName.setForeground(new Color(200, 0, 0));
			} else {
				lbIcon.setIcon(data.toIcon());
				lbName.setForeground(new Color(240, 240, 240));
			}
		}
	}
	
	private javax.swing.JLabel lbIcon;
	private javax.swing.JLabel lbName;
	
}
