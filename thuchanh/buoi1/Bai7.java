package buoi1;
import java.util.Scanner;
public class Bai7 {
	public static String extractName(String fullName) {
		fullName = fullName.trim();
		int lastSpace = fullName.lastIndexOf(" ");
		if (lastSpace == -1) {
			return fullName;
		}
		return fullName.substring(lastSpace + 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String fullName = sc.nextLine();
		String name = extractName(fullName);
		System.out.print("Your name is " + name);
		sc.close();
	}
}
