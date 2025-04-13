package hw10_exceptions;

public class ArrayValueCalculator {

    public int doCalc(String[][] nums) {
        if (nums.length != 4) {
            throw new ArraySizeException("Array size must be 4x4");
        }
        for (String[] num : nums)
            if (num.length != 4)
                throw new ArraySizeException("Length of each array row must be 4");

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++)
                try {
                    sum = sum + Integer.parseInt(nums[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at index [" + i + "," + j + "]");
                }
        }
        return sum;
    }
}