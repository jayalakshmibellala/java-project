package xyz;
import java.util.TreeSet;

public class TreeSetReverseString {

	public static void main(String[] args) {
		TreeSet<String> name=new TreeSet<String>();
		name.add("sumit");
		name.add("karan");
		name.add("anjali");
		name.add("moham");
		name.add("zoya");
		System.out.println(name);
		System.out.println(name.reversed());
		String combined=String.join("",name);
		String str=new StringBuilder(combined).reverse().toString();
		System.out.println(str);
	}
	
		
		 
		
	}


