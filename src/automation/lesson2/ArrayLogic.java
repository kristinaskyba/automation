package automation.lesson2;

import java.util.Scanner;

public class ArrayLogic {

    public void printArray() {
        String[] wordArray = {"Ada", "Beda", "Cålle", "Kati", "Selma", "Hulio"};
        System.out.println("Please, enter a number:");
        Scanner scanner = new Scanner(System.in);

        while (true) { //loop until entered number is in the array.list
            try {
                int index = scanner.nextInt();
                if (index >= 1 && index <= wordArray.length) {
                    String name = wordArray[index - 1];
                    System.out.println("Name on position " + index + " is: " + name);
                    break;
                } else {
                    System.out.println("Wrong number. Provide number from 1 to " + wordArray.length);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please, enter a number");
                scanner.nextLine(); // Clear input buffer otherwise printing
            }
        }
    }
}
