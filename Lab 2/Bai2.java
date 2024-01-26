/*Bài 2:
 * Viết chương trình kiểm tra số vừa nhập vào là số chẵn hay số lẻ.
*/
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] agrs){
        //khai báo biến
        int x;
         Scanner scanner = new Scanner(System.in);
         //nhập số nguyên
         System.out.print("Nhap vao so nguyen : ");
         x=scanner.nextInt();
         //kiểm tra chẵn lẻ
         if(x%2==0){
            System.out.println("So nhap vao la so chan !");
         }
         else{
            System.out.println("So nhap vao la so le !");
         }
         scanner.close();
    }
}




