package bai09;

import bai09.vd1.LopHoc;
import bai09.vd1.SinhVien;

public class QuanHeAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien("Son", new LopHoc("K19 CNTT"));
		System.out.println(sv);
		LopHoc lop = new LopHoc("K19 CNTT");
		lop.addSinhVien(sv);
		//sv.setLop(lop);
		System.out.println(lop);
	}

}