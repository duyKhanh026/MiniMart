package DataMM;

import java.sql.Date;

public class KhachHang {
	private String MaKhachHang;
	private String TenKhachHang;
	private String LoaiKhachHang;
	private String DiaChi;
	private String Phone;
	private Date Namsinh;
	
	public KhachHang() {
		
	}

	public KhachHang(String maKhachHang, String tenKhachHang, String loaiKhachHang, String diaChi, String phone, Date namsinh) {
		super();
		MaKhachHang = maKhachHang;
		TenKhachHang = tenKhachHang;
		LoaiKhachHang = loaiKhachHang;
		DiaChi = diaChi;
		Phone = phone;
		Namsinh = namsinh;
	}

	public String getMaKhachHang() {
		return MaKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		MaKhachHang = maKhachHang;
	}

	public String getTenKhachHang() {
		return TenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		TenKhachHang = tenKhachHang;
	}

	public String getLoaiKhachHang() {
		return LoaiKhachHang;
	}

	public void setLoaiKhachHang(String loaiKhachHang) {
		LoaiKhachHang = loaiKhachHang;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public Date getNamsinh() {
		return Namsinh;
	}

	public void setNamsinh(Date namsinh) {
		Namsinh = namsinh;
	}

}
