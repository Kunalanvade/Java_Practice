import java.util.Scanner;

public class fibonachi_series {
    public static void main(String[] args) {
        System.out.println("enter value of fibonachi series ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        System.out.println();

        for (int i = 2; i < n; i++) {
            int fib = f1 + f2;
            System.out.println(fib);
            f1 = f2;
            f1= fib;

        }
    }

}
