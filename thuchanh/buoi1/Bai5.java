package buoi1;

import java.util.Scanner;

public class Bai5 {
	static void quadraticFormula(double a, double b, double c) {
		double delta = a*a - 4*b*c;
		if (a == 0) {
			System.out.print("Khong phai phuong trinh bac 2!");
		}
		else {
			if (delta == 0) {
				System.out.print("Phuong trinh co nghiem kep: " + -b/(2*a));
			}
			else if (delta > 0) {
				double x1 = (-b + Math.sqrt(delta) / (2*a));
				double x2 = (-b - Math.sqrt(delta) / (2*a));
				System.out.printf("Phuong trinh co hai nghiem la x1 = %.2f va x2 = %.2f", x1, x2);
			}
			else {
				System.out.print("Phuong trinh vo nghiem!");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap he so a, b, c: ");
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		quadraticFormula(a, b, c);
		sc.close();
	}
}
