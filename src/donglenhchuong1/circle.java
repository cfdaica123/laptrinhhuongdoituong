package donglenhchuong1;

public class circle {
	private int radius;
	private int a ,b;
	
	public circle() {
		
	}
	
	public circle(int radius, int a, int b) {
		super();
		this.radius = radius;
		this.a = a;
		this.b = b;
	}
//	Chu vi
	public double calcPerimeter() {
		double result = 2*Math.PI*this.radius;
		return result;
	}
//	Diện tích
	public double calcArea() {
		double result = Math.PI*this.radius*this.radius;
		return result;
	}

	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
}
