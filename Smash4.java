// Day 4/366 Coding Challenge 2024
// https://www.codewars.com/kata/53dc23c68a0c93699800041d/solutions/java?filter=me&sort=best_practice&invalids=false

public class Smash4 {

    public static String smash(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = (i == words.length - 1) ? result + words[i] : result + words[i] + " ";
            // if (i == words.length - 1) {
            //     result = result + words[i];
            // } else {
            //     result = result + words[i] + " ";
            // }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"Halo", "Dunia"};

        System.out.println(smash(words));
    }
}