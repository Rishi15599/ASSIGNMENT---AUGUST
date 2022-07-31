//write a program to print the every digit of a given number in reverse order 

import java.util.Scanner;
public class GivenNoReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int i=sc.nextInt();
        //int i=4567;
        while(i>0){
            int last=i%10;
            System.out.print(last);
            i=i/10;
        }
    }
}
