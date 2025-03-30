package hw9_tasks;

import java.util.HashSet;
import java.util.Set;

public class NumsDuplicate {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(checkDuplicate(nums1));
        System.out.println(checkDuplicate(nums2));
        System.out.println(checkDuplicate(nums3));
    }

    public static boolean checkDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (!unique.add(num))
                return true;
            else {
                unique.add(num);
            }
        }
        return false;
    }
}
