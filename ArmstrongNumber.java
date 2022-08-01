public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int count=0;
        int num1=num;
        int sum=0;
        int num2=num;
        while(num>0){
            count++;
            num=num/10;
        }
        while(num1>0){
            int last=num1%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power=power*last;
            }
            sum=sum+power;
            num1=num1/10;
        }
        if(sum==num2){
            System.out.println("It is Armstrong Number");
        }else{
            System.out.println("It is not a Armstrong Number");
        }
    }
}
