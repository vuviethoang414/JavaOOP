package GETTER_SETTER;

public class HinhTron {
    private final float PI = 3.14f;
    private float r;
    
    public float GetBanKinh(){
        return r;
    }

    public void SetBanKinh(int r){
        this.r=r;
    }

    public float tinhChuVi(){
        return 2*PI*r;
    }

    public float tinhDienTich(){
        return PI*r*r;
    }
}
