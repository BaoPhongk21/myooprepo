package bailuyentap.model;

public class Laptop extends SanPham {
	private int ram;
	private String cpu;
	
	public Laptop(String tenSP, int maSP, double giaCa, int soLuong, int ram, String cpu) {
		super(tenSP, maSP, giaCa, soLuong);
		this.ram = ram;
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", cpu=" + cpu + ", getMaSP()=" + getMaSP() + ", getTenSP()=" + getTenSP()
				+ ", getSoLuong()=" + getSoLuong() + ", getGiaCa()=" + getGiaCa() + "]";
	}
	

}
