package com.gmail.seliverstova.hanna;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int leftSide;
        int rightSide;
        int leftSum;
        int rightSum;

        System.out.println("Input 4-digit number and press Enter");
        userNumber = sc.nextInt();
        leftSide = (userNumber / 1000)*10 + (userNumber % 1000)/100;
        rightSide = userNumber % 100;

        leftSum = leftSide / 10 + leftSide % 10;
        rightSum = rightSide / 10 + rightSide % 10;

        if (leftSum > 9) {
            leftSum = leftSum / 10 + leftSum % 10;
        }
        if (rightSum > 9) {
            rightSum = rightSum / 10 + rightSum % 10;
        }
        if (leftSum == rightSum) {
            System.out.println("Number is happy");
        } else {
            System.out.println("Number is not happy");
        }
    }
}
