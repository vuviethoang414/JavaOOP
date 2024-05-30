import java.util.LinkedList;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu : ");
        n=sc.nextInt();
        LinkedList<Integer> daysonguyen =new LinkedList<>();
        for(int i =0;i<n;i++){
            System.out.print("Nhao vao phan tu so "+(i+1)+" : ");
            int songuyen=sc.nextInt();
            daysonguyen.add(songuyen);
        }
        //tinh trung binh cong cac so chan
        int dem =0;
        float tb=0;
        for(Integer std : daysonguyen){
            if(std%2==0){
                tb+=std;
                dem++;
            }
        }
        tb=tb/dem;
        System.out.println("Trung binh cac so chan co trong day so la : "+tb);
    }
    
}
