package company.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // f at the end indicates that this is a float
        double myDoubleValue = 5d / 3d; // d at the end indicates that this is a double
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // for floats there are 7 digits of precision after the point
        // for doubles there are 16 digits of precision after the point

        // CHALLENGE
        double pounds = 200d;
        double kilogramsInPound = 0.45359237d;
        double kilograms = pounds * kilogramsInPound;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
