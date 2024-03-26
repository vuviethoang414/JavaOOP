package HINHHOC;
import java.util.Scanner;
public  class HINHCHUNHAT extends HinhHoc{
    public float dai;
    public float rong;
    HINHCHUNHAT(){
        ten="HINH CHU NHAT";
    }
    //Nhap chieu dai
    public void nhapChieuDai(){
        System.out.print("Nhap vao chieu dai: ");
        Scanner sc = new Scanner(System.in);
        dai=sc.nextInt();
    }
    //Nhap chieu rong
    public void nhapChieuRong(){
        System.out.print("Nhap vao chieu rong: ");
        Scanner sc = new Scanner(System.in);
        rong=sc.nextInt();
        sc.nextLine();
    }
    //Tinh chu vi
    public void tinhChuVi(){
        chuVi=(dai+rong)*2;
    }
    //Tinh dien tich
    public void tinhDienTich(){
        dienTich= dai*rong;
    }
}
