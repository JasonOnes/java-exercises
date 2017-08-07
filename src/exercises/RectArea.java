package exercises;
import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        double width;
        double height;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter a width: ");
        width = in.nextDouble();
        System.out.println("Enter a height: ");
        height = in.nextDouble();

        area = width * height;
        System.out.format("area of a rectangle with those dimensions is: " + "%f%n", area);

    }

}
