package xyz;
import java.util.HashMap;
import java.util.Scanner;

public class RollNumberHashMap {
    public static void main(String[] args) {
        // Create a HashMap with Integer as key (roll number) and String as value (name)
        HashMap<Integer, String> studentMap = new HashMap<>();
        
        // Adding some entries
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        
        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter roll number to search for student name:");
        int rollNumber = scanner.nextInt();
        
        // Check if the roll number exists in the map
        if(studentMap.containsKey(rollNumber)) {
            System.out.println("Student Name: " + studentMap.get(rollNumber));
        } else {
            System.out.println("Roll number not found.");
        }
        
        scanner.close();
    }
}
