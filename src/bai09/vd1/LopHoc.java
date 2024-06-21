package bai09.vd1;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
	private String tenlop;
	private List<SinhVien> dssv;
	/**
	 * @param tenlop
	 * @param dssv
	 */
	public LopHoc(String tenlop, List<SinhVien> dssv) {
		super();
		this.tenlop = tenlop;
		this.dssv = dssv;
	}



	/**
	 * @param tenlop
	 */
	public LopHoc(String tenlop) {
		super();
		this.tenlop = tenlop;
		this.dssv = new ArrayList<>();
	}

	public void addSinhVien(SinhVien sv) {
		this.dssv.add(sv);
	}

	/**
	 * @return the tenlop
	 */
	public String getTenlop() {
		return tenlop;
	}
	/**
	 * @param tenlop the tenlop to set
	 */
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}
	/**
	 * @return the dssv
	 */
	public List<SinhVien> getDssv() {
		return dssv;
	}
	/**
	 * @param dssv the dssv to set
	 */
	public void setDssv(List<SinhVien> dssv) {
		this.dssv = dssv;
	}
	@Override
	public String toString() {
		return "LopHoc [tenlop=" + tenlop + ", dssv=" + dssv + "]";
	}

}