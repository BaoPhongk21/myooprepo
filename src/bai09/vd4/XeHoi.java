package bai09.vd4;

import java.util.ArrayList;

public class XeHoi {
	private DongCo dongco;
	private ArrayList<BanhXe> dsbx;
	public XeHoi(DongCo dongco, ArrayList<BanhXe> dsbx) throws CloneNotSupportedException {
		super();
		this.dongco = (DongCo)dongco.clone();
		this.dsbx = dsbx;
	}
	public XeHoi(DongCo dongco) {
		super();
		this.dongco = dongco;
		this.dsbx = new ArrayList<BanhXe>();
	}
	public void addBanhXe(BanhXe bx) throws CloneNotSupportedException {
		BanhXe tam = (BanhXe)bx.clone();
		this.dsbx.add(tam);
	}
	public DongCo getDongco() {
		return dongco;
	}
	public void setDongco(DongCo dongco) {
		this.dongco = dongco;
	}
	public ArrayList<BanhXe> getDsbx() {
		return dsbx;
	}
	public void setDsbx(ArrayList<BanhXe> dsbx) {
		this.dsbx = dsbx;
	}
	@Override
	public String toString() {
		return "XeHoi [dongco=" + dongco + ", dsbx=" + dsbx + "]";
	}
	
}