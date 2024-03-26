package PERSON;
import java.util.Scanner;
public class person {
    public String fullname;
    public String address;
    public int age;
    Scanner sc = new Scanner(System.in);
    //Ham nhap thong tin
    public void NhapThongTin(){
        System.out.printf("Nhap ten : ");
        fullname=sc.nextLine();
        System.out.printf("Nhap tuoi : ");
        age=sc.nextInt();
        System.out.printf("Nhap dia chi : ");
        address=sc.next();
    }
    //Ham xuat thong tin
    public void XuatThongTin(){
        System.out.println("Name : "+fullname);
        System.out.println("Address : "+address);
        System.out.println("Age : "+age);
    }
}
