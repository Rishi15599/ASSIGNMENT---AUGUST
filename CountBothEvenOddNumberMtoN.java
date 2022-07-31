//Write a program count both even odd number m to n (50 to 1000)

import java.util.Scanner;
public class CountBothEvenOddNumberMtoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the  M :");
        int i =sc.nextInt();
        System.out.println("Enter the N");
        int j =sc.nextInt();
        int count1=0;
        int count2=0;
        do{
            if(i%2==0)
            {
                count1++;
            }else
            
            {
                count2++;
            }
            i++;
        }while(i<=j);
        
        System.out.println("Total even numbers are = "+count1);
        System.out.println("Total odd numbers are = "+count2);
    }
}
