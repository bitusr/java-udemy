package acdemy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double doubleOne = 20.00d;
        double doubleTwo = 80.00d;
        double doubleTotal = (doubleOne + doubleTwo) * 100d;
        double remainder = doubleTotal % 40d;
        System.out.println("remainder " + remainder);
        boolean hasRemainder = remainder != 0;
        System.out.println("hasRemainder " + hasRemainder);

        if (hasRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
