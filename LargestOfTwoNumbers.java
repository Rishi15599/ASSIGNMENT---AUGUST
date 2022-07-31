//Write a program to print largest of two numbers


import java.util.Scanner;
public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number :");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("1st number is is largest and my number = "+num1);

        }else{
            System.out.println("2nd number is largest and my number = "+num2);
        }
    }
}
