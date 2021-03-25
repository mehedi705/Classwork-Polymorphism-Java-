package PolymorphismDemo1;

public class Admin {

    void check(int b, double a) {
        System.out.println("Checking files");
    }

    // Method Overloading
    void check(LocalStudent s) {
        if (s.cgpa > 3.5) {
            System.out.println("OK");
        }
    }

}
