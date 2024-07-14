// Day 8/366 Coding Challenge 2024
// https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/java

public class CountSheep8 {
    public static String countingSheep(int num) {
        String sheep = "";
        for (int i = 1; i <= num; i++) {
            sheep += i + " sheep..."; 
        }
        return sheep;
    }

    public static void main(String[] args) {
        System.out.print(countingSheep(0));
    }
}
