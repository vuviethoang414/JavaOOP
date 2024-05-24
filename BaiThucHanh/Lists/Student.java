package Lists;
import java.util.Scanner;
import java.util.List;
public class Student {
    String fullName;
    int Age;
    //public Student(){}
    public void NhapThongTin(){
        System.out.print("Nhap vao ho va ten sinh vien : ");
        fullName=sc.nextLine();
        System.out.print("Nhap tuoi sinh vien ");
        Age=sc.nextInt();
    }
    Scanner sc = new Scanner(System.in);
    //Phuong thuc nhap thong tin
    public void hienthi(){
        System.out.println("FullName: "+fullName);
        System.out.println("Age: "+Age);
    }
    //Phuong thuc hien thi thong tin
    public  static void HienThiThongTin(List<Student> listStudent){
        for(Student st : listStudent){
            st.hienthi();
        }
        
    
    }
    //Phuong thuc them sinh vien
    public static void Add(List<Student> listStudent , int n){
    for(int i=0;i<n;i++){
        Student std = new Student();
        std.NhapThongTin();
        listStudent.add(std);
    }
}
    //Phuong thuc sua thong tin
    public static void Update(List<Student> listStudent  ){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nNhap vao ten sinh vien can sua : ");
        String ten = sc.nextLine();
        // Tim den vi tri ten can sua doi trong mang
        for(int i = 0;i<listStudent.size();i++){
            if(listStudent.get(i).equals(ten)){
                Student std = new Student();
                std.NhapThongTin();
                listStudent.add(i,std);
            }else{
                System.out.println("Ko co sinh vien nao trong danh sachh trung vs ten vua nhap");
            }

        }
        

    }
        
    }
    

    

