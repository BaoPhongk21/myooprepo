package bailuyentap.model;


import java.util.ArrayList;
import java.util.List;

public class XeHoi extends SanPham {
	private DongCo dongco;
	private List<BanhXe> dsbx;
	
	public XeHoi(String tenSP, int maSP, double giaCa, int soLuong, DongCo dongco) {
		super(tenSP, maSP, giaCa, soLuong);
		this.dongco = dongco;
		this.dsbx = new ArrayList<BanhXe>();
				}
	public void addBanhXe(BanhXe bx) throws CloneNotSupportedException {
		dsbx.add((BanhXe)bx.clone());
	}
	public DongCo getDongco() {
		return dongco;
	}
	public void setDongco(DongCo dongco) throws CloneNotSupportedException {
		this.dongco = (DongCo)dongco.clone();
	}
	public List<BanhXe> getDsbx() {
		return dsbx;
	}
	public void setDsbx(List<BanhXe> dsbx) throws CloneNotSupportedException {
		for(BanhXe item: dsbx) {
			this.dsbx.add((BanhXe)item.clone());
		}
			}
	@Override
	public String toString() {
		return "XeHoi [dongco=" + dongco + ", dsbx=" + dsbx + "]";
	}
	
	
	
}
