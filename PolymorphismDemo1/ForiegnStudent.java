package PolymorphismDemo1;

public class ForiegnStudent extends Student {
    ForiegnStudent(double c) {
        super(c);
    }

    // Method overriding
    @Override
    void semesterFee() {
        System.out.println("45000 BDT");
    }
}
