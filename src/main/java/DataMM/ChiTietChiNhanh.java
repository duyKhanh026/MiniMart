package DataMM;

public class ChiTietChiNhanh {
	private String MaNV;
	private String MaCN;
	
	public ChiTietChiNhanh() {
		
	}

	public ChiTietChiNhanh(String maNV, String maCN) {
		super();
		MaNV = maNV;
		MaCN = maCN;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	public String getMaCN() {
		return MaCN;
	}

	public void setMaCN(String maCN) {
		MaCN = maCN;
	}
	
}
