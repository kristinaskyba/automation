package automation.lesson4;

import java.util.Scanner;

public class ArrayLogic {

    public void printArray() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please, enter first number:");
            int indexFirst = scanner.nextInt();
            System.out.println("Please, enter second number:");
            int indexSecond = scanner.nextInt();
                int indexResult = indexFirst / indexSecond;
                System.out.println("Your result is: " + indexResult);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

//Why when first number is 0, then result is 0?