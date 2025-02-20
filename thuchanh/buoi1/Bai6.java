package buoi1;
import java.util.Scanner;
public class Bai6 {
	public static int checkPrime(int n) {
		int i = 2, flag = 1;
		while ((i <= Math.sqrt(n)) && (flag != 0)) {
			if (n % i == 0) {
				flag = 0;
			}
			i++;
		}
		if (flag != 0) {
			//System.out.print("Is prime");
			return 1;
		}
		else {
			//System.out.print("Is not prime");
			return 0;
		}
	}
	/*public static void decimalToBinary(int n) {
		System.out.print("Binary string: ");
		StringBuilder binary = new StringBuilder();
		while (n != 0) {
			int i = n % 2;
			binary.insert(0, i);
			n = n / 2;
		}
		System.out.print(binary.toString());
		System.out.print("\n");
	}*/
	public static int sumDigits(int n) {
		int S = 0;
		while (n != 0) {
			int i = n % 10;
			S += i;
			n = n / 10;
		}
		return S;
	}
	public static void primeFactorList(int n) {
		System.out.print("Prime factor(s) list: ");
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				if (checkPrime(i) == 1) {
					System.out.print(i);
					System.out.print(" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type n: ");
		int n = sc.nextInt();
		if (checkPrime(n) == 1) { 
			System.out.print(n + " is Prime\n"); 
		} 
		else { 
			System.out.print(n + " is not Prime\n"); 
		}
		//decimalToBinary(n);
		System.out.println("Binary string: " + Integer.toBinaryString(n));
		System.out.print("The sum of digits in n: ");
		System.out.print(sumDigits(n));
		System.out.print("\n");
		primeFactorList(n);
		sc.close();
	}
}
