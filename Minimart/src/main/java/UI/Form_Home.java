package UI;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Card.Card;
import Card.Model_Card;
import Modules.PanelBorder;
import Modules.ScrollBar;
import Modules.StatusType;
import Modules.Table;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Form_Home extends JPanel{
	private Card card1;
	private Card card2;
	private Card card3;
	private JPanel panel;
	private Table table;
	private JScrollPane spTable;
	
	public Form_Home() {
		setBackground(new Color(240, 240, 240));
		initComponents();
		card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/stock.png")), "Stock Total", "$200000", "Increased by 60%"));
		card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/profit.png")), "Total Profit", "$15000", "Increased by 25%"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/flag.png")), "Unique Visitors", "$300000", "Increased by 70%"));

        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        // add row table
        table.addRow(new Object[]{"Mike Bhand", "mikebhand@gmail.com", "Admin", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018", StatusType.REJECT});
        table.addRow(new Object[]{"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018", StatusType.REJECT});
        table.addRow(new Object[]{"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018", StatusType.REJECT});
        table.addRow(new Object[]{"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", StatusType.PENDING});
    
	}

	private void initComponents() {
		setLayout(null);
		card1 = new Card();
		card1.setColor1(new Color(119, 119, 255));
        card1.setColor2(new Color(255, 0, 128));
        
        card2 = new Card();
        card2.setColor1(new Color(186, 123, 247));
        card2.setColor2(new Color(63, 156, 192));
        
        card3 = new Card();
        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new Color(244, 163, 11));
        
        panel = new JPanel();
        panel.setBounds(10, 10, 1180, 200);
        panel.setOpaque(false);
        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));
        panel.add(card3);
        panel.add(card2);
		panel.add(card1);
		add(panel);
		
		PanelBorder pBorder = new PanelBorder();
		pBorder.setBackground(new Color(255, 255, 255));
		pBorder.setBounds(10, 222, 1180, 518);
		add(pBorder);
		pBorder.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Standard table design");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(21, 11, 340, 29);
		pBorder.add(lblNewLabel);
		
        spTable = new JScrollPane();
        spTable.setBounds(21, 51, 1149, 456);
        spTable.setBorder(BorderFactory.createEmptyBorder()); // tắt cái củ lồn border khốn nạn :v
        pBorder.add(spTable);
        table = new Table();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"New column", "ID", "Name", "cak", "lol"
        	}
        ));
        spTable.setViewportView(table);
	}
}
