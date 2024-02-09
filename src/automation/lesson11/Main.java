package automation.lesson11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hej, friend! :) \nTry to play a game with me");
        String[] words = {"sho", "haha", "please"};
        System.out.println("Type: " + Arrays.toString(words));

        TextPrinter.readAndOutputText(words);
        TextPrinter.printCatAscii();

    }
}



