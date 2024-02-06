import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kitu;
        int dem=0;
        do{
            System.out.print("Nhap vao chuoi : ");
            chuoi = sc.nextLine();
            System.out.print("Nhap vao ki tu can tim : ");
            kitu= sc.next().charAt(0);
            for(int i=0;i<chuoi.length();i++){
                if(chuoi.charAt(i)==kitu){
                    dem++;
                }
            }
            System.out.println("So lan xuat hien cua ki tu la : "+dem);
        }
        while(chuoi.length()>80);   
            sc.close();
    }
}
