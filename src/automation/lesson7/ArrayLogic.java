package automation.lesson7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayLogic {

    public void printArray() {
        Scanner scanner = new Scanner(System.in);
        while ( true ) {
            try {
                System.out.println("Please, enter first number:");
                int indexFirst = scanner.nextInt();
                System.out.println("Please, enter second number:");
                int indexSecond = scanner.nextInt();
                int indexResult = indexFirst / indexSecond;
                System.out.println("Your result is: " + indexResult);
                return;

            } catch (NumberFormatException | ArithmeticException | InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}

//Why when first number is 0, then result is 0?