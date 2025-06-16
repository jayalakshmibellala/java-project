package xyz;
public class BubbleSortStrings {
    public static void main(String[] args) {
        // Hardcoded input strings
        String[] arr = {"banana", "apple", "grape", "orange", "cherry"};

        System.out.println("Original strings:");
        for (String s : arr) {
            System.out.println(s);
        }

        // Bubble sort
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n -1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nStrings after bubble sort:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
