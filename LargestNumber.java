package com.dayfive.assign;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        System.out.println("enter the third number");
        c=sc.nextInt();

        if (a>=b && a>c)
            System.out.println(a+"is the largest number");
        else if (b>a && b>c)
            System.out.println(b+"is the largest number");
        else
            System.out.println(c+"is the largest number");



    }
}
