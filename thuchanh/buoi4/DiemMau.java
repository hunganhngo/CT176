package buoi4;
import buoi2.Diem;
import java.util.Scanner;
public class DiemMau extends Diem {
    private String mau;
    public DiemMau() {
        super();
        mau = "trang";
    }
    public DiemMau(int x, int y, String m) {
        super(x, y);
        mau = m;
    }
    public void nhapDM() {
        Scanner sc = new Scanner(System.in);
        super.nhapDiem();
        System.out.println("Nhap mau: ");
        mau = sc.nextLine();
    }
    public void hienthi() {
        super.hienThi();
        System.out.println("Mau: " + mau);
    }
    public String toString() {
        return super.toString()+"--Mau: "+mau;
    }
    public void GanMau(String mau) {
        this.mau = mau;
    }
}
