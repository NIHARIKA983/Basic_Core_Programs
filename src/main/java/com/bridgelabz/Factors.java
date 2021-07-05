package com.bridgelabz;

import java.util.Scanner;

public class Factors {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter any Number to find Prime Factors");
        int number=sc.nextInt();
        System.out.println("Given Number is:" + number);
        System.out.println("Prime Factors are: ");
        for (int i=2; i<=number; i++){
            while (number % i == 0){
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if (number < 1) System.out.println(number);
    }
}
