// Day 21/366 Coding Challenge 2024
// https://www.codewars.com/kata/568d0dd208ee69389d000016

public class RentalCostCar21 {
    public static int rentalCarCost(int d) {
        if (d >= 7) return 40 * d - 50;
        else if (d >= 3) return 40 * d - 20; 
        else return 40 * d;
      }
}