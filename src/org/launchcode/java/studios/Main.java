package org.launchcode.java.studios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Give me a radius: ");
        Scanner scanner = new Scanner(System.in);
        String radius = scanner.next();

        Area.areaOfCircle(radius);
    }

}
