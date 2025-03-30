package buoi4;

public class SDDiemMau {
    public static void main(String[] args) {
        DiemMau A = new DiemMau(5, 5, "trang");
        System.out.println(A);
        DiemMau B = new DiemMau();
        B.nhapDM();
        B.doiDiem(10, 8);
        B.GanMau("Vang");
        System.out.println(B);
    }
}
