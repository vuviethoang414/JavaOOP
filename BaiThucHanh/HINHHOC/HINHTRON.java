package HINHHOC;
import java.util.Scanner;
public class HINHTRON extends HinhHoc{
    public float r;
   public HINHTRON(){
        ten="HINH TRON";
    }
    //Nhap ban kinh
    public void nhapBanKinh(){
        System.out.print("Nhap vao ban kinh : ");
        Scanner sc = new Scanner(System.in);
        r=sc.nextFloat();
    }
    //Tinh chu vi
    public void tinhChuVi(){
        chuVi=r*PI*2;
    }
    //Tinh dien tich
     public void tinhDienTich(){
        dienTich=r*r*PI;
     }
}
    

