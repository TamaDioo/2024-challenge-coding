// Day 20/366 Coding Challenge 2024
// https://www.codewars.com/kata/5aa736a455f906981800360d

public class Feast20 {
    public static boolean feast(String beast, String dish) {
        return (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1));
    }
}