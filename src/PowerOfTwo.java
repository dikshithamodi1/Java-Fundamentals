import java.util.Scanner;

public class PowerOfTwo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0 && n<31){
            System.out.println("valid input");
            for(int i=0;i<=n;i++){
            double pow=Math.pow(2,i);
            System.out.println(pow);}
        }else {
            System.out.println("invalid input");
        }
    }
}
