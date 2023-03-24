package FormUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

import Chart.Chart;
import Chart.ModelChart;
import Chart1.ChartLine;
import Chart1.ChartPie;
import Chart1.ModelChartLine;
import Chart1.ModelChartPie;

@SuppressWarnings("serial")
public class ChartForm extends JPanel{

	public ChartForm() {
		setLayout(null);
		initComponent();
		
		//biểu đồ tròn chia phần trăm các ngày trong tuần trước đó 
        List<ModelChartPie> list1 = new ArrayList<ModelChartPie>();
        list1.add(new ModelChartPie("Thứ hai", 10, new Color(4, 174, 243)));
        list1.add(new ModelChartPie("Thứ ba", 150, new Color(215, 39, 250)));
        list1.add(new ModelChartPie("Thứ tư", 80, new Color(44, 88, 236)));
        list1.add(new ModelChartPie("Thứ năm", 100, new Color(21, 202, 87)));
        list1.add(new ModelChartPie("Thứ sáu", 125, new Color(127, 63, 255)));
        list1.add(new ModelChartPie("Thứ bảy", 80, new Color(238, 167, 35)));
        list1.add(new ModelChartPie("Chủ nhật", 200, new Color(245, 79, 99)));
        chartPie.setModel(list1);
        
        //biểu đồ miền hay gì đấy nhưng sẽ hiện các ngày trong tuần 
        //ví dụ dưới đấy là thể hiện các ngày t2 3 4 5 
        List<ModelChartLine> list = new ArrayList<ModelChartLine>();
        list.add(new ModelChartLine("Thứ hai", 10));
        list.add(new ModelChartLine("Thứ ba", 150));
        list.add(new ModelChartLine("Thứ tư", 80));
        list.add(new ModelChartLine("Thứ năm", 100));
        chartLine.setModel(list);

        
        //biểu đồ cột dành cho cả năm theo chỉ định ví dụ năm hiện tại 2023
        chart.addLegend("Income", new Color(245, 189, 135));
        chart.addLegend("Expense", new Color(135, 189, 245));
        chart.addLegend("Profit", new Color(189, 135, 245));
        chart.addLegend("Cost", new Color(139, 229, 222));
        chart.addData(new ModelChart("Tháng 2", new double[]{100, 150, 200, 1500}));
        chart.addData(new ModelChart("Tháng 3", new double[]{100, 350, 500, 1000}));
	}
	
	private void initComponent() {
		chart = new Chart();
		chart.setBounds(10,337,1180,400);
		add(chart);
		
		chartPie = new ChartPie();
		chartPie.setBounds(10,10,549,320);
		add(chartPie);
		
		chartLine = new ChartLine();
		chartLine.setBounds(570,10,620,320);
		add(chartLine);
	}
	private Chart chart;
	private ChartPie chartPie;
	private ChartLine chartLine;
}
