// Day 16/366 Coding Challenge 2024
// https://www.codewars.com/kata/563e320cee5dddcf77000158

public class GetAverage16 {
    public static int getAverage(int[] marks){
        int total = 0;
		for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total / marks.length;
	}
}