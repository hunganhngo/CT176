public class Fibonacci {
    public static void main(String[] args) {
        int fibo[] = new int [11];
        fibo[0] = fibo[1] = 1;
        for (int i = 2; i <= 10; i++)
            fibo[i] = fibo[i-1] + fibo[i-2];
        for (int i = 0; i <= 10; i++)
            System.out.print(fibo[i] + " ");
    }
}
