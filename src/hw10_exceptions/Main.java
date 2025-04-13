package hw10_exceptions;

public class Main {
    public static void main(String[] args) {

        String[][] nums = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};

        ArrayValueCalculator calculator = new ArrayValueCalculator();
        System.out.println("The sum of array nums: " + calculator.doCalc(nums));
    }
}
