 import java.util.Scanner;
 public class Employee {
    Scanner sc = new Scanner(System.in);
    String maNV,name;
    int luong,phucap,tongket;
    void NhapThongTinNV(){
        System.out.print("Ho va ten : ");
        name=sc.nextLine();
        System.out.print("Ma NV :");
        maNV=sc.nextLine();
        System.out.print("Luong :");
        luong=sc.nextInt();
        System.out.print("Phu cap :");
        phucap=sc.nextInt();
        sc.close();
    }
    
    void TinhLuong(){
        tongket=luong+phucap;
    }

    void InThongTin(){
        System.out.println("Ho va ten: "+name+" - "+maNV);
        System.out.println("Luong nhan duoc: "+tongket);
    }
    
    }
      

