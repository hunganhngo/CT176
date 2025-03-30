package CT176.KTCK;
import java.util.Scanner;
public class CNguoi {
    private String id, hten, ngay;
    private char phai;

    public static Scanner sc = new Scanner(System.in);

    public CNguoi() {
        id = "";
        hten = "";
        ngay = "";
        phai = 'A';
    }

    public CNguoi(CNguoi h) {
        id = h.id;
        hten = h.hten;
        ngay = h.ngay;
        phai = h.phai;
    }

    public void nhap() {
        id = sc.nextLine();
        hten = sc.nextLine();
        ngay = sc.nextLine();
        phai = sc.nextLine().charAt(0);
    }

    public void in() {
        System.out.println(id+"--"+hten+"--"+ngay+"--"+phai);
    }
}
