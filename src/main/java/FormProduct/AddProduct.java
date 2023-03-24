package FormProduct;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JTextField;

import Modules.MyButton;
import UI.Main;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class AddProduct extends JFrame {
	private JTextField Masp;
	private JTextField Maloai;
	private JTextField Tensp;
	private JTextField NhaSX;
	private JTextField Ngaysx;
	private JTextField hsd;
	private JTextField soluong;
	private JTextField dongia;
	private JTextField mota;
	private JTextField textField_9;


	public AddProduct() {
		setUndecorated(true);
		initialize();
	}

	private void initialize() {
		setSize(900, 650);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		final JPanel panbackground = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                int w = getWidth();
                int h = getHeight();
                Color color1 = new Color(250,110,150); 
                Color color2 = new Color(165,240,241);
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, w, h);
            }
        };
		panbackground.setBounds(0, 0, 900, 700);
		getContentPane().add(panbackground);
		panbackground.setLayout(null);
		
		JLabel Ma_sp = new JLabel("Mã SP");
		Ma_sp.setFont(new Font("Tahoma", Font.BOLD, 23));
		Ma_sp.setForeground(new Color(255, 255, 255));
		Ma_sp.setBounds(145, 84, 133, 35);
		panbackground.add(Ma_sp);
		
		JLabel Ma_loai = new JLabel("Mã Loại");
		Ma_loai.setFont(new Font("Tahoma", Font.BOLD, 23));		
		Ma_loai.setForeground(new Color(255, 255, 255));
		Ma_loai.setBounds(145, 177, 133, 35);
		panbackground.add(Ma_loai);
		
		JLabel Ten_sp = new JLabel("Tên SP");
		Ten_sp.setFont(new Font("Tahoma", Font.BOLD, 23));		
		Ten_sp.setForeground(new Color(255, 255, 255));
		Ten_sp.setBounds(145, 269, 133, 35);
		panbackground.add(Ten_sp);
		
		JLabel So_luong = new JLabel("Số Lượng");
		So_luong.setFont(new Font("Tahoma", Font.BOLD, 23));		
		So_luong.setForeground(new Color(255, 255, 255));
		So_luong.setBounds(145, 363, 133, 35);
		panbackground.add(So_luong);
		
		JLabel NSX = new JLabel("Nhà Sản Xuất");
		NSX.setFont(new Font("Tahoma", Font.BOLD, 23));		
		NSX.setForeground(new Color(255, 255, 255));
		NSX.setBounds(536, 84, 180, 35);
		panbackground.add(NSX);
		
		JLabel NgaySX = new JLabel("Ngày Sản Xuất");
		NgaySX.setFont(new Font("Tahoma", Font.BOLD, 23));		
		NgaySX.setForeground(new Color(255, 255, 255));
		NgaySX.setBounds(536, 177, 180, 35);
		panbackground.add(NgaySX);
		
		JLabel HSD = new JLabel("Hạn Sử Dụng");
		HSD.setFont(new Font("Tahoma", Font.BOLD, 23));		
		HSD.setForeground(new Color(255, 255, 255));
		HSD.setBounds(536, 269, 180, 35);
		panbackground.add(HSD);
		
		JLabel Mo_ta = new JLabel("Mô Tả");
		Mo_ta.setFont(new Font("Tahoma", Font.BOLD, 23));		
		Mo_ta.setForeground(new Color(255, 255, 255));
		Mo_ta.setBounds(536, 363, 152, 35);
		panbackground.add(Mo_ta);
		
		JLabel Don_gia = new JLabel("Đơn Giá");
		Don_gia.setFont(new Font("Tahoma", Font.BOLD, 23));		
		Don_gia.setForeground(new Color(255, 255, 255));
		Don_gia.setBounds(145, 460, 133, 35);
		panbackground.add(Don_gia);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 23));		
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setBounds(536, 460, 152, 35);
		panbackground.add(lblNewLabel_3_1);
		
		Masp = new JTextField();
		Masp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Masp.setBounds(145, 119, 255, 36);
		panbackground.add(Masp);
		Masp.setColumns(10);
		Masp.setCaretColor(new Color(255, 255, 255));
		Masp.setForeground(new Color(255, 255, 255));
		Masp.setBorder(null);
		Masp.setOpaque(false);

		
		Maloai = new JTextField();
		Maloai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Maloai.setColumns(10);
		Maloai.setBounds(145, 212, 255, 36);
		panbackground.add(Maloai);		
		Maloai.setCaretColor(new Color(255, 255, 255));
		Maloai.setForeground(new Color(255, 255, 255));
		Maloai.setBorder(null);
		Maloai.setOpaque(false);
		
		Tensp = new JTextField();
		Tensp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Tensp.setColumns(10);
		Tensp.setBounds(145, 311, 255, 36);
		panbackground.add(Tensp);		
		Tensp.setCaretColor(new Color(255, 255, 255));
		Tensp.setForeground(new Color(255, 255, 255));
		Tensp.setBorder(null);
		Tensp.setOpaque(false);
		
		soluong = new JTextField();
		soluong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		soluong.setColumns(10);
		soluong.setBounds(145, 404, 255, 36);
		panbackground.add(soluong);		
		soluong.setCaretColor(new Color(255, 255, 255));
		soluong.setForeground(new Color(255, 255, 255));
		soluong.setBorder(null);
		soluong.setOpaque(false);
		
		NhaSX = new JTextField();
		NhaSX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NhaSX.setColumns(10);
		NhaSX.setBounds(536, 119, 255, 36);
		panbackground.add(NhaSX);		
		NhaSX.setCaretColor(new Color(255, 255, 255));
		NhaSX.setForeground(new Color(255, 255, 255));
		NhaSX.setBorder(null);
		NhaSX.setOpaque(false);
		
		Ngaysx = new JTextField();
		Ngaysx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Ngaysx.setColumns(10);
		Ngaysx.setBounds(536, 212, 255, 36);
		panbackground.add(Ngaysx);		
		Ngaysx.setCaretColor(new Color(255, 255, 255));
		Ngaysx.setForeground(new Color(255, 255, 255));
		Ngaysx.setBorder(null);
		Ngaysx.setOpaque(false);
		
		hsd = new JTextField();
		hsd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hsd.setColumns(10);
		hsd.setBounds(536, 311, 255, 36);
		panbackground.add(hsd);		
		hsd.setCaretColor(new Color(255, 255, 255));
		hsd.setForeground(new Color(255, 255, 255));
		hsd.setBorder(null);
		hsd.setOpaque(false);
		
		mota = new JTextField();
		mota.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mota.setColumns(10);
		mota.setBounds(536, 404, 255, 36);
		panbackground.add(mota);		
		mota.setCaretColor(new Color(255, 255, 255));
		mota.setForeground(new Color(255, 255, 255));
		mota.setBorder(null);
		mota.setOpaque(false);
		
		dongia = new JTextField();
		dongia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dongia.setColumns(10);
		dongia.setBounds(145, 495, 255, 36);
		panbackground.add(dongia);		
		dongia.setCaretColor(new Color(255, 255, 255));
		dongia.setForeground(new Color(255, 255, 255));
		dongia.setBorder(null);
		dongia.setOpaque(false);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(536, 495, 255, 36);
		panbackground.add(textField_9);		
		textField_9.setCaretColor(new Color(255, 255, 255));
		textField_9.setForeground(new Color(255, 255, 255));
		textField_9.setBorder(null);
		textField_9.setOpaque(false);
		
		MyButton btn_ok = new MyButton("OK",new Color(255, 95, 163), new Color(222, 88, 145), new Color(232, 0, 98));
		btn_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_ok.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_ok.setBounds(363, 568, 190, 48);
		panbackground.add(btn_ok);
		btn_ok.setRadius(20);
		btn_ok.setFocusPainted(false);
		btn_ok.setBorder(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(145, 150, 255, 3);
		panbackground.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(145, 246, 255, 3);
		panbackground.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.menu);
		panel_2.setBounds(145, 341, 255, 3);
		panbackground.add(panel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(SystemColor.menu);
		panel_1_1.setBounds(145, 437, 255, 3);
		panbackground.add(panel_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBounds(536, 150, 255, 3);
		panbackground.add(panel_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(SystemColor.menu);
		panel_1_2.setBounds(536, 246, 255, 3);
		panbackground.add(panel_1_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(536, 341, 255, 3);
		panbackground.add(panel_4);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(SystemColor.menu);
		panel_1_3.setBounds(536, 437, 255, 3);
		panbackground.add(panel_1_3);
		
		MyButton btn_back = new MyButton("Back", new Color(100, 230, 203), new Color(110, 200, 170), new Color(232, 0, 98));
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_back.setRadius(20);
		btn_back.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_back.setFocusPainted(false);
		btn_back.setBorder(null);
		btn_back.setBounds(10, 11, 104, 35);
		panbackground.add(btn_back);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.menu);
		panel_5.setBounds(145, 528, 255, 3);
		panbackground.add(panel_5);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(SystemColor.menu);
		panel_3_1.setBounds(536, 528, 255, 3);
		panbackground.add(panel_3_1);

		setVisible(true);
	}
}
