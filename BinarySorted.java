package xyz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String input = sc.nextLine().toLowerCase(); 

        ArrayList<String> stu = new ArrayList<String>();
        stu.add("amit");
        stu.add("divya");
        stu.add("karan");
        stu.add("priya");
        stu.add("zoya");

        Collections.sort(stu); 

        System.out.println("Sorted List: " + stu);

        int left = 0;
        int right = stu.size() - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            String midVal = stu.get(mid);
            int cmp = input.compareTo(midVal);

            if (cmp == 0) {
                System.out.println("Found \"" + input + "\" at index " + mid);
                found = true;
                break;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }

        sc.close();
    }
}