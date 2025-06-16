package xyz;

public class TrainWater {
    public static int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        // --- Hardcoded Input ---
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // -------------------------

        System.out.println("--- Trapping Rain Water ---");
        System.out.print("Elevation Map: [");
        for (int i = 0; i < height.length; i++) {
            System.out.print(height[i]);
            if (i < height.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int waterTrapped = trap(height);
        System.out.println("Amount of water trapped: " + waterTrapped);
    }
}