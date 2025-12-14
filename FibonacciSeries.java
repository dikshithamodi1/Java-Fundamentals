package LogicalPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0,n2=1;
        int count=1;
        System.out.print(n1+" "+n2);
        while(count<10){
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            count++;
        }
    }
}
