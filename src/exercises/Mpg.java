package exercises;
import java.util.Scanner;

public class Mpg {
    public static void main(String[] args){
        float miles;
        float gallons;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        miles = in.nextFloat();
        System.out.println("And how many gallon di dthat take?: ");
        gallons = in.nextFloat();

        mpg = miles / gallons;
        System.out.format("Your miles per gallon were " + "%f%n", mpg);



    }
}
