package buoi1;
import java.util.Scanner;
public class Bai4 {
    public static int checkInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Not an interger. Please try again: ");
            sc.next();
        }
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = checkInt(sc);
        System.out.print("Nhap b: ");
        int b = checkInt(sc);
        System.out.println("Tong a va b la: " + (a + b));
        sc.close();
    }
}
