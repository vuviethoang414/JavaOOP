import java.util.Scanner;
public class Side16chuong3 {
        final float Pi=3.14f;
        float cv,dt,r;
        Scanner sc = new Scanner(System.in); 
        
        void nhapBanKinh(){
            System.out.print("Nhap vao ban kinh r: ");
            r=sc.nextFloat();
            sc.close();
        } 

        void tinhchuvi(){
            cv=r*2*Pi;
        }
        
        void tinhdientich(){
            dt=r*r*Pi;
        }
        
        void inchuvi(){
            System.out.println("Chu vi cua hinh tron la: "+cv);
        }

        void indientich(){
            System.out.println("Dien tich cua hinh tron la: "+dt);
        }
    }


