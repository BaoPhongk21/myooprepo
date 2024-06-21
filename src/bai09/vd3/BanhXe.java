package bai09.vd3;

public class BanhXe {
	private double bankinh;

	/**
	 * @param bankinh
	 */
	public BanhXe(double bankinh) {
		super();
		this.bankinh = bankinh;
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

	@Override
	public String toString() {
		return "BanhXe [bankinh=" + bankinh + "]";
	}

}