package buoi5;
import java.util.Scanner;
public class KHang {
	private String ten;
	private boolean gtinh;
	private int nsinh;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho va ten: ");
		ten = sc.nextLine();
		System.out.print("Nhap gioi tinh (true - nam; false - nu): ");
		gtinh = sc.nextBoolean();
		System.out.print("Nhap nam sinh: ");
		nsinh = sc.nextInt();
	}
	
	public void in() {
		System.out.println("Ho va ten: " + ten + " --- Gioi tinh: " + (gtinh ? "Nam" : "Nu") + " --- Nam sinh: " + nsinh);
	}
	
	@Override
	public String toString() {
		return "Ho va ten: " + ten + " --- Gioi tinh: " + (gtinh ? "Nam" : "Nu") + " --- Nam sinh: " + nsinh;
	}
}
