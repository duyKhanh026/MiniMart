package DataMM;

public class ChiTietPhieuNhap {

	private String MaSP;
	private String MaPN;
	private int SoLuong;
	private int GiaNhap;
	
	public ChiTietPhieuNhap() {
		
	}

	public ChiTietPhieuNhap(String maSP, String maPN, int soLuong, int giaNhap) {
		super();
		MaSP = maSP;
		MaPN = maPN;
		SoLuong = soLuong;
		GiaNhap = giaNhap;
	}

	public String getMaSP() {
		return MaSP;
	}

	public void setMaSP(String maSP) {
		MaSP = maSP;
	}

	public String getMaPN() {
		return MaPN;
	}

	public void setMaPN(String maPN) {
		MaPN = maPN;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public int getGiaNhap() {
		return GiaNhap;
	}

	public void setGiaNhap(int giaNhap) {
		GiaNhap = giaNhap;
	}
	
}
