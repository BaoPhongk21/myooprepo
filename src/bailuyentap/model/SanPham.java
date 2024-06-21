package bailuyentap.model;

public class SanPham {
	private String tenSP;
	private int maSP;
	private double giaCa;
	private int soLuong;
	public SanPham(String tenSP, int maSP, double giaCa, int soLuong) {
		super();
		this.tenSP = tenSP;
		this.maSP = maSP;
		this.giaCa = giaCa;
		this.soLuong = soLuong;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public double getGiaCa() {
		return giaCa;
	}
	public void setGiaCa(double giaCa) {
		this.giaCa = giaCa;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "SanPham [tenSP=" + tenSP + ", maSP=" + maSP + ", giaCa=" + giaCa + ", soLuong=" + soLuong + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
