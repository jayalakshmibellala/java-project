package xyz;
import java.util.Arrays;

public class SortAlphaStrings {
    public static void main(String[] args) {
        // Hardcoded input strings
        String[] arr = {"banana", "apple", "grape", "orange", "cherry"};
        
        System.out.println("Original strings:");
        for (String str : arr) {
            System.out.println(str);
        }
        
        Arrays.sort(arr);  // Sort alphabetically
        
        System.out.println("\nSorted strings:");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}

