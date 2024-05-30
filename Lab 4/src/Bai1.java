import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Bai1 {
    public static void main(String[] args) {
    int n;
    ArrayList<Integer> daysonguyen = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao so phan tu : ");
    n=sc.nextInt();
    //Nhap vao cac phan tu
    for(int i=0;i<n;i++){
        System.out.print("Nhap vao phan tu so "+(i+1)+ " : ");
        int songuyen=sc.nextInt();
        daysonguyen.add(i,songuyen);
    }
    //Tim so nguyen lon nhat trong day
    int max=0;
    for(int i=0;i<daysonguyen.size();i++){
        if(daysonguyen.get(i)>max){
            max=daysonguyen.get(i);
        }
    }
    //Nhap vao so nguyen , xoa khoi mang cac phan tu
    int x;
    System.out.print("Nhap vao phan tu tiep theo : ");
    x=sc.nextInt();
    daysonguyen.add(x);
   int vitri= daysonguyen.indexOf(x);
    daysonguyen.remove(vitri);
    Collections.sort(daysonguyen);
    //Hien thi day so nguyen
    System.out.println(daysonguyen);


    
}
}
