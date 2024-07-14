// Day 28/366 Coding Challenge 2024
// https://www.codewars.com/kata/56f6ad906b88de513f000d96

public class BonusTime28 {
    public static String bonusTime(final int salary, final boolean bonus) {
        return bonus ? "\u00A3" + (salary * 10) : "\u00A3" + (salary);
    }

    public static void main(String[] args) {
        System.out.print(bonusTime(50, true));
    }
}