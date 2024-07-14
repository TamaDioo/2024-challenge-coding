// Day 25/366 Coding Challenge 2024
// https://www.codewars.com/kata/56b1f01c247c01db92000076

public class DoubleChar25 {
    public static String doubleChar(String s){
        StringBuilder sb = new StringBuilder();      
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("null"));
    }
}