package pxu.edu.vn.bai11;

import java.util.Scanner;

public class HamCoThamSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("a =");
			double a = sc.nextDouble();
			System.out.println("b =");
			double b = sc.nextDouble();
			System.out.println("c =");
			double c = sc.nextDouble();
			System.out.println("x =");
			double x = sc.nextDouble();

			System.out.println("Bieu thuc F1 = " + tinhBieuThucF1(a, b, c, x));
			System.out.println("Bieu thuc F2 = " + tinhBieuThucF2(x));
			System.out.println("Bieu thuc F3 = " + tinhBieuThucF3(a, b, c, x));
		} catch (Exception e) {
			System.out.println("Input incorrect");
		}

	}

	public static double tinhBieuThucF1(double a, double b, double c, double x) {
		return a * x * x + b * x + c;
	}

	public static double tinhBieuThucF2(double x) {
		return Math.log(x) - 1 / (Math.sqrt(Math.abs(Math.pow(x, 3) - 8)));
	}

	public static double tinhBieuThucF3(double a, double b, double c, double x) {
		return tinhBieuThucF1(a, b, c, x) / tinhBieuThucF2(x);
	}

}
