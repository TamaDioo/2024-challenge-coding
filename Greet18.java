// Day 18/366 Coding Challenge 2024
// https://www.codewars.com/kata/5772da22b89313a4d50012f7

public class Greet18 {
    static String greet(String name, String owner) {
        return (name.equals(owner)) ? "Hello boss" : "Hello guest";
    }
}