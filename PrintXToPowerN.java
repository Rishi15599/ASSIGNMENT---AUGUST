//write a program to print X^N

public class PrintXToPowerN {
    public static void main(String[] args) {
        int x=6;
        int n=4;
        int power=1;
        for(int i=1;i<=n;i++){
            power=power*x;
        }System.out.println(power);
    }
}
