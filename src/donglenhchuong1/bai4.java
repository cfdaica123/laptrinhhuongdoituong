package donglenhchuong1;

public class bai4 {
	public static void main(String []args) {
		circle hinhtron = new circle (1,2,3);
		System.out.println("Chu vi hình tròn là: " + hinhtron.calcPerimeter());
		System.out.println("Diện tích hình tròn là: "+ hinhtron.calcArea());
		
		System.out.println("");
		
		retangle hinhchunhat = new retangle(1,2,3,4);
		System.out.println("Chu vi hình chữ nhật là: " +hinhchunhat.calcPerimeter());
		System.out.println("Diện tích hình chữ nhật là: " +hinhchunhat.calcArea());
	}
}
