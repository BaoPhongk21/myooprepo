package edu.pxu.lthdt.bai03;

import java.time.LocalDate;

public class XeBus {
	private String hangxe;
	private int namsanxuat;
	private float dongco;
	private int soghe;
	
	public XeBus(String hangxe, int namsanxuat, float dongco, int soghe) {
		super();
		this.setHangxe(hangxe);
		this.setNamsanxuat(namsanxuat);
		this.setDongco(dongco);
		this.setSoghe(soghe);
	}
	
	public String getHangxe() {
		return hangxe;
	}
	
	public void setHangxe(String hangxe) {
		if ("Hanoibus (Transerco)".equals(hangxe) || "Thaco Bus".equals(hangxe) || "SAMCO".equals(hangxe) || "Vinamoto".equals(hangxe) || "DCAR".equals(hangxe)) {
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
		if((namsanxuat < 1894) || (namsanxuat > namhientai)){
			System.out.println("Năm sản xuất không phù hợp");
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
	
	public int getSoghe() {
		return soghe;
	}
	
	public void setSoghe(int soghe) {
		if ((soghe <=36) && (soghe >=60)) {
			System.out.println("Số ghế: "+soghe+" không hợp lệ");
		}
		this.soghe = soghe;
	}
	
	
	@Override
	public String toString() {
		return "XeBus [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + ", soghe=" + soghe	+ "]";
	}
	
}