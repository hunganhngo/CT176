package buoi4;
import java.util.Scanner;
public class SDConVat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong con vat: ");
        int n = sc.nextInt();
        int choice;
        ConVat[] cv = new ConVat[n];
        for (int i = 0; i < n;  i++) {
            System.out.println("Nhap con vat (0 - bo, 1 - de, 2 - heo)");
            choice = sc.nextInt();
            if (choice == 0) {
                cv[i] = new Bo();
            } else if (choice == 1) {
                cv[i] = new De();
            } else {
                cv[i] = new Heo();
            }
            //cv[i].nhap();
        }
        for (int i = 0; i < n; i++) {
            cv[i].Keu();2
            //if (cv[i] instanceof Bo)
            // if (cv[i].getClass().equals(Heo.class))
            //     cv[i].Keu();
        }
    }
}
