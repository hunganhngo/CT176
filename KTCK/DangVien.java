package CT176.KTCK;
import java.util.Scanner;
public class DangVien {
    private String sothe, hoten, ngaysinh;
    private double heso;
    ChiBo CB;

    public DangVien() {
        sothe = new String();
        hoten = new String();
        ngaysinh = new String();
        heso = 0;
        CB = new ChiBo();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so the: ");
        sothe = sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println("Nhap he so: ");
        heso = sc.nextDouble();
        sc.nextLine();
        CB.nhap();
    }

    public void in() {
        System.out.println("- So the: " + sothe + "\n- Ho va ten: " + hoten + "\n- Ngay sinh: " + ngaysinh + "\n- He so luong: " + heso);
        CB.in();
    }

    public int layNamSinh(String ngaysinh) {
        return Integer.parseInt(ngaysinh.substring(ngaysinh.length() - 4));
    }

    public String layHoTen() {
        return hoten;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong dang vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        DangVien[] dv = new DangVien[n];
        for (int i = 0; i < n; i++) {
            dv[i] = new DangVien();
            System.out.println("Nhap thong tin dang vien thu " + (i+1));
            dv[i].nhap();
        }
        System.out.println("Thong tin cac dang vien vua nhap");
        for (int i = 0; i < n; i++) {
            dv[i].in();
            System.out.println("==========");
        }
        System.out.println("Ho ten cac dang vien sinh sau 1975");
        for (int i = 0; i < n; i++) {
            if (dv[i].layNamSinh(dv[i].ngaysinh) > 1975) {
                System.out.println(dv[i].layHoTen());
                System.out.println("==========");
            }
        }
        System.out.println("Chi bo Mang may tinh va he so luong tren 4.32");
        for (int i = 0; i < n; i++) {
            if ((dv[i].CB.layMaCB().equalsIgnoreCase("mmt")) && (dv[i].heso >= 4.32)) {
                dv[i].in();
                System.out.println("==========");
            }
        }
    }
}
