package xyz;

import java.util.ArrayList;
import java.util.Collections;

public class CityList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hyde");
        cities.add("Bangalore");

        Collections.reverse(cities);

        System.out.println(cities);
    }
}
