package exercises;

import java.util.ArrayList;

public class Arraywego {
    public static void main(String[] args) {
        //ArrayList<Integer> cool_nums = new ArrayList<>();
        int cool_nums[] = {1, 11, 14, 19, 74, 15, 16, 88, 25, 29, 2017};
        //int cool_nums[] = {1,2,  3, 7, 9, 12};
        int sum = 0;

        for (int num : cool_nums) {
            if (num % 2 == 0)
                sum += num;
        }

                System.out.println(sum);


    }
}
