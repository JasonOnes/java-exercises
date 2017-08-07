package org.launchcode.java.demos.java4python;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by LaunchCode
 * lskdjflsakjdfljsdlfjij c sdkjasjdfojsdv lkjd lkjasdf
 *
 */
public class Gradebook {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while(!newStudent.equals(""));

        // Get student grades
        for (String steve : students) {
            System.out.print("Grade for " + steve + ": ");
            Double grade = in.nextDouble();
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int x = 0; x < students.size(); x++) {
            System.out.println(students.get(x) + " (" + grades.get(x) + ")");
            sum += grades.get(x);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);

        //ArrayList<String> nsorted_list = new ArrayList<>();
        //nsorted_list = students.sort();
        //System.out.println(students.sort(char<char));
    }

}
