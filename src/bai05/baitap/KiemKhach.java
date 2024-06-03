package bai05.baitap;

public class KiemKhach extends NhanVat {
	private int sokiem;
	private int capdosudung;
	
	public KiemKhach(String ten, String id, byte gioitinh, double nangluong, int sokiem, int capdosudung) {
		super(ten, id, gioitinh, nangluong);
		this.sokiem = sokiem;
		this.capdosudung = capdosudung;
	}

	/**
	 * @return the sokiem
	 */
	public int getSokiem() {
		return sokiem;
	}

	/**
	 * @param sokiem the sokiem to set
	 */
	public void setSokiem(int sokiem) {
		this.sokiem = sokiem;
	}

	/**
	 * @return the capdosudung
	 */
	public int getCapdosudung() {
		return capdosudung;
	}

	/**
	 * @param capdosudung the capdosudung to set
	 */
	public void setCapdosudung(int capdosudung) {
		this.capdosudung = capdosudung;
	}

	public String toString() {
		return "KiemKhach [sokiem=" + sokiem + ", capdosudung=" + capdosudung + "]";
	}

	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("Vung kiem chem");
	}

	public void sucmanh() {
		// TODO Auto-generated method stub
		double energy = this.getNangluong()*1.5;
		System.out.println("Suc manh cua kiem khach la: " + energy);
	}
	
	
}