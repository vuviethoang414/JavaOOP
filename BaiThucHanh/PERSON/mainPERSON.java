package PERSON;
import PERSON.employeeFullTime;
import PERSON.employeePartTime;

public class mainPERSON {
    public static void main(String[] args) {
        employeePartTime pt = new employeePartTime();
        pt.ViTri();
        pt.NhapThongTin();
        pt.TinhLuong();
        pt.XuatThongTin();
        
        employeeFullTime ft = new employeeFullTime();
        ft.ViTri();
        ft.NhapThongTin(9);
        ft.TinhLuong(ft.NamLam);
        ft.XuatThongTin();
    }
}
