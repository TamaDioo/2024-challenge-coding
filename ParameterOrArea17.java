// Day 17/366 Coding Challenge 2024
// https://www.codewars.com/kata/5ab6538b379d20ad880000ab

public class ParameterOrArea17 {
    public static int areaOrPerimeter (int l, int w) {
        return (l == w) ? l * w : 2 * (l + w);
    }
}