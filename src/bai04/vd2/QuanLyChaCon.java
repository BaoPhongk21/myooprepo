package bai04.vd2;

public class QuanLyChaCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lopcha obj = new Lopcha("Lopcha", 15, 3.147);
		obj.thuoctinh2 = 16;
		obj.thuoctinh3 = 8;
		System.out.println(obj);
		obj.phuongthuc2();
		obj.phuongthuc3();
		obj.vidugoiprivate();
		System.out.println(obj);
		
		Lopcon obj2 = new Lopcon("phong", 109, 9.9, "K21 CNTT");
		obj.phuongthuc2();
		
	}

}
