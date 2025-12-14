import java.util.Scanner;

public class QoutientRemainder {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = dividend/divisor;
        float remainder = dividend%divisor;
        System.out.println("qoutient:"+quotient);
        System.out.println("remainder:"+remainder);
    }
}
