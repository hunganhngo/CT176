package buoi3;
import java.util.Scanner;
import buoi2.Date;

public class SinhVien implements Comparable<SinhVien> {
	private String mssv, hoTen;
	private Date ngaySinh;
	private int soLuongHocPhan;
	String[] tenHocPhan, diemHocPhan;
	public SinhVien() {
		mssv = new String();
		hoTen = new String();
		ngaySinh = new Date();
		soLuongHocPhan = 0;
		tenHocPhan = new String[60];
		diemHocPhan = new String[60];
	}
    public SinhVien(String ms, String ht, Date ns, int slhp, String[] thp, String[] dhp) {
        mssv = ms;
        hoTen = ht;
        ngaySinh = new Date(ns);
        soLuongHocPhan = slhp;
        tenHocPhan = new String[60];
        diemHocPhan = new String[60];
        for (int i = 0; i < soLuongHocPhan; i += 1) {
            tenHocPhan[i] = new String(thp[i]);
            diemHocPhan[i] = new String(dhp[i]);
        }
    }
	public SinhVien(SinhVien S) {
		mssv = new String(S.mssv);
		hoTen = new String(S.hoTen);
		ngaySinh = new Date(S.ngaySinh);
		soLuongHocPhan = S.soLuongHocPhan;
		for (int i = 0; i < soLuongHocPhan; i += 1) {
			tenHocPhan[i] = new String(S.tenHocPhan[i]);
			diemHocPhan[i] = new String(S.diemHocPhan[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hay nhap MSSV: ");
		mssv = sc.nextLine();
		System.out.print("Hay nhap ho va ten sinh vien: ");
		hoTen = sc.nextLine();
		ngaySinh.nhapDate();
		System.out.print("Hay nhap so luong hoc phan: ");
		soLuongHocPhan = sc.nextInt();
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < soLuongHocPhan; i += 1) {
			System.out.print("Hay nhap mon hoc thu " + (i + 1) + ": ");
			tenHocPhan[i] = new String();
			tenHocPhan[i] = sc.nextLine();
			System.out.print("Hay nhap diem mon " + tenHocPhan[i] + " : ");
			diemHocPhan[i] = new String();
			diemHocPhan[i] = sc.nextLine();
		}	
	}
	public void in() {
		System.out.println("Ho va Ten: " + hoTen + " " + "MSSV: " + mssv);
	}
	public String toString() {
		String s = new String("Ma so sinh vien: " + mssv + "\n"
				+ "Ho va Ten: " + hoTen + "\n"
				+ "Ngay sinh: " + ngaySinh + "\n");
		s += "Cac mon hoc: \n";
		for (int i = 0; i < soLuongHocPhan; i += 1) {
			s += ("Mon hoc thu " + (i + 1) + " la " + tenHocPhan[i] + ": " + diemHocPhan[i] + "\n");
		}
		return s;			
	}
	public float diemTrungBinh() {
		float dtb = 0;
		for (int i = 0; i < soLuongHocPhan; i += 1) {
			if (diemHocPhan[i].equals("A")) {
				dtb += 4;
			} else if (diemHocPhan[i].equals("B+")) {
				dtb += 3.5;
			} else if (diemHocPhan[i].equals("B")) {
				dtb += 3;
			} else if (diemHocPhan[i].equals("C+")) {
				dtb += 2.5;
			} else if (diemHocPhan[i].equals("C")) {
				dtb += 2;
			} else if (diemHocPhan[i].equals("D+")) {
				dtb += 1.5;
			} else if (diemHocPhan[i].equals("D")) {
				dtb += 1;
			} else {
				dtb += 0;
			}
		}
		dtb /= (1.0 * soLuongHocPhan);
		return dtb;
	}
	public void dangKyHocPhan(String hocPhan) {
		if (soLuongHocPhan < 60) {
			tenHocPhan[soLuongHocPhan] = new String(hocPhan);
			diemHocPhan[soLuongHocPhan] = new String("F");
			soLuongHocPhan += 1;
		} else {
			System.out.println("Da qua so tin chi toi da cho mot hoc ky!");
		}
	}
	public void xoaHocPhan(String hocPhan) {
	    if (soLuongHocPhan > 0) {
	        int i;
	        for (i = 0; i < soLuongHocPhan; i += 1) {
	            if (tenHocPhan[i].equals(hocPhan)) {
	                break;
	            }
	        }
	        if (i < soLuongHocPhan) {
	            for (int j = i; j < soLuongHocPhan - 1; j += 1) {
	                tenHocPhan[j] = tenHocPhan[j + 1];
	                diemHocPhan[j] = diemHocPhan[j + 1];
	            }
	            soLuongHocPhan -= 1;
	        } else {
	            System.out.println("Khong tim thay hoc phan can xoa!");
	        }
	    } else {
	        System.out.println("Khong the xoa do khong du hoc phan !");
	    }
	}
	public String layMSSV() {
		return mssv;
	}
	public String layHoTen() {
		return hoTen;
	}
	public String layTen() {
		String[] hoVaTen = hoTen.split(" ");
		String ten = hoVaTen[hoVaTen.length - 1];
		return ten;
	}
	public String ketQua() {
		String s = "";
		for (int i = 0; i < soLuongHocPhan; i++) {
			s += tenHocPhan[i] + " - " + diemHocPhan[i] + "\n";
		}
		return s;
	}
	public int compareTo(SinhVien o) {
		return hoTen.compareTo(o.hoTen);
	}
}