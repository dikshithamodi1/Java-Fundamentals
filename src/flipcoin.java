import java.util.Scanner;

public class flipcoin {
    public  static void main(String[] args){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of flip:");
    n = sc.nextInt();
    int t=0;
    int h=0;//head
    if (n>=0){
        System.out.println("entered number is positive");
    }
    else{
        System.out.println("enter number is negative");
        System.exit( 0);
    }
    for(int i=1;i<=n;i++){
        double generate=Math.random();
    if(generate<0.5){
        t=t+1;
    }
    else{
        h=h+1;
}
    }
        System.out.println("no of heads:"+h);
        System.out.println("no of tails:"+t);
        double headpercent=(double) h/n*100;
        double tailpercent=(double) t/n*100;
        System.out.println("head percentage:"+headpercent);
        System.out.println("tail percentage:"+tailpercent);
    }}
