package HINHHOC;
import HINHHOC.HINHTRON;
import HINHHOC.HINHTRU;
import HINHHOC.HINHCHUNHAT;
import HINHHOC.HINHVUONG;
public class MainClass {
    public static void main(String[] args) {
        HINHTRON ht= new HINHTRON();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
        HINHTRU htr = new HINHTRU();
        htr.xuatTen();
        htr.nhapChieuCao();
        htr.tinhTheTich();
        htr.inTheTich();
        HINHCHUNHAT hcn =new HINHCHUNHAT();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
        HINHVUONG hv =new HINHVUONG();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
    }
    
}
