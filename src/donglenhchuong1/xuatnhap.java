package donglenhchuong1;

import java.util.Scanner;

public class xuatnhap {
	@SuppressWarnings("deprecation")
	public static void main(String []args) {
		boolean flag = true;
		int a= 15;
		byte b = 2;
		double c = 12.6;
		float d = 4.5f;
		String s = "Hello Word";
		char ch = 'A';
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Hãy nhập tên: ");
		String hoten = sc.nextLine();
		System.out.println("Bạn đã nhập họ tên là: " + hoten);
		
		System.out.print("Hãy nhập vào số nguyên: ");
		String input = sc.nextLine();
		a = new Integer(input).intValue();
		System.out.println("Số Nguyên mà bạn đã nhập là: " + a);
		
		System.out.print("Hãy nhập vào số thực: ");
		input = sc.nextLine();
		c = new Double(input).intValue();
		System.out.println("Số Nguyên mà bạn đã nhập là: " + c);
	}
}
