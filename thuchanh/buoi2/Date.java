package buoi2;
import java.util.Scanner;
public class Date {
	int ngay, thang, nam;
	public Date(Date ngaySinh) {
		ngay = thang = nam = 0;
	}
	public Date(int a, int b, int c) {
		ngay = a;
		thang = b;
		nam = c;
	}
	public Date() {
		//TODO Auto-generated constructor stub
	}
	public void hienThiDate() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}
	public boolean hopLe() {
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0))
			max[2] = 29;
		if (ngay > max[thang] || thang > 12 || ngay <= 0 || thang <= 0 || nam <= 0)
			return false;
		return true;
	}
	public void nhapDate() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
		} while (!hopLe());
	}
	public Date ngayHomSau() {
		Date ngayhomsau = new Date(ngay + 1, thang, nam);
		if (!ngayhomsau.hopLe()) {
			ngayhomsau.ngay = 1;
			ngayhomsau.thang++;
			if (ngayhomsau.thang > 12) {
				ngayhomsau.thang = 1;
				ngayhomsau.nam++;
			}
		}
		return ngayhomsau;
	}
	public Date congNgay(int n) {
		Date themnngay = new Date(ngay, thang, nam);
		for (int i = 1; i <= n; i++)
			themnngay = themnngay.ngayHomSau();
		return themnngay;
	}
}
