import java.util.Scanner;
public class PrintTheDigitalProductOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        //int i = 12345;
        int product = 1;
        int last;
        while(i>0){
            last=i%10;
            product=product*last;
            i=i/10;
        }
        System.out.println("product of  = "+product);
    }
}
