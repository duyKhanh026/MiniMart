package UI;

import java.awt.Color;

import javax.swing.JPanel;

import Chart.Chart;
import Chart.ModelChart;

@SuppressWarnings("serial")
public class form1 extends JPanel{

	public form1() {
		setLayout(null);
		initComponent();

        chart.addLegend("Income", new Color(245, 189, 135));
        chart.addLegend("Expense", new Color(135, 189, 245));
        chart.addLegend("Profit", new Color(189, 135, 245));
        chart.addLegend("Cost", new Color(139, 229, 222));
        chart.addData(new ModelChart("January", new double[]{100, 150, 200, 500}));
	}
	
	private void initComponent() {
		chart = new Chart();
		chart.setBounds(10,337,1180,400);
		add(chart);
	}
	private Chart chart;
}
