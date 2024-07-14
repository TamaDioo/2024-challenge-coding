// Day 2/366 Coding Challenge 2024

import java.util.Arrays;

public class ReverseSeq2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.print(Arrays.toString(reverseSeq(n)));
    }    
    
    public static int[] reverseSeq(int n) {
        int[] p = new int[n];
        for (int i = n, j = 0; i >= 1; i--, j++) {
            p[j] = i;
        }
        return p;
    }
}