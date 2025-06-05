package xyz;
import java.util.HashMap;

public class Student {

	public static void main(String[] args) {
		HashMap<Integer,String>student=new HashMap<Integer,String>();
		student.put(101,"Ravi");
		student.put(102, "jaya");
		student.put(103,"jara");
		student.put(104, "sara");
		student.put(105, "tara");
		
		System.out.print(student);
		if(student.containsKey(101)){
			System.out.println("yes");
		}else
		{
			System.out.println("no");
			
		}
			
		
		
		
	

	}

}
