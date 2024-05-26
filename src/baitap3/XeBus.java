package baitap3;

public class XeBus {
	private String hangxe;
	private int namsanxuat;
	private float dongco;
	private int soghe;
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
		this.namsanxuat = namsanxuat;
	}
	public float getDongco() {
		return dongco;
	}
	public void setDongco(float dongco) {
		this.dongco = dongco;
	}
	public int getSoghe() {
		return soghe;
	}
	public void setSoghe(int soghe) {
		this.soghe = soghe;
	}
	@Override
	public String toString() {
		return "XeBus [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + ", soghe=" + soghe
				+ "]";
	}
	
}