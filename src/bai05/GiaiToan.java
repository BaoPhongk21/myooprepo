package bai05;

import bai05.vd2.MathHelper;

public class GiaiToan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathHelper obj = new MathHelper();
		int tong_so_nguyen = obj.sum(15, 30);
		System.out.println("Tong 2 so nguyen la: "+ tong_so_nguyen);
		System.out.println("Tong 2 so nguyen la: "+ obj.sum(1.26, 3.13));

	}

}
