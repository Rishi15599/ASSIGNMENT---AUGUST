//Write a program to print sum of digital number odd place

import java.util.Scanner;
public class PrintSumOfDigitalNumberOddPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digital number :");
        int i=sc.nextInt();
        //int i=23451;
        int count=0;
        int sum=0;
        int rev=0;
        while(i>0){
            int last=i%10;
            rev=(rev*10)+last;
            i=i/10;
        }while(rev>0){
            int last=rev%10;
            count++;
            if(count%2!=0){
                sum=sum+last;
            }
            rev=rev/10;
        }System.out.println("Sum Of Digital Number Odd Place = "+sum);
    }
}
