package LogicalPrograms;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startInput=sc.nextInt();
        long startTime=0;
        long endTime=0;
            if(startInput==1){
                startTime=System.currentTimeMillis();
            }
            System.out.println("press 2 to stop");
            int stopInput=sc.nextInt();
            if(stopInput==2){
                endTime=System.currentTimeMillis();
                long duration=endTime-startTime;
                System.out.println("Elapsed Time: " + (duration / 1000.0) + " seconds");
            }
        sc.close();
        }
    }
