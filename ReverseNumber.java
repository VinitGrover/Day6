package com.bridgelabz.logicalProgram;
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter n to find it's reverse number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0, remain = 0;
        while (n > 0) {

            remain = n % 10;
            rev = rev * 10 + remain;
            n = n / 10;

        }
        System.out.println(rev);
    }
}