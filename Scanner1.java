package xyz;
import java.util.Scanner;

public class Scanner1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text
        System.out.println("Hello, " + name);
    }
}
