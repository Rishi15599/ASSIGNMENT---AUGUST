//write a program to count the digits of a numbers 

import java.util.Scanner;
public class CountTheDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eenter the number :");
        int i=sc.nextInt(); 
        //int i=4567;
        int count=0;
        while(i>0){
            count++;
            i=i/10;

        }
        System.out.println("Total number of digit : "+count);
    }
}
