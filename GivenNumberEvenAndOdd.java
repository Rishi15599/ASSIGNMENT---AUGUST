//Write a program to check wheather the given number even and odd
import java.util.Scanner;
class GivenNumberEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value = ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+" Is Even !");
        }else
        {
            System.out.println(a+" Is Odd !");
        }
    }
}