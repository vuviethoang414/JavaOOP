package Lists;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo {
    //Phuong thuc xoa thong tin
    
    public static void delete(ArrayList<Student> listStudent){
        System.out.print("Nhap vao thong tin nguoi dung can xoa : ");
        Scanner sc = new Scanner(System.in);
        String ten =sc.nextLine();
        for(int i=0; i<listStudent.size();i++){
            Student std = new Student();
            std.NhapThongTin();
            listStudent.remove(i);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> ListStuden = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean chon=true;
        
        while (chon) {
            System.out.println("\n\n Moi ban lua chon cac muc duoi day");
            System.out.println("1.Them thong tin sinh vien");
            System.out.println("2.Xoa thong tin sinh vien");
            System.out.println("3.Sua thong tin sinh vien");
            System.out.println("4.Hien thi thong tin sinh vien");
            System.out.println("5.Thoat");
            System.out.print("Moi ban lua chon (number): ");
            int luachon=sc.nextInt();
            switch (luachon) {
                case 1:
                 System.out.println("\n\nNhap vao so phan tu can them : ");
                 int n = sc.nextInt();
                 Student.Add(ListStuden,n);
                    break;
                case 2:
                 ArrayListDemo.delete(ListStuden);
                break;
                case 3:
                Student.Update(ListStuden);
                break;
                case 4:
                Student.HienThiThongTin(ListStuden);
                case 5:
                chon = false;
                break;


            
                default:
                System.out.println("Lua chon khong phu hop");
                    break;
            }
            }


            
            
        }
        

        }

    

