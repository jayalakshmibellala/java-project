package xyz;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        // Hardcoded ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original ArrayList:");
        System.out.println(list);

        // Reverse the ArrayList using Collections.reverse()
        Collections.reverse(list);

        System.out.println("Reversed ArrayList:");
        System.out.println(list);
    }
}
