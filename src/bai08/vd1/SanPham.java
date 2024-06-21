package bai08.vd1;

public class SanPham {
	private int maSanPham;
	private String tenSanPham;
	public SanPham(int maSanPham, String tenSanPham) {
		super();
		
		this.setMaSanPham(maSanPham);
		this.setTenSanPham(tenSanPham);
	}
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + "]";
	}

}
