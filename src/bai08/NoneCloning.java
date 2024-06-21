package bai08;

import bai08.vd1.SanPham;

public class NoneCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SanPham sp1 = new SanPham(12, "Samsum");
			System.out.println(sp1);
			// Thuc hien phep gan
			SanPham sp2 = sp1;
			sp2.setTenSanPham("Iphone");
			//xuat gia tri
			System.out.println(sp1);
			System.out.println(sp2);

	}

}
