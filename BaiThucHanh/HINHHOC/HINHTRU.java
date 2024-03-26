package HINHHOC;
import java.util.Scanner;
public class HINHTRU extends HINHTRON{
    public float chieucao;
    public HINHTRU(){
        ten="HINH TRU";
    }
    //Nhap chieu cao
    public void nhapChieuCao(){
        nhapBanKinh();
        System.out.print("Nhap vao chieu cao : ");
        Scanner sc = new Scanner(System.in);
        chieucao=sc.nextFloat();
    }
    //Tinh the tich
    public void tinhTheTich(){
        tinhDienTich();
        theTich=chieucao*dienTich;
    }
}
