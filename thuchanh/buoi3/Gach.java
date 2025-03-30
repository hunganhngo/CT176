package buoi3;

import java.util.Scanner;






public class Gach {
	private String maso, mau;
	private int soluong, chieudai, chieungang; // so luong gach cho mot hop
	private long gia;  // gia mot hop
	public Gach() {
		maso = new String();
		mau = new String();
		soluong = 0;
		chieudai = 0;
		chieungang = 0;
		gia = 0;
	}
	public Gach(Gach s) {
		this.maso = new String(s.maso);
		this.mau = new String(s.mau);
		this.soluong = s.soluong;
		this.chieudai = s.chieudai;
		this.chieungang = s.chieungang;
		this.gia = s.gia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hay nhap ma so cho gach: ");
		maso = sc.nextLine();
		System.out.print("Hay nhap mau cho gach: ");
		mau = sc.nextLine();
		System.out.print("Hay nhap so luong vien gach: ");
		soluong = sc.nextInt();
		System.out.print("Hay nhieu chieu dai: ");
		chieudai = sc.nextInt();
		System.out.print("Hay nhap chieu rong: ");
		chieungang = sc.nextInt();
		System.out.print("Hay nhap gia: ");
		gia = sc.nextLong();
	}
	public void hienThi() {
		System.out.println("- Ma so: " + maso + "\n"
				+ "- Mau: " + mau + "\n"
				+ "- So luong: " + soluong + "\n"
				+ "- Chieu dai: " + chieudai + "\n"
				+ "- Chieu ngang: " + chieungang + "\n"
				+ "- Gia ban: " + gia);
	}
	public float giaBanLe() {
		return ((float)1.0 * gia) / soluong + (((float)1.0 * gia) / soluong) * 20 / 100; 
	}
	public long dienTich() {
		return (long)chieudai * chieungang * soluong;
	}
	int soLuongHop(int D, int N) {
		return D * N / (int)dienTich();
	}
	float giaTienChiaDienTich() {
		if (dienTich() == 0) return 0;
		else return (float)gia / dienTich();
	}
	public long layGia() {
		return gia;
	}
}
