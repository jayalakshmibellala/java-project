package xyz;

import java.util.Arrays; // For printing the array nicely

public class kadnesalgorithm {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array is empty or null.");
            return 0; // Or handle as an error
        }

        int currentMax = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        // --- Hardcoded Input ---
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // -------------------------

        System.out.println("--- Kadane's Algorithm (Maximum Subarray) ---");
        System.out.println("Input Array: " + Arrays.toString(nums));

        int maxSum = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}