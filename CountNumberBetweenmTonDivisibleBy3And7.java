//Write a program count the number between M to N (1 to 1000)divisible by 3 and 7

import java.util.Scanner;
public class CountNumberBetweenmTonDivisibleBy3And7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the M :");
        int i=sc.nextInt();
        System.out.println("Eenter the N :");
        int j=sc.nextInt();
        int count1=0;
        int count2=0;
        do{
            if(i%3==0){
                count1++;
            }
            if(i%7==0){
                count2++;
            }
            i++;
        }while(i<=j);
        System.out.println("Total number of Divisible by 3 = "+count1);
        System.out.println("Total number of Divisible by 7 = "+count2);
    }
}
