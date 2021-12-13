package com.dayfive.assign;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        if ( num % 2 ==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
