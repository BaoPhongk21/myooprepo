package bai06;

import java.util.ArrayList;

import bai06.vd1.HinhChuNhat;
import bai06.vd1.HinhHoc;
import bai06.vd1.HinhTron;


public class SuDungHinhHoc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Cach truyen thong
		System.out.println("Khong dung arraylist");
		HinhTron o1 = new HinhTron(3);
		HinhTron o2 = new HinhTron(4);
		HinhChuNhat n1 = new HinhChuNhat(4, 3);
		HinhChuNhat n2 = new HinhChuNhat(5, 2);
		System.out.println("Dien tich cua hinh tron o1 la: " + o1.tinhDienTich());
		System.out.println("Dien tich cua hinh chu nhat n2 la: " + n2.tinhDienTich());
		// Cach hay hon
		System.out.println("Dung 2 arraylist");
		ArrayList<HinhTron> a = new ArrayList<>();
		a.add(o1);
		a.add(o2);
		for(HinhTron item: a) {
			System.out.println(item.tinhChuVi() + " -- " + item.tinhDienTich());
		}
		ArrayList<HinhChuNhat> b = new ArrayList<>();
		b.add(n1);
		b.add(n2);
		for(HinhTron item: a) {
			System.out.println(item.tinhChuVi() + " -- " + item.tinhDienTich());
		}
		//Cach hay hon nua
		System.out.println("Cach 3 chi dung 1 arraylist");
		ArrayList<HinhHoc> w = new ArrayList();
		w.add(n2);
		w.add(o1);
		w.add(n1);
		w.add(o2);
		for(HinhHoc item: w) {
			System.out.println(item.tinhChuVi() + " --- " + item.tinhDienTich());
		}
	}

}