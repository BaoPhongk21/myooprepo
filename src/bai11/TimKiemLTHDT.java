package bai11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bai11.model.SinhVien;

public class TimKiemLTHDT {

	public static void main(String[] args) {
		
		
		
		
		
		// Buoc 1 Tao Du Lieu
		List<SinhVien> dssv = new ArrayList<SinhVien>();
			dssv.add(new SinhVien("Phong", 8, 18));
			dssv.add(new SinhVien("Doa", 10, 18));
			dssv.add(new SinhVien("Dat", 7, 19));
			dssv.add(new SinhVien("Nguyen",7, 18));
			System.out.println("Danh sach sinh vien ban dau");
			for (SinhVien item: dssv) {
				System.out.println(item);
			}
			System.out.println("-----------------------------------------------------");
			
			
			
			
			
			
			
			
			//Buoc 2 Tim Kiem Sinh Vien co dtb thap nhat
			SinhVien sv_min = Collections.min(dssv, new Comparator<SinhVien>() {

				@Override
				public int compare(SinhVien o1, SinhVien o2) {
					// TODO Auto-generated method stub
					return Double.compare(o1.getDiemtb(), o2.getDiemtb());
				}
				
			});
			System.out.println("Sinh vien co dtb thap nhat la");
			System.out.println(sv_min);
			System.out.println("-----------------------------------------------------");
			
			
			
			
			
			
			//Buoc  3: Tim kiem co tuoi lon nhat
			SinhVien sv_max = Collections.max(dssv, new Comparator<SinhVien>() {

				@Override
				public int compare(SinhVien o1, SinhVien o2) {
					// TODO Auto-generated method stub
					return Integer.compare(o1.getTuoi(), o2.getTuoi());
				}
				
			});
			System.out.println("Sinh vien co tuoi cao nhat la");
			System.out.println(sv_max);
			System.out.println("-----------------------------------------------------");
			
			
			
			
			
			
			
			// Buoc 4 Tim Sinh Vien Dau Tien Co ten La Phong
			int vitri = Collections.binarySearch(dssv, new SinhVien("Doa", 0, 0),
					new Comparator<SinhVien>() {

						@Override
						public int compare(SinhVien o1, SinhVien o2) {
							// TODO Auto-generated method stub
							return o1.getHoten().compareTo(o2.getHoten());
						}
				
					});
			if (vitri <= 0) {
				System.out.println("Khong tim thay ");
			}else {
				System.out.println("Vi tri cua sv co ten la Doa " + vitri);
				System.out.println(dssv.get(vitri));
			}
			System.out.println("-----------------------------------------------------");
			
			
			
			
			//Buoc 5 Su Dung Stream va cu phap Lambda
			List<SinhVien> kqloc = dssv.stream()
					.filter(sv -> sv.getDiemtb() >= 8)
					.filter(sv -> sv.getDiemtb()<= 10)
					.filter(sv -> sv.getTuoi() >= 18)
					.filter(sv -> sv.getTuoi() <=20)
					.toList();
			System.out.println("Ket qua loc du lieu ");
			for(SinhVien item: kqloc) {
				System.out.println(item);
			}
			System.out.println("-----------------------------------------------------");
			
			
			
			
			//Buoc 6 Cay dung menh de logic Predicate
			//Loc tat ca sinh vien co 8 <= 10 OR 19 <= tuoi <= 20
			//Xay Dung menh de logic 8 <= dtbv<= <=10
			Predicate<SinhVien> dk_dtb = new Predicate<SinhVien>() {
				
				@Override
				public boolean test(SinhVien t) {
					// TODO Auto-generated method stub
					return t.getDiemtb() >=8 && t.getDiemtb() <=10;
				}
			};
			//Xay Dung Menh De Logic 18 <= tuoi <=20
			Predicate<SinhVien> dk_tuoi = new Predicate<SinhVien>() {
				
				@Override
				public boolean test(SinhVien t) {
					// TODO Auto-generated method stub
					return t.getTuoi() >= 18 && t.getTuoi() <= 20;
				}
			};
			// Tien Hanh Loc Du Lieu Trong Bang Stream va Filter
			List<SinhVien> dskq = dssv.stream()
					.filter(dk_dtb.or(dk_tuoi))
					.toList();
			System.out.println("Ket Qua Loc du lieu 2");

	for(SinhVien item: dskq) {
		System.out.println(item);
	}
	System.out.println("-----------------------------------------------------");
	

}
}
