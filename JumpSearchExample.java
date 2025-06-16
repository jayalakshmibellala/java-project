package xyz;

import java.util.Scanner;

public class JumpSearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Sorted array
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input: Element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Jump Search
        int result = jumpSearch(array, target);

        // Output
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }

    // Jump Search Method
    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n)); // Optimal block size
        int prev = 0;

        // Jumping in blocks
        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; // Key not present
            }
        }

        // Linear search within the block
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1; // Element not found
    }
}