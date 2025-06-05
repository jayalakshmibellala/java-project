package xyz;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<String,String> country=new TreeMap <String,String>();
		country.put("India"," new Delhi");
		
		country.put("Usa","Washington");
		
		country.put("Germany","Berlin");
		country.put("japan","Tokyo");
		country.put("India","Delhi");
		System.out.println(country.firstKey());
		System.out.println(country.lastKey());
		System.out.println(country.lowerEntry("japan"));
		System.out.println(country.higherEntry("Germany"));
		
		System.out.println(country);
		
		

	}

}
