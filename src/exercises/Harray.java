package exercises;

import java.lang.reflect.Array;

public class Harray {
    public static void main(String[] args) {
        //int fib_nums[] = {1, 1, 2, 3, 5, 8};
        Integer[] fib_nums = new Integer[] {1, 1, 2, 3, 5, 8};
        for (int num:fib_nums) {
            System.out.println(num);
        }
        /*if (fib_nums instanceof Array)
            System.out.println("Harrray");*/
    }
}
