package bai03;

public class QLSV {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//khai báo đối tượng sv kểu sinh viên
		SinhVien sv;
		//khởi tạo đối tượng sinh viên
		sv = new SinhVien();
		//gán giá trị cho các thuộc tính của các đối tượng
		sv.hoten = "Doa";
		sv.namsinh = 2005;
		sv.sdt = "0399033926";
		//xuất giá trị của các đối tượng sinh viên ra màn hình
		System.out.print("Họ tên: "+sv.hoten+ "; Năm sinh: "+sv.namsinh+"; SĐT: "+sv.sdt);
	}
}
