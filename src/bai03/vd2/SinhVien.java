package bai03.vd2;

public class SinhVien {

	public String hoten;
	public int namsinh;
	public String sdt;
	
	public String gethoten() {
		return this.hoten;
	}
	public void sethoten(String name) {
		this.hoten = name;
	}
	public int getnamsinh() {
		return this.namsinh;
	}
	public void setnamsinh(int yob) {
		this.namsinh = yob;
	}
	public String getsdt() {
		return this.sdt;
	}
	public void setsdt(String phone) {
		this.sdt = phone;
	}
	public String toString() {
		String result = "Ho ten: "+this.gethoten()+ " Nam sinh: "+this.getnamsinh()+" Sdt: "+this.getsdt();
		return result;
	}
}
