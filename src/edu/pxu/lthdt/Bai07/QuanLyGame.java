package edu.pxu.lthdt.Bai07;

import bai05.baitap.KyBinh;

public class QuanLyGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KyBinh kb = new KyBinh("Phong", "IT2005", (byte) 1, 100, true, false, false, false);
		System.out.println(kb);
		kb.hanhdong();
		kb.sucmanh();
		
	}

}
