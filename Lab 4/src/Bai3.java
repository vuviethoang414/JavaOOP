import java.util.ArrayList;
import java.util.Scanner;
 class SinhVien{
    String fullname;
    float diem;
    public SinhVien(String fullname,float diem){
     this.fullname=fullname;
     this.diem=diem;

    }
}
public class Bai3 {
    
    public static void main(String[] args) {
        ArrayList<SinhVien> arrayList = new ArrayList<>();
        //Them sinh vien
            while(true){
                Scanner sc = new Scanner(System.in);

                System.out.print("Nhap ten sinh vien (nhap trong de ket thuc) : ");
                String fullname=sc.nextLine();
                if(fullname.isEmpty()){
                    break;
                }
                System.out.print("Nhap diem : ");
                float diem =sc.nextFloat();
                arrayList.add(new SinhVien(fullname, diem));
            }
        
        //Dem so sinh vien phai thi lai va hien thi 
        int dem=0;
        for(SinhVien sv : arrayList){
            if(sv.diem<=5){
                dem++;
                System.out.println("Ten : "+sv.fullname+ " Diem : "+sv.diem);
            }
            System.out.println("So sinh vien phai thi lai la "+dem);

        }
        //tim sinh vien co diem cao nhat
        float maxdiem=0;
        for(SinhVien sv: arrayList){
            if(sv.diem>maxdiem){
                maxdiem=sv.diem;
            }
        }
        //hien thi nhung sinh vien co diem cao nhat
        for(SinhVien sv : arrayList){
            if(maxdiem==sv.diem){
                System.out.println("Ten : "+sv.fullname+ " Diem : "+sv.diem);
            }
        }
        //tim kiem sinh vien theo ten
        Scanner cs = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien can tim kiem : ");
        String ten =cs.nextLine();
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i).fullname.equals(ten)){
                System.out.println("Ten : "+arrayList.get(i).fullname+ " Diem : "+arrayList.get(i).diem);
            }
        }
    }}
        
    
    

    