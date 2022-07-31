//Write a program to cheak digital sum and product is equal or not

import java.util.Scanner;
public class CheakDigitalSumAndProductIsEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int i=sc.nextInt();
        int sum=0;
        int product=1;
        while(i>0){
            int last=i%10;
            sum=sum+last;
            product=product*last;
            i=i/10;
        }if(sum==product){
            System.out.println("Sum and Product are equal !");
        }else{
            System.err.println("Sum and Product are not equal ");

        }            System.err.println("Sum = "+sum);
        System.err.println("Product = "+product);

    }
}
