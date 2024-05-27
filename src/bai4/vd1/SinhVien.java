package bai4.vd1;

public class SinhVien extends Nguoi {
	private String masoSV;
	private String nganhhoc;
	
	
	public String getMasoSV() {
		return masoSV;
	}


	public void setMasoSV(String masoSV) {
		this.masoSV = masoSV;
	}


	public String getNganhhoc() {
		return nganhhoc;
	}


	public void setNganhhoc(String nganhhoc) {
		this.nganhhoc = nganhhoc;
	}


	public SinhVien(String hoten, int namsinh, String masoSV, String nganhhoc) {
		super(hoten, namsinh);
		this.setMasoSV(masoSV);
		this.setNganhhoc(nganhhoc);
	}


	@Override
	public String toString() {
		return "SinhVien [masoSV=" + masoSV + ", nganhhoc=" + nganhhoc + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
