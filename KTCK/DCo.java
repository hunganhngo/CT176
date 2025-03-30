package CT176.KTCK;
import java.util.Scanner;
public class DCo {
    private String ten, ngay;
    private float dtich;

    public static Scanner sc = new Scanner(System.in);

    public DCo() {
        ten = "";
        dtich = 0f;
        ngay = "";
    }

    public DCo(DCo dc) {
        ten = dc.ten;
        dtich = dc.dtich;
        ngay = dc.ngay;
    }

    public void nhap() {
        ten = sc.nextLine();
        dtich = sc.nextFloat();
        sc.nextLine();
        ngay = sc.nextLine();
    }

    public void in() {
        System.out.println(ten+"---"+dtich+"---"+ngay);
    }

    public static void main(String[] args) {
        DCo d1 = new DCo();
        d1.nhap();
        d1.in();
        DCo d2 = new DCo(d1);
        d2.in();
    }

    public String layNgay() {
        return ngay;
    }

    public int layThang(String ngay) {
        return Integer.parseInt(ngay.substring(2,3));
    }

    public int layNam(String ngay) {
        return Integer.parseInt(ngay.substring(4));
    }
}
