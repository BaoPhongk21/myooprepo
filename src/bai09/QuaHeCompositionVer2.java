package bai09;

import bai09.vd4.BanhXe;
import bai09.vd4.DongCo;
import bai09.vd4.XeHoi;


public class QuaHeCompositionVer2 {
	public static void main(String[] args) throws CloneNotSupportedException {
	DongCo dc= new DongCo("Dong co xang");
	BanhXe bx = new BanhXe(1.5);
	XeHoi car = new XeHoi(dc);
	for(int i = 0; i < 4; i++) {
		car.addBanhXe(bx);
	}
	System.out.println("CAU HINH XE BAN DAU");
	System.out.println(car);
	System.out.println("thay doi cac linh kien");
	System.out.println("dong co dien");
	System.out.println("thay doi dong co"+dc);
	System.out.println("thay doi ban kinh"+bx);
	System.out.println(car);
	}

}
