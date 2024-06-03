
package bai06.vd1;


public class HinhChuNhat implements HinhHoc {
	private double chieudai;
	private double chieurong;
	
	/**
	 * @param chieudai
	 * @param chieurong
	 */
	public HinhChuNhat(double chieudai, double chieurong) {
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2*(this.chieudai + this.chieurong);
	}

	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.chieudai*this.chieurong;
	}

	/**
	 * @return the chieudai
	 */
	public double getChieudai() {
		return chieudai;
	}

	/**
	 * @param chieudai the chieudai to set
	 */
	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}

	/**
	 * @return the chieurong
	 */
	public double getChieurong() {
		return chieurong;
	}

	/**
	 * @param chieurong the chieurong to set
	 */
	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}

	public String toString() {
		return "HinhChuNhat [chieudai=" + chieudai + ", chieurong=" + chieurong + "]";
	}

	
}