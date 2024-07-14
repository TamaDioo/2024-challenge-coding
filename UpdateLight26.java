// Day 26/366 Coding Challenge 2024
// https://www.codewars.com/kata/58649884a1659ed6cb000072

public class UpdateLight26 {
    public static String updateLight(String current) {
        return current.equals("green") ? "yellow" : current.equals("yellow") ? "red" : "green";
    }
}