import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n,x,tong=0;
        float tb=0;
        System.out.print("So phan tu cua day so : ");
        n=sc.nextInt();

    for(int i=1;i<=n;i++){
        System.out.print("Nhap vao phan tu thu "+i+" : ");
        x=sc.nextInt();
        tong+=x;
    }
    tb=tong/n;
    System.out.println("Trung binh cong cua day so la : "+tb);
    sc.close();
}
}