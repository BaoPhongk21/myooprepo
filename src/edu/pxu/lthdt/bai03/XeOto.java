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
		if ("Toyota".equals(hangxe) || "Chevrolet".equals(hangxe) || "Ford".equals(hangxe) || "Honda".equals(hangxe) || "Hyundai".equals(hangxe)) {
			this.hangxe = hangxe;
		} else {
	        System.out.println("Hãng xe " + hangxe + " không được sản xuất tại Việt Nam.");
	    }
	}
	
	public int getNamsanxuat() {
		return namsanxuat;
	}
	public void setNamsanxuat(int namsanxuat) {
		LocalDate ngayht = LocalDate.now();
		int namhientai = ngayht.getYear();
		if((namsanxuat < 1885) || (namsanxuat > namhientai)){
			System.out.println("Năm sản xuất không hợp lệ");
		}else {
			this.namsanxuat = namsanxuat;
		}
	}
	
	public float getDongco() {
		return dongco;
	}
	public void setDongco(float dongco) {
		if (dongco <= 0) {
            System.out.println("Động cơ không thể có công xuất là: " + dongco + "kW");
		}else {
			this.dongco = dongco;
		}
	}
	
	
	@Override
	public String toString() {
		return "XeOto [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + "]";
	}
	
}