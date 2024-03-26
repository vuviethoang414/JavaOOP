package HINHHOC;
import java.util.Scanner;
public class HINHVUONG extends HINHCHUNHAT{
    HINHVUONG(){
        ten="HINH VUONG";
    }
    //Nhap vao canh
    public void nhapCanh(){
        System.out.print("Nhap vao canh : ");
        Scanner sc = new Scanner(System.in);
       dai=rong=sc.nextFloat();
    }
}
