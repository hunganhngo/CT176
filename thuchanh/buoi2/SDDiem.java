package buoi2;

public class SDDiem {
	public static void main(String args[]) {
		Diem A = new Diem(3, 4);
		A.hienThi();
		Diem B = new Diem();
		B.nhapDiem();
		B.hienThi();
		Diem C = new Diem(-B.x, -B.y);
		C.hienThi();
		float D = B.khoangCach();
		System.out.println(D);
		float E = C.khoangCach(A);
		System.out.print(E);
	}
}
