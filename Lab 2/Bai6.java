import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i=1;
        long giaithua=1;
        System.out.print("Nhap vao so nguyen n :");
        n=sc.nextInt();
        while(i<=n){
            giaithua=giaithua*i;
            i++;
        }
        System.out.println("n! = " +giaithua);
        sc.close();
    }
}
