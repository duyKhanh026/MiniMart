package DataMM;

import java.sql.Date;

public class HoaDon {
	private String MaHD;
	private String MaNV;
	private String Makh;
	private Date NgayLapHD;
	
	public HoaDon() {
		
	}

	public HoaDon(String maHD, String maNV, String makh, Date ngayLapHD) {
		super();
		MaHD = maHD;
		MaNV = maNV;
		Makh = makh;
		NgayLapHD = ngayLapHD;
	}

	public String getMaHD() {
		return MaHD;
	}

	public void setMaHD(String maHD) {
		MaHD = maHD;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	public String getMakh() {
		return Makh;
	}

	public void setMakh(String makh) {
		Makh = makh;
	}

	public Date getNgayLapHD() {
		return NgayLapHD;
	}

	public void setNgayLapHD(Date ngayLapHD) {
		NgayLapHD = ngayLapHD;
	}

}
