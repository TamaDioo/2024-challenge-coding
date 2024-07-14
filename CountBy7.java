// Day 7/366 Coding Challenge 2024
// https://www.codewars.com/kata/5513795bd3fafb56c200049e/java

import java.util.Arrays;

public class CountBy7 {
    public static int[] countBy(int x, int n){
        int num[] = new int[n];
        int jml = 0;
        for (int i = 0; i < n; i++) {
            jml += x;
            num[i] = jml;
        }
        return num;
    }

    public static int[] countBy2(int x, int n){
        int num[] = new int[n];
        for (int i = 0, j = 1; i < n; i++, j++) {
            num[i] = (j * x);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy2(1, 10)));
        System.out.println(Arrays.toString(countBy2(2, 5)));

        System.out.println(Arrays.toString(countBy(1, 10)));
        System.out.print(Arrays.toString(countBy(2, 5)));
    }
}
