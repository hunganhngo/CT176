package buoi3;

import java.util.Arrays;
import java.util.Scanner;
public class SDSinhVien {
	public static void main(String[] args) {
		SinhVien A = new SinhVien();
		System.out.println("- Nhap thong tinh sinh Vien A: ");
		A.nhap();
		A.nhapDiem();
		System.out.println("- Thong tinh sinh Vien A: ");
		System.out.print(A);
		String monHoc = new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("- Hay chon mon hoc de them: ");
		monHoc = sc.nextLine();
		A.dangKyHocPhan(monHoc);
		System.out.println("- Thong tinh sinh Vien A sau khi dang ky hoc phan: ");
		System.out.print(A);		
		System.out.print("Hay nhap so luong sinh vien: ");
		int soLuongSinhVien = sc.nextInt();
		SinhVien[] danhSachSinhVien = new SinhVien[soLuongSinhVien];
		for (int i = 0; i < soLuongSinhVien; i += 1) {
			danhSachSinhVien[i] = new SinhVien();
			System.out.println("- Nhap thong tin sinh vien thu " + (i + 1) + ": ");
			danhSachSinhVien[i].nhap();
			danhSachSinhVien[i].nhapDiem();
		}
		for (int i = 0; i < soLuongSinhVien; i += 1) {
			System.out.println("- Thong tin sinh vien thu " + (i + 1) + ": ");
			System.out.print(danhSachSinhVien[i]);
		}		
		String sinhVienDiemCao = new String();
		float diemCaoNhat = -1;
		System.out.println("- Danh sach sinh vien canh cao hoc vu: ");
		for (int i = 0; i < soLuongSinhVien; i += 1) {
			if (danhSachSinhVien[i].diemTrungBinh() > diemCaoNhat) {
				diemCaoNhat = danhSachSinhVien[i].diemTrungBinh();
				sinhVienDiemCao = danhSachSinhVien[i].layHoTen();
			}
			if (danhSachSinhVien[i].diemTrungBinh() < 1.0) {
				danhSachSinhVien[i].in();
			}
		}
		System.out.println("- Sinh vien co diem trung binh cao nhat: " + sinhVienDiemCao);
		System.out.println("- Danh sach sinh vien duoc sap xep theo ten: ");
		Arrays.sort(danhSachSinhVien);
		for (int i = 0; i < soLuongSinhVien; i += 1) {
			danhSachSinhVien[i].in();
		}
		
	}	
}
