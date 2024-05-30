import java.util.Scanner;
import java.util.List;
public class Student {
    String fullName;
    int Age;
    String id;
    //Phuong thuc nhap thong tin
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten : ");
        fullName=sc.nextLine();
        System.out.print("Nhap tuoi : ");
        Age=sc.nextInt();
        Scanner cs = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien : ");
        id=sc.nextLine();
    }
    //Phuong thuc sua thong tin
    public static void SuaThongTin(List<Student> ListStudent){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho ten sinh vien can sua : ");
        String ten = sc.nextLine();
        for(int i =0;i<ListStudent.size();i++){
            if(ListStudent.get(i).equals(ten)){
                Student std = new Student();
                ListStudent.add(i,std);
                System.out.println("Sua sinh vien thanh cong !");
            }  
        }
    }
    //Phuong thuc xoa thong tin
    public static void XoaThongTin(List<Student> ListStudent){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho ten sinh vien can xoa : ");
        String ten = sc.nextLine();
        for(int i =0;i<ListStudent.size();i++){
            if(ListStudent.get(i).equals(ten)){
                Student std = new Student();
                ListStudent.remove(std);
                System.out.println("Xoa sinh vien thanh cong !");
            }  
        }
    }
    //Hien thi thong tin
    public void hienthi(){
        System.out.println("FullName: "+fullName);
        System.out.println("Age: "+Age);
        System.out.println("ID: "+id);
    }
    //Phuong thuc hien thi thong tin
    public static void HienThiThongTin(List<Student> ListStudent){
        for(Student std : ListStudent){
            std.hienthi();
        }
    }
    //Them thong tin 
    public static void ThemThongTin(List<Student> ListStudent, int n){
        Student std = new Student();
        std.NhapThongTin();
        ListStudent.add(std);
    }   
}
