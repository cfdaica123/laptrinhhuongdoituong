package donglenhchuong1;

public class donglenh {
	public static void main(String []srrgs) {
		System.out.println("Các phép toán với số nguyên");
			int  a = 17, b = 4, c;
			c = a + b;
			System.out.println("Phép cộng: " + a + "+" + b + "="  + c);
			c = b - a;
			System.out.println("Phép trừ: " + b + "-" + a  + "="  + c);
			c = a * b;
			System.out.println("Phép chia: " + a + "*" + b + "="  + c);
			c = a / b;
			System.out.println("Phép chia lấy phần nguyên: " + a + "/" + b + "="  + c);
			c = a % b;
			System.out.println("Phép chia lấy phần dư: " + a + "%" + b + "="  + c);
		
		System.out.println("");
		
		System.out.println("Các phép toán với số thực");
			double x = 14.3,y = 3.56, z;
			z = x + y;
			System.out.println("Phép cộng: " + x + "+" + y + "="+ z);
			z = y - x;
			System.out.println("Phép trừ: " + x + "-" + y + "="+ z);
			z = x * y;
			System.out.println("Phép nhân: " + x + "*" + y + "="+ z);
			z = y / x;
			System.out.println("Phép chia: " + x + "/" + y + "="+ z);

		System.out.println("");
		
		System.out.println("Các phép toán kiểu logic");
			boolean flag1 = true, flag2 = false, flag3 = true;
			System.out.println("Phép AND: " + (flag1 && flag2));
			System.out.println("Phép OR: " + (flag1 || flag2));
			System.out.println("Phép NOT: " + (!flag1));
			System.out.println("Phép XOR: " + (flag1 ^ flag3));
			
		System.out.println("");
		
		System.out.println("Một số phép toán cơ bản trên chuỗi");
			String s1 = "Hue City";
			String s2 = "city";
			
			System.out.println(s1.toLowerCase());
			System.out.println(s2.toUpperCase());
			System.out.println(s1.contains(s2));
			System.out.println(s1.toLowerCase().contains(s2));
			s1 += "" + s2;
			System.out.println(s1);
	}
}
