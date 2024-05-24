package Sets;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class HashSetDemo {
    public static void main(String[] args) {
        Set<Student> HashSetStudent = new HashSet<>();
        boolean nhap = true;
        while(nhap){
            Scanner sc = new Scanner(System.in );
            System.out.println("\t\t\n====Nhap vao phuong thuc (number)===");
            System.out.println("1.Them thong tin sinh vien(nhan phim 1)");
            System.out.println("2.Xoa thong tin sinh vien(nhan phim 2)");
            System.out.println("3.Sua thong tin sinh vien(nhan phim 3)");
            System.out.println("4.Hien thi thong tinh sinh vien(nhan phim 4)");
            System.out.println("5.Exit(nhan5)");
            System.out.print("\t\t\tChon : ");
            int chon =sc.nextInt();
            switch (chon) {
                case 1:
                System.out.println("\n\t===Them sinh vien===");
                System.out.print("Nhap vao so luong sv can them : ");
                int n = sc.nextInt();
                Student.add(HashSetStudent,n);
                    
                    break;
                case 2 :
                System.out.println("\n\t===Xoa thong tin===");
                Student.delete(HashSetStudent);
                break;
                case 3:
                System.out.println("\n\t===Sua thong tin===");
                Student.Update(HashSetStudent);
                break;
                case 4:
                System.out.println("\n\t===Hien thi dach sach===");
                Student.HienThiThongTin(HashSetStudent);
                break;
                case 5:
                nhap = false;
                System.out.println("Thoat thanh cong !");
                break;

            
                default:
                System.out.println("Gia tri nhap vao khong hop le !");
                    break;
            }

        }
    }

}
