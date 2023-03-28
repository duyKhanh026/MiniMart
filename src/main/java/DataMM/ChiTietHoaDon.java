package DataMM;

public class ChiTietHoaDon {
	private String MaHD;
	private String MaSP;
	private int SoLuong;
	private int DonGia;
	
	public ChiTietHoaDon() {
		
	}

	public ChiTietHoaDon(String maHD, String maSP, int soLuong, int donGia) {
		super();
		MaHD = maHD;
		MaSP = maSP;
		SoLuong = soLuong;
		DonGia = donGia;
	}

	public String getMaHD() {
		return MaHD;
	}

	public void setMaHD(String maHD) {
		MaHD = maHD;
	}

	public String getMaSP() {
		return MaSP;
	}

	public void setMaSP(String maSP) {
		MaSP = maSP;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public int getDonGia() {
		return DonGia;
	}

	public void setDonGia(int donGia) {
		DonGia = donGia;
	}
	 
}
