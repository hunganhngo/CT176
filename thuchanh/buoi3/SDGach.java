package buoi3;
import java.util.Scanner;




public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hay nhap so luong loai gach: ");
		int n; n = sc.nextInt();
		Gach[] danhSachGach = new Gach[n];
		for (int i = 0; i < n; i += 1) {
			danhSachGach[i] = new Gach();
			System.out.println("Hay nhap thong tin cho hop gach thu " + (i + 1) + ": ");
			danhSachGach[i].nhap();
		}
		for (int i = 0; i < n; i += 1) {
			System.out.println("* Thong tin hop gach thu " + (i + 1) + ": ");
			danhSachGach[i].hienThi();
		}
		Gach A = new Gach();
		for (int i = 0; i < n; i += 1) {
			if (danhSachGach[i].giaTienChiaDienTich() > A.giaTienChiaDienTich()) {
				A = new Gach(danhSachGach[i]);
			}
		}
		System.out.println("Loai gach re nhat la: ");
		A.hienThi();
		System.out.println("So tien cho tung loai gach khi lot cho 100m^2 la");
		for (int i = 0; i < n; i += 1) {
			System.out.println("Hop gach thu " + (i + 1) + ": " + danhSachGach[i].soLuongHop(100, 20) * danhSachGach[i].layGia());
		}
	}
}
