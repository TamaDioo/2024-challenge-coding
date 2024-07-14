// Day 11/366 Coding Challenge 2024
// https://www.codewars.com/kata/5672a98bdbdd995fad00000f

public class RPS11 {
    public static String rps(String p1, String p2) {
        String result ="";
        if ((p1.equals("rock") && p2.equals("scissors")) 
            || (p1.equals("scissors") && p2.equals("paper")) 
            || (p1.equals("paper") && p2.equals("rock"))) {
            result = "Player 1 won!";
        } else if ((p2.equals(p1))) {
            result = "Draw!";
        } else {
            result = "Player 2 won!";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(rps("rock", "rock"));
    }
}