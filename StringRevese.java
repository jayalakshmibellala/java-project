package xyz;

import java.util.Scanner;

public class StringRevese {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = sc.nextLine();
		String reversed = "";  // fixed: removed the space
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		System.out.println("Reversed string: " + reversed);
		sc.close();
	}
}