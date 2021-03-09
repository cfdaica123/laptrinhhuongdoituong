package baitap01;

public class Student {
	private String fullname;
	private float age;
	private String phone;
	
	public Student() {
		super();
	}
	public Student(String fullname, float age, String phone) {
		super();
		this.fullname = fullname;
		this.age = age;
		this.phone = phone;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Student [fullname=" + fullname + ", age=" + age + ", phone=" + phone + "]";
	}
}
