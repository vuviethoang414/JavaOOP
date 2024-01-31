import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khai bao bien
        int tong=0,n=0;
        String them ="";
        //Vong lap tinh tong cac so da nhap
        while(tong<=100){
            System.out.print("Nhap vao so nguyen :");
            n = sc.nextInt();
            tong+=n;
            them = them + n + " + ";
        }
        //Hien thi ket qua
        them = them.substring(0,them.length()-2);
        System.out.println(them + "= " + tong);
        sc.close();
    }  
}
