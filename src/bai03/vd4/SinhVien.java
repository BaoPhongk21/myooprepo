package bai03.vd4;

public class SinhVien {

	private String hoten;
	private int namsinh;
	private String sdt;
	
	public SinhVien(String hoten, int namsinh, String sdt) {
		super();
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.setNamsinh(namsinh);
		this.sdt = sdt;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		if(namsinh <= 1900) {
			System.out.println("Nam sinh: "+namsinh+ " khong hop le");
		}else {
			this.namsinh = namsinh;
		}
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
}