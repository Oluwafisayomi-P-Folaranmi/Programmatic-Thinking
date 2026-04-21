import Input_Processing.LUHN_CHECKSUM_VALIDATION.UtilityClass;
import Output_Processing.A_SIDEWAYS_TRIANGLE.A_SIDEWAYS_TRIANGLE;
import Output_Processing.HALF_OF_A_SQUARE.HALF_OF_A_SQUARE;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        // Sometimes, the double of a number might give a 2-digit number.
        // You have to split the 2-digit number and add the digits separately.
        // 1. Check if input number is less than 10
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a single digit (0 - 9): ");
        // int integer = scanner.nextInt();
        // int sum = UtilityClass.checkDouble(integer);

        // System.out.println("You input: '" + integer + "'");
        // System.out.println("The double of '" + integer + "' is = '" + integer * 2 + "'");
        // System.out.println("'" + sum + "'");
        System.out.println("Enter a six-digit number: ");
        String sixDigitNumber = scanner.nextLine();
        // if (sixDigitNumber.length() != 6) {
           // return;
        // }
        while (sixDigitNumber.length() != 6) {
            System.out.println("You did not enter a six-digit number.");
            System.out.println("Please, enter a six-digit number: ");
            sixDigitNumber = scanner.nextLine();
        }

        System.out.println("Yes, you entered: '" + sixDigitNumber + "'");
        System.out.println(Integer.valueOf(sixDigitNumber.charAt(0)));
        System.out.println(Integer.valueOf(sixDigitNumber.charAt(1)));
        System.out.println(Integer.valueOf(sixDigitNumber.charAt(2)));
        System.out.println(Integer.valueOf(sixDigitNumber.charAt(3)));
        System.out.println(Integer.valueOf(sixDigitNumber.charAt(4)));
        System.out.println(Integer.valueOf(sixDigitNumber.charAt(5)));

        // Summing the digits in the input number
        int sum = 0;
        for (int i = 0; i < sixDigitNumber.length(); i++) {

            sum += sixDigitNumber.charAt(i) - 48;
        }

        System.out.println("The sum of the digits in '"
                + sixDigitNumber + "' is '" + sum + "'");





        // Builds half of a square
        // System.out.println("This is an half of a square.");
        // HALF_OF_A_SQUARE.build();

        // Builds a sideways triangle
        // System.out.println();
        // System.out.println("This is a sideways triangle.");
        // A_SIDEWAYS_TRIANGLE.build();
    }
}
