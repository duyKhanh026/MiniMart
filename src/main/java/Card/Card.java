package Card;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Card extends JPanel{
	
	private Color color1;
	private Color color2;
	private JLabel lblNewLabel;
	private JLabel lbIcon;
	private JLabel lbTitle;
	private JLabel lblValue;
	private JLabel lblDescription;
	
	public Color getColor1() {
		return color1;
	}

	public void setColor1(Color color1) {
		this.color1 = color1;
	}

	public Color getColor2() {
		return color2;
	}

	public void setColor2(Color color2) {
		this.color2 = color2;
	}
	public void setImgToLable(String t,int w,int h) {
		lblNewLabel.setIcon(new ImageIcon(t));
        lblNewLabel.setBounds(50, 0, 380,h);
		//lblNewLabel.setPreferredSize(new Dimension());
	}

	public Card() {
		initComponents();
        setOpaque(false);
        setLayout(null);
        setLayout(null);

        add(lbIcon);
        add(lbTitle);
        add(lblValue);
        add(lblDescription);
        add(lblNewLabel);
        
        
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }
	public void setData(Model_Card data) {
        lbIcon.setIcon(data.getIcon());
        lbTitle.setText(data.getTitle());
        lblValue.setText(data.getValues());
        lblDescription.setText(data.getDescription());
    }
	private void initComponents() {
		
		lblNewLabel = new JLabel("");
        
		lbIcon = new JLabel();
		lbIcon.setBounds(10, 11, 102, 30);
        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png")));
        add(lbIcon);
        
        lbTitle = new JLabel();
        lbTitle.setBounds(10, 51, 165, 32);
        lbTitle.setFont(new Font("sansserif", 1, 14)); // NOI18N
        lbTitle.setForeground(new Color(255, 255, 255));
        lbTitle.setText("Title");
        add(lbTitle);
        
        lblValue = new JLabel();
        lblValue.setText("value");
        lblValue.setForeground(Color.WHITE);
        lblValue.setFont(new Font("SansSerif", Font.BOLD, 14));
        lblValue.setBounds(10, 94, 165, 32);
        add(lblValue);
        
        lblDescription = new JLabel();
        lblDescription.setText("Description");
        lblDescription.setForeground(Color.WHITE);
        lblDescription.setFont(new Font("SansSerif", Font.BOLD, 14));
        lblDescription.setBounds(10, 137, 165, 32);
        add(lblDescription);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gs = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(gs);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
		super.paintComponent(g);
	}


	
}

