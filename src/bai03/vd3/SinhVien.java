package bai03.vd3;

public class SinhVien {
	private String hoten;
	private int namsinh;
	private String sdt;
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
		if (namsinh <= 1900) {
			System.out.println("Nam sinh " +namsinh+ "Khong hop le");
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
	@Override
	public String toString() {
		if(this.namsinh ==0) {
			return "SinhVien [hoten=" + hoten+ ", sdt=" +sdt+"]";
		}
		return "SinhVien [hoten=" + hoten + ", namsinh=" + namsinh + ", sdt=" + sdt + "]";
	}
	
}
