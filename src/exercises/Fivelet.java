package exercises;


public class Fivelet {
    public static void main(String[] args){ //} throws IOException{

        String text[] = {"Welcome", "to", "my", "castle", "dudes", "and", "ladys"};
        //List<String> text;
        //text = (ArrayList<String>) Files.readAllLines(Paths.get("/home/jasonones/mytest/intro_to_sprinting_codeless_project/beowulf.txt"));

        System.out.println(text);
        for (String word : text) {
                if (word.length() == 5) {
                    System.out.println(word);
                }
            }

    }
}
