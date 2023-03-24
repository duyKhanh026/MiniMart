package FormProduct;

import Modules.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import MyTable.StatusType;
import MyTable.Table;
import UI.Main;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ProductTable extends JPanel{

	
	private Table table;
	public ProductTable(Main maint) {
		initialize(maint);
		setLayout(new BorderLayout());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize(final Main maint) {
		setBounds(ALLBITS, ABORT, 1200, 700);
		

		JScrollPane pane1 = new JScrollPane();
		pane1.setBounds(10, 10, 1160, 600);
		pane1.setBorder(BorderFactory.createEmptyBorder());
		pane1.setVerticalScrollBar(new ScrollBar());
		pane1.getVerticalScrollBar().setBackground(Color.WHITE);
		pane1.getViewport().setBackground(Color.WHITE);
		
		table = new Table(6);
		table.setBounds(0, 0, 1200, 1000);
		table.setModel(new DefaultTableModel(
	        	new Object[][] {
	        	},
	        	new String[] {
	        			"Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Mô tả", "More..."
	        	}
	        ));
		pane1.setViewportView(table);
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        table.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018","",StatusType.NGHỈ_LUÔN});
        
        JPanel pan_all = new JPanel();
        pan_all.setBackground(new Color(240, 240, 240));
        pan_all.setBounds(0, 130, 1200, 620);
        add(pan_all, BorderLayout.CENTER);
        pan_all.setLayout(null);
        
        PanelBorder pan_table = new PanelBorder();
        pan_table.setBounds(10, 10, 1180, 607);
        pan_table.setBackground(new Color(255, 255, 255));
        pan_table.setLayout(null);
        pan_table.add(pane1);
        pan_all.add(pan_table);
        
        JPanel pan_header = new JPanel();
        pan_header.setBounds(0, 0, 1200, 130);
        add(pan_header, BorderLayout.NORTH);
        pan_header.setLayout(new BorderLayout());
        
        JPanel pan_Title = new JPanel();
        pan_header.add(pan_Title, BorderLayout.WEST);
        pan_Title.setBounds(0, 20, 100, 50);
        pan_Title.setPreferredSize(new Dimension(550,30));
        pan_Title.setLayout(null);
        
        JLabel text1 = new JLabel("Kho Sản Phẩm");
        text1.setBounds(20, 10, 303, 50);
        text1.setForeground(new Color(232, 0, 98));
        text1.setFont(new Font("Tahoma", Font.BOLD, 35));
        pan_Title.add(text1);
        
        
        String thuoctinh[] = {
				"Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Mô tả"
		};
        MyCombobox list_thuoctinh = new MyCombobox(thuoctinh);
        list_thuoctinh.setBtColor(new Color(255, 232, 241));
        list_thuoctinh.setLineColor(new Color(255, 0, 0));
        list_thuoctinh.setBackground(new Color(240, 240, 240));
        list_thuoctinh.setLabeText("");
        list_thuoctinh.setForeground(new Color(0, 0, 0));
        list_thuoctinh.setBounds(135, 70, 176, 38);
        list_thuoctinh.setFont(new Font("Tahoma", Font.PLAIN, 23));
		pan_Title.add(list_thuoctinh);
		list_thuoctinh.setFocusable(false);
		
		
		JLabel Search_from = new JLabel("Tìm kiếm ");
		Search_from.setBounds(20, 77, 161, 36);
		Search_from.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pan_Title.add(Search_from);
		Search_from.setForeground(new Color(232, 0, 98));

		
		MyButton btn_search = new MyButton("Search",new Color(255, 95, 163), new Color(222, 88, 145), new Color(232, 0, 98));
		btn_search.setBounds(321, 74, 135, 38);
		btn_search.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pan_Title.add(btn_search);
		btn_search.setFocusPainted(false);
		btn_search.setRadius(20);
		btn_search.setBorder(null);


		JPanel pan_right = new JPanel();
	    pan_header.add(pan_right, BorderLayout.EAST);
	    pan_right.setLayout(null);
	    pan_right.setPreferredSize(new Dimension(500,30));
	    
	    JLabel list_product = new JLabel("Loại sản phẩm");
	    list_product.setFont(new Font("Tahoma", Font.PLAIN, 27));
	    list_product.setBounds(21, 73, 193, 39);
	    pan_right.add(list_product);
	    list_product.setForeground(new Color(232, 0, 98));

        
        MyButton but_add = new MyButton("Thêm", new Color(255, 95, 163), new Color(222, 88, 145), new Color(232, 0, 98));
        but_add.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddProduct add = new AddProduct();
        	}
        });
        but_add.setFont(new Font("Tahoma", Font.PLAIN, 30));
        but_add.setBounds(21, 10, 171, 45);
        pan_right.add(but_add);
        but_add.setRadius(20);
        but_add.setFocusPainted(false);
        but_add.setBorder(null);
        
        MyButton but_sua = new  MyButton("Sửa", new Color(255, 95, 163), new Color(222, 88, 145), new Color(232, 0, 98));
        but_sua.setBounds(202, 10, 140, 45);
        but_sua.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddProduct add = new AddProduct();
        		
        	}
        });
        but_sua.setFont(new Font("Tahoma", Font.PLAIN, 30));
        pan_right.add(but_sua);
        but_sua.setRadius(20);
        but_sua.setFocusPainted(false);
        but_sua.setBorder(null);
        
        MyButton but_xoa = new  MyButton("Xóa", new Color(255, 95, 163), new Color(222, 88, 145), new Color(232, 0, 98));
        but_xoa.setBounds(352, 10, 138, 45);
        but_xoa.setFont(new Font("Tahoma", Font.PLAIN, 30));
        pan_right.add(but_xoa);
        but_xoa.setRadius(20);
        but_xoa.setFocusPainted(false);
        but_xoa.setBorder(null);
        
        String loai[] = {
				"Thực phẩm", "Đông lạnh", "Bánh kẹo", "Rau củ quả", "Sữa kem", "Hóa phẩm", "Đồ uống",
				"Bông, giấy", "Gia dụng", "Văn phòng phẩm", "Mỹ phẩm"
		};
		MyCombobox Loaisp = new MyCombobox(loai);
		Loaisp.setBackground(new Color(240, 240, 240));
		Loaisp.setLabeText("");
		Loaisp.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Loaisp.setBounds(212, 63, 279, 45);
		pan_right.add(Loaisp);
		Loaisp.setFocusable(false);

	}
}
