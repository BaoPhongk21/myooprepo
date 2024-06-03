package bai05.baitap;

public class NhanVat {
	private String ten;
	private String id;
	private byte gioitinh;
	private double nangluong;
	
	public NhanVat(String ten, String id, byte gioitinh, double nangluong) {
		super();
		this.ten = ten;
		this.id = id;
		this.gioitinh = gioitinh;
		this.nangluong = nangluong;
	}

	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}

	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the gioitinh
	 */
	public byte getGioitinh() {
		return gioitinh;
	}

	/**
	 * @param gioitinh the gioitinh to set
	 */
	public void setGioitinh(byte gioitinh) {
		this.gioitinh = gioitinh;
	}

	/**
	 * @return the nangluong
	 */
	public double getNangluong() {
		return nangluong;
	}

	/**
	 * @param nangluong the nangluong to set
	 */
	public void setNangluong(double nangluong) {
		this.nangluong = nangluong;
	}

	public String toString() {
		return "NhanVat [ten=" + ten + ", id=" + id + ", gioitinh=" + gioitinh + ", nangluong=" + nangluong + "]";
	}
	
	public void hanhdong() {
		System.out.println("...");
	}
	
	public void sucmanh() {
		System.out.println("...");
	}
}