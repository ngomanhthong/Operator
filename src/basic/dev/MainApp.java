package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so nguyen a");
		int a = sc.nextInt();
		System.out.println("nhap vao so nguyen b");
		int b = sc.nextInt();
		System.out.println("nhap vao so nguyen c");
		int c = sc.nextInt();
		System.out.println("----------");
		// a+b
		int tong = a + b;
		System.out.println("Tong = " + tong);
		// a-b
		int hieu = a - b;
		System.out.println("Hieu = " + hieu);
		// a*b
		int tich = a * b;
		System.out.println("Tich = " + tich);
		// a/b
		int thuong = a / b;
		System.out.println("Thuong = " + thuong);
		System.out.println("----------");
		
		boolean lonHon = a > b;
		System.out.println(lonHon);
		boolean beHon = a < b;
		System.out.println(beHon);
		boolean lonHonHoacBang = a >= b;
		System.out.println(lonHonHoacBang);
		boolean beHonHoacBang = a > b;
		System.out.println(beHonHoacBang);
	}
}