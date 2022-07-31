//write a program to print product of digital number at even place

import java.util.Scanner;
public class PrintProductOfDigitalNumberevenPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digital number :");
        int i=sc.nextInt();
        //int i=23244;
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
            if(count%2==0){
                product=product*last;
            }rev=rev/10;
        }System.out.println(product);
    }
}
