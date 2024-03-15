import java.util.Scanner;
public class Student {
    String ten;
    String msv;
    float diemA,diemB,diemC,diemtong=0;
    Scanner sc = new Scanner(System.in);
     
    void NhapThongTin(){
        System.out.print("Ho va ten: ");
        ten=sc.nextLine();
        System.out.print("MSV: ");
        msv=sc.nextLine();
        System.out.print("Diem A: ");
        diemA=sc.nextFloat();
        System.out.print("Diem B: ");
        diemB=sc.nextFloat();
        System.out.print("Diem C: ");
        diemC=sc.nextFloat();
        sc.close();
    }
    
    void TinhDiemTongKet(){
        diemtong= diemA*0.6f +diemB*0.3f +diemC*0.1f;
    }
    void inThongTin(){
        System.out.println("Ho va ten: "+ten);
        System.out.println("MSV: "+msv);
        System.out.println("Diem A: "+diemA);
        System.out.println("Diem B: "+diemB);
        System.out.println("Diem C: "+diemC);
        System.out.println("Diem tong: "+diemtong);
    }
    public static void main(String[] args) {
        Student cs = new Student();
        Employee demo = new Employee();
        cs.NhapThongTin();
        cs.TinhDiemTongKet();
        cs.inThongTin();
            
            demo.NhapThongTinNV();
            demo.TinhLuong();
            demo.InThongTin();
        }
    }



