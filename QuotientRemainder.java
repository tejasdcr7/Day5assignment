package com.dayfive.assign;
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int num1;
        int num2;
        int quotient = 0;
        int remainder = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num1=sc.nextInt();
        System.out.println("enter the number");
        num2=sc.nextInt();

        quotient = num1 / num2;
        remainder = num1 % num2;

        System.out.println("Quotient" +num1+ "/"+num2+quotient);

        System.out.println("Remainder" +num1+"%"+num2+remainder);





    }
}
