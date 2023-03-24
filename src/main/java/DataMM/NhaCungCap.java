package DataMM;

public class NhaCungCap {

	private String MaNCC;
	private String TenNCC;
	private String DiaChi;
	private String SDT;
	private String DiachiMail;
	
	public NhaCungCap() {
		
	}

	public NhaCungCap(String maNCC, String tenNCC, String diaChi, String sDT, String diachiMail) {
		super();
		MaNCC = maNCC;
		TenNCC = tenNCC;
		DiaChi = diaChi;
		SDT = sDT;
		DiachiMail = diachiMail;
	}

	public String getMaNCC() {
		return MaNCC;
	}

	public void setMaNCC(String maNCC) {
		MaNCC = maNCC;
	}

	public String getTenNCC() {
		return TenNCC;
	}

	public void setTenNCC(String tenNCC) {
		TenNCC = tenNCC;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getDiachiMail() {
		return DiachiMail;
	}

	public void setDiachiMail(String diachiMail) {
		DiachiMail = diachiMail;
	}
	
}
