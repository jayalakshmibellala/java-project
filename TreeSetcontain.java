package xyz;

import java.util.TreeSet;

public class TreeSetcontain {

	public static void main(String[] args) {
		
		TreeSet<String> name=new TreeSet<String>();
		name.add("jaya");
		name.add("heeta");
		name.add("null");
		System.out.println(name);
		if(name.contains("jaya")) {
			System.out.println("exists");
			
		}else {
			System.out.println("no");
		}
		

	}

}
