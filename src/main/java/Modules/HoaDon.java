package Modules;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class HoaDon extends JPanel {
    public HoaDon(){
    	setLayout(null);
        showGUI();
    }
    private void showGUI(){
        //setTitle("Main");
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setSize(1202,748);
        //getContentPane().setLayout(null);
        //setLocationRelativeTo(null);
    	
        //Panel HoaDon
        JPanel panelHoaDon = new JPanel();
        panelHoaDon.setBounds(0, 0, 1176, 748);
        panelHoaDon.setLayout(null);
        add(panelHoaDon);
        
        //Panel 1
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 1202, 200);
//        panel1.setBackground(Color.YELLOW);
        panelHoaDon.add(panel1);
        
        //Label Panel 1
        JLabel headerLabel = new JLabel("HÓA ĐƠN BÁN HÀNG"); 
        headerLabel.setBounds(400,0, 200,20);  
        headerLabel.setForeground(Color.BLUE);
        headerLabel.setFont(new Font("Serif", Font.BOLD, 18));
        panel1.add(headerLabel);
        
        JLabel thongtinLabel = new JLabel("Thông tin chung:"); 
        thongtinLabel.setBounds(15,20, 200,20);  
        panel1.add(thongtinLabel);
        
        JLabel maHDLabel = new JLabel("Mã hóa đơn");
        maHDLabel.setForeground(Color.BLUE);
        maHDLabel.setBounds(40,45, 200,20);  
        panel1.add(maHDLabel);
        
        JLabel dateLabel = new JLabel("Ngày bán");
        dateLabel.setForeground(Color.BLUE);
        dateLabel.setBounds(40,85, 200,20);  
        panel1.add(dateLabel);
        
        JLabel maNVLabel = new JLabel("Mã nhân viên");
        maNVLabel.setForeground(Color.BLUE);
        maNVLabel.setBounds(40,125, 200,20);  
        panel1.add(maNVLabel);
        
        JLabel tenNVLabel = new JLabel("Tên nhân viên");
        tenNVLabel.setForeground(Color.BLUE);
        tenNVLabel.setBounds(40,165, 200,20);  
        panel1.add(tenNVLabel);
        
        JLabel maKHLabel = new JLabel("Mã khách hàng");
        maKHLabel.setForeground(Color.BLUE);
        maKHLabel.setBounds(600,45, 200,20);  
        panel1.add(maKHLabel);
        
        JLabel tenKHLabel = new JLabel("Tên khách hàng");
        tenKHLabel.setForeground(Color.BLUE);
        tenKHLabel.setBounds(600,85, 200,20);  
        panel1.add(tenKHLabel);
        
        JLabel diachiKHLabel = new JLabel("Địa chỉ");
        diachiKHLabel.setForeground(Color.BLUE);
        diachiKHLabel.setBounds(600,125, 200,20);  
        panel1.add(diachiKHLabel);        
        
        JLabel sdtKHLabel = new JLabel("Điện thoại");
        sdtKHLabel.setForeground(Color.BLUE);
        sdtKHLabel.setBounds(600,165, 200,20);  
        panel1.add(sdtKHLabel);   
        
        //Field Panel 1
        JTextField maHDTextField = new JTextField();
        maHDTextField.setBounds(130,45,200,20);
        panel1.add(maHDTextField);
        
        JTextField dateTextField = new JTextField();
        dateTextField.setBounds(130,85,200,20);
        panel1.add(dateTextField);
        
        JTextField maNVTextField = new JTextField();
        maNVTextField.setBounds(130,125,200,20);
        panel1.add(maNVTextField);
        
        JTextField tenNVTextField = new JTextField();
        tenNVTextField.setBounds(130,165,200,20);
        panel1.add(tenNVTextField);
        
        JTextField maKHTextField = new JTextField();
        maKHTextField.setBounds(700,45,200,20);
        panel1.add(maKHTextField);
        
        JTextField tenKHTextField = new JTextField();
        tenKHTextField.setBounds(700,85,200,20);
        panel1.add(tenKHTextField);
        
        JTextField diachiKHTextField = new JTextField();
        diachiKHTextField.setBounds(700,125,200,20);
        panel1.add(diachiKHTextField);
        
        JTextField sdtKHTextField = new JTextField();
        sdtKHTextField.setBounds(700,165,200,20);
        panel1.add(sdtKHTextField);
        
        //Panel 2
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 200, 1202, 450);
//        panel2.setBackground(Color.RED);
        panelHoaDon.add(panel2);
        
        //Label Panel 2
        JLabel thongtinMatHangLabel = new JLabel("Thông tin các mặt hàng:"); 
        thongtinMatHangLabel.setBounds(15,0, 200,20);  
        panel2.add(thongtinMatHangLabel);
        
        JLabel maSPLabel = new JLabel("Mã sản phẩm");
        maSPLabel.setForeground(Color.BLUE);
        maSPLabel.setBounds(40,25, 200,20);  
        panel2.add(maSPLabel);
        
        JLabel soLuongLabel = new JLabel("Số lượng");
        soLuongLabel.setForeground(Color.BLUE);
        soLuongLabel.setBounds(40,65, 200,20);  
        panel2.add(soLuongLabel);
        
        JLabel tenSPLabel = new JLabel("Tên sản phẩm");
        tenSPLabel.setForeground(Color.BLUE);
        tenSPLabel.setBounds(300,25, 200,20);  
        panel2.add(tenSPLabel);
        
        JLabel giamGiaLabel = new JLabel("Giảm giá %");
        giamGiaLabel.setForeground(Color.BLUE);
        giamGiaLabel.setBounds(300,65, 200,20);  
        panel2.add(giamGiaLabel);
        
        JLabel donGiaLabel = new JLabel("Đơn giá");
        donGiaLabel.setForeground(Color.BLUE);
        donGiaLabel.setBounds(600,25, 200,20);  
        panel2.add(donGiaLabel);
        
        JLabel thanhTienLabel = new JLabel("Thành tiền");
        thanhTienLabel.setForeground(Color.BLUE);
        thanhTienLabel.setBounds(600,65, 200,20);  
        panel2.add(thanhTienLabel);
        
        JLabel tongTienLabel = new JLabel("Tổng tiền");
        tongTienLabel.setForeground(Color.BLUE);
        tongTienLabel.setBounds(600,330, 200,20);  
        panel2.add(tongTienLabel);
        
        //Field Panel 2
        JTextField maSPTextField = new JTextField();
        maSPTextField.setBounds(130,25,100,20);
        panel2.add(maSPTextField);
        
        JTextField soLuongTextField = new JTextField();
        soLuongTextField.setBounds(130,65,100,20);
        panel2.add(soLuongTextField);
        
        JTextField tenSPTextField = new JTextField();
        tenSPTextField.setBounds(400,25,100,20);
        panel2.add(tenSPTextField);
        
        JTextField giamGiaTextField = new JTextField();
        giamGiaTextField.setBounds(400,65,100,20);
        panel2.add(giamGiaTextField);
        
        JTextField donGiaTextField = new JTextField();
        donGiaTextField.setBounds(680,25,100,20);
        panel2.add(donGiaTextField);
        
        JTextField thanhTienTextField = new JTextField();
        thanhTienTextField.setBounds(680,65,100,20);
        panel2.add(thanhTienTextField);
        
        JTextField tongTienTextField = new JTextField();
        tongTienTextField.setBounds(660,330,100,20);
        panel2.add(tongTienTextField);
        
        //Table Panel 2
