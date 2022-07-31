//Write a program to print number is perfect

import java.util.Scanner;           
public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number !");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=(num/2);i++){
            if(num%i==0){
                sum=sum+i;
            }
        }if(sum==num){
            System.out.println("Number is perfect ");
        }else{
            System.out.println("Number is not perfect");
        }
    }
}
