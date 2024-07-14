// Day 22/366 Coding Challenge 2024
// https://www.codewars.com/kata/57a0885cbb9944e24c00008e

public class RemoveTandaSeru22 {
    static String removeExclamationMarks(String s) {
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == '!') {
        //         s = s.substring(0, i) + s.substring(i + 1, s.length());
        //         i--;
        //     }
        // }
        // return s;
        
        return s.replace("!", "");
    }
}