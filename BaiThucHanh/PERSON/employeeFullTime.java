package PERSON;

public class employeeFullTime extends employee{
    public float NamLam;

    public employeeFullTime(){
        viTri="Nhan vien FullTime";
    }
    //them so nam lam cho nhan vien fulltime
    public void NhapThongTin(int a){
        super.NhapThongTin();
        System.out.printf("Nhap so nam ban da lam viec o cong ty : ");
        NamLam=sc.nextFloat();
        System.out.println("\n\n   HIEN THI THONG TIN(FullTime)");
    }
    //ham tinh luong cho nhan vien full time
    public void TinhLuong(float Namlam){
        if(NamLam>5){
            luong=35000;
            luong*=GioLam;
        }else if(Namlam>3){
            luong=30000;
            luong*=GioLam;
        }else{
            luong=25000;
            luong*=GioLam;
        }
    }
    //hien thi lai ham xuat
    public void XuatThongTin(){
        super.XuatThongTin();
    }
}
