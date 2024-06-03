package bai05.baitap;

public class PhuThuy extends NhanVat {
	private boolean choi;
	private boolean gay;
	
	//Constructor
	public PhuThuy(String ten, String id, byte gioitinh, double nangluong, boolean choi, boolean gay) {
		super(ten, id, gioitinh, nangluong);
		this.choi = choi;
		this.gay = gay;
	}

	/**
	 * @return the choi
	 */
	public boolean isChoi() {
		return choi;
	}

	/**
	 * @param choi the choi to set
	 */
	public void setChoi(boolean choi) {
		this.choi = choi;
	}

	/**
	 * @return the gay
	 */
	public boolean isGay() {
		return gay;
	}

	/**
	 * @param gay the gay to set
	 */
	public void setGay(boolean gay) {
		this.gay = gay;
	}

	public String toString() {
		return "PhuThuy [choi=" + choi + ", gay=" + gay + "]";
	}

	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("Bay");
	}

	public void sucmanh() {
		// TODO Auto-generated method stub
		double energy = this.getNangluong()*1.7;
		System.out.println("Suc manh cua phu thuyu la: " + energy);
	}
	
	
}