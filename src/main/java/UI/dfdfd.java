package UI;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComboBox;


@SuppressWarnings({ "serial", "rawtypes" })
class MyCBBOx extends JComboBox {
	private int radius = 20;
	
	public MyCBBOx(String obString[]) {
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		// paint Border
		g2.setColor(Color.black);
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
		g2.setColor(getBackground());
		// border set 2 Pix
		g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
		super.paintComponent(g);
	}
}

@SuppressWarnings("serial")
public class dfdfd extends JPanel{

	public dfdfd() {
		setLayout(null);
		initComponent();
	}
	private void initComponent() {
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		String object[] = {"test 1", "test 2"};
		MyCBBOx comboBox = new MyCBBOx(object);
		comboBox.setBounds(82, 78, 93, 22);
		panel.add(comboBox);
	}
	@Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, new Color(255,80,106),0, getHeight(), new Color(165,164,241));
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
}
