package bai09.vd3;

import java.util.ArrayList;

public class XeHoi {
	private DongCo dongco;
	private ArrayList<BanhXe> dsbx;
	/**
	 * @param dongco
	 * @param dsbx
	 * @throws CloneNotSupportedException 
	 */
	public XeHoi(DongCo dongco, ArrayList<BanhXe> dsbx) throws CloneNotSupportedException {
		super();
		this.dongco = (DongCo)dongco.clone();
		this.dsbx = dsbx;
	}
	/**
	 * @param dongco
	 * @throws CloneNotSupportedException 
	 */
	public XeHoi(DongCo dongco) throws CloneNotSupportedException {
		super();
		this.dongco = (DongCo)dongco.clone();
		this.dsbx = new ArrayList<BanhXe>();
	}

	public void addBanhXe(BanhXe bx) {
		this.dsbx.add(bx);
	}
	/**
	 * @return the dongco
	 */
	public DongCo getDongco() {
		return dongco;
	}
	/**
	 * @param dongco the dongco to set
	 */
	public void setDongco(DongCo dongco) {
		this.dongco = dongco;
	}
	/**
	 * @return the dsbx
	 */
	public ArrayList<BanhXe> getDsbx() {
		return dsbx;
	}
	/**
	 * @param dsbx the dsbx to set
	 */
	public void setDsbx(ArrayList<BanhXe> dsbx) {
		this.dsbx = dsbx;
	}
	@Override
	public String toString() {
		return "XeHoi [dongco=" + dongco + ", dsbx=" + dsbx + "]";
	}


}