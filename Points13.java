// Day 13/366 Coding Challenge 2024
// https://www.codewars.com/kata/5bb904724c47249b10000131

public class Points13 {
    public static int points(String[] games) {
        int poin = 0;
        for (int i = 0; i < games.length; i++) {
            int x = Character.getNumericValue(games[i].charAt(0));
            int y = Character.getNumericValue(games[i].charAt(2));
            if (x == y) {
                poin += 1;
            } else if (x > y) {
                poin += 3;
            } 
        }
        return poin;
    }

    public static void main(String[] args) {
        String[] exp = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        System.out.print(points(exp));
    }
}