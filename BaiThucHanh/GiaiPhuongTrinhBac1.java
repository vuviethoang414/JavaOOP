// Giải phương trình bậc 1
import java.util.Scanner;
public class GiaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        // Khai báo biến
        double a ,b ;
        Scanner scanner = new Scanner(System.in);
        // Nhập hệ số
        System.out.print("Nhap a: ");
         a = scanner.nextDouble();
        System.out.print("Nhap b: ");
         b = scanner.nextDouble();
        // Nghiệm của phương trình
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " +x);
        }
        scanner.close();
    }
}
