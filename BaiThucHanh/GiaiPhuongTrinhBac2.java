// Giải phương trình bậc 2
import java.util.Scanner;
public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
// Nhập hệ số
    System.out.print("Nhap he so a: "); 
    double a= scanner.nextDouble();
    System.out.print("Nhap he so b: ");
    double b= scanner.nextDouble();
    System.out.print("Nhap he so c: ");
    double c= scanner.nextDouble();
// Điều kiện là phương trình bậc 2
    if(a==0){
        System.out.println("Phuong trinh khong phai phuong trinh bac 2 ! ");    
    }
    else{
    double delta = b*b-4*a*c;
// Các trường hợp nghiệm phương trình
    if(delta<0) {
    System.out.println("Phuong trinh vo nghiem");
    }
    else if(delta==0) {
    double x =-b/(2*a);
    System.out.println("Phuong trinh co nghiem kep x=" + x);
}
   else {
    double x1=(-b + (Math.sqrt(delta)))/(2*a);
    double x2=(-b - (Math.sqrt(delta)))/(2*a);
    System.out.println("Phuong trinh co hai nghiem phan biet");
    System.out.println("x1 =" + x1);
    System.out.println("x2 =" + x2);
   }
 }
   scanner.close();
}
}

