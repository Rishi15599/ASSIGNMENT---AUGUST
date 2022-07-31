//write a program to print the digital sum of a number

import java.util.Scanner;
public class PrintTheDigitalSumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        //int i=2345;
        int sum=0;
        int last;
        while(i>0){
            last=i%10;
            sum=sum+last;
            i=i/10;
        }
        System.out.println("Sum of "+sum);

    }
}
