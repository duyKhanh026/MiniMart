package DataMM;

import java.sql.Date;

public class SanPham {

	private String MaSP;
	private String maLoai;
	private String Tensp;
	private int SoLuong;
	private String NhaSanXuat;
	private Date NgaySanXuat;
	private int SoLuongTon;
	private Date HanSuDung;
	private String Mota;
	private String DonviTinh;
	private int HeSoGiaBan;
	
	public SanPham() {
		
	}

	public SanPham(String maSP, String maLoai, String tensp, int soLuong, String nhaSanXuat, Date ngaySanXuat,
			int soLuongTon, Date hanSuDung, String mota, String donviTinh, int heSoGiaBan) {
		super();
		MaSP = maSP;
		this.maLoai = maLoai;
		Tensp = tensp;
		SoLuong = soLuong;
		NhaSanXuat = nhaSanXuat;
		NgaySanXuat = ngaySanXuat;
		SoLuongTon = soLuongTon;
		HanSuDung = hanSuDung;
		Mota = mota;
		DonviTinh = donviTinh;
		HeSoGiaBan = heSoGiaBan;
	}

	public String getMaSP() {
		return MaSP;
	}

	public void setMaSP(String maSP) {
		MaSP = maSP;
	}

	public String getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}

	public String getTensp() {
		return Tensp;
	}

	public void setTensp(String tensp) {
		Tensp = tensp;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public String getNhaSanXuat() {
		return NhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		NhaSanXuat = nhaSanXuat;
	}

	public Date getNgaySanXuat() {
		return NgaySanXuat;
	}

	public void setNgaySanXuat(Date ngaySanXuat) {
		NgaySanXuat = ngaySanXuat;
	}

	public int getSoLuongTon() {
		return SoLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		SoLuongTon = soLuongTon;
	}

	public Date getHanSuDung() {
		return HanSuDung;
	}

	public void setHanSuDung(Date hanSuDung) {
		HanSuDung = hanSuDung;
	}

	public String getMota() {
		return Mota;
	}

	public void setMota(String mota) {
		Mota = mota;
	}

	public String getDonviTinh() {
		return DonviTinh;
	}

	public void setDonviTinh(String donviTinh) {
		DonviTinh = donviTinh;
	}

	public int getHeSoGiaBan() {
		return HeSoGiaBan;
	}

	public void setHeSoGiaBan(int heSoGiaBan) {
		HeSoGiaBan = heSoGiaBan;
	}
	
	
}
