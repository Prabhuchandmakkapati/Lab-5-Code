import java.util.Scanner;
public class DivisorCalc {
    public static int gcd(int a, int b){
        if (b != 0)
            return gcd(b, a%b);
        else
            return a;
    }

    public static void main(String args[]) {
        int m, n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value for m: ");
        m = in.nextInt();
        System.out.print("Enter value for n: ");
        n = in.nextInt();
        System.out.println("GCD = "+gcd(m,n));
    }
}