package bai09;

import java.util.ArrayList;

public class HoaDon {
	private int maHoaDon;
	private ArrayList<SanPham> dssp;
	/**
	 * @param maHoaDon
	 * @param dssp
	 */
	public HoaDon(int maHoaDon, ArrayList<SanPham> dssp) {
		super();
		this.maHoaDon = maHoaDon;
		this.dssp = dssp;
	}
	/**
	 * @param maHoaDon
	 */
	public HoaDon(int maHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
		this.dssp = new ArrayList<SanPham>();
	}
	
	public void addSanPham(SanPham sp) throws CloneNotSupportedException {
		SanPham tam = (SanPham)sp.clone();
		this.dssp.add(tam);
	}
	/**
	 * @return the maHoaDon
	 */
	public int getMaHoaDon() {
		return maHoaDon;
	}
	/**
	 * @param maHoaDon the maHoaDon to set
	 */
	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	/**
	 * @return the dssp
	 */
	public ArrayList<SanPham> getDssp() {
		return dssp;
	}
	/**
	 * @param dssp the dssp to set
	 */
	public void setDssp(ArrayList<SanPham> dssp) {
		this.dssp = dssp;
	}
	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", dssp=" + dssp + "]";
	}
	
	
}