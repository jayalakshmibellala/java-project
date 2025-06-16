package xyz;

import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input: Element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Linear Search
        int result = linearSearch(array, target);

        // Output result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }

    // Linear Search Method
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Element found
            }
        }
        return -1; // Element not found
    }
}