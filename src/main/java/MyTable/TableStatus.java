package MyTable;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TableStatus extends JLabel{
	public StatusType getType() {
		return type;
	}
	public TableStatus() {
		setForeground(Color.WHITE);
	}
	private StatusType type;
	
	public void setType(StatusType type) {
		this.type = type;
		setText(type.toString());
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		if (type != null) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint gs;
            if (type == StatusType.LÀM_VIỆC) {
                gs = new GradientPaint(0, 0, new Color(186, 123, 247), 0, getHeight(), new Color(167, 94, 236));
            } else if (type == StatusType.TẠM_NGHỈ) {
                gs = new GradientPaint(0, 0, new Color(142, 142, 250), 0, getHeight(), new Color(123, 123, 245));
            } else {
                gs = new GradientPaint(0, 0, new Color(241, 208, 62), 0, getHeight(), new Color(211, 184, 61));
            }
            g2.setPaint(gs);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);
        }
		super.paintComponent(g);
	}
}
