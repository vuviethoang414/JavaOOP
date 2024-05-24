package Sets;
import java.util.Scanner;
import java.util.Set;
public class Student {
    String fullName;
    int Age;
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
       System.out.print("\nNhap vao ho ten cua sinh vien : ");
       fullName=sc.nextLine();
       System.out.print("Nhap vao tuoi cua sinh vien : ");
       Age=sc.nextInt();
    }
    public void hienthi(){
        System.out.println("fullName : "+fullName);
        System.out.println("Age : "+Age+"\n");

    }
    public static void HienThiThongTin(Set<Student> SetStudent){
        for(Student std : SetStudent){
            std.hienthi();
        }
    }
    public static void add(Set<Student> SetStudent,int n){
        for(int i =0; i<n;i++){
            Student std = new Student();
            std.NhapThongTin();
            SetStudent.add(std);
        }
        System.out.println("Them sinh vien thanh cong !");
    }
    public static void Update(Set<Student> SetStudent){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten sinh vien can sua : ");
        String ten =sc.nextLine();
        for(Student std : SetStudent){
            if(std.fullName.equals(ten)){
                SetStudent.remove(std);
                Student st = new Student();
                st.NhapThongTin();
                SetStudent.add(st);
            }
        }
    }
    public static void delete(Set<Student> SetStudent){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten sinh vien can xoa : ");
        String ten = sc.nextLine();
        for(Student std : SetStudent){
            if(std.fullName.equals(ten)){
                SetStudent.remove(std);
                System.out.println("Da xoa thanh cong");
            }
        }
    }  
}
