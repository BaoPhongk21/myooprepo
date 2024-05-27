package bai4.vd1;

public class GiangVien extends Nguoi {
	private String maGV;
	private String trinhdo;
	private String chuyennganh;
	
	
	
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getTrinhdo() {
		return trinhdo;
	}
	public void setTrinhdo(String trinhdo) {
		this.trinhdo = trinhdo;
	}
	public String getChuyennganh() {
		return chuyennganh;
	}
	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	
	
	public GiangVien(String hoten, int namsinh, String maGV, String trinhdo, String chuyennganh) {
		super(hoten, namsinh);
		this.setMaGV(maGV);
		this.setHoten(hoten);
		this.setTrinhdo(trinhdo);
		this.setChuyennganh(chuyennganh);
	}
	@Override
	public String toString() {
		return "GiangVien [maGV=" + maGV + ", trinhdo=" + trinhdo + ", chuyennganh=" + chuyennganh + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
