package xyz;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String Day = sc.nextLine().toLowerCase();
		switch(Day) {
		case "monday":
			
		    System.out.println("Lets Learn Python");
		    
		    break;
		case "tuesday":
			System.out.println("Lets Learn java");
			break;
		case "wednesday":
			System.out.println("Lets Learn Web");
			break;
		case "thursday":
			System.out.println("Lets Learn Sql");
			break;
			default:
				sc.close();
			
		    	
			
		}
		
	}

}
