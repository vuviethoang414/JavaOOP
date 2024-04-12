package GETTER_SETTER;

public class MainClass {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.SetBanKinh(10);
        float chuVi=ht.tinhChuVi();
        float dienTich=ht.tinhDienTich();
        System.out.println("Chu vi hinh tron : "+chuVi+" Dien tich hinh tron "+dienTich);
    }
}
