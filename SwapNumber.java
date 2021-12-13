package com.dayfive.assign;

import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        int x,y,t;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        x=sc.nextInt();
        System.out.println("enter the second number");
        y=sc.nextInt();
        System.out.println("before swapping"+x+""+y);
        t=x;
        x=y;
        y=t;
        System.out.println("after swapping"+x+""+y);


    }
}
