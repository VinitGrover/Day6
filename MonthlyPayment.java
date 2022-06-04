package com.bridgelabz.jUnit;
import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p yr : ");
        double P = sc.nextDouble();
        double Y = sc.nextDouble();
        double R = sc.nextDouble();
        double n = Y * 12;
        double r = R/(12*100);
        double payment = (P*r)/(1-Math.pow((1+r),-1/n));
        System.out.println(payment);
    }
}
