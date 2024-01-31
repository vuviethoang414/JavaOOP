import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //khai bao bien
        String ten;
        int tuoi,namsinh;
    //Nhap vao ho ten va tuoi 
        System.out.print("Ho va ten :");
        ten = sc.nextLine();
        System.out.print("Sinh nam :");
        namsinh =sc.nextInt();
        tuoi=2024-namsinh;
        sc.close();
    //Xuat ra nhom tuoi
        if(tuoi<16){
            System.out.println("Ban "+ten+" o do tuoi vi thanh nien");
        }else{
            if(tuoi>=16 && tuoi<18){
                System.out.println("Ban "+ten+" o do tuoi truong thanh");
            }else{
            System.out.println("Ban "+ten+" da gia");
            }
        }
    }
}
