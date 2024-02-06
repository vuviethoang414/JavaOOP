import java.util.Scanner;
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu trong mang : ");
        int n=sc.nextInt();
        int[] mang=new int[n];
        String daybandau="",daytangdan="";
        for(int i=0;i<n;i++){
            System.out.print("Nhap vao phan tu thu "+(i+1)+ " : ");
            mang[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            daybandau+=mang[i] + ";";
        }
          daybandau=daybandau.substring(0,daybandau.length()-1);
          System.out.println("Mang so ban dau la : "+daybandau);
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(mang[j]>mang[j+1]){
                    int doicho=mang[j];
                    mang[j]=mang[j+1];
                    mang[j+1]=doicho;
                }
            }
        }
        for(int i =0;i<n;i++){
         daytangdan+=mang[i] + ";";
        }
        daytangdan=daytangdan.substring(0,daytangdan.length()-1);
        System.out.print("Mang so da sap xep theo thu tu tang dan la : "+daytangdan);
    }
}
