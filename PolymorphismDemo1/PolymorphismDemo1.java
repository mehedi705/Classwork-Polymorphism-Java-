package PolymorphismDemo1;

/**
 * first
 */

public class first {
    public static void main(String[] args) {

        Admin a1 = new Admin();

        LocalStudent s1 = new LocalStudent(3.2);
        ForiegnStudent s2 = new ForiegnStudent(3.2);

        s1.semesterFee();
        s2.semesterFee();

    }

}