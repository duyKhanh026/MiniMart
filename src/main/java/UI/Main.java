package UI;

import Menu.Menu;
import Modules.HoaDon;
import Modules.PanelBorder;
import event.EventMenu;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import FormProduct.ProductTable;
import FormUI.ChartForm;
import FormUI.Form_Home;
import FormUI.NewsForm;

@SuppressWarnings("serial")
public class Main extends JFrame {
	public final ProductTable form2 = new ProductTable(this);
	public Main() {
		getContentPane().setLayout(null);
		init();
        setVisible(true);
	}  
	private void init() {
		setTitle("Mini Mart");
		setBounds(0,0, 1445, 780);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
		
		TopBar tB = new TopBar();
		tB.setBounds(0, 0, 1445, 32);
		getContentPane().add(tB);
		
		panelBorder = new PanelBorder();
		panelBorder.setBounds(2, 30, 1472, 775);
		panelBorder.setBackground(new Color(240, 240, 240));
		getContentPane().add(panelBorder);
		panelBorder.setLayout(null);
		
		final NewsForm hnews = new NewsForm();
		hnews.setBounds(251, 2, 1202, 748);
		panelBorder.add(hnews);
		hnews.setVisible(false);
		
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(251, -12, 1202, 760);
		scrollPane.setBorder(null);
		panelBorder.add(scrollPane);
		
		Form_Home fHome = new Form_Home();
		fHome.setBounds(0, 0, 1000, 400);
		scrollPane.setViewportView(fHome);
		scrollPane.setVisible(true);
		
		final ChartForm f1 = new ChartForm();
		f1.setBounds(251, 0, 1202, 748);
		panelBorder.add(f1);
		f1.setVisible(false);
		
		final dfdfd t1 = new dfdfd();
		t1.setBounds(251, 0, 1202, 748);
		panelBorder.add(t1);
		t1.setVisible(false);
		
		final HoaDon hDon = new HoaDon();
		hDon.setBounds(251, 0, 1202, 748);
		panelBorder.add(hDon);
		hDon.setVisible(false);
		
		form2.setBounds(251, 0, 1202, 748);
		panelBorder.add(form2);
		form2.setVisible(false);
		
		Menu menu = new Menu();
		menu.setBounds(0, -12, 250, 760);
		menu.initMoving(this);
		menu.addEventMenu(new EventMenu() {
            public void menuIndexChange(int index) {
            	hnews.setVisible(index == 0);
            	scrollPane.setVisible(index == 6);
            	f1.setVisible(index == 5);
            	t1.setVisible(index == 1);
            	form2.setVisible(index == 2);
            	hDon.setVisible(index == 4);
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
