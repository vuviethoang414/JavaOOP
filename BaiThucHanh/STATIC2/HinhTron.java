package STATIC2;
import STATIC.HinhHoc;
import java.util.Scanner;

public class HinhTron extends HinhHoc{
    protected float bankinh;
    private Scanner scanner ;
    public HinhTron(){
        super();
        scanner = new Scanner(System.in);
    }
   public void nhapBanKinh(){
    System.out.println("Ban dung don vi tinh nao: ");
    System.out.println("\t1 - Centimet");
    System.out.println("\t2 - inch");
    Configs.donVi= scanner.nextInt();

    System.out.println("Hay nhap vao ban kinh hinh tron: ");
    bankinh= scanner.nextFloat();
   } 
   public void inThongTin(){
    if(Configs.donVi==Configs.DON_VI_CM){
        System.out.println("Hinh tron co ban kinh "+bankinh+" cm");
        System.out.println("Tuong duong "+Configs.chuyenCentimetSangInch(bankinh)+" inch");
   }else{
        System.out.println("Hinh tron co ban kinh "+bankinh+" inch");
        System.out.println("Tuong duong "+Configs.chuyenInchSangCentimet(bankinh)+" cm");
   }
}
}
