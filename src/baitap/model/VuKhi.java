package baitap.model;

public abstract class VuKhi implements Cloneable{
	private String ten;
	private String loaiVK;
	private String mauMa;
	private double sucManh;
	public VuKhi(String ten, String loaiVK, String mauMa, double sucManh) {
		super();
		this.ten = ten;
		this.loaiVK = loaiVK;
		this.mauMa = mauMa;
		this.sucManh = sucManh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getLoaiVK() {
		return loaiVK;
	}
	public void setLoaiVK(String loaiVK) {
		this.loaiVK = loaiVK;
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
		return "VuKhi [ten=" + ten + ", loaiVK=" + loaiVK + ", mauMa=" + mauMa + ", sucManh=" + sucManh + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public void tanCong() {
	}
	public void diChuyen() {

	}
	public void satThuong() {

	}

}