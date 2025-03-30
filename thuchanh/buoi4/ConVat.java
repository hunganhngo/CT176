package buoi4;
import java.util.Scanner;
public abstract class ConVat {
    private String giong, maulong;
    private float cannang;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap giong: ");
        giong = sc.nextLine();
        System.out.print("Nhap mau long: ");
        maulong = sc.nextLine();
        System.out.print("Nhap can nang: ");
        cannang = sc.nextFloat();
    }
    public void hienthi() {
        System.out.println(giong+"/"+maulong+"/"+cannang);
    }
    public abstract void Keu();
}
class De extends ConVat {
    @Override
    public void Keu() {
        System.out.println("Con de keu be be");
    }
}
class Bo extends ConVat {
    @Override
    public void Keu() {
        System.out.println("Con bo keu moo moo");
    }
}
class Heo extends ConVat {
    @Override
    public void Keu() {
        System.out.println("Con heo keu oink oink");
    }
}