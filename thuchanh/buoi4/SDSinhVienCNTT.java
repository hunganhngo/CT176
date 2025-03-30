package buoi4;
import java.util.*;
public class SDSinhVienCNTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        SinhVienCNTT[] sv = new SinhVienCNTT[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVienCNTT();
            System.out.println("Nhap sinh vien thu " + (i+1) + ": ");
            sv[i].nhap();
            sv[i].nhapDiem();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(sv[i]);
        }
        System.out.println("Nhap email can tim: ");
        String mail = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (sv[i].getEmail().equals(mail)) {
                System.out.println("Tai khoan: "+sv[i].getTaikhoan());
                System.out.println("Ket qua: "+sv[i].ketQua());
            }
        }

        Integer key;
        ArrayList<SinhVienCNTT> value;
        Map<Integer, ArrayList<SinhVienCNTT>> map = new HashMap<>();
        
    }
}
