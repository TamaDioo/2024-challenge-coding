// Day 1/366 Coding Challenge 2024
// https://www.codewars.com/kata/57f780909f7e8e3183000078/java

import java.util.Arrays;

public class Grow1 {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};
        System.out.println(grow(test));
        System.out.println(grow2(test));
        System.out.println(grow3(test));
    }

    //Solution by Me
    public static int grow(int[] x) {
        int total = 1;
        for (int i = 0; i < x.length; i++) {
            total *= x[i];
        }
        return total;
    }

    //Solution by WPU
    public static int grow2(int[] x) {
        int total = x[0];
        for (int i = 1; i < x.length; i++) {
            total *= x[i];
        }
        return total;
    }

    //Menggunakan fungsi reduce
    public static int grow3(int[] x) {
        return Arrays.stream(x).reduce(1 ,(a, b) -> a * b);
    }
}