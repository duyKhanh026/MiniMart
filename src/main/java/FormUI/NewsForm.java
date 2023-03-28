package FormUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import Card.Card;

@SuppressWarnings("serial")
public class NewsForm extends JPanel implements ActionListener{
	private int heightCx = 20;
	private boolean directionCx = true;
	private Card ListCard[] = new Card[3];
    private Timer timer;

	public NewsForm() {
		setLayout(null);
		
		initComponent();
	}
	private void initComponent() {
		

        timer = new Timer(10, this);
        
		
        timer.start();
		
	}
	public void paint(Graphics g) {
        super.paint(g);

		removeAll(); //xóa toàn bộ đối tượng
        for (int i = 0;i < 3;i++) {
			ListCard[i] = new Card();
			ListCard[i].setBounds(10 + (i * 390), 11, 380, heightCx);
			String txcg = "";
			Color c1 = new Color(140,200,200);
			Color c2 = new Color(100, 100, 255);
			switch(i) {
			case 0:
				txcg = "img/Untitled.png"; break;
			case 1:
				txcg = "img/bimbim.png"; 
				c1 = new Color(255,64,128);
				c2 = new Color(100, 100, 255);
				break;
			case 2:
				txcg = "img/durex.png"; 
				c1 = new Color(255,64,128);
				c2 = new Color(100, 100, 255);
				break;
			default: break;
			}
			ListCard[i].setImgToLable(txcg, ListCard[i].getWidth(),ListCard[i].getHeight());
			ListCard[i].setColor1(c1);
			ListCard[i].setColor2(c2);
			add(ListCard[i]);
		}
    }
	public void actionPerformed(ActionEvent e) {
		if (directionCx) {
			heightCx+=3;
			if (heightCx > 730) {
				directionCx = false;
			}
		}
		repaint();// vẽ lại
	}
}
