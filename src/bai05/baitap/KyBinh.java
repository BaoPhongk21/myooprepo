package bai05.baitap;

public class KyBinh extends NhanVat {
	private boolean guom;
	private boolean giao;
	private boolean cung;
	private boolean ngua;
	
	public KyBinh(String ten, String id, byte i, double nangluong, boolean guom, boolean giao, boolean cung,
			boolean ngua) {
		super(ten, id, i, nangluong);
		this.guom = guom;
		this.giao = giao;
		this.cung = cung;
		this.ngua = ngua;
	}
	/**
	 * @return the guom
	 */
	public boolean isGuom() {
		return guom;
	}
	/**
	 * @param guom the guom to set
	 */
	public void setGuom(boolean guom) {
		this.guom = guom;
	}
	/**
	 * @return the giao
	 */
	public boolean isGiao() {
		return giao;
	}
	/**
	 * @param giao the giao to set
	 */
	public void setGiao(boolean giao) {
		this.giao = giao;
	}
	/**
	 * @return the cung
	 */
	public boolean isCung() {
		return cung;
	}
	/**
	 * @param cung the cung to set
	 */
	public void setCung(boolean cung) {
		this.cung = cung;
	}
	/**
	 * @return the ngua
	 */
	public boolean isNgua() {
		return ngua;
	}
	/**
	 * @param ngua the ngua to set
	 */
	public void setNgua(boolean ngua) {
		this.ngua = ngua;
	}
	
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