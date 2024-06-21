package bai09.vd3;

public class DongCo implements Cloneable {
	private String loaiDongCo;

	/**
	 * @param loaiDongCo
	 */
	public DongCo(String loaiDongCo) {
		super();
		this.loaiDongCo = loaiDongCo;
	}

	/**
	 * @return the loaiDongCo
	 */
	public String getLoaiDongCo() {
		return loaiDongCo;
	}

	/**
	 * @param loaiDongCo the loaiDongCo to set
	 */
	public void setLoaiDongCo(String loaiDongCo) {
		this.loaiDongCo = loaiDongCo;
	}

	@Override
	public String toString() {
		return "DongCo [loaiDongCo=" + loaiDongCo + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


}