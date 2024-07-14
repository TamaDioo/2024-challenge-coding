// Day 12/366 Coding Challenge 2024
// https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/java

public class ArrayPlusArray12 {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int total = 0;
        for (int i = 0; i < arr2.length; i++) {
            total += arr1[i] + arr2[i];
        }
        return total;
      }
}