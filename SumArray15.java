// Day 15/366 Coding Challenge 2024
// https://www.codewars.com/kata/576b93db1129fcf2200001e6

public class SumArray15 {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        } 
        int total = 0;
        int minValue = numbers[0], maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) minValue = numbers[i];
            if (numbers[i] > maxValue) maxValue = numbers[i];
            total += numbers[i];
        }
        total = total - (minValue + maxValue);
        return total;
    }

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
        int[] exp = { 6, 2, 1, 8, 10};
        System.out.print(sum(exp));
    }
}