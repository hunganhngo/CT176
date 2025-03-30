package buoi5;
import java.util.Scanner;
public class mainTheBus {
	public static void main(String[] args) {
		
		System.out.print("Nhap n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		TheBus[] ds1 = new TheBus[n];
		
		for (int i = 0; i < n; i++) {
			ds1[i] = new TheBus();
			ds1[i].nhap();
		}
		
		System.out.println("Danh sach cac the");
		for (int i = 0; i < n; i++) {
			System.out.println(ds1[i]);
		}
		
		System.out.println("Danh sach cac the co han la 1 nam");
		for (int i = 0; i < n; i++) {
			if (ds1[i].getLoaiTheBus() == 'Y')
				System.out.println(ds1[i]);
		}
		
		System.out.println("Danh sach cac the phat hanh ngay 20/05/22");
		for (int i = 0; i < n; i++) {
			if (ds1[i].getNPH().equals("20/05/22"))
				System.out.println(ds1[i]);
		}
	}

}
