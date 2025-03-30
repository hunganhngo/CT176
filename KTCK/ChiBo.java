/*  Ho ten: Ngo Hung Anh
    MSSV: B2306513
    So de: 02
    So may: 22
*/
package CT176.KTCK;
import java.util.Scanner;
public class ChiBo {
    private String macb, tencb;
    private int slg;

    public ChiBo() {
        macb = "";
        tencb = "";
        slg = 0;
    }

    public ChiBo(String macb, String tencb, int slg) {
        this.macb = macb;
        this.tencb = tencb;
        this.slg = slg;
    }
    
    public ChiBo(ChiBo cb) {
        macb = cb.macb;
        tencb = cb.tencb;
        slg = cb.slg;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so chi bo: ");
        macb = sc.nextLine();
        System.out.print("Nhap ten chi bo: ");
        tencb = sc.nextLine();
        System.out.print("Nhap so luong dang vien: ");
        slg = sc.nextInt();
        sc.nextLine();
    }

    public void in() {
        System.out.println("- Ma so chi bo: " + macb + "\n- Ten chi bo: " + tencb + "\n- So dang vien: " + slg);
    }

    public static void main(String[] args) {
        ChiBo cb1 = new ChiBo();
        cb1.nhap();
        cb1.in();
        ChiBo cb2 = new ChiBo(cb1);
        cb2.in();
    }

    public String layMaCB() {
        return macb;
    }
}
