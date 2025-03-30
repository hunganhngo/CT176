package buoi3;
import buoi2.Diem;
import java.lang.Math;
public class DoanThang {
	private Diem d1, d2;
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem a, Diem b) {
		d1 = a;
		d2 = b;
	}
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	public void nhap() {
		System.out.println("Nhap diem d1");
		d1.nhapDiem();
		System.out.println("Nhap diem d2");
		d2.nhapDiem();
	}
	public void hienThiMut() {
		System.out.println("Gia tri hai dau mut cua doan thang");
		d1.hienThi();
		d2.hienThi();
	}
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float doDai() {
		return d1.khoangCach(d2);
	}
	public float gocTrucHoanh() {
		return (float)Math.acos(Math.abs(d2.giaTriX() - d1.giaTriX())/this.doDai());
	}
	
}