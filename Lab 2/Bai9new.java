import java.util.Scanner;
public class Bai9new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dem1=0,dem2=0,dem3=0;
        System.out.print("Nhap vao chuoi ki tu bat ki(gom chu cai in hoa,chu cai thuong va so) : ");
        String chuoi = sc.nextLine();
        for(int i=0;i<chuoi.length();i++){
            char kytu=chuoi.charAt(i);
            int maASCII= (int) kytu;
            if(maASCII>=48 && maASCII<=57){
                dem1++;
            }
            if(maASCII>=65 && maASCII<=90){
                dem2++;
            }
            if(maASCII>=97 && maASCII<=122){
                dem3++;
            }
        }
        System.out.println("So ki tu chu so trong chuoi la : "+dem1);
        System.out.println("So ki tu chu cai in hoa trong chuoi la : "+dem2);
        System.out.println("So ki tu chu cai thuong trong chuoi la : "+dem3);
   sc.close();  
}
}
