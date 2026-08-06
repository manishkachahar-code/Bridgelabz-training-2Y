package com.gla.PracticeProblem;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a");
        int a = sc.nextInt();
        System.out.print("Enter a number b");
        int b = sc.nextInt();
        int sum = 0;
        sum = a+b;
        System.out.println("the sum of two numbers is: "+sum);

    }


}
