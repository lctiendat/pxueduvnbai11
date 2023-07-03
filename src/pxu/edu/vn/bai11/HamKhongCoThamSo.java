package pxu.edu.vn.bai11;

public class HamKhongCoThamSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hienThi10Lan();
		hienThiThongDiep("Hello World");
		hienThiThongDiep("I am handsome");

	}

	public static void hienthi() {
		System.out.println("Lap tring java");
	}

	public static void hienThi10Lan() {
		for (int i = 0; i < 10; i++) {
			hienthi();
		}
	}

	public static void hienThiThongDiep(String msg) {
		System.out.println(msg);
	}

}
