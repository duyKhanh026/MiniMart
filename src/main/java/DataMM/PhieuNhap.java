package DataMM;

import java.sql.Date;

public class PhieuNhap {
	private String MaPN;
	private Date NgayNhap;
	private String MaNV;
	private String MaNCC;
	
	public PhieuNhap() {
		
	}

	public PhieuNhap(String maPN, Date ngayNhap, String maNV, String maNCC) {
		super();
		MaPN = maPN;
		NgayNhap = ngayNhap;
		MaNV = maNV;
		MaNCC = maNCC;
	}

	public String getMaPN() {
		return MaPN;
	}

	public void setMaPN(String maPN) {
		MaPN = maPN;
	}

	public Date getNgayNhap() {
		return NgayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		NgayNhap = ngayNhap;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	public String getMaNCC() {
		return MaNCC;
	}

	public void setMaNCC(String maNCC) {
		MaNCC = maNCC;
	}
	
}
