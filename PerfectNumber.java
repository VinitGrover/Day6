package com.bridgelabz.logicalProgram;
import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter n to find whether it is a perfect number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), j = 0;
        int arr[] = new int[n/2];

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                arr[j] = i;
                j++;
            }
        }
        int i = 0, sum = 0;
        while (i <= j) {
            sum += arr[i];
            i++;
        }
        if (sum == n)
            System.out.println("Yes " + n + " is a perfect number");
        else
            System.out.println("No " + n + " is not a perfect number");

    }
}