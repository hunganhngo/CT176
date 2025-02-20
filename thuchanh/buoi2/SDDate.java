package buoi2;

public class SDDate {
	public static void main(String args[]) {
		Date ngay1 = new Date();
		ngay1.hienThiDate();
		Date ngay2 = new Date(9, 5, 2005);
		ngay2.hienThiDate();
		Date ngay3 = new Date();
		ngay3.nhapDate();
		ngay3.hienThiDate();
		Date ngay4 = ngay3.ngayHomSau();
		ngay4.hienThiDate();
		Date ngay5 = ngay3.congNgay(117);
		ngay5.hienThiDate();
	}
}
