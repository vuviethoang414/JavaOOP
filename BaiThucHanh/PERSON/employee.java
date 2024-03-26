package PERSON;
public class employee extends person{
     public String viTri;
     public String id;
     public int luong=25000;
     public float GioLam;
    //Xuat thong tin vi tri
    public void ViTri(){
        System.out.println("\n\n==== "+viTri+" ===");
    }
    //Them vao ham nhap thong tin
    public void NhapThongTin(){
        super.NhapThongTin();
        System.out.printf("Nhap ma nhan vien : ");
        id=sc.next();
        System.out.printf("Nhap vao so gio lam : ");
        GioLam=sc.nextFloat();
    }
    //them vao ham xuat thong tin
    public void XuatThongTin(){
        super.XuatThongTin();
        System.out.println("ID : "+id);
        System.out.println("Salary : "+luong+"VND");
    }


    
}
