package bai09.vd4;

public class DongCo implements Cloneable {
	private String loaiDongCo;

	public DongCo(String loaiDongCo) {
		super();
		this.loaiDongCo = loaiDongCo;
	}

	public String getLoaiDongCo() {
		return loaiDongCo;
	}

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
