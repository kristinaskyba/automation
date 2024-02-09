package automation.lesson11;

//Skapa ett rättstavningsprogram där man tävlar i
//att skriva ut rätt ord.

// Användaren får ett ord skrivet
//på skärmen och skall sedan repetera detta ordet
//på kommandoraden.

// Skriver användaren rätt får
//den 1 poäng annars inget poäng.

// Repetera detta
//för några ord (3 ord räcker som exempel) och skriv
//sen ut totalt antal poäng.

// När du skapar ditt
//program försök att lägga logiken samt sparande av
//data i en class och låt classen med mainmetoden
//enbart läsa in text och skriva ut resultatet. Använd
//TDD för att utveckla detta

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextPrinter {

    public static void printCatAscii() {
        String catAscii =
                " /\\_/\\\n" +
                        "( o.o )\n" +
                        " > ^ <";

        System.out.println(catAscii);
    }

    public static void readAndOutputText(String[] words) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = 0;
        for (int i = 0; i < words.length; i++) {
            try {
                System.out.println("Word: " + words[i]);
                System.out.print("Repeat word here: ");
                String userInput = scanner.nextLine();
                // scanner.close(); //<----NullPointerException
                if (containsNumbers(userInput)) {
                    throw new InputMismatchException();
                }
                if (! userInput.equals(words[i])) {
                    throw new RuntimeException();
                } else
                    lineCount++;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("You wrote too many words : " + e.getMessage());
            } catch (InputMismatchException e) { //<----can't get this working
                System.out.println("Error, line contains numbers " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Error, scanner is closed " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Lines doesn't match : " + e.getMessage());
            }
        }
        System.out.println("Your score is: " +lineCount);
    }

    private static boolean containsNumbers(String userInput) {
        return userInput.matches(".*\\d.*");
    }
}


