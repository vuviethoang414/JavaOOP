package PERSON;

import HINHHOC.MainClass;

public class employeePartTime extends employee {
    public employeePartTime(){
        viTri="Nhan vien PartTime"; 
    }
    //them vao nhap gio lam
    public void NhapThongTin(){
        super.NhapThongTin();
        System.out.println("\n\n   HIEN THI THONG TIN(PartTime)");
    }
    //tinh Luong nhan duoc
    public void TinhLuong(){
        luong*=GioLam;
    }   
}
