package Modules;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

@SuppressWarnings("serial")
public class ScrollBar extends JScrollBar {

    public ScrollBar() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(7, 5));
        setBackground(new Color(242, 242, 242));
        setForeground(new java.awt.Color(170, 83, 242));
        setUnitIncrement(20);
    }
}
