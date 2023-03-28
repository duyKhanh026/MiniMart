package DataMM;

import java.sql.Date;

public class NhanVien {
	private String MaNV;
	private String HotenNV;
	private Date NgaySinh;
	private boolean Phai; 
	private String Diachi;
	private String SDT;
	private String MaNQL;
	private String DiachiMail;
	private String passsword;
	
	
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
	public boolean getPhai() {
		return Phai;
	}
	public void setPhai(boolean phai) {
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
	
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public NhanVien(String maNV, String hotenNV, Date ngaySinh, boolean phai, String diachi, String sDT, String maNQL,
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
		Phai = true;
		Diachi = "";
		SDT = "";
		MaNQL = "";
		DiachiMail = "";
	}
	
	
}
