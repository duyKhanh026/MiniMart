package UI;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Card.Card;
import Card.Model_Card;
import java.awt.Color;

@SuppressWarnings("serial")
public class Form_Home extends JPanel{
	private Card card1;
	private Card card2;
	private Card card3;
	private JPanel panel;
	
	public Form_Home() {
		initComponents();
		setOpaque(false);
		card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/stock.png")), "Stock Total", "$200000", "Increased by 60%"));
		card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/profit.png")), "Total Profit", "$15000", "Increased by 25%"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/flag.png")), "Unique Visitors", "$300000", "Increased by 70%"));
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
        panel.setBounds(0, 0, 1180, 183);
        panel.setOpaque(false);
        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));
        panel.add(card3);
        panel.add(card2);
		panel.add(card1);
		add(panel);
	}
}
