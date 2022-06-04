package com.bridgelabz.jUnit;

import java.util.Scanner;

public class TemperatureConversion {

    static float tempConvert(float temp, char deg) {
        if (deg == 'c')
            return (temp * 9 / 5) + 32;
        else
            return (temp - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.print("Enter temperature : ");
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();

        System.out.print("Enter c for celsius and f for fahrenheit : ");
        char deg = sc.next().charAt(0);
        float res = (tempConvert(temp, deg));
        if (deg == 'c')
            System.out.println("temperature in fahrenheit is " + res);
        else
            System.out.println("temperature in celsius is " + res);

    }
}