package edu.pxu.lthdt.Bai07;

public class PhuThuy {
	private boolean choi;
	private boolean gay;
	public PhuThuy(boolean choi, boolean gay) {
		super();
		this.choi = choi;
		this.gay = gay;
	}
	public boolean isChoi() {
		return choi;
	}
	public void setChoi(boolean choi) {
		this.choi = choi;
	}
	public boolean isGay() {
		return gay;
	}
	public void setGay(boolean gay) {
		this.gay = gay;
	}
	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", gay=" + gay + "]";
	}
	public void hanhdong() {
		System.out.println("...");
	}
	
	public void sucmanh() {
		System.out.println("...");
	}
}
