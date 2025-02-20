package buoi1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui long nhap mot ky tu: ");
		char ch = sc.nextLine().charAt(0);
		while (ch != 'q') {
			System.out.println("Ky tu vua nhap la: " + ch);
			System.out.print("Vui long nhap mot ky tu: ");
			ch = sc.nextLine().charAt(0);
		}
		sc.close();
	}
}