//        JLabel motmaSPLabel = new JLabel("Mã sản phẩm");
//        motmaSPLabel.setForeground(Color.BLUE);
//        motmaSPLabel.setBounds(40,90, 200,20);  
//        panel2.add(motmaSPLabel);
        
        
        String[] columnNames = {"Mã Hàng", "Tên hàng", "Số lượng","Đơn giá","Giảm giá %","Thành tiền"};
        Object[][] data = {
                {1, "Alice", 25,1, "Alice", 25},
                {2, "Bob", 30,1, "Alice", 25},
                {3, "Charlie", 35,1, "Alice", 25},
                {4, "Dave", 40,1, "Alice", 25},
                {5, "Eve", 45,1, "Alice", 25}
        };
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

        JTable table = new JTable(tableModel);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(40, 90, 900, 240);
        panel2.add(sp);
        
        //Panel Button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(250, 380, 550, 100);
        buttonPanel.setLayout(null);
//        buttonPanel.setBackground(Color.YELLOW);
        panel2.add(buttonPanel);
        
        JButton btnAddProduct = new JButton("Thêm SP");
        btnAddProduct.setBounds(10, 10, 90, 30);

        JButton btnSaveInvoice = new JButton("Lưu hóa đơn");
        btnSaveInvoice.setBounds(110, 10, 120, 30);

        JButton btnCancelInvoice = new JButton("Hủy hóa đơn");
        btnCancelInvoice.setBounds(240, 10, 120, 30);

        JButton btnPrintInvoice = new JButton("In hóa đơn");
        btnPrintInvoice.setBounds(370, 10, 130, 30);
        
        buttonPanel.add(btnAddProduct);
        buttonPanel.add(btnSaveInvoice);
        buttonPanel.add(btnCancelInvoice);
        buttonPanel.add(btnPrintInvoice);
        
        //Panel 3
        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(0, 650, 1202, 50);
//        panel3.setBackground(Color.BLUE);
        panelHoaDon.add(panel3);
        
        JLabel searchLabel = new JLabel("Mã hóa đơn");
        searchLabel.setForeground(Color.BLUE);
        JTextField searchTextField = new JTextField();
        JButton searchButton = new JButton("Tìm kiếm");

        searchLabel.setBounds(20, 10, 80, 25);
        searchTextField.setBounds(100, 10, 150, 25);
        searchButton.setBounds(260, 10, 90, 25);

        panel3.add(searchLabel);
        panel3.add(searchTextField);
        panel3.add(searchButton);
        
        setVisible(true);
    }
}
