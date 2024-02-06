import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhap vao so hang so cot cua ma tran
        int sohang,socot;
        System.out.print("Nhap so hang cua ma tran : ");
        sohang=sc.nextInt();
        System.out.print("Nhap so cot cua ma tran : ");
        socot=sc.nextInt();
        int[][] mang=new int[sohang][socot];
        System.out.println("Nhap gia tri cho tung phan tu co trong ma tran : ");
        //Nhap gia tri tung phan tu
        for(int i=0;i<sohang;i++){
            for(int j=0;j<socot;j++){
                System.out.print("Nhap vao phan tu ["+i+"]["+j+"] : ");
                mang[i][j]=sc.nextInt();
            }
        }
        //Hien thi ma tran khi da nhap
        for(int i=0;i<sohang;i++){
            for(int j=0;j<socot;j++){
                System.out.print(+mang[i][j]+" ");
            }
            System.out.println();
        }
        //Tim phan tu co gia tri lon nhat trong ma tran
        int max=mang[0][0];
        for(int i=0;i<sohang;i++){
            for(int j=0;j<socot;j++){
                if(mang[i][j]>max){
                    max=mang[i][j];
                }
            }
        }        
System.out.println("Phan tu lon nhat trong ma tran la : "+max);
sc.close();
    }
}
