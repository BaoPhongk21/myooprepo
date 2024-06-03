package bai05.baitap;

public class BoBinh extends NhanVat {
	private int giao;
	private boolean khien;
	private boolean aogiap;
	
	public BoBinh(String ten, String id, byte gioitinh, double nangluong, int giao, boolean khien, boolean aogiap) {
		super(ten, id, gioitinh, nangluong);
		this.giao = giao;
		this.khien = khien;
		this.aogiap = aogiap;
	}

	/**
	 * @return the giao
	 */
	public int getGiao() {
		return giao;
	}

	/**
	 * @param giao the giao to set
	 */
	public void setGiao(int giao) {
		this.giao = giao;
	}

	/**
	 * @return the khien
	 */
	public boolean isKhien() {
		return khien;
	}

	/**
	 * @param khien the khien to set
	 */
	public void setKhien(boolean khien) {
		this.khien = khien;
	}

	/**
	 * @return the aogiap
	 */
	public boolean isAogiap() {
		return aogiap;
	}

	/**
	 * @param aogiap the aogiap to set
	 */
	public void setAogiap(boolean aogiap) {
		this.aogiap = aogiap;
	}

	public String toString() {
		return "BoBinh [giao=" + giao + ", khien=" + khien + ", aogiap=" + aogiap + "]";
	}

	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("Dam giao");
	}

	public void sucmanh() {
		// TODO Auto-generated method stub
		double energy = this.getNangluong()*1;
		System.out.println("Suc manh cua bo binh la: " + energy);
	}
	
	
}