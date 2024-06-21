package baitap.model;

import java.util.ArrayList;
import java.util.List;

public class KyBinh extends NhanVat implements Cloneable{
	private String guom;
	private String giao;
	private String cung;
	private String ngua;
	private int namdaotao;
	private List<BinhDoan> dsbd;
	public KyBinh(String ten, int id, String gT, double nangLuong, String guom, String giao, String cung, String ngua,
			int namdaotao) {
		super(ten, id, gT, nangLuong);
		this.guom = guom;
		this.giao = giao;
		this.cung = cung;
		this.ngua = ngua;
		this.namdaotao = namdaotao;
		this.dsbd = new ArrayList<BinhDoan>();
	}
	public void addBinhDoan(BinhDoan bd) {
		dsbd.add((BinhDoan)bd.tbvk);
	}
	public String getGuom() {
		return guom;
	}
	public void setGuom(String guom) {
		this.guom = guom;
	}
	public String getGiao() {
		return giao;
	}
	public void setGiao(String giao) {
		this.giao = giao;
	}
	public String getCung() {
		return cung;
	}
	public void setCung(String cung) {
		this.cung = cung;
	}
	public String getNgua() {
		return ngua;
	}
	public void setNgua(String ngua) {
		this.ngua = ngua;
	}
	public int getNamdaotao() {
		return namdaotao;
	}
	public void setNamdaotao(int namdaotao) {
		this.namdaotao = namdaotao;
	}
	@Override
	public String toString() {
		return "KyBinh [guom=" + guom + ", giao=" + giao + ", cung=" + cung + ", ngua=" + ngua + ", namdaotao="
				+ namdaotao + ", getTen()=" + getTen() + ", getId()=" + getId() + ", getGT()=" + getGT()
				+ ", getNangLuong()=" + getNangLuong() + "]";
	}
	public void tanCong() {
	}
	public void diChuyen() {

	}
	public void satThuong() {

	}
}