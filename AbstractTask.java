package xyz;
import java.util.Scanner;
abstract class Example{
	abstract void need();
		
	}
	 class Example2 extends Example{
		void need(){
			System.out.println("need driving license");
			System.out.println("RC");
			System.out.println("excetra");
			 
		 }
}

public class AbstractTask {

	public static void main(String[] args) {
		Example ob=new Example2();
		ob.need();
		}

}
