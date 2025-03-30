package buoi2;
import java.util.Scanner;
public class Diem {
	int x, y;
	public Diem() {
		x = y = 0;
	}
	public Diem(int a, int b) {
		this.x = a;
		this.y = b;
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("x = ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.print("y = ");
		y = sc.nextInt();
		//sc.close();
	}
	public void hienThi() {
		System.out.println("(x, y) = (" + x + ", " + y + ")");
	}
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public int giaTriX() {
		return x;
	}
	public int giaTriY() {
 		return y;
	}
	public float khoangCach() {
		return (float) Math.sqrt(x*x + y*y);
	}
	public float khoangCach(Diem d) {
		return (float) Math.sqrt(Math.pow((d.x - x), 2) + (d.y - y)*(d.y - y));
	}
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
