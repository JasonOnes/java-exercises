package org.launchcode.java.studios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CharCount {
    /** a simple character counter */
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> charcounts = new HashMap<>();
        //TODO (DONE) this is hardcoded input for text
        //    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque" +
        //*          " sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit " +
        //*         "amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget " +
        //*        "massa. Donec nec velit non ligula efficitur luctus.";
        //TODO (DONE) this is user input for text
//        Scanner in = new Scanner(System.in); //creates a Scanner object "in" which accepts input from user
//
//        System.out.println("Give me a string, and feel free to be long winded!");
//        String text = in.nextLine(); //text is now a string of whatever some joker has entered
        int count;
        //TODO (DONE) this is reading file for input for text
        //String text = Files.readAllLines(Paths.get("/home/jasonones/mytest/intro_to_sprinting_codeless_project/beowulf.txt"));
        for (String text : Files.readAllLines(Paths.get("/home/jasonones/mytest/intro_to_sprinting_codeless_project/beowulf.txt"))) {

        for (int i = 0; i < text.length(); i++) { //gives range of index
            char letter = text.toLowerCase().charAt(i);//iterates through characters using index in range, string lowered
            {
                if (Character.isLetter(letter)) {//if character is letter is true . . .
                    //TODO try and get && to work with above
                    if (!charcounts.containsKey(letter)) {// && Character.isLetter(letter)) {
                        count = 1; //if charcounts doesn't contain letter that letter's count is now one
                    } else {
                        count = charcounts.get(letter) + 1;//if it does, increment by one
                    }

                    charcounts.put(letter, count);// put() adds letter and count to hashmap charcounts if db commit?

                }
            }
        }
        }
                System.out.println(("Here's the count!"));

                for (Map.Entry<Character, Integer> let_count : charcounts.entrySet()) { //since HashMap inherits from Map class
                    System.out.println(let_count.getKey() + " : " + let_count.getValue());


                }
            }
        }


