// Day 23/366 Coding Challenge 2024
// https://www.codewars.com/kata/56f69d9f9400f508fb000ba7

public class MonkeyCount23 {
    public static int[] monkeyCount(final int n) {
        int[] result = new int[n];
        for (int i = 0, j = 1; i < n; i++, j++) {
            result[i] = j;
        }
        return result;
    }
}