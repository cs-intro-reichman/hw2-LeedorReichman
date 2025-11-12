//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int times;
                times = Integer.parseInt(args[1]);

                String anLetters = "AEFHILMNORSX"; // letters that take "an"

                for (int i = 0; i < word.length(); i++) {
                        char ch = word.charAt(i);
                        String article = (anLetters.indexOf(ch) >= 0) ? "an" : "a";
                        System.out.println("Give me " + article + " " + ch + ": " + ch + "!");
                }

                System.out.println("What does that spell?");
                for (int i = 0; i < times; i++) {
                        System.out.println(word + "!!!");
                }
        }
}
