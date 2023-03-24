package DataMM;

import java.sql.Date;

public class NhanVien {
	private String MaNV;
	private String HotenNV;
	private Date NgaySinh;
	private String Phai; //cần sửa
	private String Diachi;
	private String SDT;
	private String MaNQL;
	private String DiachiMail;
	
	
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getHotenNV() {
		return HotenNV;
	}
	public void setHotenNV(String hotenNV) {
		HotenNV = hotenNV;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getPhai() {
		return Phai;
	}
	public void setPhai(String phai) {
		Phai = phai;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getMaNQL() {
		return MaNQL;
	}
	public void setMaNQL(String maNQL) {
		MaNQL = maNQL;
	}
	public String getDiachiMail() {
		return DiachiMail;
	}
	public void setDiachiMail(String diachiMail) {
		DiachiMail = diachiMail;
	}
	public NhanVien(String maNV, String hotenNV, Date ngaySinh, String phai, String diachi, String sDT, String maNQL,
			String diachiMail) {
		super();
		MaNV = maNV;
		HotenNV = hotenNV;
		NgaySinh = ngaySinh;
		Phai = phai;
		Diachi = diachi;
		SDT = sDT;
		MaNQL = maNQL;
		DiachiMail = diachiMail;
	}
	public NhanVien() {
		super();
		MaNV = "";
		HotenNV = "";
		NgaySinh = null;
		Phai = "";
		Diachi = "";
		SDT = "";
		MaNQL = "";
		DiachiMail = "";
	}
	
	
}
