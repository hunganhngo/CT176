package buoi4;
import java.util.Scanner;

import buoi3.SinhVien;
public class SinhVienCNTT extends SinhVien {
    private String taikhoan, matkhau, email;
    public SinhVienCNTT() {
        super();
        taikhoan = "B2306513";
        matkhau = "********";
        email = "anhb2306513@student.ctu.edu.vn";
    }
    public SinhVienCNTT(String hoTen, String maSo, buoi2.Date ns, int slhp, String[] thp, String[] dhp, String taikhoan, String matkhau, String email) {
        super(hoTen, maSo, ns, slhp, thp, dhp);
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.email = email;
    }
    public SinhVienCNTT(SinhVienCNTT sv) {
        super(sv);
        this.taikhoan = sv.taikhoan;
        this.matkhau = sv.matkhau;
        this.email = sv.email;
    }
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tai khoan: ");
        taikhoan = sc.nextLine();
        System.out.print("Nhap mat khau: ");
        matkhau = sc.nextLine();
        System.out.print("Nhap email: ");
        email = sc.nextLine();
    }
    // public void hienthi() {
    //     super.hienthi();
    //     System.out.println("Tai khoan: " + taikhoan);
    //     System.out.println("Mat khau: " + matkhau);
    //     System.out.println("Email: " + email);
    // }
    public String toString() {
        return super.toString() + "\nTai khoan: " + taikhoan + "\nMat khau: " + matkhau + "\nEmail: " + email;
    }
    public void doiMatKhau(String newpass) {
        matkhau = newpass;
    }
    public String getEmail() {
        return email;
    }
    public String getTaikhoan() {
        return taikhoan;
    }
}
