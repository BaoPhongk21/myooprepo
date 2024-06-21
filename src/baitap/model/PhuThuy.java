package baitap.model;

public class PhuThuy extends NhanVat {
	private String choi;
	private String gay;
	private String phongCach;
	private String sucManh;
	public PhuThuy(String ten, int id, String gT, double nangLuong, String choi, String gay, String phongCach,
			String sucManh) {
		super(ten, id, gT, nangLuong);
		this.choi = choi;
		this.gay = gay;
		this.phongCach = phongCach;
		this.sucManh = sucManh;
	}
	public String getChoi() {
		return choi;
	}
	public void setChoi(String choi) {
		this.choi = choi;
	}
	public String getGay() {
		return gay;
	}
	public void setGay(String gay) {
		this.gay = gay;
	}
	public String getPhongCach() {
		return phongCach;
	}
	public void setPhongCach(String phongCach) {
		this.phongCach = phongCach;
	}
	public String getSucManh() {
		return sucManh;
	}
	public void setSucManh(String sucManh) {
		this.sucManh = sucManh;
	}
	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", gay=" + gay + ", phongCach=" + phongCach + ", sucManh=" + sucManh
				+ ", getTen()=" + getTen() + ", getId()=" + getId() + ", getGT()=" + getGT() + ", getNangLuong()="
				+ getNangLuong() + "]";
	}
	public void tanCong() {
		System.out.println(this.getTen() + " tấn công bằng phép thuật");
	}
	public void diChuyen() {
		System.out.println(this.getTen() + " di chuyển bằng phép thuật");
	}
	public void satThuong() {
		System.out.println(this.getTen() + " gây sát thương bằng phép thuật");
	}
}