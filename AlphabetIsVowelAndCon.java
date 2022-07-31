//Write a program to cheakk  given alphabet is vowel or not

import java.util.Scanner;
public class AlphabetIsVowelAndCon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet :");
        char ch=sc.next().charAt(0);
        //char ch='p';
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u'){
            System.out.println("Given char "+ch+" is vowel");

        }else{
            System.out.println("Given char "+ch+" is cousunent");
        }

    }
}
