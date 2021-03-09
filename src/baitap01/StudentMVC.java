package baitap01;

public class StudentMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kich_ban_2();
    }
    
    public static void kich_ban_1(){
        StudentController sc = new StudentController(new StudentView());
        sc.nhap_du_lieu_sinh_vien();
        sc.hien_thi_sinh_vien();
    }
    
    public static void kich_ban_2(){
        StudentController sc = new StudentController(new StudentView());
        sc.nhap_danh_sach_sinh_vien();
        sc.hien_thi_danh_sach_sinh_vien();
    }
}