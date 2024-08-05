package org.example.subarraysum;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int[] nums = {1,2,7};
         int target = 2;
         ArrayList result = new Solution().subarraySum(nums, nums.length, target);


        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("target: " + target);

        System.out.print("result: ");
        System.out.println(result);

    }
}
