package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class TempConv {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the temperature in F: ");
        fahrenheit = in.nextDouble();

        celsius = (fahrenheit - 32) * 5.0/9.0;
        System.out.println("The temperature in C is: " + celsius);
    }

}
//above doesn't return anything(void) but prints output
