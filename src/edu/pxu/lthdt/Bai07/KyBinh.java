package edu.pxu.lthdt.Bai07;

public class KyBinh extends NhanVat {
	private boolean guom;
	private boolean giao;
	private boolean cung;
	private boolean ngua;
	public KyBinh(String ten, String id, byte gioitinh, double nangluong, boolean guom, boolean giao, boolean cung,
			boolean ngua) {
		super(ten, id, gioitinh, nangluong);
		this.guom = guom;
		this.giao = giao;
		this.cung = cung;
		this.ngua = ngua;
	}
	public boolean isGuom() {
		return guom;
	}
	public void setGuom(boolean guom) {
		this.guom = guom;
	}
	public boolean isGiao() {
		return giao;
	}
	public void setGiao(boolean giao) {
		this.giao = giao;
	}
	public boolean isCung() {
		return cung;
	}
	public void setCung(boolean cung) {
		this.cung = cung;
	}
	public boolean isNgua() {
		return ngua;
	}
	public void setNgua(boolean ngua) {
		this.ngua = ngua;
	}
	@Override
	public String toString() {
		return "KyBinh [guom=" + guom + ", giao=" + giao + ", cung=" + cung + ", ngua=" + ngua + "]";
	}
	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("Coi ngua va ban ten");
	}
	
	public void sucmanh() {
		// TODO Auto-generated method stub
		double energy = this.getNangluong()*2;
		System.out.println("Suc manh cua ky binh la: " + energy);
	}
}
	