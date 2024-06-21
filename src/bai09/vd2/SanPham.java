package bai09.vd2;

public class SanPham implements Cloneable {
	private String tensp;

	/**
	 * @param tensp
	 */
	public SanPham(String tensp) {
		super();
		this.tensp = tensp;
	}

	/**
	 * @return the tensp
	 */
	public String getTensp() {
		return tensp;
	}

	/**
	 * @param tensp the tensp to set
	 */
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	@Override
	public String toString() {
		return "SanPham [tensp=" + tensp + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}