package LogicalPrograms;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

    // Static function to generate random number
    static int getRandom(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of coupons: ");
        int num = sc.nextInt();

        boolean[] collected = new boolean[num]; // track distinct coupons
        int count = 0;        // distinct coupons collected
        int randomCount = 0;  // total random numbers generated

        while (count < num) {
            int value = getRandom(num);
            randomCount++;

            // if coupon not collected yet
            if (!collected[value]) {
                collected[value] = true;
                count++;
            }
        }

        System.out.println("Total random numbers needed: " + randomCount);
        sc.close();
    }
}
