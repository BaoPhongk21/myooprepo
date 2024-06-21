package baitap.model;


import java.util.ArrayList;
import java.util.List;

public class BinhDoan extends DoiQuan implements Cloneable{
	private String ten;
	private int sl;
	private String loaibinhdoan;
	List<VuKhi> tbvk;
	public BinhDoan(String ten, int thanhVien, String loaiDQ, String ten2, int sl, String loaibinhdoan) {
		super(ten, thanhVien, loaiDQ);
		ten = ten2;
		this.sl = sl;
		this.loaibinhdoan = loaibinhdoan;
		this.tbvk = new ArrayList<VuKhi>();
	}
	public void addVuKhi(VuKhi vk) throws CloneNotSupportedException {
		tbvk.add((VuKhi)vk.clone());
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public String getLoaibinhdoan() {
		return loaibinhdoan;
	}
	public void setLoaibinhdoan(String loaibinhdoan) {
		this.loaibinhdoan = loaibinhdoan;
	}
	public List<VuKhi> getTbvk() {
		return tbvk;
	}
	public void setTbvk(List<VuKhi> tbvk) throws CloneNotSupportedException {
		for(VuKhi item:tbvk) {
			this.tbvk.add((VuKhi)item.clone());
		}
	}
	@Override
	public String toString() {
		return "BinhDoan [ten=" + ten + ", sl=" + sl + ", loaibinhdoan=" + loaibinhdoan + ", tbvk=" + tbvk
				+ ", getThanhVien()=" + getThanhVien() + ", getLoaiDQ()=" + getLoaiDQ() + "]";
	}

	public void tanCong() {
	}
	public void diChuyen() {

	}
	public void satThuong() {

	}

}