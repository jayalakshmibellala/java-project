package xyz;


import java.util.Scanner;

public class Twosum {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int target = 7; 

        boolean found = false; 

        for (int i = 0; i < a.length; i++) { 
            for (int j = i + 1; j < a.length; j++) { 
                if (a[i] + a[j] == target) {
                    System.out.println("Found two numbers that sum to " + target + ": " + a[i] + " and " + a[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No two numbers found in the array that sum to " + target);
        }
    }
}