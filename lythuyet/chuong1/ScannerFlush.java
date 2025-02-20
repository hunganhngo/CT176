import java.util.Scanner;
public class ScannerFlush {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        String name;
        long ID;
        System.out.print("Enter your ID: ");
        ID = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.println("ID: " + ID + ", name: " + name);
        sc.close();
    }
}
