package baitap.model;

public  class NhanVat implements DiChuyen {
	private String ten;
	private int id;
	private String GT;
	private double nangLuong;
	public NhanVat(String ten, int id, String gT, double nangLuong) {
		super();
		this.ten = ten;
		this.id = id;
		this.GT = gT;
		this.nangLuong = nangLuong;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGT() {
		return GT;
	}
	public void setGT(String gT) {
		GT = gT;
	}
	public double getNangLuong() {
		return nangLuong;
	}
	public void setNangLuong(double nangLuong) {
		this.nangLuong = nangLuong;
	}
	@Override
	public String toString() {
		return "NhanVat [ten=" + ten + ", id=" + id + ", GT=" + GT + ", nangLuong=" + nangLuong + "]";
	}
	public void tanCong() {

	}
	public void diChuyen() {

	}
	public void satThuong() {

	}
	@Override
	public void trai() {
		System.out.println(this.getTen()+ "di chuyen sang trai");
	}
	@Override
	public void phai() {
		// TODO Auto-generated method stub
		System.out.println(this.getTen()+ "di chuyen sang phai");
	}
	@Override
	public void len() {
		// TODO Auto-generated method stub
		System.out.println(this.getTen()+ "di chuyen len");
	}
	@Override
	public void xuong() {
		// TODO Auto-generated method stub
		System.out.println(this.getTen()+ "di chuyen xuong");
	}



}