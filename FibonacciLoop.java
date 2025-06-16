package xyz;

import java.util.Scanner;

public class FibonacciLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int N = sc.nextInt();
        
        int first = 0, second = 1;
        
        System.out.println("First " + N + " Fibonacci numbers:");
        for (int i = 1; i <= N; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}