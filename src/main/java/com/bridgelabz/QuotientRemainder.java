package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args){
        int dividend,divisor,quotient,remainder;
        Scanner in = new Scanner(System.in);

        //get the dividend value
        System.out.println("Enter Dividend:");
        dividend = in.nextInt();

        //get the divisor value
        System.out.println("Enter Divisor:");
        divisor = in.nextInt();

        //find quotient
        quotient = dividend / divisor;

        //find reminder
        remainder = dividend % divisor;

        //print the result
        System.out.println("Quotient:" +quotient);
        System.out.println("Remainder:" +remainder);
    }
}
