package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashstuds {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer stud_num;
        String student_name;

        System.out.println("Give me a name! (please hit enter whence done)");

        int i = 1;
        do {
            System.out.println("name: ");

            student_name = in.nextLine();
            //if (student_name != "") {
            if (!student_name.equals("")) {
                stud_num = i;
                //i ++;
                students.put(stud_num, student_name);
                i ++;

            }
        } while(!student_name.equals(""));


        for (Map.Entry<Integer, String> student: students.entrySet()) {
            System.out.println(student.getKey() + ":" + student.getValue());
        }
    }
}
