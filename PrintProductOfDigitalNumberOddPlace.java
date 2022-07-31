// Write a program to print product of Digital number at odd place

import java.util.Scanner;
public class PrintProductOfDigitalNumberOddPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digital number :");
        int i=sc.nextInt();
        int product=1;
        int rev=0;
        int count=0;
        while(i>0){
            int last=i%10;
            rev=(rev*10)+last;
            i=i/10;
        }while(rev>0){
            int last=rev%10;
            count++;
            if(count%2!=0){
                product=product*last;
            }rev=rev/10;
        }System.out.println(product);
    }
}
