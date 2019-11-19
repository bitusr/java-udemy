package acdemy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        myString = myString + ", and this is more";
        myString = myString + " \u00A9 2019";
        System.out.println("myString = " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString = " + lastString);
    }
}
