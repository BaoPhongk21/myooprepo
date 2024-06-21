package bai09.vd1;

public class SinhVien {
	private String hoten;
	private LopHoc lop;
	/**
	 * @param hoten
	 * @param lop
	 */
	public SinhVien(String hoten, LopHoc lop) {
		super();
		this.hoten = hoten;
		this.lop = lop;
	}
	/**
	 * @return the hoten
	 */
	public String getHoten() {
		return hoten;
	}
	/**
	 * @param hoten the hoten to set
	 */
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	/**
	 * @return the lop
	 */
	public LopHoc getLop() {
		return lop;
	}
	/**
	 * @param lop the lop to set
	 */
	public void setLop(LopHoc lop) {
		this.lop = lop;
	}
	@Override
	public String toString() {
		return "SinhVien [hoten=" + hoten + ", lop=" + lop + "]";
	}


}