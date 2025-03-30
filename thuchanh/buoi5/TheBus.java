package buoi5;
import java.util.Scanner;
public class TheBus {
	private String maThe, nph;
	private char loai;
	KHang KH;
	
	public TheBus() {
		KH = new KHang();
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma the: ");
		maThe = sc.nextLine();
		System.out.print("Nhap ngay phat hanh (dd/mm/yy): ");
		nph = sc.nextLine();
		System.out.print("Nhap loai the (H - 1 gio, D - 24 gio, M - 1 thang, Y - 1 nam): ");
		loai = sc.nextLine().charAt(0);
		KH.nhap();
	}
	
	public void in() {
		System.out.print("Ma the: " + maThe + " --- Ngay phat hanh: " + nph + " --- Loai the (H - 1 gio, D - 24 gio, M - 1 thang, Y - 1 nam): " + loai + " --- ");
		KH.in();
	}
	
	@Override
	public String toString() {
		return "Ma the: " + maThe + " --- Ngay phat hanh: " + nph + " --- Loai the (H - 1 gio, D - 24 gio, M - 1 thang, Y - 1 nam): " + loai + " --- " + KH.toString();
	}
	
	public char getLoaiTheBus() {
		return loai;
	}
	
	public String getNPH() {
		return nph;
	}
}
