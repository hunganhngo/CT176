package CT176.KTCK;
import java.util.*;
public class CThu extends CNguoi {
    private int so;
    private String vtri, mua, clbo;
    private long bthang;

    public static Scanner sc = new Scanner(System.in);

    public CThu() {
        super();
        so = 0;
        vtri = "";
        mua = "";
        clbo = "";
        bthang = 0l;
    }

    public void nhap(){
        super.nhap();
        so = sc.nextInt();
        sc.nextLine();
        vtri = sc.nextLine();
        mua = sc.nextLine();
        clbo = sc.nextLine();
        bthang = sc.nextLong();
        sc.nextLine();
    }

    public void in() {
        super.in();
        System.out.println(so+"--"+vtri+"--"+mua+"--"+clbo+"--"+bthang);
    }

    public long getBThang() {
        return bthang;
    }

    public String clbo() {
        return clbo;
    }

    public static void main(String[] args) {
        List<CThu> players = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            CThu player = new CThu();
            player.nhap();
            players.add(player);
        }
        for (CThu player : players) {
            player.in();
        }
        
    }
}
