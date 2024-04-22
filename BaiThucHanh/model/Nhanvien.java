package model;

public class Nhanvien {
    protected String ten;
    protected long luong;
    public Nhanvien(){

    }
    public Nhanvien(String ten){
        this.ten = ten ;
    }
    protected String loaiNhanVien(){
        //Lop con phai overide de lo vu loai nhan vien nay
        return "";
    }
    public void XuatThongTin(){
        System.out.println("===Nhan vien: "+ten+" ====");
        System.out.println("-Loai nhan vien: "+loaiNhanVien());
        System.out.println("-Luong: "+luong+" VND");
    }
}
