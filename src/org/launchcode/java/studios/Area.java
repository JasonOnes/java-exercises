package org.launchcode.java.studios;
import java.util.Scanner;
import static java.lang.Double.parseDouble;

public class Area {

    public static void areaOfCircle(String radius) {


            double PI = Math.PI;
            double newRadius = parseDouble(radius);

            double area = PI * newRadius * newRadius;

            System.out.println("The area of your circle is:" + area);
    }

}
