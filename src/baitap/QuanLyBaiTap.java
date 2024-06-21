package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import baitap.model.KyBinh;
import baitap.model.NhanVat;
import baitap.model.PhuThuy;

public class QuanLyBaiTap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PhuThuy> pts = new ArrayList<PhuThuy>();
		pts.add(new PhuThuy("phong", 01,"nam",123.5,"choi phep","gay phep","co trang","gio"));
		pts.add(new PhuThuy("dat", 02,"nam",12.3,"choi bay","gay phep","co trang","lua"));
		pts.add(new PhuThuy("nguyen", 03,"nam",123.5,"choi bay","gay phep","co trang","bang"));
		pts.add(new PhuThuy("Bankaii", 04,"nu",123.5,"choi bay","gay phep","co trang","nuoc"));
		System.out.println("danh sach phu thuy ban dau");
		for(PhuThuy item:pts) {
			System.out.println(item);
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		List<KyBinh> kb = new ArrayList<KyBinh>();
		kb.add(new KyBinh("phong",01, "nam", 120.8,"kiem", "giao","cung","bach ma", 10));
		kb.add(new KyBinh("khang",02, "nam", 10.8,"kiem", "giao","cung","bach ma", 3));
		kb.add(new KyBinh("phu",03, "nam",45.65,"kiem", "giao","cung","bach ma", 8));
		kb.add(new KyBinh("quy",04, "nam", 10.45,"kiem", "giao","cung","den", 5));
		System.out.println("danh sach ky binh ban dau");
		for(KyBinh tam:kb) {
			System.out.println(tam);
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		// tim kiem phu thuy co ten la gyen
		int vitri = Collections.binarySearch(pts, new PhuThuy("dat",0,null, 0, null, null, null, null),
				new Comparator<PhuThuy>() {

					@Override
					public int compare(PhuThuy o1, PhuThuy o2) {
						// TODO Auto-generated method stub
						return o1.getTen().compareTo(o2.getTen());
					}

				});
		if(vitri < 0) {
			System.out.println("khong tim thay");
		}else {
			System.out.println("vi tri cua sinh vien Dat co vi tri la: "+vitri);
			System.out.println(pts.get(vitri));
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------");


	//tim kiem ky binh so nam dao tao cao nhat
		KyBinh kb_max = Collections.max(kb, new Comparator<KyBinh>() {

			@Override
			public int compare(KyBinh o1, KyBinh o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getNamdaotao(), o2.getNamdaotao());
			}

		});
		System.out.println("Ky binh co so nam dao tao cao nhat la:");
		System.out.println(kb_max);
		System.out.println("---------------------------------------------------------------------------------------------------------------------");

		//xap sep ky binh theo nang luong
		Collections.sort(kb, new Comparator<KyBinh>() {

			@Override
			public int compare(KyBinh o1, KyBinh o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getNangLuong(), o2.getNangLuong());
			}

		});
		System.out.println("xap xep cac Ky binh theo nang luong");
		for(NhanVat nhanVat: kb) {
			System.out.println(nhanVat);
		}
	}

}