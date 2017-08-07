package exercises;
import java.util.Scanner;

public class AliceNo {
    public static void main(String[] args){
        String  alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";
        String word_search;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What word are you looking for?: ");
        word_search = in.nextLine();
        //int wordLength = word_search.length();

        // checks without case, made alice all lower to pass Alice case
        if (alice.toLowerCase().contains(word_search.toLowerCase())) {
            System.out.println("True");
        }
                else {
            System.out.println("False");

        }

    }
}
