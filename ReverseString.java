package xyz;

public class ReverseString {

    public static void main(String[] args) {
        String original = "rushiketh";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
