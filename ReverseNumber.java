//Wrie a program to print reverse number

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        //int i=23456;
        int rev=0;
        while(i>0){
            int last=i%10;
            rev=(rev*10)+last;
            i=i/10;
        }System.out.println(rev);
    }
}
