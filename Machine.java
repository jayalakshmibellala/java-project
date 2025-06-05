package xyz;

abstract class Machines {
    abstract void ATM1();
    
    public void ATM2() {
        System.out.println("ATM USING JAVA WITH PHP");
    }
}

class Bank extends Machines {
    @Override
    void ATM1() {
        System.out.println("ATM machine using Java");
    }
}

public class Machine{
    public static void main(String[] args) {
        Bank b = new Bank();
        b.ATM1();  // Calls the implemented abstract method
        b.ATM2();  // Calls the concrete method from Machine
    }
}

