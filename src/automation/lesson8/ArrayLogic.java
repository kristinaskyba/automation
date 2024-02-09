package automation.lesson8;

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

            } catch (ArithmeticException e) {
                System.out.println("Please enter number, not 0: " + e.getMessage());
                scanner.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter only numbers: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}

//Why when first number is 0, then result is 0?