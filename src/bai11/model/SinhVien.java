package bai11.model;

public class SinhVien {
	private String hoten;
	private double diemtb;
	private int tuoi;
	public SinhVien(String hoten, double diemtb, int tuoi) {
		super();
		this.hoten = hoten;
		this.diemtb = diemtb;
		this.tuoi = tuoi;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public double getDiemtb() {
		return diemtb;
	}
	public void setDiemtb(double diemtb) {
		this.diemtb = diemtb;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "SinhVien [hoten=" + hoten + ", diemtb=" + diemtb + ", tuoi=" + tuoi + "]";
	}
	

}
