// Day 9/366 Coding Challenge 2024
// https://www.codewars.com/kata/577a98a6ae28071780000989/java

public class MaxMin9 {
    public static int min(int[] list) {
        int minValue = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < minValue) {
                minValue = list[i];
            }
        }
        return minValue;
    }
      
    public static int max(int[] list) {
        int maxValue = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > maxValue) {
                maxValue = list[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] exp = {-52, 56, 30, 29, -54, 0, -110};
        System.out.print("min : " + min(exp));
    }
}