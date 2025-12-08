import java.util.Scanner;

public class SwapTwoNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("swapping variables method 1");
        System.out.println("first number:"+m);
        System.out.println("second number:"+n);

        System.out.println("swapping variables method 2");
        int temp=n;
        n=m;
        m=temp;
        System.out.println("first number:"+n);
        System.out.println("second number:"+m);
    }
}
