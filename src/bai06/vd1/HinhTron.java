
package bai06.vd1;

public class HinhTron implements HinhHoc {
	private double bankinh;
	

	/**
	 * @param bankinh
	 */
	public HinhTron(double bankinh) {
		super();
		this.bankinh = bankinh;
	}

	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.bankinh;
	}

	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI*this.bankinh*this.bankinh;
	}

	/**
	 * @return the bankinh
	 */
	public double getBankinh() {
		return bankinh;
	}

	/**
	 * @param bankinh the bankinh to set
	 */
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	public String toString() {
		return "HinhTron [bankinh=" + bankinh + "]";
	}
	
	

}