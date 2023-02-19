package Modules;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ResizableFrame extends JFrame {
    private JPanel panel;
    private JLabel label;
    private double widthRatio;
    private double heightRatio;

    public ResizableFrame() {
        super("Resize Frame");

        panel = new JPanel();
        panel.setBackground(new Color(255, 255, 128));
        panel.setLayout(null);
        label = new JLabel("This is a JLabel");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(new Color(128, 255, 255));
        label.setBounds(181, 5, 133, 14);
        panel.add(label);
        panel.setPreferredSize(new Dimension(200, 200));
        getContentPane().add(panel);

        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                // Tính tỷ lệ giữa kích thước hiện tại của cửa sổ và kích thước ban đầu của cửa sổ
                double newWidth = e.getComponent().getWidth();
                double newHeight = e.getComponent().getHeight();
                double widthChangeRatio = newWidth / getWidth();
                double heightChangeRatio = newHeight / getHeight();

                // Lưu tỷ lệ cho lần resize tiếp theo
                widthRatio *= widthChangeRatio;
                heightRatio *= heightChangeRatio;

                // Tính toán kích thước mới cho JFrame và các thành phần bên trong nó
                int newFrameWidth = (int) (getWidth() * widthRatio);
                int newFrameHeight = (int) (getHeight() * heightRatio);
                setSize(newFrameWidth, newFrameHeight);

                // Tính toán kích thước mới cho JLabel
                int newLabelWidth = (int) (label.getWidth() * widthChangeRatio);
                int newLabelHeight = (int) (label.getHeight() * heightChangeRatio);
                label.setSize(newLabelWidth, newLabelHeight);

                // Vẽ lại JFrame
                revalidate();
                repaint();
            }
        });

        // Lưu kích thước ban đầu của cửa sổ
        widthRatio = 1.0;
        heightRatio = 1.0;
    }

    public static void main(String[] args) {
        ResizableFrame frame = new ResizableFrame();
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
