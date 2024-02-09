package automation.lesson1;

import java.util.Scanner;

public class ArrayLogic {

    public void printArray() {
        String[] wordArray = {"Ada", "Beda", "Cålle", "Kati", "Selma", "Hulio"};
        System.out.println("Please, enter a number:");
        Scanner scanner = new Scanner(System.in);


        try {
            int index = scanner.nextInt();
            if (index >= 1 && index <= wordArray.length) {
                String name = wordArray[index - 1];
                System.out.println("Name on position " + index + " is: " + name);
            } else {
                System.out.println(wordArray[index]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
