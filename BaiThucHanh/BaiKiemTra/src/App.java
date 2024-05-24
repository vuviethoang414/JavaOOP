import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<Student> ArrayListStudent = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean nhap = true;
        while (nhap) {
            System.out.print("\n\n\tMoi ban lua chon (number)");
            System.out.println("1.Them thong tin");
            System.out.println("2.Sua thong tin");
            System.out.println("3.Xoa thong tin");
            System.out.println("4.Hien thi thong tin");
            System.out.println("5.Thoat");
            System.out.print("\nNhap :");
            int chon =sc .nextInt();
            switch(chon){
                case 1:
                System.out.print("Nhap vao so luong can them : ");
                int n = sc.nextInt();
                Student.ThemThongTin(ArrayListStudent,n);
                break;
                case 2:
                Student.SuaThongTin(ArrayListStudent);
                break;
                case 3:
                Student.XoaThongTin(ArrayListStudent);
                break;
                case 4:
                Student.HienThiThongTin(ArrayListStudent);
                break;
                case 5:
                nhap = false;
                System.out.println("Thoat thanh cong !");
                break;
                default:
                System.out.println("Nhap vao khong hop le !");
                break;
            }
            
            
        }
    }
}
