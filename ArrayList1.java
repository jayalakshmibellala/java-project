package xyz;
import java.util.HashSet;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> citySet = new HashSet<String>();
        citySet.add("Hyde");
        citySet.add("Banglore");
        citySet.add("Banglore");

        // Convert HashSet to ArrayList
        ArrayList<String> cityList = new ArrayList<String>(citySet);

        // Print the ArrayList
        System.out.println("ArrayList: " + cityList);
    }
}
