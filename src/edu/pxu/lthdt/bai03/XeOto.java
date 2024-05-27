package edu.pxu.lthdt.bai03;
import java.time.LocalDate;

public class XeOto {
	private String hangxe;
	private int namsanxuat;
	private float dongco;
	
	
	
	public XeOto(String hangxe, int namsanxuat, float dongco) {
		super();
		this.setHangxe(hangxe);
		this.setNamsanxuat(namsanxuat);
		this.setDongco(dongco);
	}



	public String getHangxe() {
		return hangxe;
	}



	public void setHangxe(String hangxe) {
		this.hangxe = hangxe;
	}



	public int getNamsanxuat() {
		return namsanxuat;
	}



	public void setNamsanxuat(int namsanxuat) {
		java.time.LocalDate ngayht = LocalDate.now();
		int namhientai = ngayht.getYear();
		if((namsanxuat < 1885) || (namsanxuat > namhientai)) {
			System.out.print("Nam san xuat khong phu hop");
		}
		else {
		this.namsanxuat = namsanxuat;
	}
	}


	public float getDongco() {
		return dongco;
	}



	public void setDongco(float dongco) {
		this.dongco = dongco;
	}



	@Override
	public String toString() {
		return "XeOto [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + "]";
	}
	
	
	
	
}