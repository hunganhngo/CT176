package buoi1;
import java.util.Scanner;
public class Bai8 {
    private int a;
    public void input(Scanner sc) {
        a = sc.nextInt();
    }
    public void output() {
        System.out.print(a + " ");
    }
    public int getValue() {
        return a;
    }
    public void setValue(int value) {
        this.a = value;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int x, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so so nguyen trong danh sach: ");
        int n = sc.nextInt();
        Bai8 List[] = new Bai8[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            List[i] = new Bai8();
            List[i].input(sc);
        }
        System.out.print("Danh sach so nguyen vua nhap la: ");
        for (int i = 0; i < n; i++)
            List[i].output();
        System.out.printf("\nNhap so nguyen x: ");
        x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == List[i].getValue())
                count++;
        }
        System.out.print("So luong so x trong danh sach la: " + count);
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (List[j].getValue() > List[j + 1].getValue()) {
                    int temp = List[j].getValue();
                    List[j].setValue(List[j + 1].getValue());
                    List[j + 1].setValue(temp);
                }
        System.out.printf("\nDanh sach sau khi sap xep tang dan: ");
        for (int i = 0; i < n; i++)
            List[i].output();
        Bai8 newList[] = new Bai8[n + 1];
        int pos = 0;
        while (pos < n && List[pos].getValue() < x) {
            pos++;
        }
        System.arraycopy(List, 0, newList, 0, pos);
        newList[pos] = new Bai8();
        newList[pos].setValue(x);
        System.arraycopy(List, pos, newList, pos + 1, n - pos);
        List = newList;
        n++;
        System.out.printf("\nDanh sach sau khi them x: ");
        for (int i = 0; i < n; i++)
            List[i].output();
        sc.close();
    }
}