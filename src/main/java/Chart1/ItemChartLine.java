package Chart1;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class ItemChartLine extends javax.swing.JPanel {

    public ItemChartLine(ModelChartLine data) {
        initComponents();
        setOpaque(false);
        DecimalFormat df = new DecimalFormat("$ #,##0.##");
        lbName.setText(data.getName());
        lbValues.setText(df.format(data.getValue()));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbName = new javax.swing.JLabel();
        lbValues = new javax.swing.JLabel();

        lbName.setForeground(new java.awt.Color(69, 69, 69));
        lbName.setText("Name");

        lbValues.setForeground(new java.awt.Color(69, 69, 69));
        lbValues.setText("Values");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lbName, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
        			.addComponent(lbValues)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(lbValues, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        		.addComponent(lbName, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        //  Create line
        g.setColor(new Color(240, 240, 240));
        g.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbValues;
    // End of variables declaration//GEN-END:variables
}
