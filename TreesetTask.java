package xyz;
import java.util.TreeSet;

public class TreesetTask {

	public static void main(String[] args) {
		TreeSet<Integer>numbers=new TreeSet<>();
		numbers.add(3327);
		numbers.add(3323);
		numbers.add(3324);
		numbers.add(3325);
		numbers.add(3326);
		System.out.println(numbers);
		numbers.first();
		System.out.println(numbers.first());
		System.out.println(numbers.last());
		System.out.println(numbers.higher(3325));
		System.out.println(numbers.lower(3326));
	}

}
