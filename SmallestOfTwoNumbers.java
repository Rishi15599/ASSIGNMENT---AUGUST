//Write a program to print smallest of two numbers

import java.util.Scanner;
public class SmallestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //int num1=45;
        //int num2=56;
        if(num1<num2){
            System.out.println("num1 is smallest and my number is = "+num1);
        }else{
            System.out.println("num2 is smallest and my number is = "+num2);
        }
    }
}
