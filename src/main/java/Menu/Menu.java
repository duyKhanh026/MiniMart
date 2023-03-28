package Menu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Path2D;

import javax.swing.Timer;

import Card.Card;

import javax.swing.JPanel;
import event.EventMenu;
import event.EventMenuCallBack;
import event.EventMenuSelected;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class Menu extends javax.swing.JPanel {
	public void addEventMenu(EventMenu eventMenu) {
		this.event = eventMenu;
	}
	
	private int selectedIndex = -1;
	private final Timer timer;
	private boolean toUp;
	private int menuYTarget;
	private int menuY;
	private int speed;
	private EventMenuCallBack callBack;
	private EventMenu event;
	
	public Menu() {	
		initComponents();
		setOpaque(false);
		setLayout(null);
        listMenu.setOpaque(false);
        listMenu.addEventSelectedMenu(new EventMenuSelected() {
			public void menuSelected(int index, EventMenuCallBack callBack) {
				if (index != selectedIndex) {
					Menu.this.callBack = callBack;
					toUp = selectedIndex > index;
					if (selectedIndex == -1) {
						speed = 20;
					} else {
						//speed = selectedIndex - index;
						speed = 20;
						if (speed < 0) {
							speed *= -1;
							//  If speed valus <0 change it to <0   Ex : -1 to 1
						}
					}
					//speed++;    //  Add 1 speed
					selectedIndex = index;
					menuYTarget = selectedIndex * 44 + listMenu.getY(); //  menuYTarget is location y
					if (!timer.isRunning()) {
						timer.start();
					}
				}
			}
		});
		timer = new Timer(0, new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (toUp) {
					if (menuY <= menuYTarget - 5) {
						menuY = menuYTarget;
						repaint();
						timer.stop();
						callBack.call(selectedIndex);
						if (event != null) {
							event.menuIndexChange(selectedIndex);
						}
					} else {
						menuY -= speed;
						repaint();
					}
				} else {
					if (menuY >= menuYTarget + 5) { //  Add style
						menuY = menuYTarget + 1;
						repaint();
						timer.stop();
						callBack.call(selectedIndex);
						if (event != null) {
							event.menuIndexChange(selectedIndex);
						}
					} else {
						menuY += speed;
						repaint();
					}
				}
			}
		});
		
		panel = new JPanel();
		panel.setBounds(0, 1, 250, 105);
		panel.setOpaque(false);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MiniMart");
		lblNewLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/store.png")));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setBounds(10, 23, 230, 71);
		panel.add(lblNewLabel);
		initData();
	}
	
	private void initData() {
		listMenu.addItem(new Model_Menu("1", "Thông tin", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("2", "Các mặt hàng", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("3", "Kho", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("4", "Nhập Kho", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("5", "Hóa đơn", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("6", "Thống kê", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("7", "QL Nhân viên", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("8", "Account", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("9", "Setting", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("10", "Message", Model_Menu.MenuType.MENU));
		listMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
	}
	
	private void initComponents() {
		listMenu = new ListMenu<String>();
		listMenu.setBounds(0, 117, 250, 515);
		add(listMenu);
		
	}
	
	@Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, new Color(255,80,106),0, getHeight(), new Color(165,164,241));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if (selectedIndex >= 0) {
			int menuX = 10;
			int height = 46;
			int width = getWidth();
			g2.setColor(new Color(240, 240, 240));  
			g2.fillRoundRect(menuX, menuY, width, height, 44, 44);
			Path2D.Float f = new Path2D.Float();
			f.moveTo(width - 30, menuY);
			f.curveTo(width - 10, menuY, width, menuY, width, menuY - 30);
			f.lineTo(width, menuY + height + 30);
			f.curveTo(width, menuY + height, width - 10, menuY + height, width - 30, menuY + height);

			g2.fill(f);
		}
        super.paintComponent(grphcs);
    }
	private int x;
	private int y;
	public void initMoving(final JFrame framer) { // not Working and i dkw
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX() + 6;
				y = e.getY() + 6;
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				framer.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
			}
		});
	}
	
	private ListMenu<String> listMenu;
	private JPanel panel;

}
