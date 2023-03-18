package FormUI;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Modules.PanelBorder;
import Modules.ScrollBar;
import MyTable.StatusType;
import MyTable.Table;
import UI.littelTinyFrame;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Form_Home extends JPanel{
	private Table table;
	private JScrollPane spTable;
	
	public Form_Home() {
		setBackground(new Color(240, 240, 240));
		initComponents();

        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        // add row table
        
        for (int i =0; i < 20;i++) {
        	String idString = "NVCC"; if (i < 10) idString += "00" + i;else if (i < 100) idString += "0" + i;
        	table.addRow(new Object[]{idString, "Trần Khánh Duy", "26/10/2003", "Nam" , "0342205794", "Log An", StatusType.TẠM_NGHỈ});
		}
    
	}

	private void initComponents() { 
		setLayout(null);
		
		PanelBorder pBorder = new PanelBorder();
		pBorder.setBackground(new Color(255, 255, 255));
		pBorder.setBounds(10, 11, 1180, 738);
		add(pBorder);
		pBorder.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bảng Nhân viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(21, 11, 340, 29);
		pBorder.add(lblNewLabel);
		
        spTable = new JScrollPane();
        spTable.setBounds(31, 51, 1149, 667);
        spTable.setBorder(BorderFactory.createEmptyBorder()); // tắt cái border 
        pBorder.add(spTable);
        table = new Table(6);
        table.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		int row = table.rowAtPoint(e.getPoint());
                int column = table.columnAtPoint(e.getPoint());
                if (row >= 0 && column >= 0) {
                	littelTinyFrame b12 = new littelTinyFrame();
                	add(b12);
                }
        	}
        });
        table.setModel(new DefaultTableModel(
        	new Object[][] { 
        	},
        	new String[] {
        		"ID", "Họ Tên", "Ngày Sinh",  "Giới Tính", "SĐT", "Địa Chỉ", "Trạng thái"
        	}
        ));
        spTable.setViewportView(table);
	}
}
