package buoi3;
import buoi2.Diem;
public class SDDoanThang {
	public static void main(String[] args) {  
		Diem A = new Diem(2, 5), B = new Diem(20, 35);
		DoanThang AB = new DoanThang(A, B);
		System.out.println("Chieu dai AB truoc tinh tien: " + AB.doDai());
		AB.tinhTien(5, 3000);
		System.out.println("Chieu dai AB sau khi tinh tien: " + AB.doDai());
		DoanThang CD = new DoanThang();
		System.out.println("Nhap thong tin doan thang CD");
		CD.nhap();
		System.out.println("Do dai CD: " + CD.doDai());
		System.out.println("Goc CD voi Ox: " + CD.gocTrucHoanh());
    }

}