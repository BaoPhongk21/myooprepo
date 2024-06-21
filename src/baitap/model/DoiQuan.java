package baitap.model;

public class DoiQuan {
	private String ten;
	private int thanhVien;
	private String loaiDQ;
	public DoiQuan(String ten, int thanhVien, String loaiDQ) {
		super();
		this.ten = ten;
		this.thanhVien = thanhVien;
		this.loaiDQ = loaiDQ;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getThanhVien() {
		return thanhVien;
	}
	public void setThanhVien(int thanhVien) {
		this.thanhVien = thanhVien;
	}
	public String getLoaiDQ() {
		return loaiDQ;
	}
	public void setLoaiDQ(String loaiDQ) {
		this.loaiDQ = loaiDQ;
	}
	@Override
	public String toString() {
		return "DoiQuan [ten=" + ten + ", thanhVien=" + thanhVien + ", loaiDQ=" + loaiDQ + "]";
	}
	public void tanCong() {
	}
	public void diChuyen() {

	}
	public void satThuong() {

	}
}