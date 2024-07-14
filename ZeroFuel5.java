// Day 5/366 Coding Challenge 2024
// https://www.codewars.com/kata/5861d28f124b35723e00005e/java

public class ZeroFuel5 {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return (mpg * fuelLeft) >= distanceToPump;
    }
}