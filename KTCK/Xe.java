package CT176.KTCK;
import java.util.Scanner;
public class Xe {
    private String so, ten;
    private long gia;
    private char tthai;
    DCo d;

    public Xe() {
        so = "";
        ten = "";
        gia = 0l;
        tthai = 'K';
        d = new DCo();
    }

    public static Scanner sc = new Scanner(System.in);

    public void nhap() {
        so = sc.nextLine();
        ten = sc.nextLine();
        gia = sc.nextLong();
        sc.nextLine();
        tthai = sc.nextLine().charAt(0);
        d.nhap();
    }

    public void in() {
        System.out.println(so+"---"+ten+"---"+gia+"---"+tthai);
        d.in();
    }

    public char layTThai() {
        return tthai;
    }

    public long layGia() {
        return gia;
    }

    public double layLePhiTruocBa() {
        return (double)gia*10/100;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Xe[] ds1 = new Xe[n];
        for (int i = 0; i < n; i++) {
            ds1[i] = new Xe();
            ds1[i].nhap();
        }
        for (int i = 0; i < n; i++) {
            ds1[i].in();
        }

        for (Xe x : ds1) {
            if (x.layTThai() == 'K' || x.layGia() < 10000000) {
                x.in();
            }
        }
        double s = 0;
        for (Xe x : ds1) {
            if (x.d.layNam(x.d.layNgay()) < 2020) {
                if (x.d.layThang(x.d.layNgay()) < 10) {
                    s += x.layLePhiTruocBa();
                }
            }
        }
        System.out.printf("Tong la: " + s);
    }
}