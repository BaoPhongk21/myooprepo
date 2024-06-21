package bai09.vd3;

 import bai09.vd3.DongCo;
 import bai09.vd3.XeHoi;


 public class QuanHeComposition {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DongCo dc = new DongCo("Dong co xang");
		System.out.println("Dong co ban dau " + dc);
		
		XeHoi car = new XeHoi(dc);
		BanhXe bx1 = new BanhXe(1.5);
		BanhXe bx2 = new BanhXe(1.5);
		BanhXe bx3 = new BanhXe(1.5);
		BanhXe bx4 = new BanhXe(1.5);
		
		car.addBanhXe(bx1);
		car.addBanhXe(bx2);
		car.addBanhXe(bx3);
		car.addBanhXe(bx4);
		
		System.out.println(car);
		System.out.println("THAY DOI");
		dc.setLoaiDongCo("DONG CO DIEN");
		System.out.println("DONG co thay doi" +dc);
		bx1.setBankinh(1.8);
		System.out.println(car);
		

		

	}

}
