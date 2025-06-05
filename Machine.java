package xyz;

public class Machine {
abstract void ATM1();
    
    public void ATM2() {
        System.out.println("ATM USING JAVA WITH PHP");
    }
}

class Bank extends Machine {
    void ATM1() { // Implementing the abstract method properly
        System.out.println("ATM machine using Java");
    }
}

public class A {
    public static void main(String[] args) {
        Bank b = new Bank(); // Corrected object creation
        b.ATM1(); // Calling implemented abstract method
        b.ATM2(); // Calling inherited method from Machine
    }

}
