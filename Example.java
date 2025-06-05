package xyz;

public class Example {
    String name = "lahari";
    String name1 = name.concat("murahari");
    public void showProfile() {
        System.out.println(name);
        System.out.println(name1);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.showProfile();
    }
}
