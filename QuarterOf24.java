// Day 24/366 Coding Challenge 2024
// https://www.codewars.com/kata/5ce9c1000bab0b001134f5af

public class QuarterOf24 {
    public static int quarterOf(int month) {
        return month > 9 ? 4 : month > 6 ? 3 : month > 3 ? 2 : 1; 
    }
}