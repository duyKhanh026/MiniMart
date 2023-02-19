package Modules;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBorder extends JPanel{
	public PanelBorder() {
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D graphics2 = (Graphics2D) g;
		graphics2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics2.setColor(getBackground());
		graphics2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
		super.paintComponent(g);
	}
}
