package xyz;

import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{};
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[][] result = new int[intervals.length][2];
        int index = 0;
        result[index] = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (result[index][1] >= intervals[i][0]) {
                result[index][1] = Math.max(result[index][1], intervals[i][1]);
            } else {
                index++;
                result[index] = intervals[i];
            }
        }

        int[][] merged = new int[index + 1][2];
        System.arraycopy(result, 0, merged, 0, index + 1);
        return merged;
    }

    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = solution.merge(intervals);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}