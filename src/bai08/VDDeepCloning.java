package bai08;

import java.util.ArrayList;

import bai08.vd4.HoaDon;
import bai08.vd4.SanPham;

public class VDDeepCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> dssp = new ArrayList<SanPham>();
		dssp.add(new SanPham(1, "Nokia"));
		dssp.add(new SanPham(2, "SamSung"));
		HoaDon hd1 = new HoaDon(0, dssp);
		System.out.println("Hoa don 1: " + hd1);
		HoaDon hd2;
		try {
			hd2 = (HoaDon)hd1.clone();
			hd2.setMaHoaDon(15);
			hd2.getDssp().getFirst().setMaSanPham(18);
			hd2.getDssp().getFirst().setTenSanPham("IPhone");
			System.out.println("Hoa don 1: " + hd1);
			System.out.println("Hoa don 2: " + hd2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}