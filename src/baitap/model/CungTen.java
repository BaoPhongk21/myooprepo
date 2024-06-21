package baitap.model;

public class CungTen extends VuKhi {
	private String ten;
	private String mauMa;
	private double sucManh;
	public CungTen(String ten, String loaiVK, String mauMa, double sucManh, String ten2, String mauMa2,
			double sucManh2) {
		super(ten, loaiVK, mauMa, sucManh);
		ten = ten2;
		mauMa = mauMa2;
		sucManh = sucManh2;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMauMa() {
		return mauMa;
	}
	public void setMauMa(String mauMa) {
		this.mauMa = mauMa;
	}
	public double getSucManh() {
		return sucManh;
	}
	public void setSucManh(double sucManh) {
		this.sucManh = sucManh;
	}
	@Override
	public String toString() {
		return "CungTen [ten=" + ten + ", mauMa=" + mauMa + ", sucManh=" + sucManh + ", getLoaiVK()=" + getLoaiVK()
				+ "]";
	}
	public void tanCong() {
	}
	public void satThuong() {

	}


}