package Modules;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelRound extends JPanel{
	
	int roundTopLeft = 0;
	int roundTopRight = 0;
	int roundBottomLeft = 0;
	int roundBottomRight = 0;
	
	
	public int getRoundTopLeft() {
		return roundTopLeft;
	}
	public void setRoundTopLeft(int roundTopLeft) {
		this.roundTopLeft = roundTopLeft;
		repaint();
	}
	public int getRoundTopRight() {
		return roundTopRight;
	}
	public void setRoundTopRight(int roundTopRight) {
		this.roundTopRight = roundTopRight;
		repaint();
	}
	public int getRoundBottomLeft() {
		return roundBottomLeft;
	}
	public void setRoundBottomLeft(int roundBottomLeft) {
		this.roundBottomLeft = roundBottomLeft;
		repaint();
	}
	public int getRoundBottomRight() {
		return roundBottomRight;
	}
	public void setRoundBottomRight(int roundBottomRight) {
		this.roundBottomRight = roundBottomRight;
		repaint();
	}
	public PanelRound() {
		setOpaque(false);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(getBackground());
		Area area = new Area(createRoundTopLeft());
		if (roundTopRight > 0) {
			area.intersect(new Area(createRoundTopRight()));
		}
		if (roundBottomLeft > 0) {
			area.intersect(new Area(createRoundBottmLeft()));
		}
		if (roundBottomRight > 0) {
			area.intersect(new Area(createRoundBottmRight()));
		}
		g2.fill(area);
		g2.dispose();
		super.paintComponent(g);		
	}
	private Shape createRoundTopLeft() {
		int width = getWidth();
		int height = getHeight();
		int roundX = Math.min(width, roundTopLeft);
		int roundY = Math.min(height, roundTopLeft);
		Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
		area.add(new Area(new Rectangle2D.Double(roundX/2, 0, width - roundX / 2, height)));
		area.add(new Area(new Rectangle2D.Double(0, roundX / 2, width, height - roundY / 2)));
		return area;
	}
	
	private Shape createRoundTopRight() {
		int width = getWidth();
		int height = getHeight();
		int roundX = Math.min(width, roundTopRight);
		int roundY = Math.min(height, roundTopRight);
		Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
		area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
		area.add(new Area(new Rectangle2D.Double(0, roundX / 2, width, height - roundY / 2)));
		return area;
	}
	private Shape createRoundBottmLeft() {
		int width = getWidth();
		int height = getHeight();
		int roundX = Math.min(width, roundBottomLeft);
		int roundY = Math.min(height, roundBottomLeft);
		Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
		area.add(new Area(new Rectangle2D.Double(roundX/2, 0, width - roundX / 2, height)));
		area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
		return area;
	}
	
	private Shape createRoundBottmRight() {
		int width = getWidth();
		int height = getHeight();
		int roundX = Math.min(width, roundBottomRight);
		int roundY = Math.min(height, roundBottomRight);
		Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
		area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
		area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
		return area;
	}
}
